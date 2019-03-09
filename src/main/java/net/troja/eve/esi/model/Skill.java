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
import java.io.Serializable;

/**
 * skill object
 */
@ApiModel(description = "skill object")
public class Skill implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_TRAINED_SKILL_LEVEL = "trained_skill_level";
    @SerializedName(SERIALIZED_NAME_TRAINED_SKILL_LEVEL)
    private Integer trainedSkillLevel;

    public static final String SERIALIZED_NAME_ACTIVE_SKILL_LEVEL = "active_skill_level";
    @SerializedName(SERIALIZED_NAME_ACTIVE_SKILL_LEVEL)
    private Integer activeSkillLevel;

    public static final String SERIALIZED_NAME_SKILL_ID = "skill_id";
    @SerializedName(SERIALIZED_NAME_SKILL_ID)
    private Integer skillId;

    public static final String SERIALIZED_NAME_SKILLPOINTS_IN_SKILL = "skillpoints_in_skill";
    @SerializedName(SERIALIZED_NAME_SKILLPOINTS_IN_SKILL)
    private Long skillpointsInSkill;

    public Skill trainedSkillLevel(Integer trainedSkillLevel) {
        this.trainedSkillLevel = trainedSkillLevel;
        return this;
    }

    /**
     * trained_skill_level integer
     * 
     * @return trainedSkillLevel
     **/
    @ApiModelProperty(required = true, value = "trained_skill_level integer")
    public Integer getTrainedSkillLevel() {
        return trainedSkillLevel;
    }

    public void setTrainedSkillLevel(Integer trainedSkillLevel) {
        this.trainedSkillLevel = trainedSkillLevel;
    }

    public Skill activeSkillLevel(Integer activeSkillLevel) {
        this.activeSkillLevel = activeSkillLevel;
        return this;
    }

    /**
     * active_skill_level integer
     * 
     * @return activeSkillLevel
     **/
    @ApiModelProperty(required = true, value = "active_skill_level integer")
    public Integer getActiveSkillLevel() {
        return activeSkillLevel;
    }

    public void setActiveSkillLevel(Integer activeSkillLevel) {
        this.activeSkillLevel = activeSkillLevel;
    }

    public Skill skillId(Integer skillId) {
        this.skillId = skillId;
        return this;
    }

    /**
     * skill_id integer
     * 
     * @return skillId
     **/
    @ApiModelProperty(required = true, value = "skill_id integer")
    public Integer getSkillId() {
        return skillId;
    }

    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }

    public Skill skillpointsInSkill(Long skillpointsInSkill) {
        this.skillpointsInSkill = skillpointsInSkill;
        return this;
    }

    /**
     * skillpoints_in_skill integer
     * 
     * @return skillpointsInSkill
     **/
    @ApiModelProperty(required = true, value = "skillpoints_in_skill integer")
    public Long getSkillpointsInSkill() {
        return skillpointsInSkill;
    }

    public void setSkillpointsInSkill(Long skillpointsInSkill) {
        this.skillpointsInSkill = skillpointsInSkill;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Skill skill = (Skill) o;
        return Objects.equals(this.trainedSkillLevel, skill.trainedSkillLevel)
                && Objects.equals(this.activeSkillLevel, skill.activeSkillLevel)
                && Objects.equals(this.skillId, skill.skillId)
                && Objects.equals(this.skillpointsInSkill, skill.skillpointsInSkill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainedSkillLevel, activeSkillLevel, skillId, skillpointsInSkill);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Skill {\n");

        sb.append("    trainedSkillLevel: ").append(toIndentedString(trainedSkillLevel)).append("\n");
        sb.append("    activeSkillLevel: ").append(toIndentedString(activeSkillLevel)).append("\n");
        sb.append("    skillId: ").append(toIndentedString(skillId)).append("\n");
        sb.append("    skillpointsInSkill: ").append(toIndentedString(skillpointsInSkill)).append("\n");
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
