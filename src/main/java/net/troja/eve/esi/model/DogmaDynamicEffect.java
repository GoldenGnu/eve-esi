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
 * dogma_effect object
 */
@ApiModel(description = "dogma_effect object")
public class DogmaDynamicEffect implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("effect_id")
    private Integer effectId = null;

    @SerializedName("is_default")
    private Boolean isDefault = null;

    public DogmaDynamicEffect effectId(Integer effectId) {
        this.effectId = effectId;
        return this;
    }

    /**
     * effect_id integer
     * 
     * @return effectId
     **/
    @ApiModelProperty(required = true, value = "effect_id integer")
    public Integer getEffectId() {
        return effectId;
    }

    public void setEffectId(Integer effectId) {
        this.effectId = effectId;
    }

    public DogmaDynamicEffect isDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * is_default boolean
     * 
     * @return isDefault
     **/
    @ApiModelProperty(required = true, value = "is_default boolean")
    public Boolean isIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DogmaDynamicEffect dogmaDynamicEffect = (DogmaDynamicEffect) o;
        return Objects.equals(this.effectId, dogmaDynamicEffect.effectId)
                && Objects.equals(this.isDefault, dogmaDynamicEffect.isDefault);
    }

    @Override
    public int hashCode() {
        return Objects.hash(effectId, isDefault);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DogmaDynamicEffect {\n");

        sb.append("    effectId: ").append(toIndentedString(effectId)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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
