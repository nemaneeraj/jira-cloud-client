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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Details of an avatar.
 */
@Schema(description = "Details of an avatar.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-17T19:36:29.866+05:30[Asia/Kolkata]")
public class Avatar {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("owner")
  private String owner = null;

  @JsonProperty("isSystemAvatar")
  private Boolean isSystemAvatar = null;

  @JsonProperty("isSelected")
  private Boolean isSelected = null;

  @JsonProperty("isDeletable")
  private Boolean isDeletable = null;

  @JsonProperty("fileName")
  private String fileName = null;

  @JsonProperty("urls")
  private Map<String, String> urls = null;

  public Avatar id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the avatar.
   * @return id
  **/
  @Schema(required = true, description = "The ID of the avatar.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

   /**
   * The owner of the avatar. For a system avatar the owner is null (and nothing is returned). For non-system avatars this is the appropriate identifier, such as the ID for a project or the account ID for a user.
   * @return owner
  **/
  @Schema(description = "The owner of the avatar. For a system avatar the owner is null (and nothing is returned). For non-system avatars this is the appropriate identifier, such as the ID for a project or the account ID for a user.")
  public String getOwner() {
    return owner;
  }

   /**
   * Whether the avatar is a system avatar.
   * @return isSystemAvatar
  **/
  @Schema(description = "Whether the avatar is a system avatar.")
  public Boolean isIsSystemAvatar() {
    return isSystemAvatar;
  }

   /**
   * Whether the avatar is used in Jira. For example, shown as a project&#x27;s avatar.
   * @return isSelected
  **/
  @Schema(description = "Whether the avatar is used in Jira. For example, shown as a project's avatar.")
  public Boolean isIsSelected() {
    return isSelected;
  }

   /**
   * Whether the avatar can be deleted.
   * @return isDeletable
  **/
  @Schema(description = "Whether the avatar can be deleted.")
  public Boolean isIsDeletable() {
    return isDeletable;
  }

   /**
   * The file name of the avatar icon. Returned for system avatars.
   * @return fileName
  **/
  @Schema(description = "The file name of the avatar icon. Returned for system avatars.")
  public String getFileName() {
    return fileName;
  }

   /**
   * The list of avatar icon URLs.
   * @return urls
  **/
  @Schema(description = "The list of avatar icon URLs.")
  public Map<String, String> getUrls() {
    return urls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Avatar avatar = (Avatar) o;
    return Objects.equals(this.id, avatar.id) &&
        Objects.equals(this.owner, avatar.owner) &&
        Objects.equals(this.isSystemAvatar, avatar.isSystemAvatar) &&
        Objects.equals(this.isSelected, avatar.isSelected) &&
        Objects.equals(this.isDeletable, avatar.isDeletable) &&
        Objects.equals(this.fileName, avatar.fileName) &&
        Objects.equals(this.urls, avatar.urls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, owner, isSystemAvatar, isSelected, isDeletable, fileName, urls);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Avatar {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    isSystemAvatar: ").append(toIndentedString(isSystemAvatar)).append("\n");
    sb.append("    isSelected: ").append(toIndentedString(isSelected)).append("\n");
    sb.append("    isDeletable: ").append(toIndentedString(isDeletable)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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