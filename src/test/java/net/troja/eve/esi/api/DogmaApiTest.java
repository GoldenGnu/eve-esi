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
import net.troja.eve.esi.model.DogmaAttributeResponse;
import net.troja.eve.esi.model.DogmaDynamicItemsResponse;
import net.troja.eve.esi.model.DogmaEffectResponse;
import org.junit.Ignore;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 * API tests for DogmaApi
 */
public class DogmaApiTest extends GeneralApiTest {

    private final DogmaApi api = new DogmaApi();

    /**
     * Get attributes
     *
     * Get a list of dogma attribute ids --- This route is cached for up to 3600
     * seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getDogmaAttributesTest() throws ApiException {
        final List<Integer> response = api.getDogmaAttributes(DATASOURCE, null);

        assertThat(response.size(), notNullValue());
        assertThat(response.size(), greaterThan(0));
    }

    /**
     * Get attribute information
     *
     * Get information on a dogma attribute --- This route is cached for up to
     * 3600 seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getDogmaAttributesAttributeIdTest() throws ApiException {
        final Integer attributeId = 165;
        final DogmaAttributeResponse response = api.getDogmaAttributesAttributeId(attributeId, DATASOURCE, null);

        assertThat(response.getAttributeId(), equalTo(attributeId));
        assertThat(response.getName(), equalTo("intelligence"));
    }

    /**
     * Get dynamic item information
     *
     * Returns info about a dynamic item resulting from mutation with a mutaplasmid.  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Ignore("Needs dynamic dogma item to test")
    @Test
    public void getDogmaDynamicItemsTypeIdItemIdTest() throws ApiException {
        Long itemId = null;
        Integer typeId = null;
        DogmaDynamicItemsResponse response = api.getDogmaDynamicItemsTypeIdItemId(itemId, typeId, DATASOURCE, null);

        // TODO: test validations
    }

    /**
     * Get effects
     *
     * Get a list of dogma effect ids --- This route is cached for up to 3600
     * seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getDogmaEffectsTest() throws ApiException {
        final List<Integer> response = api.getDogmaEffects(DATASOURCE, null);

        assertThat(response.size(), notNullValue());
        assertThat(response.size(), greaterThan(0));
    }

    /**
     * Get effect information
     *
     * Get information on a dogma effect --- This route is cached for up to 3600
     * seconds
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getDogmaEffectsEffectIdTest() throws ApiException {
        final Integer effectId = 254;
        final DogmaEffectResponse response = api.getDogmaEffectsEffectId(effectId, DATASOURCE, null);

        assertThat(response.getEffectId(), equalTo(effectId));
        assertThat(response.getName(), equalTo("shadowBarrageFalloffWithFalloffPostPercentBarrageFalloffMutator"));
    }
}
