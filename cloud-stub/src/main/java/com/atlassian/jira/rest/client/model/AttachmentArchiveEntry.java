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
 * AttachmentArchiveEntry
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-17T19:36:29.866+05:30[Asia/Kolkata]")
public class AttachmentArchiveEntry {
  @JsonProperty("abbreviatedName")
  private String abbreviatedName = null;

  @JsonProperty("mediaType")
  private String mediaType = null;

  @JsonProperty("entryIndex")
  private Long entryIndex = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("size")
  private Long size = null;

  public AttachmentArchiveEntry abbreviatedName(String abbreviatedName) {
    this.abbreviatedName = abbreviatedName;
    return this;
  }

   /**
   * Get abbreviatedName
   * @return abbreviatedName
  **/
  @Schema(description = "")
  public String getAbbreviatedName() {
    return abbreviatedName;
  }

  public void setAbbreviatedName(String abbreviatedName) {
    this.abbreviatedName = abbreviatedName;
  }

  public AttachmentArchiveEntry mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

   /**
   * Get mediaType
   * @return mediaType
  **/
  @Schema(description = "")
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public AttachmentArchiveEntry entryIndex(Long entryIndex) {
    this.entryIndex = entryIndex;
    return this;
  }

   /**
   * Get entryIndex
   * @return entryIndex
  **/
  @Schema(description = "")
  public Long getEntryIndex() {
    return entryIndex;
  }

  public void setEntryIndex(Long entryIndex) {
    this.entryIndex = entryIndex;
  }

  public AttachmentArchiveEntry name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AttachmentArchiveEntry size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @Schema(description = "")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentArchiveEntry attachmentArchiveEntry = (AttachmentArchiveEntry) o;
    return Objects.equals(this.abbreviatedName, attachmentArchiveEntry.abbreviatedName) &&
        Objects.equals(this.mediaType, attachmentArchiveEntry.mediaType) &&
        Objects.equals(this.entryIndex, attachmentArchiveEntry.entryIndex) &&
        Objects.equals(this.name, attachmentArchiveEntry.name) &&
        Objects.equals(this.size, attachmentArchiveEntry.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abbreviatedName, mediaType, entryIndex, name, size);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentArchiveEntry {\n");
    
    sb.append("    abbreviatedName: ").append(toIndentedString(abbreviatedName)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    entryIndex: ").append(toIndentedString(entryIndex)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
