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
 * Details of Jira expressions for analysis.
 */
@Schema(description = "Details of Jira expressions for analysis.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-17T19:36:29.866+05:30[Asia/Kolkata]")
public class JiraExpressionForAnalysis {
  @JsonProperty("expressions")
  private List<String> expressions = new ArrayList<String>();

  @JsonProperty("contextVariables")
  private Map<String, String> contextVariables = null;

  public JiraExpressionForAnalysis expressions(List<String> expressions) {
    this.expressions = expressions;
    return this;
  }

  public JiraExpressionForAnalysis addExpressionsItem(String expressionsItem) {
    this.expressions.add(expressionsItem);
    return this;
  }

   /**
   * The list of Jira expressions to analyse.
   * @return expressions
  **/
  @Schema(example = "issues.map(issue => issue.properties['property_key'])", required = true, description = "The list of Jira expressions to analyse.")
  public List<String> getExpressions() {
    return expressions;
  }

  public void setExpressions(List<String> expressions) {
    this.expressions = expressions;
  }

  public JiraExpressionForAnalysis contextVariables(Map<String, String> contextVariables) {
    this.contextVariables = contextVariables;
    return this;
  }

  public JiraExpressionForAnalysis putContextVariablesItem(String key, String contextVariablesItem) {
    if (this.contextVariables == null) {
      this.contextVariables = new HashMap<String, String>();
    }
    this.contextVariables.put(key, contextVariablesItem);
    return this;
  }

   /**
   * Context variables and their types. The type checker assumes that [common context variables](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#context-variables), such as &#x60;issue&#x60; or &#x60;project&#x60;, are available in context and sets their type. Use this property to override the default types or provide details of new variables.
   * @return contextVariables
  **/
  @Schema(description = "Context variables and their types. The type checker assumes that [common context variables](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#context-variables), such as `issue` or `project`, are available in context and sets their type. Use this property to override the default types or provide details of new variables.")
  public Map<String, String> getContextVariables() {
    return contextVariables;
  }

  public void setContextVariables(Map<String, String> contextVariables) {
    this.contextVariables = contextVariables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraExpressionForAnalysis jiraExpressionForAnalysis = (JiraExpressionForAnalysis) o;
    return Objects.equals(this.expressions, jiraExpressionForAnalysis.expressions) &&
        Objects.equals(this.contextVariables, jiraExpressionForAnalysis.contextVariables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expressions, contextVariables);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraExpressionForAnalysis {\n");
    
    sb.append("    expressions: ").append(toIndentedString(expressions)).append("\n");
    sb.append("    contextVariables: ").append(toIndentedString(contextVariables)).append("\n");
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