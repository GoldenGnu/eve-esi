package net.troja.eve.esi.api;

import java.util.Map;

import org.junit.BeforeClass;

import net.troja.eve.esi.ApiClient;
import net.troja.eve.esi.ApiException;
import net.troja.eve.esi.auth.CharacterInfo;
import net.troja.eve.esi.auth.OAuth;

public class GeneralApiTest {
    protected static final String DATASOURCE = "tranquility";
    protected static final String SSO_CLIENT_ID = "SSO_CLIENT_ID";
    protected static final String SSO_CLIENT_SECRET = "SSO_CLIENT_SECRET";
    protected static final String SSO_REFRESH_TOKEN = "SSO_REFRESH_TOKEN";

    protected static String clientId;
    protected static String clientSecret;
    protected static String refreshToken;
    protected static int characterId;

    protected static ApiClient apiClient;

    @BeforeClass
    public static void initClass() throws ApiException {
        final Map<String, String> env = System.getenv();

        clientId = env.get(SSO_CLIENT_ID);
        clientSecret = env.get(SSO_CLIENT_SECRET);
        refreshToken = env.get(SSO_REFRESH_TOKEN);

        apiClient = new ApiClient();
        final OAuth auth = (OAuth) apiClient.getAuthentication("evesso");
        auth.setClientId(clientId);
        auth.setClientSecret(clientSecret);
        auth.setRefreshToken(refreshToken);

        characterId = getCharacterId();
    }

    private static int getCharacterId() throws ApiException {
        final ApiClient client = new ApiClient();
        final OAuth auth = (OAuth) client.getAuthentication("evesso");
        auth.setClientId(clientId);
        auth.setClientSecret(clientSecret);
        auth.setRefreshToken(refreshToken);

        final SsoApi api = new SsoApi(client);
        final CharacterInfo info = api.getCharacterInfo();

        return info.getCharacterId();
    }
}