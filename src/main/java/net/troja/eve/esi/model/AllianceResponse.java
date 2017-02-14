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
public class AllianceResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("alliance_name")
    private String allianceName = null;

    @JsonProperty("date_founded")
    private OffsetDateTime dateFounded = null;

    @JsonProperty("executor_corp")
    private Integer executorCorp = null;

    @JsonProperty("ticker")
    private String ticker = null;

    public AllianceResponse allianceName(String allianceName) {
        this.allianceName = allianceName;
        return this;
    }

    /**
     * the full name of the alliance
     * 
     * @return allianceName
     **/
    @ApiModelProperty(example = "null", required = true, value = "the full name of the alliance")
    public String getAllianceName() {
        return allianceName;
    }

    public void setAllianceName(String allianceName) {
        this.allianceName = allianceName;
    }

    public AllianceResponse dateFounded(OffsetDateTime dateFounded) {
        this.dateFounded = dateFounded;
        return this;
    }

    /**
     * date_founded string
     * 
     * @return dateFounded
     **/
    @ApiModelProperty(example = "null", required = true, value = "date_founded string")
    public OffsetDateTime getDateFounded() {
        return dateFounded;
    }

    public void setDateFounded(OffsetDateTime dateFounded) {
        this.dateFounded = dateFounded;
    }

    public AllianceResponse executorCorp(Integer executorCorp) {
        this.executorCorp = executorCorp;
        return this;
    }

    /**
     * the executor corporation ID, if this alliance is not closed
     * 
     * @return executorCorp
     **/
    @ApiModelProperty(example = "null", value = "the executor corporation ID, if this alliance is not closed")
    public Integer getExecutorCorp() {
        return executorCorp;
    }

    public void setExecutorCorp(Integer executorCorp) {
        this.executorCorp = executorCorp;
    }

    public AllianceResponse ticker(String ticker) {
        this.ticker = ticker;
        return this;
    }

    /**
     * the short name of the alliance
     * 
     * @return ticker
     **/
    @ApiModelProperty(example = "null", required = true, value = "the short name of the alliance")
    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AllianceResponse allianceResponse = (AllianceResponse) o;
        return Objects.equals(this.allianceName, allianceResponse.allianceName)
                && Objects.equals(this.dateFounded, allianceResponse.dateFounded)
                && Objects.equals(this.executorCorp, allianceResponse.executorCorp)
                && Objects.equals(this.ticker, allianceResponse.ticker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allianceName, dateFounded, executorCorp, ticker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AllianceResponse {\n");

        sb.append("    allianceName: ").append(toIndentedString(allianceName)).append("\n");
        sb.append("    dateFounded: ").append(toIndentedString(dateFounded)).append("\n");
        sb.append("    executorCorp: ").append(toIndentedString(executorCorp)).append("\n");
        sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
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