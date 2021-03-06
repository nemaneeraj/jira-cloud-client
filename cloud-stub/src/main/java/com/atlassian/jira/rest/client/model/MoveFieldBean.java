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
 * MoveFieldBean
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-17T19:36:29.866+05:30[Asia/Kolkata]")
public class MoveFieldBean {
  @JsonProperty("after")
  private String after = null;

  /**
   * The named position to which the screen tab field should be moved. Required if &#x60;after&#x60; isn&#x27;t provided.
   */
  public enum PositionEnum {
    EARLIER("Earlier"),
    LATER("Later"),
    FIRST("First"),
    LAST("Last");

    private String value;

    PositionEnum(String value) {
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
    public static PositionEnum fromValue(String text) {
      for (PositionEnum b : PositionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("position")
  private PositionEnum position = null;

  public MoveFieldBean after(String after) {
    this.after = after;
    return this;
  }

   /**
   * The ID of the screen tab field after which to place the moved screen tab field. Required if &#x60;position&#x60; isn&#x27;t provided.
   * @return after
  **/
  @Schema(description = "The ID of the screen tab field after which to place the moved screen tab field. Required if `position` isn't provided.")
  public String getAfter() {
    return after;
  }

  public void setAfter(String after) {
    this.after = after;
  }

  public MoveFieldBean position(PositionEnum position) {
    this.position = position;
    return this;
  }

   /**
   * The named position to which the screen tab field should be moved. Required if &#x60;after&#x60; isn&#x27;t provided.
   * @return position
  **/
  @Schema(description = "The named position to which the screen tab field should be moved. Required if `after` isn't provided.")
  public PositionEnum getPosition() {
    return position;
  }

  public void setPosition(PositionEnum position) {
    this.position = position;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveFieldBean moveFieldBean = (MoveFieldBean) o;
    return Objects.equals(this.after, moveFieldBean.after) &&
        Objects.equals(this.position, moveFieldBean.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(after, position);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveFieldBean {\n");
    
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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
