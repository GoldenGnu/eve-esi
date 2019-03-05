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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import net.troja.eve.esi.model.Clone;
import net.troja.eve.esi.model.CloneHomeLocation;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CharacterClonesResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("home_location")
    private CloneHomeLocation homeLocation = null;

    @SerializedName("jump_clones")
    private List<Clone> jumpClones = new ArrayList<>();

    @SerializedName("last_clone_jump_date")
    private OffsetDateTime lastCloneJumpDate = null;

    @SerializedName("last_station_change_date")
    private OffsetDateTime lastStationChangeDate = null;

    public CharacterClonesResponse homeLocation(CloneHomeLocation homeLocation) {
        this.homeLocation = homeLocation;
        return this;
    }

    /**
     * Get homeLocation
     * 
     * @return homeLocation
     **/
    @ApiModelProperty(value = "")
    public CloneHomeLocation getHomeLocation() {
        return homeLocation;
    }

    public void setHomeLocation(CloneHomeLocation homeLocation) {
        this.homeLocation = homeLocation;
    }

    public CharacterClonesResponse jumpClones(List<Clone> jumpClones) {
        this.jumpClones = jumpClones;
        return this;
    }

    public CharacterClonesResponse addJumpClonesItem(Clone jumpClonesItem) {
        this.jumpClones.add(jumpClonesItem);
        return this;
    }

    /**
     * jump_clones array
     * 
     * @return jumpClones
     **/
    @ApiModelProperty(required = true, value = "jump_clones array")
    public List<Clone> getJumpClones() {
        return jumpClones;
    }

    public void setJumpClones(List<Clone> jumpClones) {
        this.jumpClones = jumpClones;
    }

    public CharacterClonesResponse lastCloneJumpDate(OffsetDateTime lastCloneJumpDate) {
        this.lastCloneJumpDate = lastCloneJumpDate;
        return this;
    }

    /**
     * last_clone_jump_date string
     * 
     * @return lastCloneJumpDate
     **/
    @ApiModelProperty(value = "last_clone_jump_date string")
    public OffsetDateTime getLastCloneJumpDate() {
        return lastCloneJumpDate;
    }

    public void setLastCloneJumpDate(OffsetDateTime lastCloneJumpDate) {
        this.lastCloneJumpDate = lastCloneJumpDate;
    }

    public CharacterClonesResponse lastStationChangeDate(OffsetDateTime lastStationChangeDate) {
        this.lastStationChangeDate = lastStationChangeDate;
        return this;
    }

    /**
     * last_station_change_date string
     * 
     * @return lastStationChangeDate
     **/
    @ApiModelProperty(value = "last_station_change_date string")
    public OffsetDateTime getLastStationChangeDate() {
        return lastStationChangeDate;
    }

    public void setLastStationChangeDate(OffsetDateTime lastStationChangeDate) {
        this.lastStationChangeDate = lastStationChangeDate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterClonesResponse characterClonesResponse = (CharacterClonesResponse) o;
        return Objects.equals(this.homeLocation, characterClonesResponse.homeLocation)
                && Objects.equals(this.jumpClones, characterClonesResponse.jumpClones)
                && Objects.equals(this.lastCloneJumpDate, characterClonesResponse.lastCloneJumpDate)
                && Objects.equals(this.lastStationChangeDate, characterClonesResponse.lastStationChangeDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(homeLocation, jumpClones, lastCloneJumpDate, lastStationChangeDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterClonesResponse {\n");

        sb.append("    homeLocation: ").append(toIndentedString(homeLocation)).append("\n");
        sb.append("    jumpClones: ").append(toIndentedString(jumpClones)).append("\n");
        sb.append("    lastCloneJumpDate: ").append(toIndentedString(lastCloneJumpDate)).append("\n");
        sb.append("    lastStationChangeDate: ").append(toIndentedString(lastStationChangeDate)).append("\n");
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
