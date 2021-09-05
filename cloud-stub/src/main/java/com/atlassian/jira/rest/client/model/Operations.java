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
import com.atlassian.jira.rest.client.model.LinkGroup;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Details of the operations that can be performed on the issue.
 */
@Schema(description = "Details of the operations that can be performed on the issue.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-17T19:36:29.866+05:30[Asia/Kolkata]")
public class Operations extends HashMap<String, Object> {
  @JsonProperty("linkGroups")
  private List<LinkGroup> linkGroups = null;

   /**
   * Details of the link groups defining issue operations.
   * @return linkGroups
  **/
  @Schema(description = "Details of the link groups defining issue operations.")
  public List<LinkGroup> getLinkGroups() {
    return linkGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Operations operations = (Operations) o;
    return Objects.equals(this.linkGroups, operations.linkGroups) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkGroups, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Operations {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    linkGroups: ").append(toIndentedString(linkGroups)).append("\n");
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
