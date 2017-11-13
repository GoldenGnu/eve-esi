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
public class CorporationContractsBidsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("bid_id")
    private Integer bidId = null;

    @JsonProperty("bidder_id")
    private Integer bidderId = null;

    @JsonProperty("date_bid")
    private OffsetDateTime dateBid = null;

    @JsonProperty("amount")
    private Float amount = null;

    public CorporationContractsBidsResponse bidId(Integer bidId) {
        this.bidId = bidId;
        return this;
    }

    /**
     * Unique ID for the bid
     * 
     * @return bidId
     **/
    @ApiModelProperty(example = "null", required = true, value = "Unique ID for the bid")
    public Integer getBidId() {
        return bidId;
    }

    public void setBidId(Integer bidId) {
        this.bidId = bidId;
    }

    public CorporationContractsBidsResponse bidderId(Integer bidderId) {
        this.bidderId = bidderId;
        return this;
    }

    /**
     * Character ID of the bidder
     * 
     * @return bidderId
     **/
    @ApiModelProperty(example = "null", required = true, value = "Character ID of the bidder")
    public Integer getBidderId() {
        return bidderId;
    }

    public void setBidderId(Integer bidderId) {
        this.bidderId = bidderId;
    }

    public CorporationContractsBidsResponse dateBid(OffsetDateTime dateBid) {
        this.dateBid = dateBid;
        return this;
    }

    /**
     * Datetime when the bid was placed
     * 
     * @return dateBid
     **/
    @ApiModelProperty(example = "null", required = true, value = "Datetime when the bid was placed")
    public OffsetDateTime getDateBid() {
        return dateBid;
    }

    public void setDateBid(OffsetDateTime dateBid) {
        this.dateBid = dateBid;
    }

    public CorporationContractsBidsResponse amount(Float amount) {
        this.amount = amount;
        return this;
    }

    /**
     * The amount bid, in ISK
     * 
     * @return amount
     **/
    @ApiModelProperty(example = "null", required = true, value = "The amount bid, in ISK")
    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationContractsBidsResponse corporationContractsBidsResponse = (CorporationContractsBidsResponse) o;
        return Objects.equals(this.bidId, corporationContractsBidsResponse.bidId)
                && Objects.equals(this.bidderId, corporationContractsBidsResponse.bidderId)
                && Objects.equals(this.dateBid, corporationContractsBidsResponse.dateBid)
                && Objects.equals(this.amount, corporationContractsBidsResponse.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bidId, bidderId, dateBid, amount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationContractsBidsResponse {\n");

        sb.append("    bidId: ").append(toIndentedString(bidId)).append("\n");
        sb.append("    bidderId: ").append(toIndentedString(bidderId)).append("\n");
        sb.append("    dateBid: ").append(toIndentedString(dateBid)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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