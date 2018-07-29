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

import java.util.List;
import net.troja.eve.esi.ApiException;
import net.troja.eve.esi.model.CharacterFwStatsResponse;
import net.troja.eve.esi.model.CorporationFwStatsResponse;
import net.troja.eve.esi.model.FactionWarfareLeaderboardCharactersResponse;
import net.troja.eve.esi.model.FactionWarfareLeaderboardCorporationsResponse;
import net.troja.eve.esi.model.FactionWarfareLeaderboardResponse;
import net.troja.eve.esi.model.FactionWarfareStatsResponse;
import net.troja.eve.esi.model.FactionWarfareSystemsResponse;
import net.troja.eve.esi.model.FactionWarfareWarsResponse;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for FactionWarfareApi
 */
public class FactionWarfareApiTest extends GeneralApiTest {

    private final FactionWarfareApi api = new FactionWarfareApi();

    /**
     * Overview of a character involved in faction warfare
     *
     * Statistical overview of a character involved in faction warfare  ---  This route expires daily at 11:05  SSO Scope: esi-characters.read_fw_stats.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Needs character in faction warfare")
    public void getCharactersCharacterIdFwStatsTest() throws ApiException {
        CharacterFwStatsResponse response = api.getCharactersCharacterIdFwStats(characterId, DATASOURCE, null, null);

        // TODO: test validations
    }

    /**
     * Overview of a corporation involved in faction warfare
     *
     * Statistics about a corporation involved in faction warfare  ---  This route expires daily at 11:05  SSO Scope: esi-corporations.read_fw_stats.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Needs corporation in faction warfare")
    public void getCorporationsCorporationIdFwStatsTest() throws ApiException {
        Integer corporationId = null;
        CorporationFwStatsResponse response = api.getCorporationsCorporationIdFwStats(corporationId, DATASOURCE, null, null);

        // TODO: test validations
    }

    /**
     * List of the top factions in faction warfare
     *
     * Top 4 leaderboard of factions for kills and victory points separated by
     * total, last week and yesterday. --- This route expires daily at 11:05
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getFwLeaderboardsTest() throws ApiException {
        final FactionWarfareLeaderboardResponse response = api.getFwLeaderboards(DATASOURCE, null);

        assertThat(response.getKills(), notNullValue());
        assertThat(response.getKills().getActiveTotal().size(), greaterThan(0));
    }

    /**
     * List of the top pilots in faction warfare
     *
     * Top 100 leaderboard of pilots for kills and victory points separated by
     * total, last week and yesterday. --- This route expires daily at 11:05
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getFwLeaderboardsCharactersTest() throws ApiException {
        final FactionWarfareLeaderboardCharactersResponse response = api.getFwLeaderboardsCharacters(DATASOURCE, null);

        assertThat(response.getKills(), notNullValue());
        assertThat(response.getKills().getActiveTotal().size(), greaterThan(0));
    }

    /**
     * List of the top corporations in faction warfare
     *
     * Top 10 leaderboard of corporations for kills and victory points separated
     * by total, last week and yesterday. --- This route expires daily at 11:05
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getFwLeaderboardsCorporationsTest() throws ApiException {
        final FactionWarfareLeaderboardCorporationsResponse response = api.getFwLeaderboardsCorporations(DATASOURCE, null);

        assertThat(response.getKills(), notNullValue());
        assertThat(response.getKills().getActiveTotal().size(), greaterThan(0));
    }

    /**
     * An overview of statistics about factions involved in faction warfare
     *
     * Statistical overviews of factions involved in faction warfare --- This
     * route expires daily at 11:05
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getFwStatsTest() throws ApiException {
        final List<FactionWarfareStatsResponse> response = api.getFwStats(DATASOURCE, null);

        assertThat(response, notNullValue());
        assertThat(response.size(), greaterThan(0));
    }

    /**
     * Ownership of faction warfare systems
     *
     * An overview of the current ownership of faction warfare solar systems ---
     * This route is cached for up to 1800 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getFwSystemsTest() throws ApiException {
        final List<FactionWarfareSystemsResponse> response = api.getFwSystems(DATASOURCE, null);

        assertThat(response, notNullValue());
        assertThat(response.size(), greaterThan(0));
    }

    /**
     * Data about which NPC factions are at war
     *
     * Data about which NPC factions are at war --- This route expires daily at
     * 11:05
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getFwWarsTest() throws ApiException {
        final List<FactionWarfareWarsResponse> response = api.getFwWars(DATASOURCE, null);

        assertThat(response, notNullValue());
        assertThat(response.size(), greaterThan(0));
    }

}
