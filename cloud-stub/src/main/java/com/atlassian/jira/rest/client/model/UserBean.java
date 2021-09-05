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
 * UserBean
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-17T19:36:29.866+05:30[Asia/Kolkata]")
public class UserBean {
  @JsonProperty("key")
  private String key = null;

  @JsonProperty("self")
  private String self = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("avatarUrls")
  private AllOfUserBeanAvatarUrls avatarUrls = null;

  public UserBean key(String key) {
    this.key = key;
    return this;
  }

   /**
   * This property is deprecated in favor of &#x60;accountId&#x60; because of privacy changes. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.   The key of the user.
   * @return key
  **/
  @Schema(description = "This property is deprecated in favor of `accountId` because of privacy changes. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.   The key of the user.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public UserBean self(String self) {
    this.self = self;
    return this;
  }

   /**
   * The URL of the user.
   * @return self
  **/
  @Schema(description = "The URL of the user.")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public UserBean name(String name) {
    this.name = name;
    return this;
  }

   /**
   * This property is deprecated in favor of &#x60;accountId&#x60; because of privacy changes. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.   The username of the user.
   * @return name
  **/
  @Schema(description = "This property is deprecated in favor of `accountId` because of privacy changes. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.   The username of the user.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserBean displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name of the user. Depending on the user’s privacy setting, this may return an alternative value.
   * @return displayName
  **/
  @Schema(description = "The display name of the user. Depending on the user’s privacy setting, this may return an alternative value.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public UserBean active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Whether the user is active.
   * @return active
  **/
  @Schema(description = "Whether the user is active.")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public UserBean accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
   * @return accountId
  **/
  @Schema(description = "The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public UserBean avatarUrls(AllOfUserBeanAvatarUrls avatarUrls) {
    this.avatarUrls = avatarUrls;
    return this;
  }

   /**
   * The avatars of the user.
   * @return avatarUrls
  **/
  @Schema(description = "The avatars of the user.")
  public AllOfUserBeanAvatarUrls getAvatarUrls() {
    return avatarUrls;
  }

  public void setAvatarUrls(AllOfUserBeanAvatarUrls avatarUrls) {
    this.avatarUrls = avatarUrls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserBean userBean = (UserBean) o;
    return Objects.equals(this.key, userBean.key) &&
        Objects.equals(this.self, userBean.self) &&
        Objects.equals(this.name, userBean.name) &&
        Objects.equals(this.displayName, userBean.displayName) &&
        Objects.equals(this.active, userBean.active) &&
        Objects.equals(this.accountId, userBean.accountId) &&
        Objects.equals(this.avatarUrls, userBean.avatarUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, self, name, displayName, active, accountId, avatarUrls);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserBean {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    avatarUrls: ").append(toIndentedString(avatarUrls)).append("\n");
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
