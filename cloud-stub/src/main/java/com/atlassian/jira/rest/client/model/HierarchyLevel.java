/*
 * The Jira Cloud platform REST API
 * Jira Cloud platform REST API documentation
 *
 * OpenAPI spec version: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.atlassian.jira.rest.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 * HierarchyLevel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-17T19:36:29.866+05:30[Asia/Kolkata]")
public class HierarchyLevel {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("aboveLevelId")
  private Long aboveLevelId = null;

  @JsonProperty("belowLevelId")
  private Long belowLevelId = null;

  @JsonProperty("projectConfigurationId")
  private Long projectConfigurationId = null;

  @JsonProperty("level")
  private Integer level = null;

  @JsonProperty("issueTypeIds")
  private List<Long> issueTypeIds = null;

  @JsonProperty("externalUuid")
  private UUID externalUuid = null;

  /**
   * Gets or Sets globalHierarchyLevel
   */
  public enum GlobalHierarchyLevelEnum {
    SUBTASK("SUBTASK"),
    BASE("BASE"),
    EPIC("EPIC");

    private String value;

    GlobalHierarchyLevelEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static GlobalHierarchyLevelEnum fromValue(String text) {
      for (GlobalHierarchyLevelEnum b : GlobalHierarchyLevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("globalHierarchyLevel")
  private GlobalHierarchyLevelEnum globalHierarchyLevel = null;

  public HierarchyLevel id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public HierarchyLevel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public HierarchyLevel aboveLevelId(Long aboveLevelId) {
    this.aboveLevelId = aboveLevelId;
    return this;
  }

   /**
   * Get aboveLevelId
   * @return aboveLevelId
  **/
  @Schema(description = "")
  public Long getAboveLevelId() {
    return aboveLevelId;
  }

  public void setAboveLevelId(Long aboveLevelId) {
    this.aboveLevelId = aboveLevelId;
  }

  public HierarchyLevel belowLevelId(Long belowLevelId) {
    this.belowLevelId = belowLevelId;
    return this;
  }

   /**
   * Get belowLevelId
   * @return belowLevelId
  **/
  @Schema(description = "")
  public Long getBelowLevelId() {
    return belowLevelId;
  }

  public void setBelowLevelId(Long belowLevelId) {
    this.belowLevelId = belowLevelId;
  }

  public HierarchyLevel projectConfigurationId(Long projectConfigurationId) {
    this.projectConfigurationId = projectConfigurationId;
    return this;
  }

   /**
   * Get projectConfigurationId
   * @return projectConfigurationId
  **/
  @Schema(description = "")
  public Long getProjectConfigurationId() {
    return projectConfigurationId;
  }

  public void setProjectConfigurationId(Long projectConfigurationId) {
    this.projectConfigurationId = projectConfigurationId;
  }

  public HierarchyLevel level(Integer level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @Schema(description = "")
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public HierarchyLevel issueTypeIds(List<Long> issueTypeIds) {
    this.issueTypeIds = issueTypeIds;
    return this;
  }

  public HierarchyLevel addIssueTypeIdsItem(Long issueTypeIdsItem) {
    if (this.issueTypeIds == null) {
      this.issueTypeIds = new ArrayList<Long>();
    }
    this.issueTypeIds.add(issueTypeIdsItem);
    return this;
  }

   /**
   * Get issueTypeIds
   * @return issueTypeIds
  **/
  @Schema(description = "")
  public List<Long> getIssueTypeIds() {
    return issueTypeIds;
  }

  public void setIssueTypeIds(List<Long> issueTypeIds) {
    this.issueTypeIds = issueTypeIds;
  }

  public HierarchyLevel externalUuid(UUID externalUuid) {
    this.externalUuid = externalUuid;
    return this;
  }

   /**
   * Get externalUuid
   * @return externalUuid
  **/
  @Schema(description = "")
  public UUID getExternalUuid() {
    return externalUuid;
  }

  public void setExternalUuid(UUID externalUuid) {
    this.externalUuid = externalUuid;
  }

  public HierarchyLevel globalHierarchyLevel(GlobalHierarchyLevelEnum globalHierarchyLevel) {
    this.globalHierarchyLevel = globalHierarchyLevel;
    return this;
  }

   /**
   * Get globalHierarchyLevel
   * @return globalHierarchyLevel
  **/
  @Schema(description = "")
  public GlobalHierarchyLevelEnum getGlobalHierarchyLevel() {
    return globalHierarchyLevel;
  }

  public void setGlobalHierarchyLevel(GlobalHierarchyLevelEnum globalHierarchyLevel) {
    this.globalHierarchyLevel = globalHierarchyLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HierarchyLevel hierarchyLevel = (HierarchyLevel) o;
    return Objects.equals(this.id, hierarchyLevel.id) &&
        Objects.equals(this.name, hierarchyLevel.name) &&
        Objects.equals(this.aboveLevelId, hierarchyLevel.aboveLevelId) &&
        Objects.equals(this.belowLevelId, hierarchyLevel.belowLevelId) &&
        Objects.equals(this.projectConfigurationId, hierarchyLevel.projectConfigurationId) &&
        Objects.equals(this.level, hierarchyLevel.level) &&
        Objects.equals(this.issueTypeIds, hierarchyLevel.issueTypeIds) &&
        Objects.equals(this.externalUuid, hierarchyLevel.externalUuid) &&
        Objects.equals(this.globalHierarchyLevel, hierarchyLevel.globalHierarchyLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, aboveLevelId, belowLevelId, projectConfigurationId, level, issueTypeIds, externalUuid, globalHierarchyLevel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HierarchyLevel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    aboveLevelId: ").append(toIndentedString(aboveLevelId)).append("\n");
    sb.append("    belowLevelId: ").append(toIndentedString(belowLevelId)).append("\n");
    sb.append("    projectConfigurationId: ").append(toIndentedString(projectConfigurationId)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    issueTypeIds: ").append(toIndentedString(issueTypeIds)).append("\n");
    sb.append("    externalUuid: ").append(toIndentedString(externalUuid)).append("\n");
    sb.append("    globalHierarchyLevel: ").append(toIndentedString(globalHierarchyLevel)).append("\n");
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
