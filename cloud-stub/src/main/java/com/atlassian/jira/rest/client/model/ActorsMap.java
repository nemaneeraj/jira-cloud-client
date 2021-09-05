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
 * ActorsMap
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-17T19:36:29.866+05:30[Asia/Kolkata]")
public class ActorsMap {
  @JsonProperty("user")
  private List<String> user = null;

  @JsonProperty("group")
  private List<String> group = null;

  public ActorsMap user(List<String> user) {
    this.user = user;
    return this;
  }

  public ActorsMap addUserItem(String userItem) {
    if (this.user == null) {
      this.user = new ArrayList<String>();
    }
    this.user.add(userItem);
    return this;
  }

   /**
   * The user account ID of the user to add.
   * @return user
  **/
  @Schema(description = "The user account ID of the user to add.")
  public List<String> getUser() {
    return user;
  }

  public void setUser(List<String> user) {
    this.user = user;
  }

  public ActorsMap group(List<String> group) {
    this.group = group;
    return this;
  }

  public ActorsMap addGroupItem(String groupItem) {
    if (this.group == null) {
      this.group = new ArrayList<String>();
    }
    this.group.add(groupItem);
    return this;
  }

   /**
   * The name of the group to add.
   * @return group
  **/
  @Schema(description = "The name of the group to add.")
  public List<String> getGroup() {
    return group;
  }

  public void setGroup(List<String> group) {
    this.group = group;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActorsMap actorsMap = (ActorsMap) o;
    return Objects.equals(this.user, actorsMap.user) &&
        Objects.equals(this.group, actorsMap.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, group);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActorsMap {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
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