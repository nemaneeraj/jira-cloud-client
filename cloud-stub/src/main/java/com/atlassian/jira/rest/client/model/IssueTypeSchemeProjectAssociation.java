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
 * Details of the association between an issue type scheme and project.
 */
@Schema(description = "Details of the association between an issue type scheme and project.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-17T19:36:29.866+05:30[Asia/Kolkata]")
public class IssueTypeSchemeProjectAssociation {
  @JsonProperty("issueTypeSchemeId")
  private String issueTypeSchemeId = null;

  @JsonProperty("projectId")
  private String projectId = null;

  public IssueTypeSchemeProjectAssociation issueTypeSchemeId(String issueTypeSchemeId) {
    this.issueTypeSchemeId = issueTypeSchemeId;
    return this;
  }

   /**
   * The ID of the issue type scheme.
   * @return issueTypeSchemeId
  **/
  @Schema(required = true, description = "The ID of the issue type scheme.")
  public String getIssueTypeSchemeId() {
    return issueTypeSchemeId;
  }

  public void setIssueTypeSchemeId(String issueTypeSchemeId) {
    this.issueTypeSchemeId = issueTypeSchemeId;
  }

  public IssueTypeSchemeProjectAssociation projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * The ID of the project.
   * @return projectId
  **/
  @Schema(required = true, description = "The ID of the project.")
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
    IssueTypeSchemeProjectAssociation issueTypeSchemeProjectAssociation = (IssueTypeSchemeProjectAssociation) o;
    return Objects.equals(this.issueTypeSchemeId, issueTypeSchemeProjectAssociation.issueTypeSchemeId) &&
        Objects.equals(this.projectId, issueTypeSchemeProjectAssociation.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueTypeSchemeId, projectId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeSchemeProjectAssociation {\n");
    
    sb.append("    issueTypeSchemeId: ").append(toIndentedString(issueTypeSchemeId)).append("\n");
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