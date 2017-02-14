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

import net.troja.eve.esi.ApiException;
import net.troja.eve.esi.model.CharacterMailinglistsResponse;
import net.troja.eve.esi.model.Mail;
import net.troja.eve.esi.model.MailHeadersResponse;
import net.troja.eve.esi.model.MailLabelSimple;
import net.troja.eve.esi.model.MailLabelsResponse;
import net.troja.eve.esi.model.MailMetaData;
import net.troja.eve.esi.model.MailResponse;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MailApi
 */
public class MailApiTest {

    private final MailApi api = new MailApi();

    
    /**
     * Delete a mail label
     *
     * Delete a mail label  ---  Alternate route: &#x60;/v1/characters/{character_id}/mail/labels/{label_id}/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/mail/labels/{label_id}/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/labels/{label_id}/&#x60;   SSO Scope: esi-mail.organize_mail.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCharactersCharacterIdMailLabelsLabelIdTest() throws ApiException {
        Integer characterId = null;
        Integer labelId = null;
        String datasource = null;
        // api.deleteCharactersCharacterIdMailLabelsLabelId(characterId, labelId, datasource);

        // TODO: test validations
    }

    /**
     * Delete a mail
     *
     * Delete a mail  ---  Alternate route: &#x60;/v1/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/{mail_id}/&#x60;   SSO Scope: esi-mail.organize_mail.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCharactersCharacterIdMailMailIdTest() throws ApiException {
        Integer characterId = null;
        Integer mailId = null;
        String datasource = null;
        // api.deleteCharactersCharacterIdMailMailId(characterId, mailId, datasource);

        // TODO: test validations
    }
    
    /**
     * Return mail headers
     *
     * Return the 50 most recent mail headers belonging to the character that match the query criteria. Queries can be filtered by label, and last_mail_id can be used to paginate backwards.  ---  Alternate route: &#x60;/v1/characters/{character_id}/mail/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/mail/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/&#x60;   ---  This route is cached for up to 30 seconds  SSO Scope: esi-mail.read_mail.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdMailTest() throws ApiException {
        Integer characterId = null;
        List<Long> labels = null;
        Integer lastMailId = null;
        String datasource = null;
        // List<MailHeadersResponse> response = api.getCharactersCharacterIdMail(characterId, labels, lastMailId, datasource);

        // TODO: test validations
    }
    
    /**
     * Get mail labels and unread counts
     *
     * Return a list of the users mail labels, unread counts for each label and a total unread count.  ---  Alternate route: &#x60;/v3/characters/{character_id}/mail/labels/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/labels/&#x60;   ---  This route is cached for up to 30 seconds  SSO Scope: esi-mail.read_mail.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdMailLabelsTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        // MailLabelsResponse response = api.getCharactersCharacterIdMailLabels(characterId, datasource);

        // TODO: test validations
    }
    
    /**
     * Return mailing list subscriptions
     *
     * Return all mailing lists that the character is subscribed to   ---  Alternate route: &#x60;/v1/characters/{character_id}/mail/lists/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/mail/lists/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/lists/&#x60;   ---  This route is cached for up to 120 seconds  SSO Scope: esi-mail.read_mail.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdMailListsTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        // List<CharacterMailinglistsResponse> response = api.getCharactersCharacterIdMailLists(characterId, datasource);

        // TODO: test validations
    }
    
    /**
     * Return a mail
     *
     * Return the contents of an EVE mail  ---  Alternate route: &#x60;/v1/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/{mail_id}/&#x60;   ---  This route is cached for up to 30 seconds  SSO Scope: esi-mail.read_mail.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdMailMailIdTest() throws ApiException {
        Integer characterId = null;
        Integer mailId = null;
        String datasource = null;
        // MailResponse response = api.getCharactersCharacterIdMailMailId(characterId, mailId, datasource);

        // TODO: test validations
    }
    
    /**
     * Send a new mail
     *
     * Create and send a new mail  ---  Alternate route: &#x60;/v1/characters/{character_id}/mail/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/mail/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/&#x60;   SSO Scope: esi-mail.send_mail.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCharactersCharacterIdMailTest() throws ApiException {
        Integer characterId = null;
        Mail mail = null;
        String datasource = null;
        // Integer response = api.postCharactersCharacterIdMail(characterId, mail, datasource);

        // TODO: test validations
    }
    
    /**
     * Create a mail label
     *
     * Create a mail label  ---  Alternate route: &#x60;/v2/characters/{character_id}/mail/labels/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/mail/labels/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/labels/&#x60;   SSO Scope: esi-mail.organize_mail.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCharactersCharacterIdMailLabelsTest() throws ApiException {
        Integer characterId = null;
        MailLabelSimple label = null;
        String datasource = null;
        // Long response = api.postCharactersCharacterIdMailLabels(characterId, label, datasource);

        // TODO: test validations
    }
    
    /**
     * Update metadata about a mail
     *
     * Update metadata about a mail  ---  Alternate route: &#x60;/v1/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/mail/{mail_id}/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/mail/{mail_id}/&#x60;   SSO Scope: esi-mail.organize_mail.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putCharactersCharacterIdMailMailIdTest() throws ApiException {
        Integer characterId = null;
        Integer mailId = null;
        MailMetaData contents = null;
        String datasource = null;
        // api.putCharactersCharacterIdMailMailId(characterId, mailId, contents, datasource);

        // TODO: test validations
    }
    
}