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
import com.atlassian.jira.rest.client.model.NotificationSchemeEvent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * Details about a notification scheme.
 */
@Schema(description = "Details about a notification scheme.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-17T19:36:29.866+05:30[Asia/Kolkata]")
public class NotificationScheme {
  @JsonProperty("expand")
  private String expand = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("self")
  private String self = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("notificationSchemeEvents")
  private List<NotificationSchemeEvent> notificationSchemeEvents = null;

  @JsonProperty("scope")
  private AllOfNotificationSchemeScope scope = null;

  public NotificationScheme expand(String expand) {
    this.expand = expand;
    return this;
  }

   /**
   * Expand options that include additional notification scheme details in the response.
   * @return expand
  **/
  @Schema(description = "Expand options that include additional notification scheme details in the response.")
  public String getExpand() {
    return expand;
  }

  public void setExpand(String expand) {
    this.expand = expand;
  }

  public NotificationScheme id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the notification scheme.
   * @return id
  **/
  @Schema(description = "The ID of the notification scheme.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public NotificationScheme self(String self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @Schema(description = "")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public NotificationScheme name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the notification scheme.
   * @return name
  **/
  @Schema(description = "The name of the notification scheme.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NotificationScheme description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the notification scheme.
   * @return description
  **/
  @Schema(description = "The description of the notification scheme.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public NotificationScheme notificationSchemeEvents(List<NotificationSchemeEvent> notificationSchemeEvents) {
    this.notificationSchemeEvents = notificationSchemeEvents;
    return this;
  }

  public NotificationScheme addNotificationSchemeEventsItem(NotificationSchemeEvent notificationSchemeEventsItem) {
    if (this.notificationSchemeEvents == null) {
      this.notificationSchemeEvents = new ArrayList<NotificationSchemeEvent>();
    }
    this.notificationSchemeEvents.add(notificationSchemeEventsItem);
    return this;
  }

   /**
   * The notification events and associated recipients.
   * @return notificationSchemeEvents
  **/
  @Schema(description = "The notification events and associated recipients.")
  public List<NotificationSchemeEvent> getNotificationSchemeEvents() {
    return notificationSchemeEvents;
  }

  public void setNotificationSchemeEvents(List<NotificationSchemeEvent> notificationSchemeEvents) {
    this.notificationSchemeEvents = notificationSchemeEvents;
  }

  public NotificationScheme scope(AllOfNotificationSchemeScope scope) {
    this.scope = scope;
    return this;
  }

   /**
   * The scope of the notification scheme.
   * @return scope
  **/
  @Schema(description = "The scope of the notification scheme.")
  public AllOfNotificationSchemeScope getScope() {
    return scope;
  }

  public void setScope(AllOfNotificationSchemeScope scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationScheme notificationScheme = (NotificationScheme) o;
    return Objects.equals(this.expand, notificationScheme.expand) &&
        Objects.equals(this.id, notificationScheme.id) &&
        Objects.equals(this.self, notificationScheme.self) &&
        Objects.equals(this.name, notificationScheme.name) &&
        Objects.equals(this.description, notificationScheme.description) &&
        Objects.equals(this.notificationSchemeEvents, notificationScheme.notificationSchemeEvents) &&
        Objects.equals(this.scope, notificationScheme.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expand, id, self, name, description, notificationSchemeEvents, scope);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationScheme {\n");
    
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    notificationSchemeEvents: ").append(toIndentedString(notificationSchemeEvents)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
