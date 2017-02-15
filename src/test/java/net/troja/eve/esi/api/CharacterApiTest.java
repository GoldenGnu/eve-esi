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

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.junit.Before;
import org.junit.Test;

import net.troja.eve.esi.ApiException;
import net.troja.eve.esi.model.CharacterCorporationHistoryResponse;
import net.troja.eve.esi.model.CharacterNamesResponse;
import net.troja.eve.esi.model.CharacterPortraitResponse;
import net.troja.eve.esi.model.CharacterResponse;
import net.troja.eve.esi.model.CspaCharacters;
import net.troja.eve.esi.model.CspaCostResponse;

/**
 * API tests for CharacterApi
 */
public class CharacterApiTest extends GeneralApiTest {

    private final CharacterApi api = new CharacterApi();

    @Before
    public void setUp() {
        api.setApiClient(apiClient);
    }

    /**
     * Get character&#39;s public information
     *
     * Public information about a character --- Alternate route:
     * &#x60;/v3/characters/{character_id}/&#x60; Alternate route:
     * &#x60;/legacy/characters/{character_id}/&#x60; Alternate route:
     * &#x60;/dev/characters/{character_id}/&#x60; --- This route is cached for
     * up to 3600 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdTest() throws ApiException {
        final CharacterResponse response = api.getCharactersCharacterId(characterId, DATASOURCE);

        assertThat(response, notNullValue());
        assertThat(response.getName(), notNullValue());
    }

    /**
     * Get corporation history
     *
     * Get a list of all the corporations a character has been a member of ---
     * Alternate route:
     * &#x60;/v1/characters/{character_id}/corporationhistory/&#x60; Alternate
     * route: &#x60;/legacy/characters/{character_id}/corporationhistory/&#x60;
     * Alternate route:
     * &#x60;/dev/characters/{character_id}/corporationhistory/&#x60; --- This
     * route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdCorporationhistoryTest() throws ApiException {
        final List<CharacterCorporationHistoryResponse> response = api
                .getCharactersCharacterIdCorporationhistory(characterId, DATASOURCE);

        assertThat(response.size(), greaterThan(0));
        assertThat(response.get(0).getCorporationId(), greaterThan(0));
    }

    /**
     * Get character portraits
     *
     * Get portrait urls for a character --- Alternate route:
     * &#x60;/v2/characters/{character_id}/portrait/&#x60; Alternate route:
     * &#x60;/dev/characters/{character_id}/portrait/&#x60; --- This route is
     * cached for up to 3600 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdPortraitTest() throws ApiException {
        final CharacterPortraitResponse response = api.getCharactersCharacterIdPortrait(characterId, DATASOURCE);

        assertThat(response, notNullValue());
        final String icon = response.getPx64x64();
        assertThat(StringUtils.isNotBlank(icon), equalTo(true));
    }

    /**
     * Get character names
     *
     * Resolve a set of character IDs to character names --- Alternate route:
     * &#x60;/v1/characters/names/&#x60; Alternate route:
     * &#x60;/legacy/characters/names/&#x60; Alternate route:
     * &#x60;/dev/characters/names/&#x60; --- This route is cached for up to
     * 3600 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getCharactersNamesTest() throws ApiException {
        final List<Long> characterIds = new ArrayList<>();
        characterIds.add((long) characterId);

        final List<CharacterNamesResponse> response = api.getCharactersNames(characterIds, DATASOURCE);

        assertThat(response.size(), equalTo(1));
        assertThat(response.get(0).getCharacterName(), equalTo(characterName));
    }

    /**
     * Calculate a CSPA charge cost
     *
     * Takes a source character ID in the url and a set of target character
     * ID&#39;s in the body, returns a CSPA charge cost --- Alternate route:
     * &#x60;/v3/characters/{character_id}/cspa/&#x60; Alternate route:
     * &#x60;/legacy/characters/{character_id}/cspa/&#x60; Alternate route:
     * &#x60;/dev/characters/{character_id}/cspa/&#x60; SSO Scope:
     * esi-characters.read_contacts.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void postCharactersCharacterIdCspaTest() throws ApiException {
        final CspaCharacters characters = new CspaCharacters();
        characters.addCharactersItem(CHARACTER_ID_CHRIBBA);

        final CspaCostResponse response = api.postCharactersCharacterIdCspa(characterId, characters, DATASOURCE);

        assertThat(response.getCost(), equalTo(0l));
    }

}
