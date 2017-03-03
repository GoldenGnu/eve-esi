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

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import net.troja.eve.esi.ApiException;
import net.troja.eve.esi.model.MarketGroupResponse;
import net.troja.eve.esi.model.MarketHistoryResponse;
import net.troja.eve.esi.model.MarketOrdersResponse;
import net.troja.eve.esi.model.MarketPricesResponse;

/**
 * API tests for MarketApi
 */
public class MarketApiTest extends GeneralApiTest {

    private final MarketApi api = new MarketApi();

    /**
     * Get item group information
     *
     * Get information on an item group --- This route is cached for up to 3600
     * seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getMarketsGroupsMarketGroupIdTest() throws ApiException {
        final Integer marketGroupId = 23;
        final String userAgent = null;
        final String xUserAgent = null;
        final MarketGroupResponse response = api.getMarketsGroupsMarketGroupId(marketGroupId, DATASOURCE, LANGUAGE,
                userAgent, xUserAgent);

        assertThat(response, notNullValue());
        assertThat(response.getName(), equalTo("Passengers"));
    }

    /**
     * List market prices
     *
     * Return a list of prices --- Alternate route:
     * &#x60;/v1/markets/prices/&#x60; Alternate route:
     * &#x60;/legacy/markets/prices/&#x60; Alternate route:
     * &#x60;/dev/markets/prices/&#x60; --- This route is cached for up to 3600
     * seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getMarketsPricesTest() throws ApiException {
        final String userAgent = null;
        final String xUserAgent = null;
        final List<MarketPricesResponse> response = api.getMarketsPrices(DATASOURCE, userAgent, xUserAgent);

        assertThat(response.size(), greaterThan(0));
        final MarketPricesResponse market = response.get(0);
        assertThat(market.getTypeId(), greaterThan(0));
    }

    /**
     * List historical market statistics in a region
     *
     * Return a list of historical market statistics for the specified type in a
     * region --- Alternate route: &#x60;/v1/markets/{region_id}/history/&#x60;
     * Alternate route: &#x60;/legacy/markets/{region_id}/history/&#x60;
     * Alternate route: &#x60;/dev/markets/{region_id}/history/&#x60; --- This
     * route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getMarketsRegionIdHistoryTest() throws ApiException {
        final String userAgent = null;
        final String xUserAgent = null;
        final List<MarketHistoryResponse> response = api.getMarketsRegionIdHistory(REGION_ID_THE_FORGE, TYPE_ID_PLEX,
                DATASOURCE, userAgent, xUserAgent);

        assertThat(response.size(), greaterThan(0));
        final MarketHistoryResponse historyResponse = response.get(0);
        assertThat(historyResponse.getOrderCount(), greaterThan(0l));
    }

    /**
     * List orders in a region
     *
     * Return a list of orders in a region --- Alternate route:
     * &#x60;/v1/markets/{region_id}/orders/&#x60; Alternate route:
     * &#x60;/legacy/markets/{region_id}/orders/&#x60; Alternate route:
     * &#x60;/dev/markets/{region_id}/orders/&#x60; --- This route is cached for
     * up to 300 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getMarketsRegionIdOrdersTest() throws ApiException {
        final String orderType = "buy";
        final Integer page = null;
        final String userAgent = null;
        final String xUserAgent = null;
        final List<MarketOrdersResponse> response = api.getMarketsRegionIdOrders(orderType, REGION_ID_THE_FORGE,
                DATASOURCE, page, TYPE_ID_PLEX, userAgent, xUserAgent);

        assertThat(response.size(), greaterThan(0));
        final MarketOrdersResponse ordersResponse = response.get(0);
        assertThat(ordersResponse.getMinVolume(), greaterThan(0));
    }

    /**
     * List orders in a structure
     *
     * Return all orders in a structure --- Alternate route:
     * &#x60;/v1/markets/structures/{structure_id}/&#x60; Alternate route:
     * &#x60;/legacy/markets/structures/{structure_id}/&#x60; Alternate route:
     * &#x60;/dev/markets/structures/{structure_id}/&#x60; --- This route is
     * cached for up to 300 seconds SSO Scope: esi-markets.structure_markets.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    @Ignore("No static structure to use here")
    public void getMarketsStructuresStructureIdTest() throws ApiException {
    }
}
