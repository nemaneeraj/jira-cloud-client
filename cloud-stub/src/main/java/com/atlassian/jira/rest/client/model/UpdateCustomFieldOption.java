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
import com.atlassian.jira.rest.client.model.RenamedOption;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * Details of the options to update for a custom field.
 */
@Schema(description = "Details of the options to update for a custom field.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-17T19:36:29.866+05:30[Asia/Kolkata]")
public class UpdateCustomFieldOption {
  @JsonProperty("options")
  private List<RenamedOption> options = null;

  public UpdateCustomFieldOption options(List<RenamedOption> options) {
    this.options = options;
    return this;
  }

  public UpdateCustomFieldOption addOptionsItem(RenamedOption optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<RenamedOption>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Details of the options to update.
   * @return options
  **/
  @Schema(description = "Details of the options to update.")
  public List<RenamedOption> getOptions() {
    return options;
  }

  public void setOptions(List<RenamedOption> options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCustomFieldOption updateCustomFieldOption = (UpdateCustomFieldOption) o;
    return Objects.equals(this.options, updateCustomFieldOption.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCustomFieldOption {\n");
    
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
