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
import com.atlassian.jira.rest.client.model.UserPickerUser;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * The list of users found in a search, including header text (Showing X of Y matching users) and total of matched users.
 */
@Schema(description = "The list of users found in a search, including header text (Showing X of Y matching users) and total of matched users.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-17T19:36:29.866+05:30[Asia/Kolkata]")
public class FoundUsers {
  @JsonProperty("users")
  private List<UserPickerUser> users = null;

  @JsonProperty("total")
  private Integer total = null;

  @JsonProperty("header")
  private String header = null;

  public FoundUsers users(List<UserPickerUser> users) {
    this.users = users;
    return this;
  }

  public FoundUsers addUsersItem(UserPickerUser usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<UserPickerUser>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @Schema(description = "")
  public List<UserPickerUser> getUsers() {
    return users;
  }

  public void setUsers(List<UserPickerUser> users) {
    this.users = users;
  }

  public FoundUsers total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * The total number of users found in the search.
   * @return total
  **/
  @Schema(description = "The total number of users found in the search.")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public FoundUsers header(String header) {
    this.header = header;
    return this;
  }

   /**
   * Header text indicating the number of users in the response and the total number of users found in the search.
   * @return header
  **/
  @Schema(description = "Header text indicating the number of users in the response and the total number of users found in the search.")
  public String getHeader() {
    return header;
  }

  public void setHeader(String header) {
    this.header = header;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FoundUsers foundUsers = (FoundUsers) o;
    return Objects.equals(this.users, foundUsers.users) &&
        Objects.equals(this.total, foundUsers.total) &&
        Objects.equals(this.header, foundUsers.header);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, total, header);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FoundUsers {\n");
    
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
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
