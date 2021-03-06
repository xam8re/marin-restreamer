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
import io.swagger.client.model.ApiProcessConfigIOCleanup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiProcessConfigIO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-20T09:54:33.803Z")
public class ApiProcessConfigIO {
  @SerializedName("address")
  private String address = null;

  @SerializedName("cleanup")
  private List<ApiProcessConfigIOCleanup> cleanup = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("options")
  private List<String> options = null;

  public ApiProcessConfigIO address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public ApiProcessConfigIO cleanup(List<ApiProcessConfigIOCleanup> cleanup) {
    this.cleanup = cleanup;
    return this;
  }

  public ApiProcessConfigIO addCleanupItem(ApiProcessConfigIOCleanup cleanupItem) {
    if (this.cleanup == null) {
      this.cleanup = new ArrayList<ApiProcessConfigIOCleanup>();
    }
    this.cleanup.add(cleanupItem);
    return this;
  }

   /**
   * Get cleanup
   * @return cleanup
  **/
  @ApiModelProperty(value = "")
  public List<ApiProcessConfigIOCleanup> getCleanup() {
    return cleanup;
  }

  public void setCleanup(List<ApiProcessConfigIOCleanup> cleanup) {
    this.cleanup = cleanup;
  }

  public ApiProcessConfigIO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ApiProcessConfigIO options(List<String> options) {
    this.options = options;
    return this;
  }

  public ApiProcessConfigIO addOptionsItem(String optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<String>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @ApiModelProperty(value = "")
  public List<String> getOptions() {
    return options;
  }

  public void setOptions(List<String> options) {
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
    ApiProcessConfigIO apiProcessConfigIO = (ApiProcessConfigIO) o;
    return Objects.equals(this.address, apiProcessConfigIO.address) &&
        Objects.equals(this.cleanup, apiProcessConfigIO.cleanup) &&
        Objects.equals(this.id, apiProcessConfigIO.id) &&
        Objects.equals(this.options, apiProcessConfigIO.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, cleanup, id, options);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiProcessConfigIO {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    cleanup: ").append(toIndentedString(cleanup)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

