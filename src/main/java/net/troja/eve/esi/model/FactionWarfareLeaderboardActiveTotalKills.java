/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package net.troja.eve.esi.model;

import java.util.Objects;
import java.util.Arrays;
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
 * active_total object
 */
@ApiModel(description = "active_total object")
public class FactionWarfareLeaderboardActiveTotalKills implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_AMOUNT = "amount";
    @SerializedName(SERIALIZED_NAME_AMOUNT)
    private Integer amount;

    public static final String SERIALIZED_NAME_FACTION_ID = "faction_id";
    @SerializedName(SERIALIZED_NAME_FACTION_ID)
    private Integer factionId;

    public FactionWarfareLeaderboardActiveTotalKills amount(Integer amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Amount of kills
     * 
     * @return amount
     **/
    @ApiModelProperty(value = "Amount of kills")
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public FactionWarfareLeaderboardActiveTotalKills factionId(Integer factionId) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FactionWarfareLeaderboardActiveTotalKills factionWarfareLeaderboardActiveTotalKills = (FactionWarfareLeaderboardActiveTotalKills) o;
        return Objects.equals(this.amount, factionWarfareLeaderboardActiveTotalKills.amount)
                && Objects.equals(this.factionId, factionWarfareLeaderboardActiveTotalKills.factionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, factionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FactionWarfareLeaderboardActiveTotalKills {\n");

        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    factionId: ").append(toIndentedString(factionId)).append("\n");
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
