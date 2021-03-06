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
 * A list of the issues matched to a JQL query or details of errors encountered during matching.
 */
@Schema(description = "A list of the issues matched to a JQL query or details of errors encountered during matching.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-17T19:36:29.866+05:30[Asia/Kolkata]")
public class IssueMatchesForJQL {
  @JsonProperty("matchedIssues")
  private List<Long> matchedIssues = new ArrayList<Long>();

  @JsonProperty("errors")
  private List<String> errors = new ArrayList<String>();

  public IssueMatchesForJQL matchedIssues(List<Long> matchedIssues) {
    this.matchedIssues = matchedIssues;
    return this;
  }

  public IssueMatchesForJQL addMatchedIssuesItem(Long matchedIssuesItem) {
    this.matchedIssues.add(matchedIssuesItem);
    return this;
  }

   /**
   * A list of issue IDs.
   * @return matchedIssues
  **/
  @Schema(required = true, description = "A list of issue IDs.")
  public List<Long> getMatchedIssues() {
    return matchedIssues;
  }

  public void setMatchedIssues(List<Long> matchedIssues) {
    this.matchedIssues = matchedIssues;
  }

  public IssueMatchesForJQL errors(List<String> errors) {
    this.errors = errors;
    return this;
  }

  public IssueMatchesForJQL addErrorsItem(String errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * A list of errors.
   * @return errors
  **/
  @Schema(required = true, description = "A list of errors.")
  public List<String> getErrors() {
    return errors;
  }

  public void setErrors(List<String> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueMatchesForJQL issueMatchesForJQL = (IssueMatchesForJQL) o;
    return Objects.equals(this.matchedIssues, issueMatchesForJQL.matchedIssues) &&
        Objects.equals(this.errors, issueMatchesForJQL.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchedIssues, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueMatchesForJQL {\n");
    
    sb.append("    matchedIssues: ").append(toIndentedString(matchedIssues)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
