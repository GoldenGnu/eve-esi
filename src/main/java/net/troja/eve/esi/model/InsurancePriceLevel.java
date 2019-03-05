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
 * level object
 */
@ApiModel(description = "level object")
public class InsurancePriceLevel implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("cost")
    private Float cost = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("payout")
    private Float payout = null;

    public InsurancePriceLevel cost(Float cost) {
        this.cost = cost;
        return this;
    }

    /**
     * cost number
     * 
     * @return cost
     **/
    @ApiModelProperty(required = true, value = "cost number")
    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public InsurancePriceLevel name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Localized insurance level
     * 
     * @return name
     **/
    @ApiModelProperty(required = true, value = "Localized insurance level")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InsurancePriceLevel payout(Float payout) {
        this.payout = payout;
        return this;
    }

    /**
     * payout number
     * 
     * @return payout
     **/
    @ApiModelProperty(required = true, value = "payout number")
    public Float getPayout() {
        return payout;
    }

    public void setPayout(Float payout) {
        this.payout = payout;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InsurancePriceLevel insurancePriceLevel = (InsurancePriceLevel) o;
        return Objects.equals(this.cost, insurancePriceLevel.cost)
                && Objects.equals(this.name, insurancePriceLevel.name)
                && Objects.equals(this.payout, insurancePriceLevel.payout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cost, name, payout);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InsurancePriceLevel {\n");

        sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    payout: ").append(toIndentedString(payout)).append("\n");
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
