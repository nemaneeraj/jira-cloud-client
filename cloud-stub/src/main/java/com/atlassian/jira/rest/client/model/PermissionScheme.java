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
import com.atlassian.jira.rest.client.model.PermissionGrant;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Details of a permission scheme.
 */
@Schema(description = "Details of a permission scheme.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-17T19:36:29.866+05:30[Asia/Kolkata]")
public class PermissionScheme extends HashMap<String, Object> {
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

  @JsonProperty("scope")
  private AllOfPermissionSchemeScope scope = null;

  @JsonProperty("permissions")
  private List<PermissionGrant> permissions = null;

   /**
   * The expand options available for the permission scheme.
   * @return expand
  **/
  @Schema(description = "The expand options available for the permission scheme.")
  public String getExpand() {
    return expand;
  }

   /**
   * The ID of the permission scheme.
   * @return id
  **/
  @Schema(description = "The ID of the permission scheme.")
  public Long getId() {
    return id;
  }

   /**
   * The URL of the permission scheme.
   * @return self
  **/
  @Schema(description = "The URL of the permission scheme.")
  public String getSelf() {
    return self;
  }

  public PermissionScheme name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the permission scheme. Must be unique.
   * @return name
  **/
  @Schema(required = true, description = "The name of the permission scheme. Must be unique.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PermissionScheme description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description for the permission scheme.
   * @return description
  **/
  @Schema(description = "A description for the permission scheme.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PermissionScheme scope(AllOfPermissionSchemeScope scope) {
    this.scope = scope;
    return this;
  }

   /**
   * The scope of the permission scheme.
   * @return scope
  **/
  @Schema(description = "The scope of the permission scheme.")
  public AllOfPermissionSchemeScope getScope() {
    return scope;
  }

  public void setScope(AllOfPermissionSchemeScope scope) {
    this.scope = scope;
  }

  public PermissionScheme permissions(List<PermissionGrant> permissions) {
    this.permissions = permissions;
    return this;
  }

  public PermissionScheme addPermissionsItem(PermissionGrant permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<PermissionGrant>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * The permission scheme to create or update. See [About permission schemes and grants](#about-permission-schemes-and-grants) for more information.
   * @return permissions
  **/
  @Schema(description = "The permission scheme to create or update. See [About permission schemes and grants](#about-permission-schemes-and-grants) for more information.")
  public List<PermissionGrant> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<PermissionGrant> permissions) {
    this.permissions = permissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionScheme permissionScheme = (PermissionScheme) o;
    return Objects.equals(this.expand, permissionScheme.expand) &&
        Objects.equals(this.id, permissionScheme.id) &&
        Objects.equals(this.self, permissionScheme.self) &&
        Objects.equals(this.name, permissionScheme.name) &&
        Objects.equals(this.description, permissionScheme.description) &&
        Objects.equals(this.scope, permissionScheme.scope) &&
        Objects.equals(this.permissions, permissionScheme.permissions) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expand, id, self, name, description, scope, permissions, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionScheme {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
