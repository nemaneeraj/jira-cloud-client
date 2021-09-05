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
 * Details of the name, description, and default issue type for an issue type scheme.
 */
@Schema(description = "Details of the name, description, and default issue type for an issue type scheme.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-17T19:36:29.866+05:30[Asia/Kolkata]")
public class IssueTypeSchemeUpdateDetails {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("defaultIssueTypeId")
  private String defaultIssueTypeId = null;

  public IssueTypeSchemeUpdateDetails name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the issue type scheme. The name must be unique. The maximum length is 255 characters.
   * @return name
  **/
  @Schema(description = "The name of the issue type scheme. The name must be unique. The maximum length is 255 characters.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IssueTypeSchemeUpdateDetails description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the issue type scheme. The maximum length is 4000 characters.
   * @return description
  **/
  @Schema(description = "The description of the issue type scheme. The maximum length is 4000 characters.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IssueTypeSchemeUpdateDetails defaultIssueTypeId(String defaultIssueTypeId) {
    this.defaultIssueTypeId = defaultIssueTypeId;
    return this;
  }

   /**
   * The ID of the default issue type of the issue type scheme.
   * @return defaultIssueTypeId
  **/
  @Schema(description = "The ID of the default issue type of the issue type scheme.")
  public String getDefaultIssueTypeId() {
    return defaultIssueTypeId;
  }

  public void setDefaultIssueTypeId(String defaultIssueTypeId) {
    this.defaultIssueTypeId = defaultIssueTypeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeSchemeUpdateDetails issueTypeSchemeUpdateDetails = (IssueTypeSchemeUpdateDetails) o;
    return Objects.equals(this.name, issueTypeSchemeUpdateDetails.name) &&
        Objects.equals(this.description, issueTypeSchemeUpdateDetails.description) &&
        Objects.equals(this.defaultIssueTypeId, issueTypeSchemeUpdateDetails.defaultIssueTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, defaultIssueTypeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeSchemeUpdateDetails {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    defaultIssueTypeId: ").append(toIndentedString(defaultIssueTypeId)).append("\n");
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
