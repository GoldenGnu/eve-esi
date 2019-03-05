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
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CharacterCorporationHistoryResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("corporation_id")
    private Integer corporationId = null;

    @SerializedName("is_deleted")
    private Boolean isDeleted = null;

    @SerializedName("record_id")
    private Integer recordId = null;

    @SerializedName("start_date")
    private OffsetDateTime startDate = null;

    public CharacterCorporationHistoryResponse corporationId(Integer corporationId) {
        this.corporationId = corporationId;
        return this;
    }

    /**
     * corporation_id integer
     * 
     * @return corporationId
     **/
    @ApiModelProperty(required = true, value = "corporation_id integer")
    public Integer getCorporationId() {
        return corporationId;
    }

    public void setCorporationId(Integer corporationId) {
        this.corporationId = corporationId;
    }

    public CharacterCorporationHistoryResponse isDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

    /**
     * True if the corporation has been deleted
     * 
     * @return isDeleted
     **/
    @ApiModelProperty(value = "True if the corporation has been deleted")
    public Boolean isIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public CharacterCorporationHistoryResponse recordId(Integer recordId) {
        this.recordId = recordId;
        return this;
    }

    /**
     * An incrementing ID that can be used to canonically establish order of
     * records in cases where dates may be ambiguous
     * 
     * @return recordId
     **/
    @ApiModelProperty(required = true, value = "An incrementing ID that can be used to canonically establish order of records in cases where dates may be ambiguous")
    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public CharacterCorporationHistoryResponse startDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * start_date string
     * 
     * @return startDate
     **/
    @ApiModelProperty(required = true, value = "start_date string")
    public OffsetDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterCorporationHistoryResponse characterCorporationHistoryResponse = (CharacterCorporationHistoryResponse) o;
        return Objects.equals(this.corporationId, characterCorporationHistoryResponse.corporationId)
                && Objects.equals(this.isDeleted, characterCorporationHistoryResponse.isDeleted)
                && Objects.equals(this.recordId, characterCorporationHistoryResponse.recordId)
                && Objects.equals(this.startDate, characterCorporationHistoryResponse.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(corporationId, isDeleted, recordId, startDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterCorporationHistoryResponse {\n");

        sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
        sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
        sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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
