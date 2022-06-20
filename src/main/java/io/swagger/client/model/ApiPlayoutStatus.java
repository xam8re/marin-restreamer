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
import io.swagger.client.model.ApiPlayoutStatusIO;
import io.swagger.client.model.ApiPlayoutStatusSwap;
import java.io.IOException;

/**
 * ApiPlayoutStatus
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-20T09:54:33.803Z")
public class ApiPlayoutStatus {
  @SerializedName("aqueue")
  private Integer aqueue = null;

  @SerializedName("debug")
  private Object debug = null;

  @SerializedName("drop")
  private Integer drop = null;

  @SerializedName("dup")
  private Integer dup = null;

  @SerializedName("duplicating")
  private Boolean duplicating = null;

  @SerializedName("enc")
  private Integer enc = null;

  @SerializedName("gop")
  private String gop = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("input")
  private ApiPlayoutStatusIO input = null;

  @SerializedName("looping")
  private Boolean looping = null;

  @SerializedName("output")
  private ApiPlayoutStatusIO output = null;

  @SerializedName("queue")
  private Integer queue = null;

  @SerializedName("stream")
  private Integer stream = null;

  @SerializedName("swap")
  private ApiPlayoutStatusSwap swap = null;

  @SerializedName("url")
  private String url = null;

  public ApiPlayoutStatus aqueue(Integer aqueue) {
    this.aqueue = aqueue;
    return this;
  }

   /**
   * Get aqueue
   * @return aqueue
  **/
  @ApiModelProperty(value = "")
  public Integer getAqueue() {
    return aqueue;
  }

  public void setAqueue(Integer aqueue) {
    this.aqueue = aqueue;
  }

  public ApiPlayoutStatus debug(Object debug) {
    this.debug = debug;
    return this;
  }

   /**
   * Get debug
   * @return debug
  **/
  @ApiModelProperty(value = "")
  public Object getDebug() {
    return debug;
  }

  public void setDebug(Object debug) {
    this.debug = debug;
  }

  public ApiPlayoutStatus drop(Integer drop) {
    this.drop = drop;
    return this;
  }

   /**
   * Get drop
   * @return drop
  **/
  @ApiModelProperty(value = "")
  public Integer getDrop() {
    return drop;
  }

  public void setDrop(Integer drop) {
    this.drop = drop;
  }

  public ApiPlayoutStatus dup(Integer dup) {
    this.dup = dup;
    return this;
  }

   /**
   * Get dup
   * @return dup
  **/
  @ApiModelProperty(value = "")
  public Integer getDup() {
    return dup;
  }

  public void setDup(Integer dup) {
    this.dup = dup;
  }

  public ApiPlayoutStatus duplicating(Boolean duplicating) {
    this.duplicating = duplicating;
    return this;
  }

   /**
   * Get duplicating
   * @return duplicating
  **/
  @ApiModelProperty(value = "")
  public Boolean isDuplicating() {
    return duplicating;
  }

  public void setDuplicating(Boolean duplicating) {
    this.duplicating = duplicating;
  }

  public ApiPlayoutStatus enc(Integer enc) {
    this.enc = enc;
    return this;
  }

   /**
   * Get enc
   * @return enc
  **/
  @ApiModelProperty(value = "")
  public Integer getEnc() {
    return enc;
  }

  public void setEnc(Integer enc) {
    this.enc = enc;
  }

  public ApiPlayoutStatus gop(String gop) {
    this.gop = gop;
    return this;
  }

   /**
   * Get gop
   * @return gop
  **/
  @ApiModelProperty(value = "")
  public String getGop() {
    return gop;
  }

  public void setGop(String gop) {
    this.gop = gop;
  }

  public ApiPlayoutStatus id(String id) {
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

  public ApiPlayoutStatus input(ApiPlayoutStatusIO input) {
    this.input = input;
    return this;
  }

   /**
   * Get input
   * @return input
  **/
  @ApiModelProperty(value = "")
  public ApiPlayoutStatusIO getInput() {
    return input;
  }

  public void setInput(ApiPlayoutStatusIO input) {
    this.input = input;
  }

  public ApiPlayoutStatus looping(Boolean looping) {
    this.looping = looping;
    return this;
  }

   /**
   * Get looping
   * @return looping
  **/
  @ApiModelProperty(value = "")
  public Boolean isLooping() {
    return looping;
  }

  public void setLooping(Boolean looping) {
    this.looping = looping;
  }

  public ApiPlayoutStatus output(ApiPlayoutStatusIO output) {
    this.output = output;
    return this;
  }

   /**
   * Get output
   * @return output
  **/
  @ApiModelProperty(value = "")
  public ApiPlayoutStatusIO getOutput() {
    return output;
  }

  public void setOutput(ApiPlayoutStatusIO output) {
    this.output = output;
  }

  public ApiPlayoutStatus queue(Integer queue) {
    this.queue = queue;
    return this;
  }

   /**
   * Get queue
   * @return queue
  **/
  @ApiModelProperty(value = "")
  public Integer getQueue() {
    return queue;
  }

  public void setQueue(Integer queue) {
    this.queue = queue;
  }

  public ApiPlayoutStatus stream(Integer stream) {
    this.stream = stream;
    return this;
  }

   /**
   * Get stream
   * @return stream
  **/
  @ApiModelProperty(value = "")
  public Integer getStream() {
    return stream;
  }

  public void setStream(Integer stream) {
    this.stream = stream;
  }

  public ApiPlayoutStatus swap(ApiPlayoutStatusSwap swap) {
    this.swap = swap;
    return this;
  }

   /**
   * Get swap
   * @return swap
  **/
  @ApiModelProperty(value = "")
  public ApiPlayoutStatusSwap getSwap() {
    return swap;
  }

  public void setSwap(ApiPlayoutStatusSwap swap) {
    this.swap = swap;
  }

  public ApiPlayoutStatus url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiPlayoutStatus apiPlayoutStatus = (ApiPlayoutStatus) o;
    return Objects.equals(this.aqueue, apiPlayoutStatus.aqueue) &&
        Objects.equals(this.debug, apiPlayoutStatus.debug) &&
        Objects.equals(this.drop, apiPlayoutStatus.drop) &&
        Objects.equals(this.dup, apiPlayoutStatus.dup) &&
        Objects.equals(this.duplicating, apiPlayoutStatus.duplicating) &&
        Objects.equals(this.enc, apiPlayoutStatus.enc) &&
        Objects.equals(this.gop, apiPlayoutStatus.gop) &&
        Objects.equals(this.id, apiPlayoutStatus.id) &&
        Objects.equals(this.input, apiPlayoutStatus.input) &&
        Objects.equals(this.looping, apiPlayoutStatus.looping) &&
        Objects.equals(this.output, apiPlayoutStatus.output) &&
        Objects.equals(this.queue, apiPlayoutStatus.queue) &&
        Objects.equals(this.stream, apiPlayoutStatus.stream) &&
        Objects.equals(this.swap, apiPlayoutStatus.swap) &&
        Objects.equals(this.url, apiPlayoutStatus.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aqueue, debug, drop, dup, duplicating, enc, gop, id, input, looping, output, queue, stream, swap, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiPlayoutStatus {\n");
    
    sb.append("    aqueue: ").append(toIndentedString(aqueue)).append("\n");
    sb.append("    debug: ").append(toIndentedString(debug)).append("\n");
    sb.append("    drop: ").append(toIndentedString(drop)).append("\n");
    sb.append("    dup: ").append(toIndentedString(dup)).append("\n");
    sb.append("    duplicating: ").append(toIndentedString(duplicating)).append("\n");
    sb.append("    enc: ").append(toIndentedString(enc)).append("\n");
    sb.append("    gop: ").append(toIndentedString(gop)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    looping: ").append(toIndentedString(looping)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
    sb.append("    swap: ").append(toIndentedString(swap)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

