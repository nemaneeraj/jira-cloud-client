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
 * The metadata describing an issue field.
 */
@Schema(description = "The metadata describing an issue field.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-17T19:36:29.866+05:30[Asia/Kolkata]")
public class FieldMetadata {
  @JsonProperty("required")
  private Boolean required = null;

  @JsonProperty("schema")
  private AllOfFieldMetadataSchema schema = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("key")
  private String key = null;

  @JsonProperty("autoCompleteUrl")
  private String autoCompleteUrl = null;

  @JsonProperty("hasDefaultValue")
  private Boolean hasDefaultValue = null;

  @JsonProperty("operations")
  private List<String> operations = new ArrayList<String>();

  @JsonProperty("allowedValues")
  private List<Object> allowedValues = null;

  @JsonProperty("defaultValue")
  private Object defaultValue = null;

   /**
   * Whether the field is required.
   * @return required
  **/
  @Schema(required = true, description = "Whether the field is required.")
  public Boolean isRequired() {
    return required;
  }

   /**
   * The data type of the field.
   * @return schema
  **/
  @Schema(required = true, description = "The data type of the field.")
  public AllOfFieldMetadataSchema getSchema() {
    return schema;
  }

   /**
   * The name of the field.
   * @return name
  **/
  @Schema(required = true, description = "The name of the field.")
  public String getName() {
    return name;
  }

   /**
   * The key of the field.
   * @return key
  **/
  @Schema(required = true, description = "The key of the field.")
  public String getKey() {
    return key;
  }

   /**
   * The URL that can be used to automatically complete the field.
   * @return autoCompleteUrl
  **/
  @Schema(description = "The URL that can be used to automatically complete the field.")
  public String getAutoCompleteUrl() {
    return autoCompleteUrl;
  }

   /**
   * Whether the field has a default value.
   * @return hasDefaultValue
  **/
  @Schema(description = "Whether the field has a default value.")
  public Boolean isHasDefaultValue() {
    return hasDefaultValue;
  }

   /**
   * The list of operations that can be performed on the field.
   * @return operations
  **/
  @Schema(required = true, description = "The list of operations that can be performed on the field.")
  public List<String> getOperations() {
    return operations;
  }

   /**
   * The list of values allowed in the field.
   * @return allowedValues
  **/
  @Schema(description = "The list of values allowed in the field.")
  public List<Object> getAllowedValues() {
    return allowedValues;
  }

   /**
   * The default value of the field.
   * @return defaultValue
  **/
  @Schema(description = "The default value of the field.")
  public Object getDefaultValue() {
    return defaultValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldMetadata fieldMetadata = (FieldMetadata) o;
    return Objects.equals(this.required, fieldMetadata.required) &&
        Objects.equals(this.schema, fieldMetadata.schema) &&
        Objects.equals(this.name, fieldMetadata.name) &&
        Objects.equals(this.key, fieldMetadata.key) &&
        Objects.equals(this.autoCompleteUrl, fieldMetadata.autoCompleteUrl) &&
        Objects.equals(this.hasDefaultValue, fieldMetadata.hasDefaultValue) &&
        Objects.equals(this.operations, fieldMetadata.operations) &&
        Objects.equals(this.allowedValues, fieldMetadata.allowedValues) &&
        Objects.equals(this.defaultValue, fieldMetadata.defaultValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(required, schema, name, key, autoCompleteUrl, hasDefaultValue, operations, allowedValues, defaultValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldMetadata {\n");
    
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    autoCompleteUrl: ").append(toIndentedString(autoCompleteUrl)).append("\n");
    sb.append("    hasDefaultValue: ").append(toIndentedString(hasDefaultValue)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    allowedValues: ").append(toIndentedString(allowedValues)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
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
