/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package net.troja.eve.esi.api;

import net.troja.eve.esi.ApiCallback;
import net.troja.eve.esi.ApiClient;
import net.troja.eve.esi.ApiException;
import net.troja.eve.esi.ApiResponse;
import net.troja.eve.esi.Configuration;
import net.troja.eve.esi.Pair;
import net.troja.eve.esi.ProgressRequestBody;
import net.troja.eve.esi.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import net.troja.eve.esi.model.CharacterKillmailsResponse;
import net.troja.eve.esi.model.CorporationKillmailsResponse;
import net.troja.eve.esi.model.KillmailResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KillmailsApi {
    private ApiClient apiClient;

    public KillmailsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public KillmailsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getCharactersCharacterIdKillmailsRecent
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param page
     *            Which page of results to return (optional, default to 1)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param progressListener
     *            Progress listener
     * @param progressRequestListener
     *            Progress request listener
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdKillmailsRecentCall(Integer characterId, String datasource,
            String ifNoneMatch, Integer page, String token,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/characters/{character_id}/killmails/recent/".replaceAll("\\{" + "character_id"
                + "\\}", apiClient.escapeString(characterId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("datasource", datasource));
        if (page != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (token != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("token", token));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifNoneMatch != null)
            localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null)
            localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain)
                        throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "evesso" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getCharactersCharacterIdKillmailsRecentValidateBeforeCall(Integer characterId,
            String datasource, String ifNoneMatch, Integer page, String token,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException(
                    "Missing the required parameter 'characterId' when calling getCharactersCharacterIdKillmailsRecent(Async)");
        }

        com.squareup.okhttp.Call call = getCharactersCharacterIdKillmailsRecentCall(characterId, datasource,
                ifNoneMatch, page, token, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a character&#39;s recent kills and losses Return a list of a
     * character&#39;s kills and losses going back 90 days --- This route is
     * cached for up to 300 seconds SSO Scope: esi-killmails.read_killmails.v1
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param page
     *            Which page of results to return (optional, default to 1)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @return List&lt;CharacterKillmailsResponse&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public List<CharacterKillmailsResponse> getCharactersCharacterIdKillmailsRecent(Integer characterId,
            String datasource, String ifNoneMatch, Integer page, String token) throws ApiException {
        ApiResponse<List<CharacterKillmailsResponse>> resp = getCharactersCharacterIdKillmailsRecentWithHttpInfo(
                characterId, datasource, ifNoneMatch, page, token);
        return resp.getData();
    }

    /**
     * Get a character&#39;s recent kills and losses Return a list of a
     * character&#39;s kills and losses going back 90 days --- This route is
     * cached for up to 300 seconds SSO Scope: esi-killmails.read_killmails.v1
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param page
     *            Which page of results to return (optional, default to 1)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @return ApiResponse&lt;List&lt;CharacterKillmailsResponse&gt;&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<List<CharacterKillmailsResponse>> getCharactersCharacterIdKillmailsRecentWithHttpInfo(
            Integer characterId, String datasource, String ifNoneMatch, Integer page, String token) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdKillmailsRecentValidateBeforeCall(characterId,
                datasource, ifNoneMatch, page, token, null, null);
        Type localVarReturnType = new TypeToken<List<CharacterKillmailsResponse>>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a character&#39;s recent kills and losses (asynchronously) Return a
     * list of a character&#39;s kills and losses going back 90 days --- This
     * route is cached for up to 300 seconds SSO Scope:
     * esi-killmails.read_killmails.v1
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param page
     *            Which page of results to return (optional, default to 1)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdKillmailsRecentAsync(Integer characterId,
            String datasource, String ifNoneMatch, Integer page, String token,
            final ApiCallback<List<CharacterKillmailsResponse>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getCharactersCharacterIdKillmailsRecentValidateBeforeCall(characterId,
                datasource, ifNoneMatch, page, token, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<CharacterKillmailsResponse>>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getCorporationsCorporationIdKillmailsRecent
     * 
     * @param corporationId
     *            An EVE corporation ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param page
     *            Which page of results to return (optional, default to 1)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param progressListener
     *            Progress listener
     * @param progressRequestListener
     *            Progress request listener
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCorporationsCorporationIdKillmailsRecentCall(Integer corporationId,
            String datasource, String ifNoneMatch, Integer page, String token,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/corporations/{corporation_id}/killmails/recent/".replaceAll("\\{" + "corporation_id"
                + "\\}", apiClient.escapeString(corporationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("datasource", datasource));
        if (page != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (token != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("token", token));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifNoneMatch != null)
            localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null)
            localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain)
                        throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "evesso" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getCorporationsCorporationIdKillmailsRecentValidateBeforeCall(
            Integer corporationId, String datasource, String ifNoneMatch, Integer page, String token,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'corporationId' is set
        if (corporationId == null) {
            throw new ApiException(
                    "Missing the required parameter 'corporationId' when calling getCorporationsCorporationIdKillmailsRecent(Async)");
        }

        com.squareup.okhttp.Call call = getCorporationsCorporationIdKillmailsRecentCall(corporationId, datasource,
                ifNoneMatch, page, token, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a corporation&#39;s recent kills and losses Get a list of a
     * corporation&#39;s kills and losses going back 90 days --- This route is
     * cached for up to 300 seconds --- Requires one of the following EVE
     * corporation role(s): Director SSO Scope:
     * esi-killmails.read_corporation_killmails.v1
     * 
     * @param corporationId
     *            An EVE corporation ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param page
     *            Which page of results to return (optional, default to 1)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @return List&lt;CorporationKillmailsResponse&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public List<CorporationKillmailsResponse> getCorporationsCorporationIdKillmailsRecent(Integer corporationId,
            String datasource, String ifNoneMatch, Integer page, String token) throws ApiException {
        ApiResponse<List<CorporationKillmailsResponse>> resp = getCorporationsCorporationIdKillmailsRecentWithHttpInfo(
                corporationId, datasource, ifNoneMatch, page, token);
        return resp.getData();
    }

    /**
     * Get a corporation&#39;s recent kills and losses Get a list of a
     * corporation&#39;s kills and losses going back 90 days --- This route is
     * cached for up to 300 seconds --- Requires one of the following EVE
     * corporation role(s): Director SSO Scope:
     * esi-killmails.read_corporation_killmails.v1
     * 
     * @param corporationId
     *            An EVE corporation ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param page
     *            Which page of results to return (optional, default to 1)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @return ApiResponse&lt;List&lt;CorporationKillmailsResponse&gt;&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<List<CorporationKillmailsResponse>> getCorporationsCorporationIdKillmailsRecentWithHttpInfo(
            Integer corporationId, String datasource, String ifNoneMatch, Integer page, String token)
            throws ApiException {
        com.squareup.okhttp.Call call = getCorporationsCorporationIdKillmailsRecentValidateBeforeCall(corporationId,
                datasource, ifNoneMatch, page, token, null, null);
        Type localVarReturnType = new TypeToken<List<CorporationKillmailsResponse>>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a corporation&#39;s recent kills and losses (asynchronously) Get a
     * list of a corporation&#39;s kills and losses going back 90 days --- This
     * route is cached for up to 300 seconds --- Requires one of the following
     * EVE corporation role(s): Director SSO Scope:
     * esi-killmails.read_corporation_killmails.v1
     * 
     * @param corporationId
     *            An EVE corporation ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param page
     *            Which page of results to return (optional, default to 1)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public com.squareup.okhttp.Call getCorporationsCorporationIdKillmailsRecentAsync(Integer corporationId,
            String datasource, String ifNoneMatch, Integer page, String token,
            final ApiCallback<List<CorporationKillmailsResponse>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getCorporationsCorporationIdKillmailsRecentValidateBeforeCall(corporationId,
                datasource, ifNoneMatch, page, token, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<CorporationKillmailsResponse>>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getKillmailsKillmailIdKillmailHash
     * 
     * @param killmailHash
     *            The killmail hash for verification (required)
     * @param killmailId
     *            The killmail ID to be queried (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param progressListener
     *            Progress listener
     * @param progressRequestListener
     *            Progress request listener
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getKillmailsKillmailIdKillmailHashCall(String killmailHash, Integer killmailId,
            String datasource, String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/killmails/{killmail_id}/{killmail_hash}/".replaceAll(
                "\\{" + "killmail_hash" + "\\}", apiClient.escapeString(killmailHash.toString())).replaceAll(
                "\\{" + "killmail_id" + "\\}", apiClient.escapeString(killmailId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("datasource", datasource));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifNoneMatch != null)
            localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null)
            localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain)
                        throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {};
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getKillmailsKillmailIdKillmailHashValidateBeforeCall(String killmailHash,
            Integer killmailId, String datasource, String ifNoneMatch,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'killmailHash' is set
        if (killmailHash == null) {
            throw new ApiException(
                    "Missing the required parameter 'killmailHash' when calling getKillmailsKillmailIdKillmailHash(Async)");
        }

        // verify the required parameter 'killmailId' is set
        if (killmailId == null) {
            throw new ApiException(
                    "Missing the required parameter 'killmailId' when calling getKillmailsKillmailIdKillmailHash(Async)");
        }

        com.squareup.okhttp.Call call = getKillmailsKillmailIdKillmailHashCall(killmailHash, killmailId, datasource,
                ifNoneMatch, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get a single killmail Return a single killmail from its ID and hash ---
     * This route is cached for up to 1209600 seconds
     * 
     * @param killmailHash
     *            The killmail hash for verification (required)
     * @param killmailId
     *            The killmail ID to be queried (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @return KillmailResponse
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public KillmailResponse getKillmailsKillmailIdKillmailHash(String killmailHash, Integer killmailId,
            String datasource, String ifNoneMatch) throws ApiException {
        ApiResponse<KillmailResponse> resp = getKillmailsKillmailIdKillmailHashWithHttpInfo(killmailHash, killmailId,
                datasource, ifNoneMatch);
        return resp.getData();
    }

    /**
     * Get a single killmail Return a single killmail from its ID and hash ---
     * This route is cached for up to 1209600 seconds
     * 
     * @param killmailHash
     *            The killmail hash for verification (required)
     * @param killmailId
     *            The killmail ID to be queried (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @return ApiResponse&lt;KillmailResponse&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<KillmailResponse> getKillmailsKillmailIdKillmailHashWithHttpInfo(String killmailHash,
            Integer killmailId, String datasource, String ifNoneMatch) throws ApiException {
        com.squareup.okhttp.Call call = getKillmailsKillmailIdKillmailHashValidateBeforeCall(killmailHash, killmailId,
                datasource, ifNoneMatch, null, null);
        Type localVarReturnType = new TypeToken<KillmailResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a single killmail (asynchronously) Return a single killmail from its
     * ID and hash --- This route is cached for up to 1209600 seconds
     * 
     * @param killmailHash
     *            The killmail hash for verification (required)
     * @param killmailId
     *            The killmail ID to be queried (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public com.squareup.okhttp.Call getKillmailsKillmailIdKillmailHashAsync(String killmailHash, Integer killmailId,
            String datasource, String ifNoneMatch, final ApiCallback<KillmailResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getKillmailsKillmailIdKillmailHashValidateBeforeCall(killmailHash, killmailId,
                datasource, ifNoneMatch, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<KillmailResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
