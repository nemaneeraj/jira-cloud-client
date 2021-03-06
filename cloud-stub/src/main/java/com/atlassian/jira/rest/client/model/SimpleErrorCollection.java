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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * SimpleErrorCollection
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-17T19:36:29.866+05:30[Asia/Kolkata]")
public class SimpleErrorCollection {
  @JsonProperty("errors")
  private Map<String, String> errors = null;

  @JsonProperty("errorMessages")
  private List<String> errorMessages = null;

  @JsonProperty("httpStatusCode")
  private Integer httpStatusCode = null;

  public SimpleErrorCollection errors(Map<String, String> errors) {
    this.errors = errors;
    return this;
  }

  public SimpleErrorCollection putErrorsItem(String key, String errorsItem) {
    if (this.errors == null) {
      this.errors = new HashMap<String, String>();
    }
    this.errors.put(key, errorsItem);
    return this;
  }

   /**
   * The list of errors by parameter returned by the operation. For example,\&quot;projectKey\&quot;: \&quot;Project keys must start with an uppercase letter, followed by one or more uppercase alphanumeric characters.\&quot;
   * @return errors
  **/
  @Schema(description = "The list of errors by parameter returned by the operation. For example,\"projectKey\": \"Project keys must start with an uppercase letter, followed by one or more uppercase alphanumeric characters.\"")
  public Map<String, String> getErrors() {
    return errors;
  }

  public void setErrors(Map<String, String> errors) {
    this.errors = errors;
  }

  public SimpleErrorCollection errorMessages(List<String> errorMessages) {
    this.errorMessages = errorMessages;
    return this;
  }

  public SimpleErrorCollection addErrorMessagesItem(String errorMessagesItem) {
    if (this.errorMessages == null) {
      this.errorMessages = new ArrayList<String>();
    }
    this.errorMessages.add(errorMessagesItem);
    return this;
  }

   /**
   * The list of error messages produced by this operation. For example, \&quot;input parameter &#x27;key&#x27; must be provided\&quot;
   * @return errorMessages
  **/
  @Schema(description = "The list of error messages produced by this operation. For example, \"input parameter 'key' must be provided\"")
  public List<String> getErrorMessages() {
    return errorMessages;
  }

  public void setErrorMessages(List<String> errorMessages) {
    this.errorMessages = errorMessages;
  }

  public SimpleErrorCollection httpStatusCode(Integer httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
    return this;
  }

   /**
   * Get httpStatusCode
   * @return httpStatusCode
  **/
  @Schema(description = "")
  public Integer getHttpStatusCode() {
    return httpStatusCode;
  }

  public void setHttpStatusCode(Integer httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleErrorCollection simpleErrorCollection = (SimpleErrorCollection) o;
    return Objects.equals(this.errors, simpleErrorCollection.errors) &&
        Objects.equals(this.errorMessages, simpleErrorCollection.errorMessages) &&
        Objects.equals(this.httpStatusCode, simpleErrorCollection.httpStatusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, errorMessages, httpStatusCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleErrorCollection {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    errorMessages: ").append(toIndentedString(errorMessages)).append("\n");
    sb.append("    httpStatusCode: ").append(toIndentedString(httpStatusCode)).append("\n");
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
