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
import net.troja.eve.esi.model.CharacterWalletJournalResponse;
import net.troja.eve.esi.model.CharacterWalletTransactionsResponse;
import net.troja.eve.esi.model.CorporationWalletTransactionsResponse;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for WalletApi
 */
public class WalletApiTest extends GeneralApiTest {

    private final WalletApi api = new WalletApi();

    @Before
    public void setUp() {
        api.setApiClient(apiClient);
    }

    /**
     * Get a character&#39;s wallet balance
     *
     * Returns a character&#39;s wallet_id and balance --- This route is cached
     * for up to 120 seconds SSO Scope: esi-wallet.read_character_wallet.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdWalletTest() throws ApiException {
        final Double response = api.getCharactersCharacterIdWallet(characterId, DATASOURCE, null, null);

        assertThat(response, greaterThan(0.0));
    }

    /**
     * Get character wallet journal
     *
     * Retrieve character wallet journal --- This route is cached for up to 3600
     * seconds SSO Scope: esi-wallet.read_character_wallet.v1 SSO Scope:
     * esi-wallet.read_character_wallet.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdWalletJournalTest() throws ApiException {
        final Integer page = null;
        final List<CharacterWalletJournalResponse> response = api.getCharactersCharacterIdWalletJournal(characterId, DATASOURCE, null, page, null);

        assertThat(response, notNullValue());
        assertThat(response.size(), greaterThan(0));
        final CharacterWalletJournalResponse characterWalletJournalResponse = response.get(0);
        assertThat(characterWalletJournalResponse.getBalance(), greaterThan(0.0));
    }

    /**
     * Get wallet transactions
     *
     * Get wallet transactions of a character --- This route is cached for up to
     * 3600 seconds SSO Scope: esi-wallet.read_character_wallet.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdWalletTransactionsTest() throws ApiException {
        final Long fromId = null;
        final List<CharacterWalletTransactionsResponse> response = api.getCharactersCharacterIdWalletTransactions(characterId, DATASOURCE, fromId, null, null);

        assertThat(response, notNullValue());
        assertThat(response.size(), greaterThan(0));
        final CharacterWalletTransactionsResponse characterWalletTransactionsResponse = response.get(0);
        assertThat(characterWalletTransactionsResponse.getUnitPrice(), greaterThan(0.0));
    }

    /**
     * Returns a corporation&#39;s wallet balance
     *
     * Get a corporation&#39;s wallets --- This route is cached for up to 300
     * seconds SSO Scope: esi-wallet.read_corporation_wallets.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    @Ignore("Needs corporation with read access")
    public void getCorporationsCorporationIdWalletsTest() throws ApiException {
    }
    
    /**
     * Get character wallet journal
     *
     * Retrieve corporation wallet journal  ---  This route is cached for up to 300 seconds  SSO Scope: esi-wallet.read_corporation_wallets.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Needs corporation with read access")
    public void getCorporationsCorporationIdWalletsDivisionJournalTest() throws ApiException {
    }

    /**
     * Get corporation wallet transactions
     *
     * Get wallet transactions of a corporation  ---  This route is cached for up to 3600 seconds  SSO Scope: esi-wallet.read_corporation_wallets.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Needs corporation with read access")
    public void getCorporationsCorporationIdWalletsDivisionTransactionsTest() throws ApiException {
        Integer corporationId = null;
        Integer division = 1;
        Long fromId = null;
        List<CorporationWalletTransactionsResponse> response = api.getCorporationsCorporationIdWalletsDivisionTransactions(corporationId, division, DATASOURCE, fromId, null, null);

        assertThat(response, notNullValue());
        assertThat(response.size(), greaterThan(0));
    }
}
