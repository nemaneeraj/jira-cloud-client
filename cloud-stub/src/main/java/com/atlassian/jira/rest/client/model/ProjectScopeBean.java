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
 * ProjectScopeBean
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-17T19:36:29.866+05:30[Asia/Kolkata]")
public class ProjectScopeBean {
  @JsonProperty("id")
  private Long id = null;

  /**
   * Gets or Sets attributes
   */
  public enum AttributesEnum {
    NOTSELECTABLE("notSelectable"),
    DEFAULTVALUE("defaultValue");

    private String value;

    AttributesEnum(String value) {
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
    public static AttributesEnum fromValue(String text) {
      for (AttributesEnum b : AttributesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("attributes")
  private List<AttributesEnum> attributes = null;

  public ProjectScopeBean id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the project that the option&#x27;s behavior applies to.
   * @return id
  **/
  @Schema(description = "The ID of the project that the option's behavior applies to.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ProjectScopeBean attributes(List<AttributesEnum> attributes) {
    this.attributes = attributes;
    return this;
  }

  public ProjectScopeBean addAttributesItem(AttributesEnum attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<AttributesEnum>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Defines the behavior of the option in the project.If notSelectable is set, the option cannot be set as the field&#x27;s value. This is useful for archiving an option that has previously been selected but shouldn&#x27;t be used anymore.If defaultValue is set, the option is selected by default.
   * @return attributes
  **/
  @Schema(description = "Defines the behavior of the option in the project.If notSelectable is set, the option cannot be set as the field's value. This is useful for archiving an option that has previously been selected but shouldn't be used anymore.If defaultValue is set, the option is selected by default.")
  public List<AttributesEnum> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<AttributesEnum> attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectScopeBean projectScopeBean = (ProjectScopeBean) o;
    return Objects.equals(this.id, projectScopeBean.id) &&
        Objects.equals(this.attributes, projectScopeBean.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, attributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectScopeBean {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
