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
import net.troja.eve.esi.model.FittingItem;
import java.io.Serializable;

/**
 * fitting object
 */
@ApiModel(description = "fitting object")
public class CharacterFitting implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("description")
    private String description = null;

    @SerializedName("items")
    private List<FittingItem> items = new ArrayList<>();

    @SerializedName("name")
    private String name = null;

    @SerializedName("ship_type_id")
    private Integer shipTypeId = null;

    public CharacterFitting description(String description) {
        this.description = description;
        return this;
    }

    /**
     * description string
     * 
     * @return description
     **/
    @ApiModelProperty(required = true, value = "description string")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CharacterFitting items(List<FittingItem> items) {
        this.items = items;
        return this;
    }

    public CharacterFitting addItemsItem(FittingItem itemsItem) {
        this.items.add(itemsItem);
        return this;
    }

    /**
     * items array
     * 
     * @return items
     **/
    @ApiModelProperty(required = true, value = "items array")
    public List<FittingItem> getItems() {
        return items;
    }

    public void setItems(List<FittingItem> items) {
        this.items = items;
    }

    public CharacterFitting name(String name) {
        this.name = name;
        return this;
    }

    /**
     * name string
     * 
     * @return name
     **/
    @ApiModelProperty(required = true, value = "name string")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CharacterFitting shipTypeId(Integer shipTypeId) {
        this.shipTypeId = shipTypeId;
        return this;
    }

    /**
     * ship_type_id integer
     * 
     * @return shipTypeId
     **/
    @ApiModelProperty(required = true, value = "ship_type_id integer")
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
        CharacterFitting characterFitting = (CharacterFitting) o;
        return Objects.equals(this.description, characterFitting.description)
                && Objects.equals(this.items, characterFitting.items)
                && Objects.equals(this.name, characterFitting.name)
                && Objects.equals(this.shipTypeId, characterFitting.shipTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, items, name, shipTypeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterFitting {\n");

        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
