/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
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

import net.troja.eve.esi.model.CharacterClonesResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClonesApi {
    private ApiClient apiClient;

    public ClonesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ClonesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getCharactersCharacterIdClones
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param callback
     *            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdClonesCall(Integer characterId, String datasource,
            String ifNoneMatch, String token, final ApiCallback callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v3/characters/{character_id}/clones/".replaceAll("\\{" + "character_id" + "\\}",
                apiClient.escapeString(characterId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("datasource", datasource));
        }

        if (token != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("token", token));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifNoneMatch != null) {
            localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));
        }

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "evesso" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, callback);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getCharactersCharacterIdClonesValidateBeforeCall(Integer characterId,
            String datasource, String ifNoneMatch, String token, final ApiCallback callback) throws ApiException {

        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException(
                    "Missing the required parameter 'characterId' when calling getCharactersCharacterIdClones(Async)");
        }

        com.squareup.okhttp.Call call = getCharactersCharacterIdClonesCall(characterId, datasource, ifNoneMatch, token,
                callback);
        return call;

    }

    /**
     * Get clones A list of the character&#39;s clones --- This route is cached
     * for up to 120 seconds SSO Scope: esi-clones.read_clones.v1
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @return CharacterClonesResponse
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public CharacterClonesResponse getCharactersCharacterIdClones(Integer characterId, String datasource,
            String ifNoneMatch, String token) throws ApiException {
        ApiResponse<CharacterClonesResponse> resp = getCharactersCharacterIdClonesWithHttpInfo(characterId, datasource,
                ifNoneMatch, token);
        return resp.getData();
    }

    /**
     * Get clones A list of the character&#39;s clones --- This route is cached
     * for up to 120 seconds SSO Scope: esi-clones.read_clones.v1
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @return ApiResponse&lt;CharacterClonesResponse&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<CharacterClonesResponse> getCharactersCharacterIdClonesWithHttpInfo(Integer characterId,
            String datasource, String ifNoneMatch, String token) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdClonesValidateBeforeCall(characterId, datasource,
                ifNoneMatch, token, null);
        Type localVarReturnType = new TypeToken<CharacterClonesResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get clones (asynchronously) A list of the character&#39;s clones --- This
     * route is cached for up to 120 seconds SSO Scope:
     * esi-clones.read_clones.v1
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdClonesAsync(Integer characterId, String datasource,
            String ifNoneMatch, String token, final ApiCallback<CharacterClonesResponse> callback) throws ApiException {

        com.squareup.okhttp.Call call = getCharactersCharacterIdClonesValidateBeforeCall(characterId, datasource,
                ifNoneMatch, token, callback);
        Type localVarReturnType = new TypeToken<CharacterClonesResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getCharactersCharacterIdImplants
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param callback
     *            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdImplantsCall(Integer characterId, String datasource,
            String ifNoneMatch, String token, final ApiCallback callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v1/characters/{character_id}/implants/".replaceAll("\\{" + "character_id" + "\\}",
                apiClient.escapeString(characterId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("datasource", datasource));
        }

        if (token != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("token", token));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifNoneMatch != null) {
            localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));
        }

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "evesso" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, callback);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getCharactersCharacterIdImplantsValidateBeforeCall(Integer characterId,
            String datasource, String ifNoneMatch, String token, final ApiCallback callback) throws ApiException {

        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException(
                    "Missing the required parameter 'characterId' when calling getCharactersCharacterIdImplants(Async)");
        }

        com.squareup.okhttp.Call call = getCharactersCharacterIdImplantsCall(characterId, datasource, ifNoneMatch,
                token, callback);
        return call;

    }

    /**
     * Get active implants Return implants on the active clone of a character
     * --- This route is cached for up to 120 seconds SSO Scope:
     * esi-clones.read_implants.v1
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @return List&lt;Integer&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public List<Integer> getCharactersCharacterIdImplants(Integer characterId, String datasource, String ifNoneMatch,
            String token) throws ApiException {
        ApiResponse<List<Integer>> resp = getCharactersCharacterIdImplantsWithHttpInfo(characterId, datasource,
                ifNoneMatch, token);
        return resp.getData();
    }

    /**
     * Get active implants Return implants on the active clone of a character
     * --- This route is cached for up to 120 seconds SSO Scope:
     * esi-clones.read_implants.v1
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @return ApiResponse&lt;List&lt;Integer&gt;&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<List<Integer>> getCharactersCharacterIdImplantsWithHttpInfo(Integer characterId,
            String datasource, String ifNoneMatch, String token) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdImplantsValidateBeforeCall(characterId, datasource,
                ifNoneMatch, token, null);
        Type localVarReturnType = new TypeToken<List<Integer>>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get active implants (asynchronously) Return implants on the active clone
     * of a character --- This route is cached for up to 120 seconds SSO Scope:
     * esi-clones.read_implants.v1
     * 
     * @param characterId
     *            An EVE character ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public com.squareup.okhttp.Call getCharactersCharacterIdImplantsAsync(Integer characterId, String datasource,
            String ifNoneMatch, String token, final ApiCallback<List<Integer>> callback) throws ApiException {

        com.squareup.okhttp.Call call = getCharactersCharacterIdImplantsValidateBeforeCall(characterId, datasource,
                ifNoneMatch, token, callback);
        Type localVarReturnType = new TypeToken<List<Integer>>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
