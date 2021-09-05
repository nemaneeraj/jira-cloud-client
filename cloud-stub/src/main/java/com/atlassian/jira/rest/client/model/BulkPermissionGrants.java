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
import com.atlassian.jira.rest.client.model.BulkProjectPermissionGrants;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * Details of global and project permissions granted to the user.
 */
@Schema(description = "Details of global and project permissions granted to the user.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-17T19:36:29.866+05:30[Asia/Kolkata]")
public class BulkPermissionGrants {
  @JsonProperty("projectPermissions")
  private List<BulkProjectPermissionGrants> projectPermissions = new ArrayList<BulkProjectPermissionGrants>();

  @JsonProperty("globalPermissions")
  private List<String> globalPermissions = new ArrayList<String>();

  public BulkPermissionGrants projectPermissions(List<BulkProjectPermissionGrants> projectPermissions) {
    this.projectPermissions = projectPermissions;
    return this;
  }

  public BulkPermissionGrants addProjectPermissionsItem(BulkProjectPermissionGrants projectPermissionsItem) {
    this.projectPermissions.add(projectPermissionsItem);
    return this;
  }

   /**
   * List of project permissions and the projects and issues those permissions provide access to.
   * @return projectPermissions
  **/
  @Schema(required = true, description = "List of project permissions and the projects and issues those permissions provide access to.")
  public List<BulkProjectPermissionGrants> getProjectPermissions() {
    return projectPermissions;
  }

  public void setProjectPermissions(List<BulkProjectPermissionGrants> projectPermissions) {
    this.projectPermissions = projectPermissions;
  }

  public BulkPermissionGrants globalPermissions(List<String> globalPermissions) {
    this.globalPermissions = globalPermissions;
    return this;
  }

  public BulkPermissionGrants addGlobalPermissionsItem(String globalPermissionsItem) {
    this.globalPermissions.add(globalPermissionsItem);
    return this;
  }

   /**
   * List of permissions granted to the user.
   * @return globalPermissions
  **/
  @Schema(required = true, description = "List of permissions granted to the user.")
  public List<String> getGlobalPermissions() {
    return globalPermissions;
  }

  public void setGlobalPermissions(List<String> globalPermissions) {
    this.globalPermissions = globalPermissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkPermissionGrants bulkPermissionGrants = (BulkPermissionGrants) o;
    return Objects.equals(this.projectPermissions, bulkPermissionGrants.projectPermissions) &&
        Objects.equals(this.globalPermissions, bulkPermissionGrants.globalPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectPermissions, globalPermissions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkPermissionGrants {\n");
    
    sb.append("    projectPermissions: ").append(toIndentedString(projectPermissions)).append("\n");
    sb.append("    globalPermissions: ").append(toIndentedString(globalPermissions)).append("\n");
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