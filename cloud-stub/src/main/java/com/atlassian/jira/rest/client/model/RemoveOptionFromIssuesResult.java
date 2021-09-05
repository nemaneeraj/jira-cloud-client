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
 * RemoveOptionFromIssuesResult
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-17T19:36:29.866+05:30[Asia/Kolkata]")
public class RemoveOptionFromIssuesResult {
  @JsonProperty("modifiedIssues")
  private List<Long> modifiedIssues = null;

  @JsonProperty("unmodifiedIssues")
  private List<Long> unmodifiedIssues = null;

  @JsonProperty("errors")
  private AllOfRemoveOptionFromIssuesResultErrors errors = null;

  public RemoveOptionFromIssuesResult modifiedIssues(List<Long> modifiedIssues) {
    this.modifiedIssues = modifiedIssues;
    return this;
  }

  public RemoveOptionFromIssuesResult addModifiedIssuesItem(Long modifiedIssuesItem) {
    if (this.modifiedIssues == null) {
      this.modifiedIssues = new ArrayList<Long>();
    }
    this.modifiedIssues.add(modifiedIssuesItem);
    return this;
  }

   /**
   * The IDs of the modified issues.
   * @return modifiedIssues
  **/
  @Schema(description = "The IDs of the modified issues.")
  public List<Long> getModifiedIssues() {
    return modifiedIssues;
  }

  public void setModifiedIssues(List<Long> modifiedIssues) {
    this.modifiedIssues = modifiedIssues;
  }

  public RemoveOptionFromIssuesResult unmodifiedIssues(List<Long> unmodifiedIssues) {
    this.unmodifiedIssues = unmodifiedIssues;
    return this;
  }

  public RemoveOptionFromIssuesResult addUnmodifiedIssuesItem(Long unmodifiedIssuesItem) {
    if (this.unmodifiedIssues == null) {
      this.unmodifiedIssues = new ArrayList<Long>();
    }
    this.unmodifiedIssues.add(unmodifiedIssuesItem);
    return this;
  }

   /**
   * The IDs of the unchanged issues, those issues where errors prevent modification.
   * @return unmodifiedIssues
  **/
  @Schema(description = "The IDs of the unchanged issues, those issues where errors prevent modification.")
  public List<Long> getUnmodifiedIssues() {
    return unmodifiedIssues;
  }

  public void setUnmodifiedIssues(List<Long> unmodifiedIssues) {
    this.unmodifiedIssues = unmodifiedIssues;
  }

  public RemoveOptionFromIssuesResult errors(AllOfRemoveOptionFromIssuesResultErrors errors) {
    this.errors = errors;
    return this;
  }

   /**
   * A collection of errors related to unchanged issues. The collection size is limited, which means not all errors may be returned.
   * @return errors
  **/
  @Schema(description = "A collection of errors related to unchanged issues. The collection size is limited, which means not all errors may be returned.")
  public AllOfRemoveOptionFromIssuesResultErrors getErrors() {
    return errors;
  }

  public void setErrors(AllOfRemoveOptionFromIssuesResultErrors errors) {
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
    RemoveOptionFromIssuesResult removeOptionFromIssuesResult = (RemoveOptionFromIssuesResult) o;
    return Objects.equals(this.modifiedIssues, removeOptionFromIssuesResult.modifiedIssues) &&
        Objects.equals(this.unmodifiedIssues, removeOptionFromIssuesResult.unmodifiedIssues) &&
        Objects.equals(this.errors, removeOptionFromIssuesResult.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modifiedIssues, unmodifiedIssues, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveOptionFromIssuesResult {\n");
    
    sb.append("    modifiedIssues: ").append(toIndentedString(modifiedIssues)).append("\n");
    sb.append("    unmodifiedIssues: ").append(toIndentedString(unmodifiedIssues)).append("\n");
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
