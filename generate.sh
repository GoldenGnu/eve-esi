#!/bin/bash

if [ "a$1" = "a-g" ]; then
  GIT=true
fi

#
# Get eve swagger file
#
rm -f esi.json
wget -q -O esi.json https://esi.tech.ccp.is/latest/swagger.json?datasource=tranquility

APIHASH=$(md5sum esi.json | sed -e 's#.*\(.\{10\}\)  esi.json#\1#')
DATE=$(date +"%y-%m-%d")

APIVERSION="$DATE-$APIHASH"

echo "ESI version $APIVERSION"

if [ "$GIT" = true ]; then
  git fetch -p
  BRANCH=$(git branch -a | grep $APIHASH > /dev/null && echo "true")
  COMMIT=$(git log | grep $APIHASH > /dev/null && echo "true")

  if [ "a$BRANCH" = "atrue" ]; then
    echo "Found version as branch"
    exit 0
  fi
  if [ "a$COMMIT" = "atrue" ]; then
    echo "Found version as commit"
    exit 0
  fi

  git checkout -b $APIVERSION
fi

#
# Get swagger code generator
#
#VERSION=$(git ls-remote --tags https://github.com/swagger-api/swagger-codegen.git | grep -o "refs/tags/v.*" | sort -rV | head -1 | sed -e 's#.*v##')

#if [ ! -e swagger-codegen-cli-$VERSION.jar ]; then
#  wget -q http://central.maven.org/maven2/io/swagger/swagger-codegen-cli/$VERSION/swagger-codegen-cli-$VERSION.jar

#  if [ $? != 0 ]; then
#    echo "Could not download http://central.maven.org/maven2/io/swagger/swagger-codegen-cli/$VERSION/swagger-codegen-cli-$VERSION.jar"
#    exit -1
#  fi
#fi

#
# Transform and beautify swagger file
#
./transformation.sh
sed -i -f replace.sed esi.json

#
# Generate code
# Move tests so they are generated new and then moved to a different directory
#
test -d src/test/java/net/troja/eve/esi/api.new && rm -r src/test/java/net/troja/eve/esi/api.new
mv src/test/java/net/troja/eve/esi/api src/test/java/net/troja/eve/esi/api.old
java -jar swagger-codegen-cli.jar generate \
  -i esi.json \
  -l java \
  -c config.json
mv src/test/java/net/troja/eve/esi/api src/test/java/net/troja/eve/esi/api.new
mv src/test/java/net/troja/eve/esi/api.old src/test/java/net/troja/eve/esi/api

for I in $(grep "OpenAPI spec version" src/* -r | sed -e 's#:.*##'); do
  sed -i -e '/OpenAPI spec version/d' $I
done

#
# Generate SSO scopes
#
BAD_SCOPES=""
FILE="src/main/java/net/troja/eve/esi/auth/SsoScopes.java"
echo "package net.troja.eve.esi.auth;" > $FILE
echo "public class SsoScopes {" >> $FILE
for VAL in $(jq "(.paths[][] | select(.security[0].evesso).security[0].evesso[0])" esi.json | sort | uniq | sed -e 's#"##g'); do
  echo $BAD_SCOPES | grep $VAL > /dev/null && continue
  UPPER=$(echo $VAL | tr [.a-z-] [_A-Z_])
  if [ "a$ALL" = "a" ]; then
    ALL="$UPPER"
  else
    ALL="$ALL, $UPPER"
  fi
  echo "public static final String $UPPER = \"$VAL\";" >> $FILE
done
echo -e "\npublic static final String[] ALL = {$ALL};" >> $FILE
echo "}" >> $FILE

#
# Clean formating
#
mvn formatter:format

cp src/test/java/net/troja/eve/esi/api/GeneralApiTest.java src/test/java/net/troja/eve/esi/api.new/
cp -r src/test/java/net/troja/eve/esi/api/auth src/test/java/net/troja/eve/esi/api.new/

if [ "$GIT" = true ]; then
  git add .
  git commit -m "Generated API version $APIVERSION"
  git push origin $APIVERSION

  echo "New version $APIVERSION"

#
# Send email
#
  EMAILS=$(sed -n -e 's#.*<email>\(.*\)</email>#\1#p' pom.xml | tr "\n" " ")
  DIFFTESTS=$(diff -Naur src/test/java/net/troja/eve/esi/api.new src/test/java/net/troja/eve/esi/api)
  DIFF=$(git diff HEAD^ HEAD)
  echo -e "$DIFFTESTS\n\n$DIFF\n.\n" | mail -s "New eve-esi version $APIVERSION" $EMAILS

else
  echo "To publish to a git branch, start with '-g'"
fi
