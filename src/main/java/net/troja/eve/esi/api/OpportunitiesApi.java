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

import net.troja.eve.esi.model.CharacterOpportunitiesResponse;
import net.troja.eve.esi.model.OpportunitiesGroupResponse;
import net.troja.eve.esi.model.OpportunitiesTasksResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OpportunitiesApi {
    private ApiClient apiClient;

    public OpportunitiesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OpportunitiesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getCharactersCharacterIdOpportunities
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
    public com.squareup.okhttp.Call getCharactersCharacterIdOpportunitiesCall(Integer characterId, String datasource,
            String ifNoneMatch, String token, final ApiCallback callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v1/characters/{character_id}/opportunities/".replaceAll("\\{" + "character_id" + "\\}",
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
    private com.squareup.okhttp.Call getCharactersCharacterIdOpportunitiesValidateBeforeCall(Integer characterId,
            String datasource, String ifNoneMatch, String token, final ApiCallback callback) throws ApiException {

        // verify the required parameter 'characterId' is set
        if (characterId == null) {
            throw new ApiException(
                    "Missing the required parameter 'characterId' when calling getCharactersCharacterIdOpportunities(Async)");
        }

        com.squareup.okhttp.Call call = getCharactersCharacterIdOpportunitiesCall(characterId, datasource, ifNoneMatch,
                token, callback);
        return call;

    }

    /**
     * Get a character&#39;s completed tasks Return a list of tasks finished by
     * a character --- This route is cached for up to 3600 seconds SSO Scope:
     * esi-characters.read_opportunities.v1
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
     * @return List&lt;CharacterOpportunitiesResponse&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public List<CharacterOpportunitiesResponse> getCharactersCharacterIdOpportunities(Integer characterId,
            String datasource, String ifNoneMatch, String token) throws ApiException {
        ApiResponse<List<CharacterOpportunitiesResponse>> resp = getCharactersCharacterIdOpportunitiesWithHttpInfo(
                characterId, datasource, ifNoneMatch, token);
        return resp.getData();
    }

    /**
     * Get a character&#39;s completed tasks Return a list of tasks finished by
     * a character --- This route is cached for up to 3600 seconds SSO Scope:
     * esi-characters.read_opportunities.v1
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
     * @return ApiResponse&lt;List&lt;CharacterOpportunitiesResponse&gt;&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<List<CharacterOpportunitiesResponse>> getCharactersCharacterIdOpportunitiesWithHttpInfo(
            Integer characterId, String datasource, String ifNoneMatch, String token) throws ApiException {
        com.squareup.okhttp.Call call = getCharactersCharacterIdOpportunitiesValidateBeforeCall(characterId,
                datasource, ifNoneMatch, token, null);
        Type localVarReturnType = new TypeToken<List<CharacterOpportunitiesResponse>>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a character&#39;s completed tasks (asynchronously) Return a list of
     * tasks finished by a character --- This route is cached for up to 3600
     * seconds SSO Scope: esi-characters.read_opportunities.v1
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
    public com.squareup.okhttp.Call getCharactersCharacterIdOpportunitiesAsync(Integer characterId, String datasource,
            String ifNoneMatch, String token, final ApiCallback<List<CharacterOpportunitiesResponse>> callback)
            throws ApiException {

        com.squareup.okhttp.Call call = getCharactersCharacterIdOpportunitiesValidateBeforeCall(characterId,
                datasource, ifNoneMatch, token, callback);
        Type localVarReturnType = new TypeToken<List<CharacterOpportunitiesResponse>>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getOpportunitiesGroups
     * 
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param callback
     *            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOpportunitiesGroupsCall(String datasource, String ifNoneMatch,
            final ApiCallback callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v1/opportunities/groups/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("datasource", datasource));
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

        String[] localVarAuthNames = new String[] {};
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, callback);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getOpportunitiesGroupsValidateBeforeCall(String datasource, String ifNoneMatch,
            final ApiCallback callback) throws ApiException {

        com.squareup.okhttp.Call call = getOpportunitiesGroupsCall(datasource, ifNoneMatch, callback);
        return call;

    }

    /**
     * Get opportunities groups Return a list of opportunities groups --- This
     * route expires daily at 11:05
     * 
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @return List&lt;Integer&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public List<Integer> getOpportunitiesGroups(String datasource, String ifNoneMatch) throws ApiException {
        ApiResponse<List<Integer>> resp = getOpportunitiesGroupsWithHttpInfo(datasource, ifNoneMatch);
        return resp.getData();
    }

    /**
     * Get opportunities groups Return a list of opportunities groups --- This
     * route expires daily at 11:05
     * 
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @return ApiResponse&lt;List&lt;Integer&gt;&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<List<Integer>> getOpportunitiesGroupsWithHttpInfo(String datasource, String ifNoneMatch)
            throws ApiException {
        com.squareup.okhttp.Call call = getOpportunitiesGroupsValidateBeforeCall(datasource, ifNoneMatch, null);
        Type localVarReturnType = new TypeToken<List<Integer>>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get opportunities groups (asynchronously) Return a list of opportunities
     * groups --- This route expires daily at 11:05
     * 
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
    public com.squareup.okhttp.Call getOpportunitiesGroupsAsync(String datasource, String ifNoneMatch,
            final ApiCallback<List<Integer>> callback) throws ApiException {

        com.squareup.okhttp.Call call = getOpportunitiesGroupsValidateBeforeCall(datasource, ifNoneMatch, callback);
        Type localVarReturnType = new TypeToken<List<Integer>>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getOpportunitiesGroupsGroupId
     * 
     * @param groupId
     *            ID of an opportunities group (required)
     * @param acceptLanguage
     *            Language to use in the response (optional, default to en-us)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param language
     *            Language to use in the response, takes precedence over
     *            Accept-Language (optional, default to en-us)
     * @param callback
     *            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOpportunitiesGroupsGroupIdCall(Integer groupId, String acceptLanguage,
            String datasource, String ifNoneMatch, String language, final ApiCallback callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v1/opportunities/groups/{group_id}/".replaceAll("\\{" + "group_id" + "\\}",
                apiClient.escapeString(groupId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("datasource", datasource));
        }

        if (language != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("language", language));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (acceptLanguage != null) {
            localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));
        }

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

        String[] localVarAuthNames = new String[] {};
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, callback);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getOpportunitiesGroupsGroupIdValidateBeforeCall(Integer groupId,
            String acceptLanguage, String datasource, String ifNoneMatch, String language, final ApiCallback callback)
            throws ApiException {

        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new ApiException(
                    "Missing the required parameter 'groupId' when calling getOpportunitiesGroupsGroupId(Async)");
        }

        com.squareup.okhttp.Call call = getOpportunitiesGroupsGroupIdCall(groupId, acceptLanguage, datasource,
                ifNoneMatch, language, callback);
        return call;

    }

    /**
     * Get opportunities group Return information of an opportunities group ---
     * This route expires daily at 11:05
     * 
     * @param groupId
     *            ID of an opportunities group (required)
     * @param acceptLanguage
     *            Language to use in the response (optional, default to en-us)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param language
     *            Language to use in the response, takes precedence over
     *            Accept-Language (optional, default to en-us)
     * @return OpportunitiesGroupResponse
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public OpportunitiesGroupResponse getOpportunitiesGroupsGroupId(Integer groupId, String acceptLanguage,
            String datasource, String ifNoneMatch, String language) throws ApiException {
        ApiResponse<OpportunitiesGroupResponse> resp = getOpportunitiesGroupsGroupIdWithHttpInfo(groupId,
                acceptLanguage, datasource, ifNoneMatch, language);
        return resp.getData();
    }

    /**
     * Get opportunities group Return information of an opportunities group ---
     * This route expires daily at 11:05
     * 
     * @param groupId
     *            ID of an opportunities group (required)
     * @param acceptLanguage
     *            Language to use in the response (optional, default to en-us)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param language
     *            Language to use in the response, takes precedence over
     *            Accept-Language (optional, default to en-us)
     * @return ApiResponse&lt;OpportunitiesGroupResponse&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<OpportunitiesGroupResponse> getOpportunitiesGroupsGroupIdWithHttpInfo(Integer groupId,
            String acceptLanguage, String datasource, String ifNoneMatch, String language) throws ApiException {
        com.squareup.okhttp.Call call = getOpportunitiesGroupsGroupIdValidateBeforeCall(groupId, acceptLanguage,
                datasource, ifNoneMatch, language, null);
        Type localVarReturnType = new TypeToken<OpportunitiesGroupResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get opportunities group (asynchronously) Return information of an
     * opportunities group --- This route expires daily at 11:05
     * 
     * @param groupId
     *            ID of an opportunities group (required)
     * @param acceptLanguage
     *            Language to use in the response (optional, default to en-us)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param language
     *            Language to use in the response, takes precedence over
     *            Accept-Language (optional, default to en-us)
     * @param callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public com.squareup.okhttp.Call getOpportunitiesGroupsGroupIdAsync(Integer groupId, String acceptLanguage,
            String datasource, String ifNoneMatch, String language,
            final ApiCallback<OpportunitiesGroupResponse> callback) throws ApiException {

        com.squareup.okhttp.Call call = getOpportunitiesGroupsGroupIdValidateBeforeCall(groupId, acceptLanguage,
                datasource, ifNoneMatch, language, callback);
        Type localVarReturnType = new TypeToken<OpportunitiesGroupResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getOpportunitiesTasks
     * 
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param callback
     *            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOpportunitiesTasksCall(String datasource, String ifNoneMatch,
            final ApiCallback callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v1/opportunities/tasks/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("datasource", datasource));
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

        String[] localVarAuthNames = new String[] {};
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, callback);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getOpportunitiesTasksValidateBeforeCall(String datasource, String ifNoneMatch,
            final ApiCallback callback) throws ApiException {

        com.squareup.okhttp.Call call = getOpportunitiesTasksCall(datasource, ifNoneMatch, callback);
        return call;

    }

    /**
     * Get opportunities tasks Return a list of opportunities tasks --- This
     * route expires daily at 11:05
     * 
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @return List&lt;Integer&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public List<Integer> getOpportunitiesTasks(String datasource, String ifNoneMatch) throws ApiException {
        ApiResponse<List<Integer>> resp = getOpportunitiesTasksWithHttpInfo(datasource, ifNoneMatch);
        return resp.getData();
    }

    /**
     * Get opportunities tasks Return a list of opportunities tasks --- This
     * route expires daily at 11:05
     * 
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @return ApiResponse&lt;List&lt;Integer&gt;&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<List<Integer>> getOpportunitiesTasksWithHttpInfo(String datasource, String ifNoneMatch)
            throws ApiException {
        com.squareup.okhttp.Call call = getOpportunitiesTasksValidateBeforeCall(datasource, ifNoneMatch, null);
        Type localVarReturnType = new TypeToken<List<Integer>>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get opportunities tasks (asynchronously) Return a list of opportunities
     * tasks --- This route expires daily at 11:05
     * 
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
    public com.squareup.okhttp.Call getOpportunitiesTasksAsync(String datasource, String ifNoneMatch,
            final ApiCallback<List<Integer>> callback) throws ApiException {

        com.squareup.okhttp.Call call = getOpportunitiesTasksValidateBeforeCall(datasource, ifNoneMatch, callback);
        Type localVarReturnType = new TypeToken<List<Integer>>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getOpportunitiesTasksTaskId
     * 
     * @param taskId
     *            ID of an opportunities task (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @param callback
     *            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOpportunitiesTasksTaskIdCall(Integer taskId, String datasource,
            String ifNoneMatch, final ApiCallback callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v1/opportunities/tasks/{task_id}/".replaceAll("\\{" + "task_id" + "\\}",
                apiClient.escapeString(taskId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (datasource != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("datasource", datasource));
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

        String[] localVarAuthNames = new String[] {};
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, callback);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getOpportunitiesTasksTaskIdValidateBeforeCall(Integer taskId, String datasource,
            String ifNoneMatch, final ApiCallback callback) throws ApiException {

        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new ApiException(
                    "Missing the required parameter 'taskId' when calling getOpportunitiesTasksTaskId(Async)");
        }

        com.squareup.okhttp.Call call = getOpportunitiesTasksTaskIdCall(taskId, datasource, ifNoneMatch, callback);
        return call;

    }

    /**
     * Get opportunities task Return information of an opportunities task ---
     * This route expires daily at 11:05
     * 
     * @param taskId
     *            ID of an opportunities task (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @return OpportunitiesTasksResponse
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public OpportunitiesTasksResponse getOpportunitiesTasksTaskId(Integer taskId, String datasource, String ifNoneMatch)
            throws ApiException {
        ApiResponse<OpportunitiesTasksResponse> resp = getOpportunitiesTasksTaskIdWithHttpInfo(taskId, datasource,
                ifNoneMatch);
        return resp.getData();
    }

    /**
     * Get opportunities task Return information of an opportunities task ---
     * This route expires daily at 11:05
     * 
     * @param taskId
     *            ID of an opportunities task (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @return ApiResponse&lt;OpportunitiesTasksResponse&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<OpportunitiesTasksResponse> getOpportunitiesTasksTaskIdWithHttpInfo(Integer taskId,
            String datasource, String ifNoneMatch) throws ApiException {
        com.squareup.okhttp.Call call = getOpportunitiesTasksTaskIdValidateBeforeCall(taskId, datasource, ifNoneMatch,
                null);
        Type localVarReturnType = new TypeToken<OpportunitiesTasksResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get opportunities task (asynchronously) Return information of an
     * opportunities task --- This route expires daily at 11:05
     * 
     * @param taskId
     *            ID of an opportunities task (required)
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
    public com.squareup.okhttp.Call getOpportunitiesTasksTaskIdAsync(Integer taskId, String datasource,
            String ifNoneMatch, final ApiCallback<OpportunitiesTasksResponse> callback) throws ApiException {

        com.squareup.okhttp.Call call = getOpportunitiesTasksTaskIdValidateBeforeCall(taskId, datasource, ifNoneMatch,
                callback);
        Type localVarReturnType = new TypeToken<OpportunitiesTasksResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
