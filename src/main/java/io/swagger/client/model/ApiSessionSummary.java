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
import io.swagger.client.model.ApiSessionSummaryActive;
import io.swagger.client.model.ApiSessionSummarySummary;
import java.io.IOException;

/**
 * ApiSessionSummary
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-20T09:54:33.803Z")
public class ApiSessionSummary {
  @SerializedName("active")
  private ApiSessionSummaryActive active = null;

  @SerializedName("summary")
  private ApiSessionSummarySummary summary = null;

  public ApiSessionSummary active(ApiSessionSummaryActive active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public ApiSessionSummaryActive getActive() {
    return active;
  }

  public void setActive(ApiSessionSummaryActive active) {
    this.active = active;
  }

  public ApiSessionSummary summary(ApiSessionSummarySummary summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @ApiModelProperty(value = "")
  public ApiSessionSummarySummary getSummary() {
    return summary;
  }

  public void setSummary(ApiSessionSummarySummary summary) {
    this.summary = summary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiSessionSummary apiSessionSummary = (ApiSessionSummary) o;
    return Objects.equals(this.active, apiSessionSummary.active) &&
        Objects.equals(this.summary, apiSessionSummary.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, summary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiSessionSummary {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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

