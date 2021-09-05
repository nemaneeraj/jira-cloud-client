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
/**
 * Issue type scheme with a list of the projects that use it.
 */
@Schema(description = "Issue type scheme with a list of the projects that use it.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-17T19:36:29.866+05:30[Asia/Kolkata]")
public class IssueTypeSchemeProjects {
  @JsonProperty("issueTypeScheme")
  private AllOfIssueTypeSchemeProjectsIssueTypeScheme issueTypeScheme = null;

  @JsonProperty("projectIds")
  private List<String> projectIds = new ArrayList<String>();

  public IssueTypeSchemeProjects issueTypeScheme(AllOfIssueTypeSchemeProjectsIssueTypeScheme issueTypeScheme) {
    this.issueTypeScheme = issueTypeScheme;
    return this;
  }

   /**
   * Details of an issue type scheme.
   * @return issueTypeScheme
  **/
  @Schema(required = true, description = "Details of an issue type scheme.")
  public AllOfIssueTypeSchemeProjectsIssueTypeScheme getIssueTypeScheme() {
    return issueTypeScheme;
  }

  public void setIssueTypeScheme(AllOfIssueTypeSchemeProjectsIssueTypeScheme issueTypeScheme) {
    this.issueTypeScheme = issueTypeScheme;
  }

  public IssueTypeSchemeProjects projectIds(List<String> projectIds) {
    this.projectIds = projectIds;
    return this;
  }

  public IssueTypeSchemeProjects addProjectIdsItem(String projectIdsItem) {
    this.projectIds.add(projectIdsItem);
    return this;
  }

   /**
   * The IDs of the projects using the issue type scheme.
   * @return projectIds
  **/
  @Schema(required = true, description = "The IDs of the projects using the issue type scheme.")
  public List<String> getProjectIds() {
    return projectIds;
  }

  public void setProjectIds(List<String> projectIds) {
    this.projectIds = projectIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeSchemeProjects issueTypeSchemeProjects = (IssueTypeSchemeProjects) o;
    return Objects.equals(this.issueTypeScheme, issueTypeSchemeProjects.issueTypeScheme) &&
        Objects.equals(this.projectIds, issueTypeSchemeProjects.projectIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueTypeScheme, projectIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeSchemeProjects {\n");
    
    sb.append("    issueTypeScheme: ").append(toIndentedString(issueTypeScheme)).append("\n");
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
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
