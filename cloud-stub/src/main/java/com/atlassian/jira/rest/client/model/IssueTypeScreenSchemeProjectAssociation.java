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
/**
 * Associated issue type screen scheme and project.
 */
@Schema(description = "Associated issue type screen scheme and project.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-17T19:36:29.866+05:30[Asia/Kolkata]")
public class IssueTypeScreenSchemeProjectAssociation {
  @JsonProperty("issueTypeScreenSchemeId")
  private String issueTypeScreenSchemeId = null;

  @JsonProperty("projectId")
  private String projectId = null;

  public IssueTypeScreenSchemeProjectAssociation issueTypeScreenSchemeId(String issueTypeScreenSchemeId) {
    this.issueTypeScreenSchemeId = issueTypeScreenSchemeId;
    return this;
  }

   /**
   * The ID of the issue type screen scheme.
   * @return issueTypeScreenSchemeId
  **/
  @Schema(description = "The ID of the issue type screen scheme.")
  public String getIssueTypeScreenSchemeId() {
    return issueTypeScreenSchemeId;
  }

  public void setIssueTypeScreenSchemeId(String issueTypeScreenSchemeId) {
    this.issueTypeScreenSchemeId = issueTypeScreenSchemeId;
  }

  public IssueTypeScreenSchemeProjectAssociation projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * The ID of the project.
   * @return projectId
  **/
  @Schema(description = "The ID of the project.")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeScreenSchemeProjectAssociation issueTypeScreenSchemeProjectAssociation = (IssueTypeScreenSchemeProjectAssociation) o;
    return Objects.equals(this.issueTypeScreenSchemeId, issueTypeScreenSchemeProjectAssociation.issueTypeScreenSchemeId) &&
        Objects.equals(this.projectId, issueTypeScreenSchemeProjectAssociation.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueTypeScreenSchemeId, projectId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeScreenSchemeProjectAssociation {\n");
    
    sb.append("    issueTypeScreenSchemeId: ").append(toIndentedString(issueTypeScreenSchemeId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
