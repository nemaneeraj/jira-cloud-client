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
import com.atlassian.jira.rest.client.model.SuggestedIssue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * A type of issue suggested for use in auto-completion.
 */
@Schema(description = "A type of issue suggested for use in auto-completion.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-17T19:36:29.866+05:30[Asia/Kolkata]")
public class IssuePickerSuggestionsIssueType {
  @JsonProperty("label")
  private String label = null;

  @JsonProperty("sub")
  private String sub = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("msg")
  private String msg = null;

  @JsonProperty("issues")
  private List<SuggestedIssue> issues = null;

   /**
   * The label of the type of issues suggested for use in auto-completion.
   * @return label
  **/
  @Schema(description = "The label of the type of issues suggested for use in auto-completion.")
  public String getLabel() {
    return label;
  }

   /**
   * If issue suggestions are found, returns a message indicating the number of issues suggestions found and returned.
   * @return sub
  **/
  @Schema(description = "If issue suggestions are found, returns a message indicating the number of issues suggestions found and returned.")
  public String getSub() {
    return sub;
  }

   /**
   * The ID of the type of issues suggested for use in auto-completion.
   * @return id
  **/
  @Schema(description = "The ID of the type of issues suggested for use in auto-completion.")
  public String getId() {
    return id;
  }

   /**
   * If no issue suggestions are found, returns a message indicating no suggestions were found,
   * @return msg
  **/
  @Schema(description = "If no issue suggestions are found, returns a message indicating no suggestions were found,")
  public String getMsg() {
    return msg;
  }

   /**
   * A list of issues suggested for use in auto-completion.
   * @return issues
  **/
  @Schema(description = "A list of issues suggested for use in auto-completion.")
  public List<SuggestedIssue> getIssues() {
    return issues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuePickerSuggestionsIssueType issuePickerSuggestionsIssueType = (IssuePickerSuggestionsIssueType) o;
    return Objects.equals(this.label, issuePickerSuggestionsIssueType.label) &&
        Objects.equals(this.sub, issuePickerSuggestionsIssueType.sub) &&
        Objects.equals(this.id, issuePickerSuggestionsIssueType.id) &&
        Objects.equals(this.msg, issuePickerSuggestionsIssueType.msg) &&
        Objects.equals(this.issues, issuePickerSuggestionsIssueType.issues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, sub, id, msg, issues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssuePickerSuggestionsIssueType {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    sub: ").append(toIndentedString(sub)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
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
