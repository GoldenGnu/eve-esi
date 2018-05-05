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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * graphic object
 */
@ApiModel(description = "graphic object")
public class CharacterMedalsGraphic implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("color")
    private Integer color = null;

    @JsonProperty("graphic")
    private String graphic = null;

    @JsonProperty("layer")
    private Integer layer = null;

    @JsonProperty("part")
    private Integer part = null;

    public CharacterMedalsGraphic color(Integer color) {
        this.color = color;
        return this;
    }

    /**
     * color integer
     * 
     * @return color
     **/
    @ApiModelProperty(example = "null", value = "color integer")
    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public CharacterMedalsGraphic graphic(String graphic) {
        this.graphic = graphic;
        return this;
    }

    /**
     * graphic string
     * 
     * @return graphic
     **/
    @ApiModelProperty(example = "null", required = true, value = "graphic string")
    public String getGraphic() {
        return graphic;
    }

    public void setGraphic(String graphic) {
        this.graphic = graphic;
    }

    public CharacterMedalsGraphic layer(Integer layer) {
        this.layer = layer;
        return this;
    }

    /**
     * layer integer
     * 
     * @return layer
     **/
    @ApiModelProperty(example = "null", required = true, value = "layer integer")
    public Integer getLayer() {
        return layer;
    }

    public void setLayer(Integer layer) {
        this.layer = layer;
    }

    public CharacterMedalsGraphic part(Integer part) {
        this.part = part;
        return this;
    }

    /**
     * part integer
     * 
     * @return part
     **/
    @ApiModelProperty(example = "null", required = true, value = "part integer")
    public Integer getPart() {
        return part;
    }

    public void setPart(Integer part) {
        this.part = part;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterMedalsGraphic characterMedalsGraphic = (CharacterMedalsGraphic) o;
        return Objects.equals(this.color, characterMedalsGraphic.color)
                && Objects.equals(this.graphic, characterMedalsGraphic.graphic)
                && Objects.equals(this.layer, characterMedalsGraphic.layer)
                && Objects.equals(this.part, characterMedalsGraphic.part);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, graphic, layer, part);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterMedalsGraphic {\n");

        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    graphic: ").append(toIndentedString(graphic)).append("\n");
        sb.append("    layer: ").append(toIndentedString(layer)).append("\n");
        sb.append("    part: ").append(toIndentedString(part)).append("\n");
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
