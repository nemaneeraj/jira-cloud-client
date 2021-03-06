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
import com.atlassian.jira.rest.client.model.SharePermission;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * Details about a filter.
 */
@Schema(description = "Details about a filter.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-17T19:36:29.866+05:30[Asia/Kolkata]")
public class Filter {
  @JsonProperty("self")
  private String self = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("owner")
  private AllOfFilterOwner owner = null;

  @JsonProperty("jql")
  private String jql = null;

  @JsonProperty("viewUrl")
  private String viewUrl = null;

  @JsonProperty("searchUrl")
  private String searchUrl = null;

  @JsonProperty("favourite")
  private Boolean favourite = null;

  @JsonProperty("favouritedCount")
  private Long favouritedCount = null;

  @JsonProperty("sharePermissions")
  private List<SharePermission> sharePermissions = null;

  @JsonProperty("sharedUsers")
  private AllOfFilterSharedUsers sharedUsers = null;

  @JsonProperty("subscriptions")
  private AllOfFilterSubscriptions subscriptions = null;

   /**
   * The URL of the filter.
   * @return self
  **/
  @Schema(description = "The URL of the filter.")
  public String getSelf() {
    return self;
  }

   /**
   * The unique identifier for the filter.
   * @return id
  **/
  @Schema(description = "The unique identifier for the filter.")
  public String getId() {
    return id;
  }

  public Filter name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the filter. Must be unique.
   * @return name
  **/
  @Schema(required = true, description = "The name of the filter. Must be unique.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Filter description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the filter.
   * @return description
  **/
  @Schema(description = "A description of the filter.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

   /**
   * The user who owns the filter. This is defaulted to the creator of the filter, however Jira administrators can change the owner of a shared filter in the admin settings.
   * @return owner
  **/
  @Schema(description = "The user who owns the filter. This is defaulted to the creator of the filter, however Jira administrators can change the owner of a shared filter in the admin settings.")
  public AllOfFilterOwner getOwner() {
    return owner;
  }

  public Filter jql(String jql) {
    this.jql = jql;
    return this;
  }

   /**
   * The JQL query for the filter. For example, *project &#x3D; SSP AND issuetype &#x3D; Bug*.
   * @return jql
  **/
  @Schema(description = "The JQL query for the filter. For example, *project = SSP AND issuetype = Bug*.")
  public String getJql() {
    return jql;
  }

  public void setJql(String jql) {
    this.jql = jql;
  }

   /**
   * A URL to view the filter results in Jira, using the ID of the filter. For example, *https://your-domain.atlassian.net/issues/?filter&#x3D;10100*.
   * @return viewUrl
  **/
  @Schema(description = "A URL to view the filter results in Jira, using the ID of the filter. For example, *https://your-domain.atlassian.net/issues/?filter=10100*.")
  public String getViewUrl() {
    return viewUrl;
  }

   /**
   * A URL to view the filter results in Jira, using the [Search for issues using JQL](#api-rest-api-3-filter-search-get) operation with the filter&#x27;s JQL string to return the filter results. For example, *https://your-domain.atlassian.net/rest/api/3/search?jql&#x3D;project+%3D+SSP+AND+issuetype+%3D+Bug*.
   * @return searchUrl
  **/
  @Schema(description = "A URL to view the filter results in Jira, using the [Search for issues using JQL](#api-rest-api-3-filter-search-get) operation with the filter's JQL string to return the filter results. For example, *https://your-domain.atlassian.net/rest/api/3/search?jql=project+%3D+SSP+AND+issuetype+%3D+Bug*.")
  public String getSearchUrl() {
    return searchUrl;
  }

  public Filter favourite(Boolean favourite) {
    this.favourite = favourite;
    return this;
  }

   /**
   * Whether the filter is selected as a favorite.
   * @return favourite
  **/
  @Schema(description = "Whether the filter is selected as a favorite.")
  public Boolean isFavourite() {
    return favourite;
  }

  public void setFavourite(Boolean favourite) {
    this.favourite = favourite;
  }

   /**
   * The count of how many users have selected this filter as a favorite, including the filter owner.
   * @return favouritedCount
  **/
  @Schema(description = "The count of how many users have selected this filter as a favorite, including the filter owner.")
  public Long getFavouritedCount() {
    return favouritedCount;
  }

  public Filter sharePermissions(List<SharePermission> sharePermissions) {
    this.sharePermissions = sharePermissions;
    return this;
  }

  public Filter addSharePermissionsItem(SharePermission sharePermissionsItem) {
    if (this.sharePermissions == null) {
      this.sharePermissions = new ArrayList<SharePermission>();
    }
    this.sharePermissions.add(sharePermissionsItem);
    return this;
  }

   /**
   * The groups and projects that the filter is shared with.
   * @return sharePermissions
  **/
  @Schema(description = "The groups and projects that the filter is shared with.")
  public List<SharePermission> getSharePermissions() {
    return sharePermissions;
  }

  public void setSharePermissions(List<SharePermission> sharePermissions) {
    this.sharePermissions = sharePermissions;
  }

   /**
   * A paginated list of the users that the filter is shared with. This includes users that are members of the groups or can browse the projects that the filter is shared with.
   * @return sharedUsers
  **/
  @Schema(description = "A paginated list of the users that the filter is shared with. This includes users that are members of the groups or can browse the projects that the filter is shared with.")
  public AllOfFilterSharedUsers getSharedUsers() {
    return sharedUsers;
  }

   /**
   * A paginated list of the users that are subscribed to the filter.
   * @return subscriptions
  **/
  @Schema(description = "A paginated list of the users that are subscribed to the filter.")
  public AllOfFilterSubscriptions getSubscriptions() {
    return subscriptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Filter filter = (Filter) o;
    return Objects.equals(this.self, filter.self) &&
        Objects.equals(this.id, filter.id) &&
        Objects.equals(this.name, filter.name) &&
        Objects.equals(this.description, filter.description) &&
        Objects.equals(this.owner, filter.owner) &&
        Objects.equals(this.jql, filter.jql) &&
        Objects.equals(this.viewUrl, filter.viewUrl) &&
        Objects.equals(this.searchUrl, filter.searchUrl) &&
        Objects.equals(this.favourite, filter.favourite) &&
        Objects.equals(this.favouritedCount, filter.favouritedCount) &&
        Objects.equals(this.sharePermissions, filter.sharePermissions) &&
        Objects.equals(this.sharedUsers, filter.sharedUsers) &&
        Objects.equals(this.subscriptions, filter.subscriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, id, name, description, owner, jql, viewUrl, searchUrl, favourite, favouritedCount, sharePermissions, sharedUsers, subscriptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Filter {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    jql: ").append(toIndentedString(jql)).append("\n");
    sb.append("    viewUrl: ").append(toIndentedString(viewUrl)).append("\n");
    sb.append("    searchUrl: ").append(toIndentedString(searchUrl)).append("\n");
    sb.append("    favourite: ").append(toIndentedString(favourite)).append("\n");
    sb.append("    favouritedCount: ").append(toIndentedString(favouritedCount)).append("\n");
    sb.append("    sharePermissions: ").append(toIndentedString(sharePermissions)).append("\n");
    sb.append("    sharedUsers: ").append(toIndentedString(sharedUsers)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
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
