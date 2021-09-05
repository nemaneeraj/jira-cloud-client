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
import com.atlassian.jira.rest.client.model.SecurityScheme;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * List of security schemes.
 */
@Schema(description = "List of security schemes.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-17T19:36:29.866+05:30[Asia/Kolkata]")
public class SecuritySchemes {
  @JsonProperty("issueSecuritySchemes")
  private List<SecurityScheme> issueSecuritySchemes = null;

   /**
   * List of security schemes.
   * @return issueSecuritySchemes
  **/
  @Schema(description = "List of security schemes.")
  public List<SecurityScheme> getIssueSecuritySchemes() {
    return issueSecuritySchemes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecuritySchemes securitySchemes = (SecuritySchemes) o;
    return Objects.equals(this.issueSecuritySchemes, securitySchemes.issueSecuritySchemes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueSecuritySchemes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecuritySchemes {\n");
    
    sb.append("    issueSecuritySchemes: ").append(toIndentedString(issueSecuritySchemes)).append("\n");
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
