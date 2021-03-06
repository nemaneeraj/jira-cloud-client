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
 * A webhook.
 */
@Schema(description = "A webhook.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-17T19:36:29.866+05:30[Asia/Kolkata]")
public class Webhook {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("jqlFilter")
  private String jqlFilter = null;

  /**
   * Gets or Sets events
   */
  public enum EventsEnum {
    JIRA_ISSUE_CREATED("jira:issue_created"),
    JIRA_ISSUE_UPDATED("jira:issue_updated"),
    JIRA_ISSUE_DELETED("jira:issue_deleted"),
    COMMENT_CREATED("comment_created"),
    COMMENT_UPDATED("comment_updated"),
    COMMENT_DELETED("comment_deleted"),
    ISSUE_PROPERTY_SET("issue_property_set"),
    ISSUE_PROPERTY_DELETED("issue_property_deleted");

    private String value;

    EventsEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static EventsEnum fromValue(String text) {
      for (EventsEnum b : EventsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("events")
  private List<EventsEnum> events = new ArrayList<EventsEnum>();

  @JsonProperty("expirationDate")
  private Long expirationDate = null;

  public Webhook id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the webhook.
   * @return id
  **/
  @Schema(required = true, description = "The ID of the webhook.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Webhook jqlFilter(String jqlFilter) {
    this.jqlFilter = jqlFilter;
    return this;
  }

   /**
   * The JQL filter that specifies which issues the webhook is sent for.
   * @return jqlFilter
  **/
  @Schema(required = true, description = "The JQL filter that specifies which issues the webhook is sent for.")
  public String getJqlFilter() {
    return jqlFilter;
  }

  public void setJqlFilter(String jqlFilter) {
    this.jqlFilter = jqlFilter;
  }

  public Webhook events(List<EventsEnum> events) {
    this.events = events;
    return this;
  }

  public Webhook addEventsItem(EventsEnum eventsItem) {
    this.events.add(eventsItem);
    return this;
  }

   /**
   * The Jira events that trigger the webhook.
   * @return events
  **/
  @Schema(required = true, description = "The Jira events that trigger the webhook.")
  public List<EventsEnum> getEvents() {
    return events;
  }

  public void setEvents(List<EventsEnum> events) {
    this.events = events;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @Schema(required = true, description = "")
  public Long getExpirationDate() {
    return expirationDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Webhook webhook = (Webhook) o;
    return Objects.equals(this.id, webhook.id) &&
        Objects.equals(this.jqlFilter, webhook.jqlFilter) &&
        Objects.equals(this.events, webhook.events) &&
        Objects.equals(this.expirationDate, webhook.expirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, jqlFilter, events, expirationDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webhook {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jqlFilter: ").append(toIndentedString(jqlFilter)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
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
