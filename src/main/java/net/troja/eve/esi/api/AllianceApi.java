package net.troja.eve.esi.api;

import net.troja.eve.esi.ApiException;
import net.troja.eve.esi.ApiClient;
import net.troja.eve.esi.Configuration;
import net.troja.eve.esi.Pair;

import javax.ws.rs.core.GenericType;

import net.troja.eve.esi.model.AllianceIconsResponse;
import net.troja.eve.esi.model.AllianceResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllianceApi {
    private ApiClient apiClient;

    public AllianceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AllianceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List all alliances List all active player alliances --- This route is
     * cached for up to 3600 seconds
     * 
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @return List&lt;Integer&gt;
     * @throws ApiException
     *             if fails to make API call
     */
    public List<Integer> getAlliances(String datasource, String ifNoneMatch) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/alliances/".replaceAll("\\{format\\}", "json");

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));

        if (ifNoneMatch != null)
            localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {};

        GenericType<List<Integer>> localVarReturnType = new GenericType<List<Integer>>() {
        };
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams,
                localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get alliance information Public information about an alliance --- This
     * route is cached for up to 3600 seconds
     * 
     * @param allianceId
     *            An EVE alliance ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @return AllianceResponse
     * @throws ApiException
     *             if fails to make API call
     */
    public AllianceResponse getAlliancesAllianceId(Integer allianceId, String datasource, String ifNoneMatch)
            throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'allianceId' is set
        if (allianceId == null) {
            throw new ApiException(400,
                    "Missing the required parameter 'allianceId' when calling getAlliancesAllianceId");
        }

        // create path and map variables
        String localVarPath = "/v3/alliances/{alliance_id}/".replaceAll("\\{format\\}", "json").replaceAll(
                "\\{" + "alliance_id" + "\\}", apiClient.escapeString(allianceId.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));

        if (ifNoneMatch != null)
            localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {};

        GenericType<AllianceResponse> localVarReturnType = new GenericType<AllianceResponse>() {
        };
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams,
                localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List alliance&#39;s corporations List all current member corporations of
     * an alliance --- This route is cached for up to 3600 seconds
     * 
     * @param allianceId
     *            An EVE alliance ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @return List&lt;Integer&gt;
     * @throws ApiException
     *             if fails to make API call
     */
    public List<Integer> getAlliancesAllianceIdCorporations(Integer allianceId, String datasource, String ifNoneMatch)
            throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'allianceId' is set
        if (allianceId == null) {
            throw new ApiException(400,
                    "Missing the required parameter 'allianceId' when calling getAlliancesAllianceIdCorporations");
        }

        // create path and map variables
        String localVarPath = "/v1/alliances/{alliance_id}/corporations/".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "alliance_id" + "\\}", apiClient.escapeString(allianceId.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));

        if (ifNoneMatch != null)
            localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {};

        GenericType<List<Integer>> localVarReturnType = new GenericType<List<Integer>>() {
        };
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams,
                localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get alliance icon Get the icon urls for a alliance --- This route expires
     * daily at 11:05
     * 
     * @param allianceId
     *            An EVE alliance ID (required)
     * @param datasource
     *            The server name you would like data from (optional, default to
     *            tranquility)
     * @param ifNoneMatch
     *            ETag from a previous request. A 304 will be returned if this
     *            matches the current ETag (optional)
     * @return AllianceIconsResponse
     * @throws ApiException
     *             if fails to make API call
     */
    public AllianceIconsResponse getAlliancesAllianceIdIcons(Integer allianceId, String datasource, String ifNoneMatch)
            throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'allianceId' is set
        if (allianceId == null) {
            throw new ApiException(400,
                    "Missing the required parameter 'allianceId' when calling getAlliancesAllianceIdIcons");
        }

        // create path and map variables
        String localVarPath = "/v1/alliances/{alliance_id}/icons/".replaceAll("\\{format\\}", "json").replaceAll(
                "\\{" + "alliance_id" + "\\}", apiClient.escapeString(allianceId.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));

        if (ifNoneMatch != null)
            localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));

        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {};

        GenericType<AllianceIconsResponse> localVarReturnType = new GenericType<AllianceIconsResponse>() {
        };
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams,
                localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
