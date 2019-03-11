/*
 * ESI Meta Spec
 * ESI specs and miscellaneous routes
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

import net.troja.eve.esi.model.EsiStatusResponse;
import net.troja.eve.esi.model.EsiVerifyResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MetaApi {
    private ApiClient apiClient;

    public MetaApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MetaApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getHeaders
     * 
     * @param callback
     *            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getHeadersCall(final ApiCallback callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/headers/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
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
    private com.squareup.okhttp.Call getHeadersValidateBeforeCall(final ApiCallback callback) throws ApiException {

        com.squareup.okhttp.Call call = getHeadersCall(callback);
        return call;

    }

    /**
     * Debug request headers Echo the request headers for debugging purposes.
     * Note that the &#39;Connection&#39; header and any &#39;X-&#39; headers
     * are not included
     * 
     * @return Map&lt;String, String&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public Map<String, String> getHeaders() throws ApiException {
        ApiResponse<Map<String, String>> resp = getHeadersWithHttpInfo();
        return resp.getData();
    }

    /**
     * Debug request headers Echo the request headers for debugging purposes.
     * Note that the &#39;Connection&#39; header and any &#39;X-&#39; headers
     * are not included
     * 
     * @return ApiResponse&lt;Map&lt;String, String&gt;&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<Map<String, String>> getHeadersWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getHeadersValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<Map<String, String>>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Debug request headers (asynchronously) Echo the request headers for
     * debugging purposes. Note that the &#39;Connection&#39; header and any
     * &#39;X-&#39; headers are not included
     * 
     * @param callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public com.squareup.okhttp.Call getHeadersAsync(final ApiCallback<Map<String, String>> callback)
            throws ApiException {

        com.squareup.okhttp.Call call = getHeadersValidateBeforeCall(callback);
        Type localVarReturnType = new TypeToken<Map<String, String>>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getPing
     * 
     * @param callback
     *            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPingCall(final ApiCallback callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/ping";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "text/plain; charset=utf-8" };
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
    private com.squareup.okhttp.Call getPingValidateBeforeCall(final ApiCallback callback) throws ApiException {

        com.squareup.okhttp.Call call = getPingCall(callback);
        return call;

    }

    /**
     * Ping route Ping the ESI routers
     * 
     * @return String
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public String getPing() throws ApiException {
        ApiResponse<String> resp = getPingWithHttpInfo();
        return resp.getData();
    }

    /**
     * Ping route Ping the ESI routers
     * 
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<String> getPingWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getPingValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<String>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Ping route (asynchronously) Ping the ESI routers
     * 
     * @param callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public com.squareup.okhttp.Call getPingAsync(final ApiCallback<String> callback) throws ApiException {

        com.squareup.okhttp.Call call = getPingValidateBeforeCall(callback);
        Type localVarReturnType = new TypeToken<String>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getStatus
     * 
     * @param version
     *            The version of metrics to request. Note that alternate
     *            versions are grouped together (optional, default to latest)
     * @param callback
     *            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStatusCall(String version, final ApiCallback callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/status.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (version != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("version", version));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
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
    private com.squareup.okhttp.Call getStatusValidateBeforeCall(String version, final ApiCallback callback)
            throws ApiException {

        com.squareup.okhttp.Call call = getStatusCall(version, callback);
        return call;

    }

    /**
     * ESI health status Provides a general health indicator per route and
     * method
     * 
     * @param version
     *            The version of metrics to request. Note that alternate
     *            versions are grouped together (optional, default to latest)
     * @return List&lt;EsiStatusResponse&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public List<EsiStatusResponse> getStatus(String version) throws ApiException {
        ApiResponse<List<EsiStatusResponse>> resp = getStatusWithHttpInfo(version);
        return resp.getData();
    }

    /**
     * ESI health status Provides a general health indicator per route and
     * method
     * 
     * @param version
     *            The version of metrics to request. Note that alternate
     *            versions are grouped together (optional, default to latest)
     * @return ApiResponse&lt;List&lt;EsiStatusResponse&gt;&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<List<EsiStatusResponse>> getStatusWithHttpInfo(String version) throws ApiException {
        com.squareup.okhttp.Call call = getStatusValidateBeforeCall(version, null);
        Type localVarReturnType = new TypeToken<List<EsiStatusResponse>>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * ESI health status (asynchronously) Provides a general health indicator
     * per route and method
     * 
     * @param version
     *            The version of metrics to request. Note that alternate
     *            versions are grouped together (optional, default to latest)
     * @param callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public com.squareup.okhttp.Call getStatusAsync(String version, final ApiCallback<List<EsiStatusResponse>> callback)
            throws ApiException {

        com.squareup.okhttp.Call call = getStatusValidateBeforeCall(version, callback);
        Type localVarReturnType = new TypeToken<List<EsiStatusResponse>>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getVerify
     * 
     * @param userAgent
     *            Client identifier, takes precedence over headers (optional)
     * @param xUserAgent
     *            Client identifier, takes precedence over User-Agent (optional)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param authorization
     *            Access token, in the format of \&quot;Bearer &lt;access
     *            token&gt;\&quot; (optional)
     * @param callback
     *            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getVerifyCall(String userAgent, String xUserAgent, String datasource, String token,
            String authorization, final ApiCallback callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/verify/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (userAgent != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("user_agent", userAgent));
        }

        if (datasource != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("datasource", datasource));
        }

        if (token != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("token", token));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xUserAgent != null) {
            localVarHeaderParams.put("X-User-Agent", apiClient.parameterToString(xUserAgent));
        }

        if (authorization != null) {
            localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));
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
    private com.squareup.okhttp.Call getVerifyValidateBeforeCall(String userAgent, String xUserAgent,
            String datasource, String token, String authorization, final ApiCallback callback) throws ApiException {

        com.squareup.okhttp.Call call = getVerifyCall(userAgent, xUserAgent, datasource, token, authorization, callback);
        return call;

    }

    /**
     * Verify access token Verify authorization tokens in ESI&#39;s auth cache
     * 
     * @param userAgent
     *            Client identifier, takes precedence over headers (optional)
     * @param xUserAgent
     *            Client identifier, takes precedence over User-Agent (optional)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param authorization
     *            Access token, in the format of \&quot;Bearer &lt;access
     *            token&gt;\&quot; (optional)
     * @return EsiVerifyResponse
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public EsiVerifyResponse getVerify(String userAgent, String xUserAgent, String datasource, String token,
            String authorization) throws ApiException {
        ApiResponse<EsiVerifyResponse> resp = getVerifyWithHttpInfo(userAgent, xUserAgent, datasource, token,
                authorization);
        return resp.getData();
    }

    /**
     * Verify access token Verify authorization tokens in ESI&#39;s auth cache
     * 
     * @param userAgent
     *            Client identifier, takes precedence over headers (optional)
     * @param xUserAgent
     *            Client identifier, takes precedence over User-Agent (optional)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param authorization
     *            Access token, in the format of \&quot;Bearer &lt;access
     *            token&gt;\&quot; (optional)
     * @return ApiResponse&lt;EsiVerifyResponse&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<EsiVerifyResponse> getVerifyWithHttpInfo(String userAgent, String xUserAgent, String datasource,
            String token, String authorization) throws ApiException {
        com.squareup.okhttp.Call call = getVerifyValidateBeforeCall(userAgent, xUserAgent, datasource, token,
                authorization, null);
        Type localVarReturnType = new TypeToken<EsiVerifyResponse>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Verify access token (asynchronously) Verify authorization tokens in
     * ESI&#39;s auth cache
     * 
     * @param userAgent
     *            Client identifier, takes precedence over headers (optional)
     * @param xUserAgent
     *            Client identifier, takes precedence over User-Agent (optional)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param token
     *            Access token to use if unable to set a header (optional)
     * @param authorization
     *            Access token, in the format of \&quot;Bearer &lt;access
     *            token&gt;\&quot; (optional)
     * @param callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public com.squareup.okhttp.Call getVerifyAsync(String userAgent, String xUserAgent, String datasource,
            String token, String authorization, final ApiCallback<EsiVerifyResponse> callback) throws ApiException {

        com.squareup.okhttp.Call call = getVerifyValidateBeforeCall(userAgent, xUserAgent, datasource, token,
                authorization, callback);
        Type localVarReturnType = new TypeToken<EsiVerifyResponse>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for getVersions
     * 
     * @param userAgent
     *            Client identifier, takes precedence over headers (optional)
     * @param xUserAgent
     *            Client identifier, takes precedence over User-Agent (optional)
     * @param callback
     *            Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getVersionsCall(String userAgent, String xUserAgent, final ApiCallback callback)
            throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/versions/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (userAgent != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("user_agent", userAgent));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xUserAgent != null) {
            localVarHeaderParams.put("X-User-Agent", apiClient.parameterToString(xUserAgent));
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
    private com.squareup.okhttp.Call getVersionsValidateBeforeCall(String userAgent, String xUserAgent,
            final ApiCallback callback) throws ApiException {

        com.squareup.okhttp.Call call = getVersionsCall(userAgent, xUserAgent, callback);
        return call;

    }

    /**
     * List versions List all endpoint versions
     * 
     * @param userAgent
     *            Client identifier, takes precedence over headers (optional)
     * @param xUserAgent
     *            Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;String&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public List<String> getVersions(String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<String>> resp = getVersionsWithHttpInfo(userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * List versions List all endpoint versions
     * 
     * @param userAgent
     *            Client identifier, takes precedence over headers (optional)
     * @param xUserAgent
     *            Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<List<String>> getVersionsWithHttpInfo(String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getVersionsValidateBeforeCall(userAgent, xUserAgent, null);
        Type localVarReturnType = new TypeToken<List<String>>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List versions (asynchronously) List all endpoint versions
     * 
     * @param userAgent
     *            Client identifier, takes precedence over headers (optional)
     * @param xUserAgent
     *            Client identifier, takes precedence over User-Agent (optional)
     * @param callback
     *            The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException
     *             If fail to process the API call, e.g. serializing the request
     *             body object
     */
    public com.squareup.okhttp.Call getVersionsAsync(String userAgent, String xUserAgent,
            final ApiCallback<List<String>> callback) throws ApiException {

        com.squareup.okhttp.Call call = getVersionsValidateBeforeCall(userAgent, xUserAgent, callback);
        Type localVarReturnType = new TypeToken<List<String>>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
