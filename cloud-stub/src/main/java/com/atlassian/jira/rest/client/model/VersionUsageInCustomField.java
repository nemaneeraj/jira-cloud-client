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
 * List of custom fields using the version.
 */
@Schema(description = "List of custom fields using the version.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-17T19:36:29.866+05:30[Asia/Kolkata]")
public class VersionUsageInCustomField {
  @JsonProperty("fieldName")
  private String fieldName = null;

  @JsonProperty("customFieldId")
  private Long customFieldId = null;

  @JsonProperty("issueCountWithVersionInCustomField")
  private Long issueCountWithVersionInCustomField = null;

   /**
   * The name of the custom field.
   * @return fieldName
  **/
  @Schema(description = "The name of the custom field.")
  public String getFieldName() {
    return fieldName;
  }

   /**
   * The ID of the custom field.
   * @return customFieldId
  **/
  @Schema(description = "The ID of the custom field.")
  public Long getCustomFieldId() {
    return customFieldId;
  }

   /**
   * Count of the issues where the custom field contains the version.
   * @return issueCountWithVersionInCustomField
  **/
  @Schema(description = "Count of the issues where the custom field contains the version.")
  public Long getIssueCountWithVersionInCustomField() {
    return issueCountWithVersionInCustomField;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionUsageInCustomField versionUsageInCustomField = (VersionUsageInCustomField) o;
    return Objects.equals(this.fieldName, versionUsageInCustomField.fieldName) &&
        Objects.equals(this.customFieldId, versionUsageInCustomField.customFieldId) &&
        Objects.equals(this.issueCountWithVersionInCustomField, versionUsageInCustomField.issueCountWithVersionInCustomField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, customFieldId, issueCountWithVersionInCustomField);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionUsageInCustomField {\n");
    
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    customFieldId: ").append(toIndentedString(customFieldId)).append("\n");
    sb.append("    issueCountWithVersionInCustomField: ").append(toIndentedString(issueCountWithVersionInCustomField)).append("\n");
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
