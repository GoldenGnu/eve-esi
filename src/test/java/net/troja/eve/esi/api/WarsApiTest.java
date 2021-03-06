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

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import net.troja.eve.esi.ApiException;
import net.troja.eve.esi.model.WarResponse;

/**
 * API tests for WarsApi
 */
public class WarsApiTest extends GeneralApiTest {

    private final WarsApi api = new WarsApi();

    @Before
    public void setUp() {
        api.setApiClient(apiClient);
    }

    /**
     * List wars
     *
     * Return a list of wars  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getWarsTest() throws ApiException {
        final Integer maxWarId = null;
        final List<Integer> response = api.getWars(DATASOURCE, null, maxWarId);

        assertThat(response.size(), greaterThan(0));
    }

    /**
     * Get war information
     *
     * Return details about a war  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getWarsWarIdTest() throws ApiException {
        final Integer warId = api.getWars(DATASOURCE, null, null).get(0);
        final WarResponse response = api.getWarsWarId(warId, DATASOURCE, null);

        assertThat(response.getAggressor(), notNullValue());
        assertThat(response.getId(), equalTo(warId));
    }

    /**
     * List kills for a war
     *
     * Return a list of kills related to a war  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    @Ignore("Takes too long")
    public void getWarsWarIdKillmailsTest() throws ApiException {
        // final Integer page = null;
        // for (final Integer warId : api.getWars(DATASOURCE, null, null,
        // null)) {
        //
        // final List<WarKillmailsResponse> response =
        // api.getWarsWarIdKillmails(warId, DATASOURCE, page, null,
        // null);
        //
        // if (response.size() > 0) {
        // final WarKillmailsResponse killmailsResponse = response.get(0);
        // assertThat(killmailsResponse.getKillmailId(), greaterThan(0));
        // break;
        // }
        // }
    }
}
