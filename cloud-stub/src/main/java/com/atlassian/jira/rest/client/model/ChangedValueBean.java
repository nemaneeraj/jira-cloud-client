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
 * Details of names changed in the record event.
 */
@Schema(description = "Details of names changed in the record event.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-17T19:36:29.866+05:30[Asia/Kolkata]")
public class ChangedValueBean {
  @JsonProperty("fieldName")
  private String fieldName = null;

  @JsonProperty("changedFrom")
  private String changedFrom = null;

  @JsonProperty("changedTo")
  private String changedTo = null;

   /**
   * The name of the field changed.
   * @return fieldName
  **/
  @Schema(description = "The name of the field changed.")
  public String getFieldName() {
    return fieldName;
  }

   /**
   * The value of the field before the change.
   * @return changedFrom
  **/
  @Schema(description = "The value of the field before the change.")
  public String getChangedFrom() {
    return changedFrom;
  }

   /**
   * The value of the field after the change.
   * @return changedTo
  **/
  @Schema(description = "The value of the field after the change.")
  public String getChangedTo() {
    return changedTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangedValueBean changedValueBean = (ChangedValueBean) o;
    return Objects.equals(this.fieldName, changedValueBean.fieldName) &&
        Objects.equals(this.changedFrom, changedValueBean.changedFrom) &&
        Objects.equals(this.changedTo, changedValueBean.changedTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, changedFrom, changedTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangedValueBean {\n");
    
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    changedFrom: ").append(toIndentedString(changedFrom)).append("\n");
    sb.append("    changedTo: ").append(toIndentedString(changedTo)).append("\n");
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
