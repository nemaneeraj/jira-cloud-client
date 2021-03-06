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
import com.atlassian.jira.rest.client.model.PublishedWorkflowId;
import com.atlassian.jira.rest.client.model.Transition;
import com.atlassian.jira.rest.client.model.WorkflowStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * Details about a workflow.
 */
@Schema(description = "Details about a workflow.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-17T19:36:29.866+05:30[Asia/Kolkata]")
public class Workflow {
  @JsonProperty("id")
  private PublishedWorkflowId id = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("transitions")
  private List<Transition> transitions = null;

  @JsonProperty("statuses")
  private List<WorkflowStatus> statuses = null;

  @JsonProperty("isDefault")
  private Boolean isDefault = null;

  public Workflow id(PublishedWorkflowId id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
  public PublishedWorkflowId getId() {
    return id;
  }

  public void setId(PublishedWorkflowId id) {
    this.id = id;
  }

  public Workflow description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the workflow.
   * @return description
  **/
  @Schema(required = true, description = "The description of the workflow.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Workflow transitions(List<Transition> transitions) {
    this.transitions = transitions;
    return this;
  }

  public Workflow addTransitionsItem(Transition transitionsItem) {
    if (this.transitions == null) {
      this.transitions = new ArrayList<Transition>();
    }
    this.transitions.add(transitionsItem);
    return this;
  }

   /**
   * The transitions of the workflow.
   * @return transitions
  **/
  @Schema(description = "The transitions of the workflow.")
  public List<Transition> getTransitions() {
    return transitions;
  }

  public void setTransitions(List<Transition> transitions) {
    this.transitions = transitions;
  }

  public Workflow statuses(List<WorkflowStatus> statuses) {
    this.statuses = statuses;
    return this;
  }

  public Workflow addStatusesItem(WorkflowStatus statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<WorkflowStatus>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

   /**
   * The statuses of the workflow.
   * @return statuses
  **/
  @Schema(description = "The statuses of the workflow.")
  public List<WorkflowStatus> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<WorkflowStatus> statuses) {
    this.statuses = statuses;
  }

  public Workflow isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Whether this is the default workflow.
   * @return isDefault
  **/
  @Schema(description = "Whether this is the default workflow.")
  public Boolean isIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Workflow workflow = (Workflow) o;
    return Objects.equals(this.id, workflow.id) &&
        Objects.equals(this.description, workflow.description) &&
        Objects.equals(this.transitions, workflow.transitions) &&
        Objects.equals(this.statuses, workflow.statuses) &&
        Objects.equals(this.isDefault, workflow.isDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, transitions, statuses, isDefault);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workflow {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    transitions: ").append(toIndentedString(transitions)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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
