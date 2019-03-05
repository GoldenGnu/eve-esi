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
import net.troja.eve.esi.model.PlanetContent;
import net.troja.eve.esi.model.PlanetExtractorDetails;
import net.troja.eve.esi.model.PlanetFactoryDetails;
import java.io.Serializable;

/**
 * pin object
 */
@ApiModel(description = "pin object")
public class PlanetPin implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("contents")
    private List<PlanetContent> contents = null;

    @SerializedName("expiry_time")
    private OffsetDateTime expiryTime = null;

    @SerializedName("extractor_details")
    private PlanetExtractorDetails extractorDetails = null;

    @SerializedName("factory_details")
    private PlanetFactoryDetails factoryDetails = null;

    @SerializedName("install_time")
    private OffsetDateTime installTime = null;

    @SerializedName("last_cycle_start")
    private OffsetDateTime lastCycleStart = null;

    @SerializedName("latitude")
    private Float latitude = null;

    @SerializedName("longitude")
    private Float longitude = null;

    @SerializedName("pin_id")
    private Long pinId = null;

    @SerializedName("schematic_id")
    private Integer schematicId = null;

    @SerializedName("type_id")
    private Integer typeId = null;

    public PlanetPin contents(List<PlanetContent> contents) {
        this.contents = contents;
        return this;
    }

    public PlanetPin addContentsItem(PlanetContent contentsItem) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        this.contents.add(contentsItem);
        return this;
    }

    /**
     * contents array
     * 
     * @return contents
     **/
    @ApiModelProperty(value = "contents array")
    public List<PlanetContent> getContents() {
        return contents;
    }

    public void setContents(List<PlanetContent> contents) {
        this.contents = contents;
    }

    public PlanetPin expiryTime(OffsetDateTime expiryTime) {
        this.expiryTime = expiryTime;
        return this;
    }

    /**
     * expiry_time string
     * 
     * @return expiryTime
     **/
    @ApiModelProperty(value = "expiry_time string")
    public OffsetDateTime getExpiryTime() {
        return expiryTime;
    }

    public void setExpiryTime(OffsetDateTime expiryTime) {
        this.expiryTime = expiryTime;
    }

    public PlanetPin extractorDetails(PlanetExtractorDetails extractorDetails) {
        this.extractorDetails = extractorDetails;
        return this;
    }

    /**
     * Get extractorDetails
     * 
     * @return extractorDetails
     **/
    @ApiModelProperty(value = "")
    public PlanetExtractorDetails getExtractorDetails() {
        return extractorDetails;
    }

    public void setExtractorDetails(PlanetExtractorDetails extractorDetails) {
        this.extractorDetails = extractorDetails;
    }

    public PlanetPin factoryDetails(PlanetFactoryDetails factoryDetails) {
        this.factoryDetails = factoryDetails;
        return this;
    }

    /**
     * Get factoryDetails
     * 
     * @return factoryDetails
     **/
    @ApiModelProperty(value = "")
    public PlanetFactoryDetails getFactoryDetails() {
        return factoryDetails;
    }

    public void setFactoryDetails(PlanetFactoryDetails factoryDetails) {
        this.factoryDetails = factoryDetails;
    }

    public PlanetPin installTime(OffsetDateTime installTime) {
        this.installTime = installTime;
        return this;
    }

    /**
     * install_time string
     * 
     * @return installTime
     **/
    @ApiModelProperty(value = "install_time string")
    public OffsetDateTime getInstallTime() {
        return installTime;
    }

    public void setInstallTime(OffsetDateTime installTime) {
        this.installTime = installTime;
    }

    public PlanetPin lastCycleStart(OffsetDateTime lastCycleStart) {
        this.lastCycleStart = lastCycleStart;
        return this;
    }

    /**
     * last_cycle_start string
     * 
     * @return lastCycleStart
     **/
    @ApiModelProperty(value = "last_cycle_start string")
    public OffsetDateTime getLastCycleStart() {
        return lastCycleStart;
    }

    public void setLastCycleStart(OffsetDateTime lastCycleStart) {
        this.lastCycleStart = lastCycleStart;
    }

    public PlanetPin latitude(Float latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * latitude number
     * 
     * @return latitude
     **/
    @ApiModelProperty(required = true, value = "latitude number")
    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public PlanetPin longitude(Float longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * longitude number
     * 
     * @return longitude
     **/
    @ApiModelProperty(required = true, value = "longitude number")
    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public PlanetPin pinId(Long pinId) {
        this.pinId = pinId;
        return this;
    }

    /**
     * pin_id integer
     * 
     * @return pinId
     **/
    @ApiModelProperty(required = true, value = "pin_id integer")
    public Long getPinId() {
        return pinId;
    }

    public void setPinId(Long pinId) {
        this.pinId = pinId;
    }

    public PlanetPin schematicId(Integer schematicId) {
        this.schematicId = schematicId;
        return this;
    }

    /**
     * schematic_id integer
     * 
     * @return schematicId
     **/
    @ApiModelProperty(value = "schematic_id integer")
    public Integer getSchematicId() {
        return schematicId;
    }

    public void setSchematicId(Integer schematicId) {
        this.schematicId = schematicId;
    }

    public PlanetPin typeId(Integer typeId) {
        this.typeId = typeId;
        return this;
    }

    /**
     * type_id integer
     * 
     * @return typeId
     **/
    @ApiModelProperty(required = true, value = "type_id integer")
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlanetPin planetPin = (PlanetPin) o;
        return Objects.equals(this.contents, planetPin.contents)
                && Objects.equals(this.expiryTime, planetPin.expiryTime)
                && Objects.equals(this.extractorDetails, planetPin.extractorDetails)
                && Objects.equals(this.factoryDetails, planetPin.factoryDetails)
                && Objects.equals(this.installTime, planetPin.installTime)
                && Objects.equals(this.lastCycleStart, planetPin.lastCycleStart)
                && Objects.equals(this.latitude, planetPin.latitude)
                && Objects.equals(this.longitude, planetPin.longitude) && Objects.equals(this.pinId, planetPin.pinId)
                && Objects.equals(this.schematicId, planetPin.schematicId)
                && Objects.equals(this.typeId, planetPin.typeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contents, expiryTime, extractorDetails, factoryDetails, installTime, lastCycleStart,
                latitude, longitude, pinId, schematicId, typeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlanetPin {\n");

        sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
        sb.append("    expiryTime: ").append(toIndentedString(expiryTime)).append("\n");
        sb.append("    extractorDetails: ").append(toIndentedString(extractorDetails)).append("\n");
        sb.append("    factoryDetails: ").append(toIndentedString(factoryDetails)).append("\n");
        sb.append("    installTime: ").append(toIndentedString(installTime)).append("\n");
        sb.append("    lastCycleStart: ").append(toIndentedString(lastCycleStart)).append("\n");
        sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
        sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
        sb.append("    pinId: ").append(toIndentedString(pinId)).append("\n");
        sb.append("    schematicId: ").append(toIndentedString(schematicId)).append("\n");
        sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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
