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
import com.atlassian.jira.rest.client.model.WorkflowConditionBean;
import com.atlassian.jira.rest.client.model.WorkflowTransitionRule;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * A collection of transition rules.
 */
@Schema(description = "A collection of transition rules.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-17T19:36:29.866+05:30[Asia/Kolkata]")
public class WorkflowRules {
  @JsonProperty("conditions")
  private List<WorkflowTransitionRule> conditions = new ArrayList<WorkflowTransitionRule>();

  @JsonProperty("conditionsTree")
  private WorkflowConditionBean conditionsTree = null;

  @JsonProperty("validators")
  private List<WorkflowTransitionRule> validators = new ArrayList<WorkflowTransitionRule>();

  @JsonProperty("postFunctions")
  private List<WorkflowTransitionRule> postFunctions = new ArrayList<WorkflowTransitionRule>();

  public WorkflowRules conditions(List<WorkflowTransitionRule> conditions) {
    this.conditions = conditions;
    return this;
  }

  public WorkflowRules addConditionsItem(WorkflowTransitionRule conditionsItem) {
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * The workflow conditions.
   * @return conditions
  **/
  @Schema(required = true, description = "The workflow conditions.")
  public List<WorkflowTransitionRule> getConditions() {
    return conditions;
  }

  public void setConditions(List<WorkflowTransitionRule> conditions) {
    this.conditions = conditions;
  }

  public WorkflowRules conditionsTree(WorkflowConditionBean conditionsTree) {
    this.conditionsTree = conditionsTree;
    return this;
  }

   /**
   * Get conditionsTree
   * @return conditionsTree
  **/
  @Schema(description = "")
  public WorkflowConditionBean getConditionsTree() {
    return conditionsTree;
  }

  public void setConditionsTree(WorkflowConditionBean conditionsTree) {
    this.conditionsTree = conditionsTree;
  }

  public WorkflowRules validators(List<WorkflowTransitionRule> validators) {
    this.validators = validators;
    return this;
  }

  public WorkflowRules addValidatorsItem(WorkflowTransitionRule validatorsItem) {
    this.validators.add(validatorsItem);
    return this;
  }

   /**
   * The workflow validators.
   * @return validators
  **/
  @Schema(required = true, description = "The workflow validators.")
  public List<WorkflowTransitionRule> getValidators() {
    return validators;
  }

  public void setValidators(List<WorkflowTransitionRule> validators) {
    this.validators = validators;
  }

  public WorkflowRules postFunctions(List<WorkflowTransitionRule> postFunctions) {
    this.postFunctions = postFunctions;
    return this;
  }

  public WorkflowRules addPostFunctionsItem(WorkflowTransitionRule postFunctionsItem) {
    this.postFunctions.add(postFunctionsItem);
    return this;
  }

   /**
   * The workflow post functions.
   * @return postFunctions
  **/
  @Schema(required = true, description = "The workflow post functions.")
  public List<WorkflowTransitionRule> getPostFunctions() {
    return postFunctions;
  }

  public void setPostFunctions(List<WorkflowTransitionRule> postFunctions) {
    this.postFunctions = postFunctions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowRules workflowRules = (WorkflowRules) o;
    return Objects.equals(this.conditions, workflowRules.conditions) &&
        Objects.equals(this.conditionsTree, workflowRules.conditionsTree) &&
        Objects.equals(this.validators, workflowRules.validators) &&
        Objects.equals(this.postFunctions, workflowRules.postFunctions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, conditionsTree, validators, postFunctions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowRules {\n");
    
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    conditionsTree: ").append(toIndentedString(conditionsTree)).append("\n");
    sb.append("    validators: ").append(toIndentedString(validators)).append("\n");
    sb.append("    postFunctions: ").append(toIndentedString(postFunctions)).append("\n");
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
