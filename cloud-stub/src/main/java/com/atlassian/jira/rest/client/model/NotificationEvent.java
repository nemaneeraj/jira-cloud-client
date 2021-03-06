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
 * Details about a notification event.
 */
@Schema(description = "Details about a notification event.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-17T19:36:29.866+05:30[Asia/Kolkata]")
public class NotificationEvent {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("templateEvent")
  private AllOfNotificationEventTemplateEvent templateEvent = null;

  public NotificationEvent id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the event. The event can be a [Jira system event](https://confluence.atlassian.com/x/8YdKLg#Creatinganotificationscheme-eventsEvents) or a [custom event](https://confluence.atlassian.com/x/AIlKLg).
   * @return id
  **/
  @Schema(description = "The ID of the event. The event can be a [Jira system event](https://confluence.atlassian.com/x/8YdKLg#Creatinganotificationscheme-eventsEvents) or a [custom event](https://confluence.atlassian.com/x/AIlKLg).")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public NotificationEvent name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the event.
   * @return name
  **/
  @Schema(description = "The name of the event.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NotificationEvent description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the event.
   * @return description
  **/
  @Schema(description = "The description of the event.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public NotificationEvent templateEvent(AllOfNotificationEventTemplateEvent templateEvent) {
    this.templateEvent = templateEvent;
    return this;
  }

   /**
   * The template of the event. Only custom events configured by Jira administrators have template.
   * @return templateEvent
  **/
  @Schema(description = "The template of the event. Only custom events configured by Jira administrators have template.")
  public AllOfNotificationEventTemplateEvent getTemplateEvent() {
    return templateEvent;
  }

  public void setTemplateEvent(AllOfNotificationEventTemplateEvent templateEvent) {
    this.templateEvent = templateEvent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationEvent notificationEvent = (NotificationEvent) o;
    return Objects.equals(this.id, notificationEvent.id) &&
        Objects.equals(this.name, notificationEvent.name) &&
        Objects.equals(this.description, notificationEvent.description) &&
        Objects.equals(this.templateEvent, notificationEvent.templateEvent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, templateEvent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationEvent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    templateEvent: ").append(toIndentedString(templateEvent)).append("\n");
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
