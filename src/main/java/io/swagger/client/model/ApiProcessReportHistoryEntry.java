/*
 * datarhei Core API
 * Expose REST API for the datarhei Core
 *
 * OpenAPI spec version: 3.0
 * Contact: hello@datarhei.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiProcessReportHistoryEntry
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-20T09:54:33.803Z")
public class ApiProcessReportHistoryEntry {
  @SerializedName("created_at")
  private Integer createdAt = null;

  @SerializedName("log")
  private List<List<String>> log = null;

  @SerializedName("prelude")
  private List<String> prelude = null;

  public ApiProcessReportHistoryEntry createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public ApiProcessReportHistoryEntry log(List<List<String>> log) {
    this.log = log;
    return this;
  }

  public ApiProcessReportHistoryEntry addLogItem(List<String> logItem) {
    if (this.log == null) {
      this.log = new ArrayList<List<String>>();
    }
    this.log.add(logItem);
    return this;
  }

   /**
   * Get log
   * @return log
  **/
  @ApiModelProperty(value = "")
  public List<List<String>> getLog() {
    return log;
  }

  public void setLog(List<List<String>> log) {
    this.log = log;
  }

  public ApiProcessReportHistoryEntry prelude(List<String> prelude) {
    this.prelude = prelude;
    return this;
  }

  public ApiProcessReportHistoryEntry addPreludeItem(String preludeItem) {
    if (this.prelude == null) {
      this.prelude = new ArrayList<String>();
    }
    this.prelude.add(preludeItem);
    return this;
  }

   /**
   * Get prelude
   * @return prelude
  **/
  @ApiModelProperty(value = "")
  public List<String> getPrelude() {
    return prelude;
  }

  public void setPrelude(List<String> prelude) {
    this.prelude = prelude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiProcessReportHistoryEntry apiProcessReportHistoryEntry = (ApiProcessReportHistoryEntry) o;
    return Objects.equals(this.createdAt, apiProcessReportHistoryEntry.createdAt) &&
        Objects.equals(this.log, apiProcessReportHistoryEntry.log) &&
        Objects.equals(this.prelude, apiProcessReportHistoryEntry.prelude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, log, prelude);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiProcessReportHistoryEntry {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    log: ").append(toIndentedString(log)).append("\n");
    sb.append("    prelude: ").append(toIndentedString(prelude)).append("\n");
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

