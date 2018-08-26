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
import java.util.ArrayList;
import java.util.List;
import net.troja.eve.esi.model.FactionWarfareLeaderboardCharactersActiveTotalKills;
import net.troja.eve.esi.model.FactionWarfareLeaderboardCharactersLastWeekKills;
import net.troja.eve.esi.model.FactionWarfareLeaderboardCharactersYesterdayKills;
import java.io.Serializable;

/**
 * Top 100 rankings of pilots by number of kills from yesterday, last week and
 * in total
 */
@ApiModel(description = "Top 100 rankings of pilots by number of kills from yesterday, last week and in total")
public class FactionWarfareLeaderboardCharacterKills implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("active_total")
    private List<FactionWarfareLeaderboardCharactersActiveTotalKills> activeTotal = new ArrayList<FactionWarfareLeaderboardCharactersActiveTotalKills>();

    @JsonProperty("last_week")
    private List<FactionWarfareLeaderboardCharactersLastWeekKills> lastWeek = new ArrayList<FactionWarfareLeaderboardCharactersLastWeekKills>();

    @JsonProperty("yesterday")
    private List<FactionWarfareLeaderboardCharactersYesterdayKills> yesterday = new ArrayList<FactionWarfareLeaderboardCharactersYesterdayKills>();

    public FactionWarfareLeaderboardCharacterKills activeTotal(
            List<FactionWarfareLeaderboardCharactersActiveTotalKills> activeTotal) {
        this.activeTotal = activeTotal;
        return this;
    }

    public FactionWarfareLeaderboardCharacterKills addActiveTotalItem(
            FactionWarfareLeaderboardCharactersActiveTotalKills activeTotalItem) {
        this.activeTotal.add(activeTotalItem);
        return this;
    }

    /**
     * Top 100 ranking of pilots active in faction warfare by total kills. A
     * pilot is considered \"active\" if they have participated in faction
     * warfare in the past 14 days
     * 
     * @return activeTotal
     **/
    @ApiModelProperty(example = "null", required = true, value = "Top 100 ranking of pilots active in faction warfare by total kills. A pilot is considered \"active\" if they have participated in faction warfare in the past 14 days")
    public List<FactionWarfareLeaderboardCharactersActiveTotalKills> getActiveTotal() {
        return activeTotal;
    }

    public void setActiveTotal(List<FactionWarfareLeaderboardCharactersActiveTotalKills> activeTotal) {
        this.activeTotal = activeTotal;
    }

    public FactionWarfareLeaderboardCharacterKills lastWeek(
            List<FactionWarfareLeaderboardCharactersLastWeekKills> lastWeek) {
        this.lastWeek = lastWeek;
        return this;
    }

    public FactionWarfareLeaderboardCharacterKills addLastWeekItem(
            FactionWarfareLeaderboardCharactersLastWeekKills lastWeekItem) {
        this.lastWeek.add(lastWeekItem);
        return this;
    }

    /**
     * Top 100 ranking of pilots by kills in the past week
     * 
     * @return lastWeek
     **/
    @ApiModelProperty(example = "null", required = true, value = "Top 100 ranking of pilots by kills in the past week")
    public List<FactionWarfareLeaderboardCharactersLastWeekKills> getLastWeek() {
        return lastWeek;
    }

    public void setLastWeek(List<FactionWarfareLeaderboardCharactersLastWeekKills> lastWeek) {
        this.lastWeek = lastWeek;
    }

    public FactionWarfareLeaderboardCharacterKills yesterday(
            List<FactionWarfareLeaderboardCharactersYesterdayKills> yesterday) {
        this.yesterday = yesterday;
        return this;
    }

    public FactionWarfareLeaderboardCharacterKills addYesterdayItem(
            FactionWarfareLeaderboardCharactersYesterdayKills yesterdayItem) {
        this.yesterday.add(yesterdayItem);
        return this;
    }

    /**
     * Top 100 ranking of pilots by kills in the past day
     * 
     * @return yesterday
     **/
    @ApiModelProperty(example = "null", required = true, value = "Top 100 ranking of pilots by kills in the past day")
    public List<FactionWarfareLeaderboardCharactersYesterdayKills> getYesterday() {
        return yesterday;
    }

    public void setYesterday(List<FactionWarfareLeaderboardCharactersYesterdayKills> yesterday) {
        this.yesterday = yesterday;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FactionWarfareLeaderboardCharacterKills factionWarfareLeaderboardCharacterKills = (FactionWarfareLeaderboardCharacterKills) o;
        return Objects.equals(this.activeTotal, factionWarfareLeaderboardCharacterKills.activeTotal)
                && Objects.equals(this.lastWeek, factionWarfareLeaderboardCharacterKills.lastWeek)
                && Objects.equals(this.yesterday, factionWarfareLeaderboardCharacterKills.yesterday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activeTotal, lastWeek, yesterday);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FactionWarfareLeaderboardCharacterKills {\n");

        sb.append("    activeTotal: ").append(toIndentedString(activeTotal)).append("\n");
        sb.append("    lastWeek: ").append(toIndentedString(lastWeek)).append("\n");
        sb.append("    yesterday: ").append(toIndentedString(yesterday)).append("\n");
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
