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
public class CorporationContractsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("acceptor_id")
    private Integer acceptorId = null;

    @JsonProperty("assignee_id")
    private Integer assigneeId = null;

    /**
     * To whom the contract is available
     */
    public enum AvailabilityEnum {
        PUBLIC("public"),

        PERSONAL("personal"),

        CORPORATION("corporation"),

        ALLIANCE("alliance");

        private String value;

        AvailabilityEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AvailabilityEnum fromValue(String text) {
            for (AvailabilityEnum b : AvailabilityEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("availability")
    private AvailabilityEnum availability = null;

    @JsonProperty("buyout")
    private Double buyout = null;

    @JsonProperty("collateral")
    private Double collateral = null;

    @JsonProperty("contract_id")
    private Integer contractId = null;

    @JsonProperty("date_accepted")
    private OffsetDateTime dateAccepted = null;

    @JsonProperty("date_completed")
    private OffsetDateTime dateCompleted = null;

    @JsonProperty("date_expired")
    private OffsetDateTime dateExpired = null;

    @JsonProperty("date_issued")
    private OffsetDateTime dateIssued = null;

    @JsonProperty("days_to_complete")
    private Integer daysToComplete = null;

    @JsonProperty("end_location_id")
    private Long endLocationId = null;

    @JsonProperty("for_corporation")
    private Boolean forCorporation = null;

    @JsonProperty("issuer_corporation_id")
    private Integer issuerCorporationId = null;

    @JsonProperty("issuer_id")
    private Integer issuerId = null;

    @JsonProperty("price")
    private Double price = null;

    @JsonProperty("reward")
    private Double reward = null;

    @JsonProperty("start_location_id")
    private Long startLocationId = null;

    /**
     * Status of the the contract
     */
    public enum StatusEnum {
        OUTSTANDING("outstanding"),

        IN_PROGRESS("in_progress"),

        FINISHED_ISSUER("finished_issuer"),

        FINISHED_CONTRACTOR("finished_contractor"),

        FINISHED("finished"),

        CANCELLED("cancelled"),

        REJECTED("rejected"),

        FAILED("failed"),

        DELETED("deleted"),

        REVERSED("reversed");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String text) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("status")
    private StatusEnum status = null;

    @JsonProperty("title")
    private String title = null;

    /**
     * Type of the contract
     */
    public enum TypeEnum {
        UNKNOWN("unknown"),

        ITEM_EXCHANGE("item_exchange"),

        AUCTION("auction"),

        COURIER("courier"),

        LOAN("loan");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String text) {
            for (TypeEnum b : TypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("type")
    private TypeEnum type = null;

    @JsonProperty("volume")
    private Double volume = null;

    public CorporationContractsResponse acceptorId(Integer acceptorId) {
        this.acceptorId = acceptorId;
        return this;
    }

    /**
     * Who will accept the contract
     * 
     * @return acceptorId
     **/
    @ApiModelProperty(example = "null", required = true, value = "Who will accept the contract")
    public Integer getAcceptorId() {
        return acceptorId;
    }

    public void setAcceptorId(Integer acceptorId) {
        this.acceptorId = acceptorId;
    }

    public CorporationContractsResponse assigneeId(Integer assigneeId) {
        this.assigneeId = assigneeId;
        return this;
    }

    /**
     * ID to whom the contract is assigned, can be corporation or character ID
     * 
     * @return assigneeId
     **/
    @ApiModelProperty(example = "null", required = true, value = "ID to whom the contract is assigned, can be corporation or character ID")
    public Integer getAssigneeId() {
        return assigneeId;
    }

    public void setAssigneeId(Integer assigneeId) {
        this.assigneeId = assigneeId;
    }

    public CorporationContractsResponse availability(AvailabilityEnum availability) {
        this.availability = availability;
        return this;
    }

    /**
     * To whom the contract is available
     * 
     * @return availability
     **/
    @ApiModelProperty(example = "null", required = true, value = "To whom the contract is available")
    public AvailabilityEnum getAvailability() {
        return availability;
    }

    public void setAvailability(AvailabilityEnum availability) {
        this.availability = availability;
    }

    public CorporationContractsResponse buyout(Double buyout) {
        this.buyout = buyout;
        return this;
    }

    /**
     * Buyout price (for Auctions only)
     * 
     * @return buyout
     **/
    @ApiModelProperty(example = "null", value = "Buyout price (for Auctions only)")
    public Double getBuyout() {
        return buyout;
    }

    public void setBuyout(Double buyout) {
        this.buyout = buyout;
    }

    public CorporationContractsResponse collateral(Double collateral) {
        this.collateral = collateral;
        return this;
    }

    /**
     * Collateral price (for Couriers only)
     * 
     * @return collateral
     **/
    @ApiModelProperty(example = "null", value = "Collateral price (for Couriers only)")
    public Double getCollateral() {
        return collateral;
    }

    public void setCollateral(Double collateral) {
        this.collateral = collateral;
    }

    public CorporationContractsResponse contractId(Integer contractId) {
        this.contractId = contractId;
        return this;
    }

    /**
     * contract_id integer
     * 
     * @return contractId
     **/
    @ApiModelProperty(example = "null", required = true, value = "contract_id integer")
    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public CorporationContractsResponse dateAccepted(OffsetDateTime dateAccepted) {
        this.dateAccepted = dateAccepted;
        return this;
    }

    /**
     * Date of confirmation of contract
     * 
     * @return dateAccepted
     **/
    @ApiModelProperty(example = "null", value = "Date of confirmation of contract")
    public OffsetDateTime getDateAccepted() {
        return dateAccepted;
    }

    public void setDateAccepted(OffsetDateTime dateAccepted) {
        this.dateAccepted = dateAccepted;
    }

    public CorporationContractsResponse dateCompleted(OffsetDateTime dateCompleted) {
        this.dateCompleted = dateCompleted;
        return this;
    }

    /**
     * Date of completed of contract
     * 
     * @return dateCompleted
     **/
    @ApiModelProperty(example = "null", value = "Date of completed of contract")
    public OffsetDateTime getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(OffsetDateTime dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    public CorporationContractsResponse dateExpired(OffsetDateTime dateExpired) {
        this.dateExpired = dateExpired;
        return this;
    }

    /**
     * Expiration date of the contract
     * 
     * @return dateExpired
     **/
    @ApiModelProperty(example = "null", required = true, value = "Expiration date of the contract")
    public OffsetDateTime getDateExpired() {
        return dateExpired;
    }

    public void setDateExpired(OffsetDateTime dateExpired) {
        this.dateExpired = dateExpired;
    }

    public CorporationContractsResponse dateIssued(OffsetDateTime dateIssued) {
        this.dateIssued = dateIssued;
        return this;
    }

    /**
     * Сreation date of the contract
     * 
     * @return dateIssued
     **/
    @ApiModelProperty(example = "null", required = true, value = "Сreation date of the contract")
    public OffsetDateTime getDateIssued() {
        return dateIssued;
    }

    public void setDateIssued(OffsetDateTime dateIssued) {
        this.dateIssued = dateIssued;
    }

    public CorporationContractsResponse daysToComplete(Integer daysToComplete) {
        this.daysToComplete = daysToComplete;
        return this;
    }

    /**
     * Number of days to perform the contract
     * 
     * @return daysToComplete
     **/
    @ApiModelProperty(example = "null", value = "Number of days to perform the contract")
    public Integer getDaysToComplete() {
        return daysToComplete;
    }

    public void setDaysToComplete(Integer daysToComplete) {
        this.daysToComplete = daysToComplete;
    }

    public CorporationContractsResponse endLocationId(Long endLocationId) {
        this.endLocationId = endLocationId;
        return this;
    }

    /**
     * End location ID (for Couriers contract)
     * 
     * @return endLocationId
     **/
    @ApiModelProperty(example = "null", value = "End location ID (for Couriers contract)")
    public Long getEndLocationId() {
        return endLocationId;
    }

    public void setEndLocationId(Long endLocationId) {
        this.endLocationId = endLocationId;
    }

    public CorporationContractsResponse forCorporation(Boolean forCorporation) {
        this.forCorporation = forCorporation;
        return this;
    }

    /**
     * true if the contract was issued on behalf of the issuer's corporation
     * 
     * @return forCorporation
     **/
    @ApiModelProperty(example = "null", required = true, value = "true if the contract was issued on behalf of the issuer's corporation")
    public Boolean getForCorporation() {
        return forCorporation;
    }

    public void setForCorporation(Boolean forCorporation) {
        this.forCorporation = forCorporation;
    }

    public CorporationContractsResponse issuerCorporationId(Integer issuerCorporationId) {
        this.issuerCorporationId = issuerCorporationId;
        return this;
    }

    /**
     * Character's corporation ID for the issuer
     * 
     * @return issuerCorporationId
     **/
    @ApiModelProperty(example = "null", required = true, value = "Character's corporation ID for the issuer")
    public Integer getIssuerCorporationId() {
        return issuerCorporationId;
    }

    public void setIssuerCorporationId(Integer issuerCorporationId) {
        this.issuerCorporationId = issuerCorporationId;
    }

    public CorporationContractsResponse issuerId(Integer issuerId) {
        this.issuerId = issuerId;
        return this;
    }

    /**
     * Character ID for the issuer
     * 
     * @return issuerId
     **/
    @ApiModelProperty(example = "null", required = true, value = "Character ID for the issuer")
    public Integer getIssuerId() {
        return issuerId;
    }

    public void setIssuerId(Integer issuerId) {
        this.issuerId = issuerId;
    }

    public CorporationContractsResponse price(Double price) {
        this.price = price;
        return this;
    }

    /**
     * Price of contract (for ItemsExchange and Auctions)
     * 
     * @return price
     **/
    @ApiModelProperty(example = "null", value = "Price of contract (for ItemsExchange and Auctions)")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public CorporationContractsResponse reward(Double reward) {
        this.reward = reward;
        return this;
    }

    /**
     * Remuneration for contract (for Couriers only)
     * 
     * @return reward
     **/
    @ApiModelProperty(example = "null", value = "Remuneration for contract (for Couriers only)")
    public Double getReward() {
        return reward;
    }

    public void setReward(Double reward) {
        this.reward = reward;
    }

    public CorporationContractsResponse startLocationId(Long startLocationId) {
        this.startLocationId = startLocationId;
        return this;
    }

    /**
     * Start location ID (for Couriers contract)
     * 
     * @return startLocationId
     **/
    @ApiModelProperty(example = "null", value = "Start location ID (for Couriers contract)")
    public Long getStartLocationId() {
        return startLocationId;
    }

    public void setStartLocationId(Long startLocationId) {
        this.startLocationId = startLocationId;
    }

    public CorporationContractsResponse status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Status of the the contract
     * 
     * @return status
     **/
    @ApiModelProperty(example = "null", required = true, value = "Status of the the contract")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public CorporationContractsResponse title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Title of the contract
     * 
     * @return title
     **/
    @ApiModelProperty(example = "null", value = "Title of the contract")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CorporationContractsResponse type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Type of the contract
     * 
     * @return type
     **/
    @ApiModelProperty(example = "null", required = true, value = "Type of the contract")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CorporationContractsResponse volume(Double volume) {
        this.volume = volume;
        return this;
    }

    /**
     * Volume of items in the contract
     * 
     * @return volume
     **/
    @ApiModelProperty(example = "null", value = "Volume of items in the contract")
    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationContractsResponse corporationContractsResponse = (CorporationContractsResponse) o;
        return Objects.equals(this.acceptorId, corporationContractsResponse.acceptorId)
                && Objects.equals(this.assigneeId, corporationContractsResponse.assigneeId)
                && Objects.equals(this.availability, corporationContractsResponse.availability)
                && Objects.equals(this.buyout, corporationContractsResponse.buyout)
                && Objects.equals(this.collateral, corporationContractsResponse.collateral)
                && Objects.equals(this.contractId, corporationContractsResponse.contractId)
                && Objects.equals(this.dateAccepted, corporationContractsResponse.dateAccepted)
                && Objects.equals(this.dateCompleted, corporationContractsResponse.dateCompleted)
                && Objects.equals(this.dateExpired, corporationContractsResponse.dateExpired)
                && Objects.equals(this.dateIssued, corporationContractsResponse.dateIssued)
                && Objects.equals(this.daysToComplete, corporationContractsResponse.daysToComplete)
                && Objects.equals(this.endLocationId, corporationContractsResponse.endLocationId)
                && Objects.equals(this.forCorporation, corporationContractsResponse.forCorporation)
                && Objects.equals(this.issuerCorporationId, corporationContractsResponse.issuerCorporationId)
                && Objects.equals(this.issuerId, corporationContractsResponse.issuerId)
                && Objects.equals(this.price, corporationContractsResponse.price)
                && Objects.equals(this.reward, corporationContractsResponse.reward)
                && Objects.equals(this.startLocationId, corporationContractsResponse.startLocationId)
                && Objects.equals(this.status, corporationContractsResponse.status)
                && Objects.equals(this.title, corporationContractsResponse.title)
                && Objects.equals(this.type, corporationContractsResponse.type)
                && Objects.equals(this.volume, corporationContractsResponse.volume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(acceptorId, assigneeId, availability, buyout, collateral, contractId, dateAccepted,
                dateCompleted, dateExpired, dateIssued, daysToComplete, endLocationId, forCorporation,
                issuerCorporationId, issuerId, price, reward, startLocationId, status, title, type, volume);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationContractsResponse {\n");

        sb.append("    acceptorId: ").append(toIndentedString(acceptorId)).append("\n");
        sb.append("    assigneeId: ").append(toIndentedString(assigneeId)).append("\n");
        sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
        sb.append("    buyout: ").append(toIndentedString(buyout)).append("\n");
        sb.append("    collateral: ").append(toIndentedString(collateral)).append("\n");
        sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
        sb.append("    dateAccepted: ").append(toIndentedString(dateAccepted)).append("\n");
        sb.append("    dateCompleted: ").append(toIndentedString(dateCompleted)).append("\n");
        sb.append("    dateExpired: ").append(toIndentedString(dateExpired)).append("\n");
        sb.append("    dateIssued: ").append(toIndentedString(dateIssued)).append("\n");
        sb.append("    daysToComplete: ").append(toIndentedString(daysToComplete)).append("\n");
        sb.append("    endLocationId: ").append(toIndentedString(endLocationId)).append("\n");
        sb.append("    forCorporation: ").append(toIndentedString(forCorporation)).append("\n");
        sb.append("    issuerCorporationId: ").append(toIndentedString(issuerCorporationId)).append("\n");
        sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    reward: ").append(toIndentedString(reward)).append("\n");
        sb.append("    startLocationId: ").append(toIndentedString(startLocationId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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
