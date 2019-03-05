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
import java.util.ArrayList;
import java.util.List;
import net.troja.eve.esi.model.KillmailItem;
import net.troja.eve.esi.model.Position;
import java.io.Serializable;

/**
 * victim object
 */
@ApiModel(description = "victim object")
public class KillmailVictim implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("alliance_id")
    private Integer allianceId = null;

    @SerializedName("character_id")
    private Integer characterId = null;

    @SerializedName("corporation_id")
    private Integer corporationId = null;

    @SerializedName("damage_taken")
    private Integer damageTaken = null;

    @SerializedName("faction_id")
    private Integer factionId = null;

    @SerializedName("items")
    private List<KillmailItem> items = null;

    @SerializedName("position")
    private Position position = null;

    @SerializedName("ship_type_id")
    private Integer shipTypeId = null;

    public KillmailVictim allianceId(Integer allianceId) {
        this.allianceId = allianceId;
        return this;
    }

    /**
     * alliance_id integer
     * 
     * @return allianceId
     **/
    @ApiModelProperty(value = "alliance_id integer")
    public Integer getAllianceId() {
        return allianceId;
    }

    public void setAllianceId(Integer allianceId) {
        this.allianceId = allianceId;
    }

    public KillmailVictim characterId(Integer characterId) {
        this.characterId = characterId;
        return this;
    }

    /**
     * character_id integer
     * 
     * @return characterId
     **/
    @ApiModelProperty(value = "character_id integer")
    public Integer getCharacterId() {
        return characterId;
    }

    public void setCharacterId(Integer characterId) {
        this.characterId = characterId;
    }

    public KillmailVictim corporationId(Integer corporationId) {
        this.corporationId = corporationId;
        return this;
    }

    /**
     * corporation_id integer
     * 
     * @return corporationId
     **/
    @ApiModelProperty(value = "corporation_id integer")
    public Integer getCorporationId() {
        return corporationId;
    }

    public void setCorporationId(Integer corporationId) {
        this.corporationId = corporationId;
    }

    public KillmailVictim damageTaken(Integer damageTaken) {
        this.damageTaken = damageTaken;
        return this;
    }

    /**
     * How much total damage was taken by the victim
     * 
     * @return damageTaken
     **/
    @ApiModelProperty(required = true, value = "How much total damage was taken by the victim ")
    public Integer getDamageTaken() {
        return damageTaken;
    }

    public void setDamageTaken(Integer damageTaken) {
        this.damageTaken = damageTaken;
    }

    public KillmailVictim factionId(Integer factionId) {
        this.factionId = factionId;
        return this;
    }

    /**
     * faction_id integer
     * 
     * @return factionId
     **/
    @ApiModelProperty(value = "faction_id integer")
    public Integer getFactionId() {
        return factionId;
    }

    public void setFactionId(Integer factionId) {
        this.factionId = factionId;
    }

    public KillmailVictim items(List<KillmailItem> items) {
        this.items = items;
        return this;
    }

    public KillmailVictim addItemsItem(KillmailItem itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    /**
     * items array
     * 
     * @return items
     **/
    @ApiModelProperty(value = "items array")
    public List<KillmailItem> getItems() {
        return items;
    }

    public void setItems(List<KillmailItem> items) {
        this.items = items;
    }

    public KillmailVictim position(Position position) {
        this.position = position;
        return this;
    }

    /**
     * Get position
     * 
     * @return position
     **/
    @ApiModelProperty(value = "")
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public KillmailVictim shipTypeId(Integer shipTypeId) {
        this.shipTypeId = shipTypeId;
        return this;
    }

    /**
     * The ship that the victim was piloting and was destroyed
     * 
     * @return shipTypeId
     **/
    @ApiModelProperty(required = true, value = "The ship that the victim was piloting and was destroyed ")
    public Integer getShipTypeId() {
        return shipTypeId;
    }

    public void setShipTypeId(Integer shipTypeId) {
        this.shipTypeId = shipTypeId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KillmailVictim killmailVictim = (KillmailVictim) o;
        return Objects.equals(this.allianceId, killmailVictim.allianceId)
                && Objects.equals(this.characterId, killmailVictim.characterId)
                && Objects.equals(this.corporationId, killmailVictim.corporationId)
                && Objects.equals(this.damageTaken, killmailVictim.damageTaken)
                && Objects.equals(this.factionId, killmailVictim.factionId)
                && Objects.equals(this.items, killmailVictim.items)
                && Objects.equals(this.position, killmailVictim.position)
                && Objects.equals(this.shipTypeId, killmailVictim.shipTypeId);
    }

    @Override
    public int hashCode() {
        return Objects
                .hash(allianceId, characterId, corporationId, damageTaken, factionId, items, position, shipTypeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KillmailVictim {\n");

        sb.append("    allianceId: ").append(toIndentedString(allianceId)).append("\n");
        sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
        sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
        sb.append("    damageTaken: ").append(toIndentedString(damageTaken)).append("\n");
        sb.append("    factionId: ").append(toIndentedString(factionId)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    shipTypeId: ").append(toIndentedString(shipTypeId)).append("\n");
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
