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
import com.atlassian.jira.rest.client.model.IssueLinkType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * A list of issue link type beans.
 */
@Schema(description = "A list of issue link type beans.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-17T19:36:29.866+05:30[Asia/Kolkata]")
public class IssueLinkTypes {
  @JsonProperty("issueLinkTypes")
  private List<IssueLinkType> issueLinkTypes = null;

   /**
   * The issue link type bean.
   * @return issueLinkTypes
  **/
  @Schema(description = "The issue link type bean.")
  public List<IssueLinkType> getIssueLinkTypes() {
    return issueLinkTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueLinkTypes issueLinkTypes = (IssueLinkTypes) o;
    return Objects.equals(this.issueLinkTypes, issueLinkTypes.issueLinkTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueLinkTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueLinkTypes {\n");
    
    sb.append("    issueLinkTypes: ").append(toIndentedString(issueLinkTypes)).append("\n");
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