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
 * 201 created object
 */
@ApiModel(description = "201 created object")
public class CharacterFittingResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("fitting_id")
    private Integer fittingId = null;

    public CharacterFittingResponse fittingId(Integer fittingId) {
        this.fittingId = fittingId;
        return this;
    }

    /**
     * fitting_id integer
     * 
     * @return fittingId
     **/
    @ApiModelProperty(required = true, value = "fitting_id integer")
    public Integer getFittingId() {
        return fittingId;
    }

    public void setFittingId(Integer fittingId) {
        this.fittingId = fittingId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterFittingResponse characterFittingResponse = (CharacterFittingResponse) o;
        return Objects.equals(this.fittingId, characterFittingResponse.fittingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fittingId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterFittingResponse {\n");

        sb.append("    fittingId: ").append(toIndentedString(fittingId)).append("\n");
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
