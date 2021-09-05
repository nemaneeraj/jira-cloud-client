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
 * SimpleApplicationPropertyBean
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-17T19:36:29.866+05:30[Asia/Kolkata]")
public class SimpleApplicationPropertyBean {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("value")
  private String value = null;

  public SimpleApplicationPropertyBean id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the application property.
   * @return id
  **/
  @Schema(description = "The ID of the application property.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SimpleApplicationPropertyBean value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The new value.
   * @return value
  **/
  @Schema(description = "The new value.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleApplicationPropertyBean simpleApplicationPropertyBean = (SimpleApplicationPropertyBean) o;
    return Objects.equals(this.id, simpleApplicationPropertyBean.id) &&
        Objects.equals(this.value, simpleApplicationPropertyBean.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleApplicationPropertyBean {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
