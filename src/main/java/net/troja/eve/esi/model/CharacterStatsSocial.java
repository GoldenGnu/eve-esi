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

package net.troja.eve.esi.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * social object
 */
@ApiModel(description = "social object")
public class CharacterStatsSocial implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("add_contact_bad")
    private Long addContactBad = null;

    @SerializedName("add_contact_good")
    private Long addContactGood = null;

    @SerializedName("add_contact_high")
    private Long addContactHigh = null;

    @SerializedName("add_contact_horrible")
    private Long addContactHorrible = null;

    @SerializedName("add_contact_neutral")
    private Long addContactNeutral = null;

    @SerializedName("add_note")
    private Long addNote = null;

    @SerializedName("added_as_contact_bad")
    private Long addedAsContactBad = null;

    @SerializedName("added_as_contact_good")
    private Long addedAsContactGood = null;

    @SerializedName("added_as_contact_high")
    private Long addedAsContactHigh = null;

    @SerializedName("added_as_contact_horrible")
    private Long addedAsContactHorrible = null;

    @SerializedName("added_as_contact_neutral")
    private Long addedAsContactNeutral = null;

    @SerializedName("calendar_event_created")
    private Long calendarEventCreated = null;

    @SerializedName("chat_messages_alliance")
    private Long chatMessagesAlliance = null;

    @SerializedName("chat_messages_constellation")
    private Long chatMessagesConstellation = null;

    @SerializedName("chat_messages_corporation")
    private Long chatMessagesCorporation = null;

    @SerializedName("chat_messages_fleet")
    private Long chatMessagesFleet = null;

    @SerializedName("chat_messages_region")
    private Long chatMessagesRegion = null;

    @SerializedName("chat_messages_solarsystem")
    private Long chatMessagesSolarsystem = null;

    @SerializedName("chat_messages_warfaction")
    private Long chatMessagesWarfaction = null;

    @SerializedName("chat_total_message_length")
    private Long chatTotalMessageLength = null;

    @SerializedName("direct_trades")
    private Long directTrades = null;

    @SerializedName("fleet_broadcasts")
    private Long fleetBroadcasts = null;

    @SerializedName("fleet_joins")
    private Long fleetJoins = null;

    @SerializedName("mails_received")
    private Long mailsReceived = null;

    @SerializedName("mails_sent")
    private Long mailsSent = null;

    public CharacterStatsSocial addContactBad(Long addContactBad) {
        this.addContactBad = addContactBad;
        return this;
    }

    /**
     * add_contact_bad integer
     * 
     * @return addContactBad
     **/
    @ApiModelProperty(value = "add_contact_bad integer")
    public Long getAddContactBad() {
        return addContactBad;
    }

    public void setAddContactBad(Long addContactBad) {
        this.addContactBad = addContactBad;
    }

    public CharacterStatsSocial addContactGood(Long addContactGood) {
        this.addContactGood = addContactGood;
        return this;
    }

    /**
     * add_contact_good integer
     * 
     * @return addContactGood
     **/
    @ApiModelProperty(value = "add_contact_good integer")
    public Long getAddContactGood() {
        return addContactGood;
    }

    public void setAddContactGood(Long addContactGood) {
        this.addContactGood = addContactGood;
    }

    public CharacterStatsSocial addContactHigh(Long addContactHigh) {
        this.addContactHigh = addContactHigh;
        return this;
    }

    /**
     * add_contact_high integer
     * 
     * @return addContactHigh
     **/
    @ApiModelProperty(value = "add_contact_high integer")
    public Long getAddContactHigh() {
        return addContactHigh;
    }

    public void setAddContactHigh(Long addContactHigh) {
        this.addContactHigh = addContactHigh;
    }

    public CharacterStatsSocial addContactHorrible(Long addContactHorrible) {
        this.addContactHorrible = addContactHorrible;
        return this;
    }

    /**
     * add_contact_horrible integer
     * 
     * @return addContactHorrible
     **/
    @ApiModelProperty(value = "add_contact_horrible integer")
    public Long getAddContactHorrible() {
        return addContactHorrible;
    }

    public void setAddContactHorrible(Long addContactHorrible) {
        this.addContactHorrible = addContactHorrible;
    }

    public CharacterStatsSocial addContactNeutral(Long addContactNeutral) {
        this.addContactNeutral = addContactNeutral;
        return this;
    }

    /**
     * add_contact_neutral integer
     * 
     * @return addContactNeutral
     **/
    @ApiModelProperty(value = "add_contact_neutral integer")
    public Long getAddContactNeutral() {
        return addContactNeutral;
    }

    public void setAddContactNeutral(Long addContactNeutral) {
        this.addContactNeutral = addContactNeutral;
    }

    public CharacterStatsSocial addNote(Long addNote) {
        this.addNote = addNote;
        return this;
    }

    /**
     * add_note integer
     * 
     * @return addNote
     **/
    @ApiModelProperty(value = "add_note integer")
    public Long getAddNote() {
        return addNote;
    }

    public void setAddNote(Long addNote) {
        this.addNote = addNote;
    }

    public CharacterStatsSocial addedAsContactBad(Long addedAsContactBad) {
        this.addedAsContactBad = addedAsContactBad;
        return this;
    }

    /**
     * added_as_contact_bad integer
     * 
     * @return addedAsContactBad
     **/
    @ApiModelProperty(value = "added_as_contact_bad integer")
    public Long getAddedAsContactBad() {
        return addedAsContactBad;
    }

    public void setAddedAsContactBad(Long addedAsContactBad) {
        this.addedAsContactBad = addedAsContactBad;
    }

    public CharacterStatsSocial addedAsContactGood(Long addedAsContactGood) {
        this.addedAsContactGood = addedAsContactGood;
        return this;
    }

    /**
     * added_as_contact_good integer
     * 
     * @return addedAsContactGood
     **/
    @ApiModelProperty(value = "added_as_contact_good integer")
    public Long getAddedAsContactGood() {
        return addedAsContactGood;
    }

    public void setAddedAsContactGood(Long addedAsContactGood) {
        this.addedAsContactGood = addedAsContactGood;
    }

    public CharacterStatsSocial addedAsContactHigh(Long addedAsContactHigh) {
        this.addedAsContactHigh = addedAsContactHigh;
        return this;
    }

    /**
     * added_as_contact_high integer
     * 
     * @return addedAsContactHigh
     **/
    @ApiModelProperty(value = "added_as_contact_high integer")
    public Long getAddedAsContactHigh() {
        return addedAsContactHigh;
    }

    public void setAddedAsContactHigh(Long addedAsContactHigh) {
        this.addedAsContactHigh = addedAsContactHigh;
    }

    public CharacterStatsSocial addedAsContactHorrible(Long addedAsContactHorrible) {
        this.addedAsContactHorrible = addedAsContactHorrible;
        return this;
    }

    /**
     * added_as_contact_horrible integer
     * 
     * @return addedAsContactHorrible
     **/
    @ApiModelProperty(value = "added_as_contact_horrible integer")
    public Long getAddedAsContactHorrible() {
        return addedAsContactHorrible;
    }

    public void setAddedAsContactHorrible(Long addedAsContactHorrible) {
        this.addedAsContactHorrible = addedAsContactHorrible;
    }

    public CharacterStatsSocial addedAsContactNeutral(Long addedAsContactNeutral) {
        this.addedAsContactNeutral = addedAsContactNeutral;
        return this;
    }

    /**
     * added_as_contact_neutral integer
     * 
     * @return addedAsContactNeutral
     **/
    @ApiModelProperty(value = "added_as_contact_neutral integer")
    public Long getAddedAsContactNeutral() {
        return addedAsContactNeutral;
    }

    public void setAddedAsContactNeutral(Long addedAsContactNeutral) {
        this.addedAsContactNeutral = addedAsContactNeutral;
    }

    public CharacterStatsSocial calendarEventCreated(Long calendarEventCreated) {
        this.calendarEventCreated = calendarEventCreated;
        return this;
    }

    /**
     * calendar_event_created integer
     * 
     * @return calendarEventCreated
     **/
    @ApiModelProperty(value = "calendar_event_created integer")
    public Long getCalendarEventCreated() {
        return calendarEventCreated;
    }

    public void setCalendarEventCreated(Long calendarEventCreated) {
        this.calendarEventCreated = calendarEventCreated;
    }

    public CharacterStatsSocial chatMessagesAlliance(Long chatMessagesAlliance) {
        this.chatMessagesAlliance = chatMessagesAlliance;
        return this;
    }

    /**
     * chat_messages_alliance integer
     * 
     * @return chatMessagesAlliance
     **/
    @ApiModelProperty(value = "chat_messages_alliance integer")
    public Long getChatMessagesAlliance() {
        return chatMessagesAlliance;
    }

    public void setChatMessagesAlliance(Long chatMessagesAlliance) {
        this.chatMessagesAlliance = chatMessagesAlliance;
    }

    public CharacterStatsSocial chatMessagesConstellation(Long chatMessagesConstellation) {
        this.chatMessagesConstellation = chatMessagesConstellation;
        return this;
    }

    /**
     * chat_messages_constellation integer
     * 
     * @return chatMessagesConstellation
     **/
    @ApiModelProperty(value = "chat_messages_constellation integer")
    public Long getChatMessagesConstellation() {
        return chatMessagesConstellation;
    }

    public void setChatMessagesConstellation(Long chatMessagesConstellation) {
        this.chatMessagesConstellation = chatMessagesConstellation;
    }

    public CharacterStatsSocial chatMessagesCorporation(Long chatMessagesCorporation) {
        this.chatMessagesCorporation = chatMessagesCorporation;
        return this;
    }

    /**
     * chat_messages_corporation integer
     * 
     * @return chatMessagesCorporation
     **/
    @ApiModelProperty(value = "chat_messages_corporation integer")
    public Long getChatMessagesCorporation() {
        return chatMessagesCorporation;
    }

    public void setChatMessagesCorporation(Long chatMessagesCorporation) {
        this.chatMessagesCorporation = chatMessagesCorporation;
    }

    public CharacterStatsSocial chatMessagesFleet(Long chatMessagesFleet) {
        this.chatMessagesFleet = chatMessagesFleet;
        return this;
    }

    /**
     * chat_messages_fleet integer
     * 
     * @return chatMessagesFleet
     **/
    @ApiModelProperty(value = "chat_messages_fleet integer")
    public Long getChatMessagesFleet() {
        return chatMessagesFleet;
    }

    public void setChatMessagesFleet(Long chatMessagesFleet) {
        this.chatMessagesFleet = chatMessagesFleet;
    }

    public CharacterStatsSocial chatMessagesRegion(Long chatMessagesRegion) {
        this.chatMessagesRegion = chatMessagesRegion;
        return this;
    }

    /**
     * chat_messages_region integer
     * 
     * @return chatMessagesRegion
     **/
    @ApiModelProperty(value = "chat_messages_region integer")
    public Long getChatMessagesRegion() {
        return chatMessagesRegion;
    }

    public void setChatMessagesRegion(Long chatMessagesRegion) {
        this.chatMessagesRegion = chatMessagesRegion;
    }

    public CharacterStatsSocial chatMessagesSolarsystem(Long chatMessagesSolarsystem) {
        this.chatMessagesSolarsystem = chatMessagesSolarsystem;
        return this;
    }

    /**
     * chat_messages_solarsystem integer
     * 
     * @return chatMessagesSolarsystem
     **/
    @ApiModelProperty(value = "chat_messages_solarsystem integer")
    public Long getChatMessagesSolarsystem() {
        return chatMessagesSolarsystem;
    }

    public void setChatMessagesSolarsystem(Long chatMessagesSolarsystem) {
        this.chatMessagesSolarsystem = chatMessagesSolarsystem;
    }

    public CharacterStatsSocial chatMessagesWarfaction(Long chatMessagesWarfaction) {
        this.chatMessagesWarfaction = chatMessagesWarfaction;
        return this;
    }

    /**
     * chat_messages_warfaction integer
     * 
     * @return chatMessagesWarfaction
     **/
    @ApiModelProperty(value = "chat_messages_warfaction integer")
    public Long getChatMessagesWarfaction() {
        return chatMessagesWarfaction;
    }

    public void setChatMessagesWarfaction(Long chatMessagesWarfaction) {
        this.chatMessagesWarfaction = chatMessagesWarfaction;
    }

    public CharacterStatsSocial chatTotalMessageLength(Long chatTotalMessageLength) {
        this.chatTotalMessageLength = chatTotalMessageLength;
        return this;
    }

    /**
     * chat_total_message_length integer
     * 
     * @return chatTotalMessageLength
     **/
    @ApiModelProperty(value = "chat_total_message_length integer")
    public Long getChatTotalMessageLength() {
        return chatTotalMessageLength;
    }

    public void setChatTotalMessageLength(Long chatTotalMessageLength) {
        this.chatTotalMessageLength = chatTotalMessageLength;
    }

    public CharacterStatsSocial directTrades(Long directTrades) {
        this.directTrades = directTrades;
        return this;
    }

    /**
     * direct_trades integer
     * 
     * @return directTrades
     **/
    @ApiModelProperty(value = "direct_trades integer")
    public Long getDirectTrades() {
        return directTrades;
    }

    public void setDirectTrades(Long directTrades) {
        this.directTrades = directTrades;
    }

    public CharacterStatsSocial fleetBroadcasts(Long fleetBroadcasts) {
        this.fleetBroadcasts = fleetBroadcasts;
        return this;
    }

    /**
     * fleet_broadcasts integer
     * 
     * @return fleetBroadcasts
     **/
    @ApiModelProperty(value = "fleet_broadcasts integer")
    public Long getFleetBroadcasts() {
        return fleetBroadcasts;
    }

    public void setFleetBroadcasts(Long fleetBroadcasts) {
        this.fleetBroadcasts = fleetBroadcasts;
    }

    public CharacterStatsSocial fleetJoins(Long fleetJoins) {
        this.fleetJoins = fleetJoins;
        return this;
    }

    /**
     * fleet_joins integer
     * 
     * @return fleetJoins
     **/
    @ApiModelProperty(value = "fleet_joins integer")
    public Long getFleetJoins() {
        return fleetJoins;
    }

    public void setFleetJoins(Long fleetJoins) {
        this.fleetJoins = fleetJoins;
    }

    public CharacterStatsSocial mailsReceived(Long mailsReceived) {
        this.mailsReceived = mailsReceived;
        return this;
    }

    /**
     * mails_received integer
     * 
     * @return mailsReceived
     **/
    @ApiModelProperty(value = "mails_received integer")
    public Long getMailsReceived() {
        return mailsReceived;
    }

    public void setMailsReceived(Long mailsReceived) {
        this.mailsReceived = mailsReceived;
    }

    public CharacterStatsSocial mailsSent(Long mailsSent) {
        this.mailsSent = mailsSent;
        return this;
    }

    /**
     * mails_sent integer
     * 
     * @return mailsSent
     **/
    @ApiModelProperty(value = "mails_sent integer")
    public Long getMailsSent() {
        return mailsSent;
    }

    public void setMailsSent(Long mailsSent) {
        this.mailsSent = mailsSent;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterStatsSocial characterStatsSocial = (CharacterStatsSocial) o;
        return Objects.equals(this.addContactBad, characterStatsSocial.addContactBad)
                && Objects.equals(this.addContactGood, characterStatsSocial.addContactGood)
                && Objects.equals(this.addContactHigh, characterStatsSocial.addContactHigh)
                && Objects.equals(this.addContactHorrible, characterStatsSocial.addContactHorrible)
                && Objects.equals(this.addContactNeutral, characterStatsSocial.addContactNeutral)
                && Objects.equals(this.addNote, characterStatsSocial.addNote)
                && Objects.equals(this.addedAsContactBad, characterStatsSocial.addedAsContactBad)
                && Objects.equals(this.addedAsContactGood, characterStatsSocial.addedAsContactGood)
                && Objects.equals(this.addedAsContactHigh, characterStatsSocial.addedAsContactHigh)
                && Objects.equals(this.addedAsContactHorrible, characterStatsSocial.addedAsContactHorrible)
                && Objects.equals(this.addedAsContactNeutral, characterStatsSocial.addedAsContactNeutral)
                && Objects.equals(this.calendarEventCreated, characterStatsSocial.calendarEventCreated)
                && Objects.equals(this.chatMessagesAlliance, characterStatsSocial.chatMessagesAlliance)
                && Objects.equals(this.chatMessagesConstellation, characterStatsSocial.chatMessagesConstellation)
                && Objects.equals(this.chatMessagesCorporation, characterStatsSocial.chatMessagesCorporation)
                && Objects.equals(this.chatMessagesFleet, characterStatsSocial.chatMessagesFleet)
                && Objects.equals(this.chatMessagesRegion, characterStatsSocial.chatMessagesRegion)
                && Objects.equals(this.chatMessagesSolarsystem, characterStatsSocial.chatMessagesSolarsystem)
                && Objects.equals(this.chatMessagesWarfaction, characterStatsSocial.chatMessagesWarfaction)
                && Objects.equals(this.chatTotalMessageLength, characterStatsSocial.chatTotalMessageLength)
                && Objects.equals(this.directTrades, characterStatsSocial.directTrades)
                && Objects.equals(this.fleetBroadcasts, characterStatsSocial.fleetBroadcasts)
                && Objects.equals(this.fleetJoins, characterStatsSocial.fleetJoins)
                && Objects.equals(this.mailsReceived, characterStatsSocial.mailsReceived)
                && Objects.equals(this.mailsSent, characterStatsSocial.mailsSent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addContactBad, addContactGood, addContactHigh, addContactHorrible, addContactNeutral,
                addNote, addedAsContactBad, addedAsContactGood, addedAsContactHigh, addedAsContactHorrible,
                addedAsContactNeutral, calendarEventCreated, chatMessagesAlliance, chatMessagesConstellation,
                chatMessagesCorporation, chatMessagesFleet, chatMessagesRegion, chatMessagesSolarsystem,
                chatMessagesWarfaction, chatTotalMessageLength, directTrades, fleetBroadcasts, fleetJoins,
                mailsReceived, mailsSent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterStatsSocial {\n");

        sb.append("    addContactBad: ").append(toIndentedString(addContactBad)).append("\n");
        sb.append("    addContactGood: ").append(toIndentedString(addContactGood)).append("\n");
        sb.append("    addContactHigh: ").append(toIndentedString(addContactHigh)).append("\n");
        sb.append("    addContactHorrible: ").append(toIndentedString(addContactHorrible)).append("\n");
        sb.append("    addContactNeutral: ").append(toIndentedString(addContactNeutral)).append("\n");
        sb.append("    addNote: ").append(toIndentedString(addNote)).append("\n");
        sb.append("    addedAsContactBad: ").append(toIndentedString(addedAsContactBad)).append("\n");
        sb.append("    addedAsContactGood: ").append(toIndentedString(addedAsContactGood)).append("\n");
        sb.append("    addedAsContactHigh: ").append(toIndentedString(addedAsContactHigh)).append("\n");
        sb.append("    addedAsContactHorrible: ").append(toIndentedString(addedAsContactHorrible)).append("\n");
        sb.append("    addedAsContactNeutral: ").append(toIndentedString(addedAsContactNeutral)).append("\n");
        sb.append("    calendarEventCreated: ").append(toIndentedString(calendarEventCreated)).append("\n");
        sb.append("    chatMessagesAlliance: ").append(toIndentedString(chatMessagesAlliance)).append("\n");
        sb.append("    chatMessagesConstellation: ").append(toIndentedString(chatMessagesConstellation)).append("\n");
        sb.append("    chatMessagesCorporation: ").append(toIndentedString(chatMessagesCorporation)).append("\n");
        sb.append("    chatMessagesFleet: ").append(toIndentedString(chatMessagesFleet)).append("\n");
        sb.append("    chatMessagesRegion: ").append(toIndentedString(chatMessagesRegion)).append("\n");
        sb.append("    chatMessagesSolarsystem: ").append(toIndentedString(chatMessagesSolarsystem)).append("\n");
        sb.append("    chatMessagesWarfaction: ").append(toIndentedString(chatMessagesWarfaction)).append("\n");
        sb.append("    chatTotalMessageLength: ").append(toIndentedString(chatTotalMessageLength)).append("\n");
        sb.append("    directTrades: ").append(toIndentedString(directTrades)).append("\n");
        sb.append("    fleetBroadcasts: ").append(toIndentedString(fleetBroadcasts)).append("\n");
        sb.append("    fleetJoins: ").append(toIndentedString(fleetJoins)).append("\n");
        sb.append("    mailsReceived: ").append(toIndentedString(mailsReceived)).append("\n");
        sb.append("    mailsSent: ").append(toIndentedString(mailsSent)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
