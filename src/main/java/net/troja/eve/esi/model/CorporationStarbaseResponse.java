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
import net.troja.eve.esi.model.CorporationStarbaseFuel;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CorporationStarbaseResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("allow_alliance_members")
    private Boolean allowAllianceMembers = null;

    @SerializedName("allow_corporation_members")
    private Boolean allowCorporationMembers = null;

    /**
     * Who can anchor starbase (POS) and its structures
     */
    @JsonAdapter(AnchorEnum.Adapter.class)
    public enum AnchorEnum {
        ALLIANCE_MEMBER("alliance_member"),

        CONFIG_STARBASE_EQUIPMENT_ROLE("config_starbase_equipment_role"),

        CORPORATION_MEMBER("corporation_member"),

        STARBASE_FUEL_TECHNICIAN_ROLE("starbase_fuel_technician_role");

        private String value;

        AnchorEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static AnchorEnum fromValue(String text) {
            for (AnchorEnum b : AnchorEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<AnchorEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final AnchorEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public AnchorEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return AnchorEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("anchor")
    private AnchorEnum anchor = null;

    @SerializedName("attack_if_at_war")
    private Boolean attackIfAtWar = null;

    @SerializedName("attack_if_other_security_status_dropping")
    private Boolean attackIfOtherSecurityStatusDropping = null;

    @SerializedName("attack_security_status_threshold")
    private Float attackSecurityStatusThreshold = null;

    @SerializedName("attack_standing_threshold")
    private Float attackStandingThreshold = null;

    /**
     * Who can take fuel blocks out of the starbase (POS)&#39;s fuel bay
     */
    @JsonAdapter(FuelBayTakeEnum.Adapter.class)
    public enum FuelBayTakeEnum {
        ALLIANCE_MEMBER("alliance_member"),

        CONFIG_STARBASE_EQUIPMENT_ROLE("config_starbase_equipment_role"),

        CORPORATION_MEMBER("corporation_member"),

        STARBASE_FUEL_TECHNICIAN_ROLE("starbase_fuel_technician_role");

        private String value;

        FuelBayTakeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static FuelBayTakeEnum fromValue(String text) {
            for (FuelBayTakeEnum b : FuelBayTakeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<FuelBayTakeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final FuelBayTakeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public FuelBayTakeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return FuelBayTakeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("fuel_bay_take")
    private FuelBayTakeEnum fuelBayTake = null;

    /**
     * Who can view the starbase (POS)&#39;s fule bay. Characters either need to
     * have required role or belong to the starbase (POS) owner&#39;s
     * corporation or alliance, as described by the enum, all other access
     * settings follows the same scheme
     */
    @JsonAdapter(FuelBayViewEnum.Adapter.class)
    public enum FuelBayViewEnum {
        ALLIANCE_MEMBER("alliance_member"),

        CONFIG_STARBASE_EQUIPMENT_ROLE("config_starbase_equipment_role"),

        CORPORATION_MEMBER("corporation_member"),

        STARBASE_FUEL_TECHNICIAN_ROLE("starbase_fuel_technician_role");

        private String value;

        FuelBayViewEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static FuelBayViewEnum fromValue(String text) {
            for (FuelBayViewEnum b : FuelBayViewEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<FuelBayViewEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final FuelBayViewEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public FuelBayViewEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return FuelBayViewEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("fuel_bay_view")
    private FuelBayViewEnum fuelBayView = null;

    @SerializedName("fuels")
    private List<CorporationStarbaseFuel> fuels = null;

    /**
     * Who can offline starbase (POS) and its structures
     */
    @JsonAdapter(OfflineEnum.Adapter.class)
    public enum OfflineEnum {
        ALLIANCE_MEMBER("alliance_member"),

        CONFIG_STARBASE_EQUIPMENT_ROLE("config_starbase_equipment_role"),

        CORPORATION_MEMBER("corporation_member"),

        STARBASE_FUEL_TECHNICIAN_ROLE("starbase_fuel_technician_role");

        private String value;

        OfflineEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static OfflineEnum fromValue(String text) {
            for (OfflineEnum b : OfflineEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<OfflineEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final OfflineEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public OfflineEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return OfflineEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("offline")
    private OfflineEnum offline = null;

    /**
     * Who can online starbase (POS) and its structures
     */
    @JsonAdapter(OnlineEnum.Adapter.class)
    public enum OnlineEnum {
        ALLIANCE_MEMBER("alliance_member"),

        CONFIG_STARBASE_EQUIPMENT_ROLE("config_starbase_equipment_role"),

        CORPORATION_MEMBER("corporation_member"),

        STARBASE_FUEL_TECHNICIAN_ROLE("starbase_fuel_technician_role");

        private String value;

        OnlineEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static OnlineEnum fromValue(String text) {
            for (OnlineEnum b : OnlineEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<OnlineEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final OnlineEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public OnlineEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return OnlineEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("online")
    private OnlineEnum online = null;

    /**
     * Who can unanchor starbase (POS) and its structures
     */
    @JsonAdapter(UnanchorEnum.Adapter.class)
    public enum UnanchorEnum {
        ALLIANCE_MEMBER("alliance_member"),

        CONFIG_STARBASE_EQUIPMENT_ROLE("config_starbase_equipment_role"),

        CORPORATION_MEMBER("corporation_member"),

        STARBASE_FUEL_TECHNICIAN_ROLE("starbase_fuel_technician_role");

        private String value;

        UnanchorEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static UnanchorEnum fromValue(String text) {
            for (UnanchorEnum b : UnanchorEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<UnanchorEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final UnanchorEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public UnanchorEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return UnanchorEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("unanchor")
    private UnanchorEnum unanchor = null;

    @SerializedName("use_alliance_standings")
    private Boolean useAllianceStandings = null;

    public CorporationStarbaseResponse allowAllianceMembers(Boolean allowAllianceMembers) {
        this.allowAllianceMembers = allowAllianceMembers;
        return this;
    }

    /**
     * allow_alliance_members boolean
     * 
     * @return allowAllianceMembers
     **/
    @ApiModelProperty(required = true, value = "allow_alliance_members boolean")
    public Boolean isAllowAllianceMembers() {
        return allowAllianceMembers;
    }

    public void setAllowAllianceMembers(Boolean allowAllianceMembers) {
        this.allowAllianceMembers = allowAllianceMembers;
    }

    public CorporationStarbaseResponse allowCorporationMembers(Boolean allowCorporationMembers) {
        this.allowCorporationMembers = allowCorporationMembers;
        return this;
    }

    /**
     * allow_corporation_members boolean
     * 
     * @return allowCorporationMembers
     **/
    @ApiModelProperty(required = true, value = "allow_corporation_members boolean")
    public Boolean isAllowCorporationMembers() {
        return allowCorporationMembers;
    }

    public void setAllowCorporationMembers(Boolean allowCorporationMembers) {
        this.allowCorporationMembers = allowCorporationMembers;
    }

    public CorporationStarbaseResponse anchor(AnchorEnum anchor) {
        this.anchor = anchor;
        return this;
    }

    /**
     * Who can anchor starbase (POS) and its structures
     * 
     * @return anchor
     **/
    @ApiModelProperty(required = true, value = "Who can anchor starbase (POS) and its structures")
    public AnchorEnum getAnchor() {
        return anchor;
    }

    public void setAnchor(AnchorEnum anchor) {
        this.anchor = anchor;
    }

    public CorporationStarbaseResponse attackIfAtWar(Boolean attackIfAtWar) {
        this.attackIfAtWar = attackIfAtWar;
        return this;
    }

    /**
     * attack_if_at_war boolean
     * 
     * @return attackIfAtWar
     **/
    @ApiModelProperty(required = true, value = "attack_if_at_war boolean")
    public Boolean isAttackIfAtWar() {
        return attackIfAtWar;
    }

    public void setAttackIfAtWar(Boolean attackIfAtWar) {
        this.attackIfAtWar = attackIfAtWar;
    }

    public CorporationStarbaseResponse attackIfOtherSecurityStatusDropping(Boolean attackIfOtherSecurityStatusDropping) {
        this.attackIfOtherSecurityStatusDropping = attackIfOtherSecurityStatusDropping;
        return this;
    }

    /**
     * attack_if_other_security_status_dropping boolean
     * 
     * @return attackIfOtherSecurityStatusDropping
     **/
    @ApiModelProperty(required = true, value = "attack_if_other_security_status_dropping boolean")
    public Boolean isAttackIfOtherSecurityStatusDropping() {
        return attackIfOtherSecurityStatusDropping;
    }

    public void setAttackIfOtherSecurityStatusDropping(Boolean attackIfOtherSecurityStatusDropping) {
        this.attackIfOtherSecurityStatusDropping = attackIfOtherSecurityStatusDropping;
    }

    public CorporationStarbaseResponse attackSecurityStatusThreshold(Float attackSecurityStatusThreshold) {
        this.attackSecurityStatusThreshold = attackSecurityStatusThreshold;
        return this;
    }

    /**
     * Starbase (POS) will attack if target&#39;s security standing is lower
     * than this value
     * 
     * @return attackSecurityStatusThreshold
     **/
    @ApiModelProperty(value = "Starbase (POS) will attack if target's security standing is lower than this value")
    public Float getAttackSecurityStatusThreshold() {
        return attackSecurityStatusThreshold;
    }

    public void setAttackSecurityStatusThreshold(Float attackSecurityStatusThreshold) {
        this.attackSecurityStatusThreshold = attackSecurityStatusThreshold;
    }

    public CorporationStarbaseResponse attackStandingThreshold(Float attackStandingThreshold) {
        this.attackStandingThreshold = attackStandingThreshold;
        return this;
    }

    /**
     * Starbase (POS) will attack if target&#39;s standing is lower than this
     * value
     * 
     * @return attackStandingThreshold
     **/
    @ApiModelProperty(value = "Starbase (POS) will attack if target's standing is lower than this value")
    public Float getAttackStandingThreshold() {
        return attackStandingThreshold;
    }

    public void setAttackStandingThreshold(Float attackStandingThreshold) {
        this.attackStandingThreshold = attackStandingThreshold;
    }

    public CorporationStarbaseResponse fuelBayTake(FuelBayTakeEnum fuelBayTake) {
        this.fuelBayTake = fuelBayTake;
        return this;
    }

    /**
     * Who can take fuel blocks out of the starbase (POS)&#39;s fuel bay
     * 
     * @return fuelBayTake
     **/
    @ApiModelProperty(required = true, value = "Who can take fuel blocks out of the starbase (POS)'s fuel bay")
    public FuelBayTakeEnum getFuelBayTake() {
        return fuelBayTake;
    }

    public void setFuelBayTake(FuelBayTakeEnum fuelBayTake) {
        this.fuelBayTake = fuelBayTake;
    }

    public CorporationStarbaseResponse fuelBayView(FuelBayViewEnum fuelBayView) {
        this.fuelBayView = fuelBayView;
        return this;
    }

    /**
     * Who can view the starbase (POS)&#39;s fule bay. Characters either need to
     * have required role or belong to the starbase (POS) owner&#39;s
     * corporation or alliance, as described by the enum, all other access
     * settings follows the same scheme
     * 
     * @return fuelBayView
     **/
    @ApiModelProperty(required = true, value = "Who can view the starbase (POS)'s fule bay. Characters either need to have required role or belong to the starbase (POS) owner's corporation or alliance, as described by the enum, all other access settings follows the same scheme")
    public FuelBayViewEnum getFuelBayView() {
        return fuelBayView;
    }

    public void setFuelBayView(FuelBayViewEnum fuelBayView) {
        this.fuelBayView = fuelBayView;
    }

    public CorporationStarbaseResponse fuels(List<CorporationStarbaseFuel> fuels) {
        this.fuels = fuels;
        return this;
    }

    public CorporationStarbaseResponse addFuelsItem(CorporationStarbaseFuel fuelsItem) {
        if (this.fuels == null) {
            this.fuels = new ArrayList<>();
        }
        this.fuels.add(fuelsItem);
        return this;
    }

    /**
     * Fuel blocks and other things that will be consumed when operating a
     * starbase (POS)
     * 
     * @return fuels
     **/
    @ApiModelProperty(value = "Fuel blocks and other things that will be consumed when operating a starbase (POS)")
    public List<CorporationStarbaseFuel> getFuels() {
        return fuels;
    }

    public void setFuels(List<CorporationStarbaseFuel> fuels) {
        this.fuels = fuels;
    }

    public CorporationStarbaseResponse offline(OfflineEnum offline) {
        this.offline = offline;
        return this;
    }

    /**
     * Who can offline starbase (POS) and its structures
     * 
     * @return offline
     **/
    @ApiModelProperty(required = true, value = "Who can offline starbase (POS) and its structures")
    public OfflineEnum getOffline() {
        return offline;
    }

    public void setOffline(OfflineEnum offline) {
        this.offline = offline;
    }

    public CorporationStarbaseResponse online(OnlineEnum online) {
        this.online = online;
        return this;
    }

    /**
     * Who can online starbase (POS) and its structures
     * 
     * @return online
     **/
    @ApiModelProperty(required = true, value = "Who can online starbase (POS) and its structures")
    public OnlineEnum getOnline() {
        return online;
    }

    public void setOnline(OnlineEnum online) {
        this.online = online;
    }

    public CorporationStarbaseResponse unanchor(UnanchorEnum unanchor) {
        this.unanchor = unanchor;
        return this;
    }

    /**
     * Who can unanchor starbase (POS) and its structures
     * 
     * @return unanchor
     **/
    @ApiModelProperty(required = true, value = "Who can unanchor starbase (POS) and its structures")
    public UnanchorEnum getUnanchor() {
        return unanchor;
    }

    public void setUnanchor(UnanchorEnum unanchor) {
        this.unanchor = unanchor;
    }

    public CorporationStarbaseResponse useAllianceStandings(Boolean useAllianceStandings) {
        this.useAllianceStandings = useAllianceStandings;
        return this;
    }

    /**
     * True if the starbase (POS) is using alliance standings, otherwise using
     * corporation&#39;s
     * 
     * @return useAllianceStandings
     **/
    @ApiModelProperty(required = true, value = "True if the starbase (POS) is using alliance standings, otherwise using corporation's")
    public Boolean isUseAllianceStandings() {
        return useAllianceStandings;
    }

    public void setUseAllianceStandings(Boolean useAllianceStandings) {
        this.useAllianceStandings = useAllianceStandings;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationStarbaseResponse corporationStarbaseResponse = (CorporationStarbaseResponse) o;
        return Objects.equals(this.allowAllianceMembers, corporationStarbaseResponse.allowAllianceMembers)
                && Objects.equals(this.allowCorporationMembers, corporationStarbaseResponse.allowCorporationMembers)
                && Objects.equals(this.anchor, corporationStarbaseResponse.anchor)
                && Objects.equals(this.attackIfAtWar, corporationStarbaseResponse.attackIfAtWar)
                && Objects.equals(this.attackIfOtherSecurityStatusDropping,
                        corporationStarbaseResponse.attackIfOtherSecurityStatusDropping)
                && Objects.equals(this.attackSecurityStatusThreshold,
                        corporationStarbaseResponse.attackSecurityStatusThreshold)
                && Objects.equals(this.attackStandingThreshold, corporationStarbaseResponse.attackStandingThreshold)
                && Objects.equals(this.fuelBayTake, corporationStarbaseResponse.fuelBayTake)
                && Objects.equals(this.fuelBayView, corporationStarbaseResponse.fuelBayView)
                && Objects.equals(this.fuels, corporationStarbaseResponse.fuels)
                && Objects.equals(this.offline, corporationStarbaseResponse.offline)
                && Objects.equals(this.online, corporationStarbaseResponse.online)
                && Objects.equals(this.unanchor, corporationStarbaseResponse.unanchor)
                && Objects.equals(this.useAllianceStandings, corporationStarbaseResponse.useAllianceStandings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowAllianceMembers, allowCorporationMembers, anchor, attackIfAtWar,
                attackIfOtherSecurityStatusDropping, attackSecurityStatusThreshold, attackStandingThreshold,
                fuelBayTake, fuelBayView, fuels, offline, online, unanchor, useAllianceStandings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationStarbaseResponse {\n");

        sb.append("    allowAllianceMembers: ").append(toIndentedString(allowAllianceMembers)).append("\n");
        sb.append("    allowCorporationMembers: ").append(toIndentedString(allowCorporationMembers)).append("\n");
        sb.append("    anchor: ").append(toIndentedString(anchor)).append("\n");
        sb.append("    attackIfAtWar: ").append(toIndentedString(attackIfAtWar)).append("\n");
        sb.append("    attackIfOtherSecurityStatusDropping: ")
                .append(toIndentedString(attackIfOtherSecurityStatusDropping)).append("\n");
        sb.append("    attackSecurityStatusThreshold: ").append(toIndentedString(attackSecurityStatusThreshold))
                .append("\n");
        sb.append("    attackStandingThreshold: ").append(toIndentedString(attackStandingThreshold)).append("\n");
        sb.append("    fuelBayTake: ").append(toIndentedString(fuelBayTake)).append("\n");
        sb.append("    fuelBayView: ").append(toIndentedString(fuelBayView)).append("\n");
        sb.append("    fuels: ").append(toIndentedString(fuels)).append("\n");
        sb.append("    offline: ").append(toIndentedString(offline)).append("\n");
        sb.append("    online: ").append(toIndentedString(online)).append("\n");
        sb.append("    unanchor: ").append(toIndentedString(unanchor)).append("\n");
        sb.append("    useAllianceStandings: ").append(toIndentedString(useAllianceStandings)).append("\n");
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
