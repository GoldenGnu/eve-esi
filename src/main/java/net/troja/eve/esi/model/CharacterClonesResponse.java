/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.3.2.dev3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package net.troja.eve.esi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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

    @JsonProperty("home_location")
    private CloneHomeLocation homeLocation = null;

    @JsonProperty("jump_clones")
    private List<Clone> jumpClones = new ArrayList<Clone>();

    @JsonProperty("last_jump_date")
    private OffsetDateTime lastJumpDate = null;

    public CharacterClonesResponse homeLocation(CloneHomeLocation homeLocation) {
        this.homeLocation = homeLocation;
        return this;
    }

    /**
     * Get homeLocation
     * 
     * @return homeLocation
     **/
    @ApiModelProperty(example = "null", value = "")
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
    @ApiModelProperty(example = "null", required = true, value = "jump_clones array")
    public List<Clone> getJumpClones() {
        return jumpClones;
    }

    public void setJumpClones(List<Clone> jumpClones) {
        this.jumpClones = jumpClones;
    }

    public CharacterClonesResponse lastJumpDate(OffsetDateTime lastJumpDate) {
        this.lastJumpDate = lastJumpDate;
        return this;
    }

    /**
     * last_jump_date string
     * 
     * @return lastJumpDate
     **/
    @ApiModelProperty(example = "null", value = "last_jump_date string")
    public OffsetDateTime getLastJumpDate() {
        return lastJumpDate;
    }

    public void setLastJumpDate(OffsetDateTime lastJumpDate) {
        this.lastJumpDate = lastJumpDate;
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
                && Objects.equals(this.lastJumpDate, characterClonesResponse.lastJumpDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(homeLocation, jumpClones, lastJumpDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterClonesResponse {\n");

        sb.append("    homeLocation: ").append(toIndentedString(homeLocation)).append("\n");
        sb.append("    jumpClones: ").append(toIndentedString(jumpClones)).append("\n");
        sb.append("    lastJumpDate: ").append(toIndentedString(lastJumpDate)).append("\n");
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
