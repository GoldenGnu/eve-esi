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
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class MarketOrdersResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("order_id")
    private Long orderId = null;

    @JsonProperty("type_id")
    private Integer typeId = null;

    @JsonProperty("location_id")
    private Long locationId = null;

    @JsonProperty("volume_total")
    private Integer volumeTotal = null;

    @JsonProperty("volume_remain")
    private Integer volumeRemain = null;

    @JsonProperty("min_volume")
    private Integer minVolume = null;

    @JsonProperty("price")
    private Double price = null;

    @JsonProperty("is_buy_order")
    private Boolean isBuyOrder = null;

    @JsonProperty("duration")
    private Integer duration = null;

    @JsonProperty("issued")
    private OffsetDateTime issued = null;

    /**
     * range string
     */
    public enum RangeEnum {
        STATION("station"),

        REGION("region"),

        SOLARSYSTEM("solarsystem"),

        _1("1"),

        _2("2"),

        _3("3"),

        _4("4"),

        _5("5"),

        _10("10"),

        _20("20"),

        _30("30"),

        _40("40");

        private String value;

        RangeEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RangeEnum fromValue(String text) {
            for (RangeEnum b : RangeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("range")
    private RangeEnum range = null;

    public MarketOrdersResponse orderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * order_id integer
     * 
     * @return orderId
     **/
    @ApiModelProperty(example = "null", required = true, value = "order_id integer")
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public MarketOrdersResponse typeId(Integer typeId) {
        this.typeId = typeId;
        return this;
    }

    /**
     * type_id integer
     * 
     * @return typeId
     **/
    @ApiModelProperty(example = "null", required = true, value = "type_id integer")
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public MarketOrdersResponse locationId(Long locationId) {
        this.locationId = locationId;
        return this;
    }

    /**
     * location_id integer
     * 
     * @return locationId
     **/
    @ApiModelProperty(example = "null", required = true, value = "location_id integer")
    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public MarketOrdersResponse volumeTotal(Integer volumeTotal) {
        this.volumeTotal = volumeTotal;
        return this;
    }

    /**
     * volume_total integer
     * 
     * @return volumeTotal
     **/
    @ApiModelProperty(example = "null", required = true, value = "volume_total integer")
    public Integer getVolumeTotal() {
        return volumeTotal;
    }

    public void setVolumeTotal(Integer volumeTotal) {
        this.volumeTotal = volumeTotal;
    }

    public MarketOrdersResponse volumeRemain(Integer volumeRemain) {
        this.volumeRemain = volumeRemain;
        return this;
    }

    /**
     * volume_remain integer
     * 
     * @return volumeRemain
     **/
    @ApiModelProperty(example = "null", required = true, value = "volume_remain integer")
    public Integer getVolumeRemain() {
        return volumeRemain;
    }

    public void setVolumeRemain(Integer volumeRemain) {
        this.volumeRemain = volumeRemain;
    }

    public MarketOrdersResponse minVolume(Integer minVolume) {
        this.minVolume = minVolume;
        return this;
    }

    /**
     * min_volume integer
     * 
     * @return minVolume
     **/
    @ApiModelProperty(example = "null", required = true, value = "min_volume integer")
    public Integer getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(Integer minVolume) {
        this.minVolume = minVolume;
    }

    public MarketOrdersResponse price(Double price) {
        this.price = price;
        return this;
    }

    /**
     * price number
     * 
     * @return price
     **/
    @ApiModelProperty(example = "null", required = true, value = "price number")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public MarketOrdersResponse isBuyOrder(Boolean isBuyOrder) {
        this.isBuyOrder = isBuyOrder;
        return this;
    }

    /**
     * is_buy_order boolean
     * 
     * @return isBuyOrder
     **/
    @ApiModelProperty(example = "null", required = true, value = "is_buy_order boolean")
    public Boolean getIsBuyOrder() {
        return isBuyOrder;
    }

    public void setIsBuyOrder(Boolean isBuyOrder) {
        this.isBuyOrder = isBuyOrder;
    }

    public MarketOrdersResponse duration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * duration integer
     * 
     * @return duration
     **/
    @ApiModelProperty(example = "null", required = true, value = "duration integer")
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public MarketOrdersResponse issued(OffsetDateTime issued) {
        this.issued = issued;
        return this;
    }

    /**
     * issued string
     * 
     * @return issued
     **/
    @ApiModelProperty(example = "null", required = true, value = "issued string")
    public OffsetDateTime getIssued() {
        return issued;
    }

    public void setIssued(OffsetDateTime issued) {
        this.issued = issued;
    }

    public MarketOrdersResponse range(RangeEnum range) {
        this.range = range;
        return this;
    }

    /**
     * range string
     * 
     * @return range
     **/
    @ApiModelProperty(example = "null", required = true, value = "range string")
    public RangeEnum getRange() {
        return range;
    }

    public void setRange(RangeEnum range) {
        this.range = range;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MarketOrdersResponse marketOrdersResponse = (MarketOrdersResponse) o;
        return Objects.equals(this.orderId, marketOrdersResponse.orderId)
                && Objects.equals(this.typeId, marketOrdersResponse.typeId)
                && Objects.equals(this.locationId, marketOrdersResponse.locationId)
                && Objects.equals(this.volumeTotal, marketOrdersResponse.volumeTotal)
                && Objects.equals(this.volumeRemain, marketOrdersResponse.volumeRemain)
                && Objects.equals(this.minVolume, marketOrdersResponse.minVolume)
                && Objects.equals(this.price, marketOrdersResponse.price)
                && Objects.equals(this.isBuyOrder, marketOrdersResponse.isBuyOrder)
                && Objects.equals(this.duration, marketOrdersResponse.duration)
                && Objects.equals(this.issued, marketOrdersResponse.issued)
                && Objects.equals(this.range, marketOrdersResponse.range);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, typeId, locationId, volumeTotal, volumeRemain, minVolume, price, isBuyOrder,
                duration, issued, range);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MarketOrdersResponse {\n");

        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
        sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
        sb.append("    volumeTotal: ").append(toIndentedString(volumeTotal)).append("\n");
        sb.append("    volumeRemain: ").append(toIndentedString(volumeRemain)).append("\n");
        sb.append("    minVolume: ").append(toIndentedString(minVolume)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    isBuyOrder: ").append(toIndentedString(isBuyOrder)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    issued: ").append(toIndentedString(issued)).append("\n");
        sb.append("    range: ").append(toIndentedString(range)).append("\n");
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
