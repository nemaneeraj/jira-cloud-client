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
 * Details about a created issue or subtask.
 */
@Schema(description = "Details about a created issue or subtask.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-17T19:36:29.866+05:30[Asia/Kolkata]")
public class CreatedIssue {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("key")
  private String key = null;

  @JsonProperty("self")
  private String self = null;

  @JsonProperty("transition")
  private AllOfCreatedIssueTransition transition = null;

   /**
   * The ID of the created issue or subtask.
   * @return id
  **/
  @Schema(description = "The ID of the created issue or subtask.")
  public String getId() {
    return id;
  }

   /**
   * The key of the created issue or subtask.
   * @return key
  **/
  @Schema(description = "The key of the created issue or subtask.")
  public String getKey() {
    return key;
  }

   /**
   * The URL of the created issue or subtask.
   * @return self
  **/
  @Schema(description = "The URL of the created issue or subtask.")
  public String getSelf() {
    return self;
  }

   /**
   * The response code and messages related to any requested transition.
   * @return transition
  **/
  @Schema(description = "The response code and messages related to any requested transition.")
  public AllOfCreatedIssueTransition getTransition() {
    return transition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatedIssue createdIssue = (CreatedIssue) o;
    return Objects.equals(this.id, createdIssue.id) &&
        Objects.equals(this.key, createdIssue.key) &&
        Objects.equals(this.self, createdIssue.self) &&
        Objects.equals(this.transition, createdIssue.transition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, self, transition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatedIssue {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    transition: ").append(toIndentedString(transition)).append("\n");
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
