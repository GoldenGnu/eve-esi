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

import net.troja.eve.esi.model.InsurancePricesResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InsuranceApi {
    private ApiClient apiClient;

    public InsuranceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public InsuranceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getInsurancePrices
     * 
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
     * @param progressListener
     *            Progress listener
     * @param progressRequestListener
     *            Progress request listener
     * @return Call to execute
     * @throws ApiException
     *             If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getInsurancePricesCall(String acceptLanguage, String datasource,
            String ifNoneMatch, String language, final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v1/insurance/prices/";

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
    private com.squareup.okhttp.Call getInsurancePricesValidateBeforeCall(String acceptLanguage, String datasource,
            String ifNoneMatch, String language, final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        com.squareup.okhttp.Call call = getInsurancePricesCall(acceptLanguage, datasource, ifNoneMatch, language,
                progressListener, progressRequestListener);
        return call;

    }

    /**
     * List insurance levels Return available insurance levels for all ship
     * types --- This route is cached for up to 3600 seconds
     * 
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
     * @return List&lt;InsurancePricesResponse&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public List<InsurancePricesResponse> getInsurancePrices(String acceptLanguage, String datasource,
            String ifNoneMatch, String language) throws ApiException {
        ApiResponse<List<InsurancePricesResponse>> resp = getInsurancePricesWithHttpInfo(acceptLanguage, datasource,
                ifNoneMatch, language);
        return resp.getData();
    }

    /**
     * List insurance levels Return available insurance levels for all ship
     * types --- This route is cached for up to 3600 seconds
     * 
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
     * @return ApiResponse&lt;List&lt;InsurancePricesResponse&gt;&gt;
     * @throws ApiException
     *             If fail to call the API, e.g. server error or cannot
     *             deserialize the response body
     */
    public ApiResponse<List<InsurancePricesResponse>> getInsurancePricesWithHttpInfo(String acceptLanguage,
            String datasource, String ifNoneMatch, String language) throws ApiException {
        com.squareup.okhttp.Call call = getInsurancePricesValidateBeforeCall(acceptLanguage, datasource, ifNoneMatch,
                language, null, null);
        Type localVarReturnType = new TypeToken<List<InsurancePricesResponse>>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List insurance levels (asynchronously) Return available insurance levels
     * for all ship types --- This route is cached for up to 3600 seconds
     * 
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
    public com.squareup.okhttp.Call getInsurancePricesAsync(String acceptLanguage, String datasource,
            String ifNoneMatch, String language, final ApiCallback<List<InsurancePricesResponse>> callback)
            throws ApiException {

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

        com.squareup.okhttp.Call call = getInsurancePricesValidateBeforeCall(acceptLanguage, datasource, ifNoneMatch,
                language, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<InsurancePricesResponse>>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
