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
 * wallet transaction
 */
@ApiModel(description = "wallet transaction")
public class CorporationWalletTransactionsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("transaction_id")
    private Long transactionId = null;

    @JsonProperty("date")
    private OffsetDateTime date = null;

    @JsonProperty("type_id")
    private Integer typeId = null;

    @JsonProperty("location_id")
    private Long locationId = null;

    @JsonProperty("unit_price")
    private Double unitPrice = null;

    @JsonProperty("quantity")
    private Integer quantity = null;

    @JsonProperty("client_id")
    private Integer clientId = null;

    @JsonProperty("is_buy")
    private Boolean isBuy = null;

    @JsonProperty("journal_ref_id")
    private Long journalRefId = null;

    public CorporationWalletTransactionsResponse transactionId(Long transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Unique transaction ID
     * 
     * @return transactionId
     **/
    @ApiModelProperty(example = "null", required = true, value = "Unique transaction ID")
    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public CorporationWalletTransactionsResponse date(OffsetDateTime date) {
        this.date = date;
        return this;
    }

    /**
     * Date and time of transaction
     * 
     * @return date
     **/
    @ApiModelProperty(example = "null", required = true, value = "Date and time of transaction")
    public OffsetDateTime getDate() {
        return date;
    }

    public void setDate(OffsetDateTime date) {
        this.date = date;
    }

    public CorporationWalletTransactionsResponse typeId(Integer typeId) {
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

    public CorporationWalletTransactionsResponse locationId(Long locationId) {
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

    public CorporationWalletTransactionsResponse unitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    /**
     * Amount paid per unit
     * 
     * @return unitPrice
     **/
    @ApiModelProperty(example = "null", required = true, value = "Amount paid per unit")
    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public CorporationWalletTransactionsResponse quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * quantity integer
     * 
     * @return quantity
     **/
    @ApiModelProperty(example = "null", required = true, value = "quantity integer")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public CorporationWalletTransactionsResponse clientId(Integer clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * client_id integer
     * 
     * @return clientId
     **/
    @ApiModelProperty(example = "null", required = true, value = "client_id integer")
    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public CorporationWalletTransactionsResponse isBuy(Boolean isBuy) {
        this.isBuy = isBuy;
        return this;
    }

    /**
     * is_buy boolean
     * 
     * @return isBuy
     **/
    @ApiModelProperty(example = "null", required = true, value = "is_buy boolean")
    public Boolean getIsBuy() {
        return isBuy;
    }

    public void setIsBuy(Boolean isBuy) {
        this.isBuy = isBuy;
    }

    public CorporationWalletTransactionsResponse journalRefId(Long journalRefId) {
        this.journalRefId = journalRefId;
        return this;
    }

    /**
     * journal_ref_id integer
     * 
     * @return journalRefId
     **/
    @ApiModelProperty(example = "null", required = true, value = "journal_ref_id integer")
    public Long getJournalRefId() {
        return journalRefId;
    }

    public void setJournalRefId(Long journalRefId) {
        this.journalRefId = journalRefId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationWalletTransactionsResponse corporationWalletTransactionsResponse = (CorporationWalletTransactionsResponse) o;
        return Objects.equals(this.transactionId, corporationWalletTransactionsResponse.transactionId)
                && Objects.equals(this.date, corporationWalletTransactionsResponse.date)
                && Objects.equals(this.typeId, corporationWalletTransactionsResponse.typeId)
                && Objects.equals(this.locationId, corporationWalletTransactionsResponse.locationId)
                && Objects.equals(this.unitPrice, corporationWalletTransactionsResponse.unitPrice)
                && Objects.equals(this.quantity, corporationWalletTransactionsResponse.quantity)
                && Objects.equals(this.clientId, corporationWalletTransactionsResponse.clientId)
                && Objects.equals(this.isBuy, corporationWalletTransactionsResponse.isBuy)
                && Objects.equals(this.journalRefId, corporationWalletTransactionsResponse.journalRefId);
    }

    @Override
    public int hashCode() {
        return Objects
                .hash(transactionId, date, typeId, locationId, unitPrice, quantity, clientId, isBuy, journalRefId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationWalletTransactionsResponse {\n");

        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
        sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
        sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    isBuy: ").append(toIndentedString(isBuy)).append("\n");
        sb.append("    journalRefId: ").append(toIndentedString(journalRefId)).append("\n");
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
