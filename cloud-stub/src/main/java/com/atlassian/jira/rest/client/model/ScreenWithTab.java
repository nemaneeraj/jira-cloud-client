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
 * A screen with tab details.
 */
@Schema(description = "A screen with tab details.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-17T19:36:29.866+05:30[Asia/Kolkata]")
public class ScreenWithTab {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("scope")
  private AllOfScreenWithTabScope scope = null;

  @JsonProperty("tab")
  private AllOfScreenWithTabTab tab = null;

   /**
   * The ID of the screen.
   * @return id
  **/
  @Schema(description = "The ID of the screen.")
  public Long getId() {
    return id;
  }

   /**
   * The name of the screen.
   * @return name
  **/
  @Schema(description = "The name of the screen.")
  public String getName() {
    return name;
  }

   /**
   * The description of the screen.
   * @return description
  **/
  @Schema(description = "The description of the screen.")
  public String getDescription() {
    return description;
  }

  public ScreenWithTab scope(AllOfScreenWithTabScope scope) {
    this.scope = scope;
    return this;
  }

   /**
   * The scope of the screen.
   * @return scope
  **/
  @Schema(description = "The scope of the screen.")
  public AllOfScreenWithTabScope getScope() {
    return scope;
  }

  public void setScope(AllOfScreenWithTabScope scope) {
    this.scope = scope;
  }

  public ScreenWithTab tab(AllOfScreenWithTabTab tab) {
    this.tab = tab;
    return this;
  }

   /**
   * The tab for the screen
   * @return tab
  **/
  @Schema(description = "The tab for the screen")
  public AllOfScreenWithTabTab getTab() {
    return tab;
  }

  public void setTab(AllOfScreenWithTabTab tab) {
    this.tab = tab;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreenWithTab screenWithTab = (ScreenWithTab) o;
    return Objects.equals(this.id, screenWithTab.id) &&
        Objects.equals(this.name, screenWithTab.name) &&
        Objects.equals(this.description, screenWithTab.description) &&
        Objects.equals(this.scope, screenWithTab.scope) &&
        Objects.equals(this.tab, screenWithTab.tab);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, scope, tab);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreenWithTab {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    tab: ").append(toIndentedString(tab)).append("\n");
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
