/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package net.troja.eve.esi.model;

import java.util.Objects;
import java.util.Arrays;
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
import net.troja.eve.esi.model.CharacterMedalsGraphic;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CharacterMedalsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_DATE = "date";
    @SerializedName(SERIALIZED_NAME_DATE)
    private OffsetDateTime date;

    public static final String SERIALIZED_NAME_MEDAL_ID = "medal_id";
    @SerializedName(SERIALIZED_NAME_MEDAL_ID)
    private Integer medalId;

    public static final String SERIALIZED_NAME_ISSUER_ID = "issuer_id";
    @SerializedName(SERIALIZED_NAME_ISSUER_ID)
    private Integer issuerId;

    public static final String SERIALIZED_NAME_REASON = "reason";
    @SerializedName(SERIALIZED_NAME_REASON)
    private String reason;

    public static final String SERIALIZED_NAME_CORPORATION_ID = "corporation_id";
    @SerializedName(SERIALIZED_NAME_CORPORATION_ID)
    private Integer corporationId;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_GRAPHICS = "graphics";
    @SerializedName(SERIALIZED_NAME_GRAPHICS)
    private List<CharacterMedalsGraphic> graphics = new ArrayList<>();

    public static final String SERIALIZED_NAME_TITLE = "title";
    @SerializedName(SERIALIZED_NAME_TITLE)
    private String title;

    /**
     * status string
     */
    @JsonAdapter(StatusEnum.Adapter.class)
    public enum StatusEnum {
        PUBLIC("public"),

        PRIVATE("private");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StatusEnum fromValue(String text) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }

        public static class Adapter extends TypeAdapter<StatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StatusEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StatusEnum.fromValue(String.valueOf(value));
            }
        }
    }

    public static final String SERIALIZED_NAME_STATUS = "status";
    @SerializedName(SERIALIZED_NAME_STATUS)
    private StatusEnum status;

    public CharacterMedalsResponse date(OffsetDateTime date) {
        this.date = date;
        return this;
    }

    /**
     * date string
     * 
     * @return date
     **/
    @ApiModelProperty(required = true, value = "date string")
    public OffsetDateTime getDate() {
        return date;
    }

    public void setDate(OffsetDateTime date) {
        this.date = date;
    }

    public CharacterMedalsResponse medalId(Integer medalId) {
        this.medalId = medalId;
        return this;
    }

    /**
     * medal_id integer
     * 
     * @return medalId
     **/
    @ApiModelProperty(required = true, value = "medal_id integer")
    public Integer getMedalId() {
        return medalId;
    }

    public void setMedalId(Integer medalId) {
        this.medalId = medalId;
    }

    public CharacterMedalsResponse issuerId(Integer issuerId) {
        this.issuerId = issuerId;
        return this;
    }

    /**
     * issuer_id integer
     * 
     * @return issuerId
     **/
    @ApiModelProperty(required = true, value = "issuer_id integer")
    public Integer getIssuerId() {
        return issuerId;
    }

    public void setIssuerId(Integer issuerId) {
        this.issuerId = issuerId;
    }

    public CharacterMedalsResponse reason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * reason string
     * 
     * @return reason
     **/
    @ApiModelProperty(required = true, value = "reason string")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public CharacterMedalsResponse corporationId(Integer corporationId) {
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

    public CharacterMedalsResponse description(String description) {
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

    public CharacterMedalsResponse graphics(List<CharacterMedalsGraphic> graphics) {
        this.graphics = graphics;
        return this;
    }

    public CharacterMedalsResponse addGraphicsItem(CharacterMedalsGraphic graphicsItem) {
        this.graphics.add(graphicsItem);
        return this;
    }

    /**
     * graphics array
     * 
     * @return graphics
     **/
    @ApiModelProperty(required = true, value = "graphics array")
    public List<CharacterMedalsGraphic> getGraphics() {
        return graphics;
    }

    public void setGraphics(List<CharacterMedalsGraphic> graphics) {
        this.graphics = graphics;
    }

    public CharacterMedalsResponse title(String title) {
        this.title = title;
        return this;
    }

    /**
     * title string
     * 
     * @return title
     **/
    @ApiModelProperty(required = true, value = "title string")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CharacterMedalsResponse status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * status string
     * 
     * @return status
     **/
    @ApiModelProperty(required = true, value = "status string")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterMedalsResponse characterMedalsResponse = (CharacterMedalsResponse) o;
        return Objects.equals(this.date, characterMedalsResponse.date)
                && Objects.equals(this.medalId, characterMedalsResponse.medalId)
                && Objects.equals(this.issuerId, characterMedalsResponse.issuerId)
                && Objects.equals(this.reason, characterMedalsResponse.reason)
                && Objects.equals(this.corporationId, characterMedalsResponse.corporationId)
                && Objects.equals(this.description, characterMedalsResponse.description)
                && Objects.equals(this.graphics, characterMedalsResponse.graphics)
                && Objects.equals(this.title, characterMedalsResponse.title)
                && Objects.equals(this.status, characterMedalsResponse.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, medalId, issuerId, reason, corporationId, description, graphics, title, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterMedalsResponse {\n");

        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    medalId: ").append(toIndentedString(medalId)).append("\n");
        sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    graphics: ").append(toIndentedString(graphics)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
