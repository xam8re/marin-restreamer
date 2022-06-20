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
import io.swagger.client.model.ApiAVstreamIO;
import java.io.IOException;

/**
 * ApiAVstream
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-20T09:54:33.803Z")
public class ApiAVstream {
  @SerializedName("aqueue")
  private Integer aqueue = null;

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

  @SerializedName("input")
  private ApiAVstreamIO input = null;

  @SerializedName("looping")
  private Boolean looping = null;

  @SerializedName("output")
  private ApiAVstreamIO output = null;

  @SerializedName("queue")
  private Integer queue = null;

  public ApiAVstream aqueue(Integer aqueue) {
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

  public ApiAVstream drop(Integer drop) {
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

  public ApiAVstream dup(Integer dup) {
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

  public ApiAVstream duplicating(Boolean duplicating) {
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

  public ApiAVstream enc(Integer enc) {
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

  public ApiAVstream gop(String gop) {
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

  public ApiAVstream input(ApiAVstreamIO input) {
    this.input = input;
    return this;
  }

   /**
   * Get input
   * @return input
  **/
  @ApiModelProperty(value = "")
  public ApiAVstreamIO getInput() {
    return input;
  }

  public void setInput(ApiAVstreamIO input) {
    this.input = input;
  }

  public ApiAVstream looping(Boolean looping) {
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

  public ApiAVstream output(ApiAVstreamIO output) {
    this.output = output;
    return this;
  }

   /**
   * Get output
   * @return output
  **/
  @ApiModelProperty(value = "")
  public ApiAVstreamIO getOutput() {
    return output;
  }

  public void setOutput(ApiAVstreamIO output) {
    this.output = output;
  }

  public ApiAVstream queue(Integer queue) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiAVstream apiAVstream = (ApiAVstream) o;
    return Objects.equals(this.aqueue, apiAVstream.aqueue) &&
        Objects.equals(this.drop, apiAVstream.drop) &&
        Objects.equals(this.dup, apiAVstream.dup) &&
        Objects.equals(this.duplicating, apiAVstream.duplicating) &&
        Objects.equals(this.enc, apiAVstream.enc) &&
        Objects.equals(this.gop, apiAVstream.gop) &&
        Objects.equals(this.input, apiAVstream.input) &&
        Objects.equals(this.looping, apiAVstream.looping) &&
        Objects.equals(this.output, apiAVstream.output) &&
        Objects.equals(this.queue, apiAVstream.queue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aqueue, drop, dup, duplicating, enc, gop, input, looping, output, queue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiAVstream {\n");
    
    sb.append("    aqueue: ").append(toIndentedString(aqueue)).append("\n");
    sb.append("    drop: ").append(toIndentedString(drop)).append("\n");
    sb.append("    dup: ").append(toIndentedString(dup)).append("\n");
    sb.append("    duplicating: ").append(toIndentedString(duplicating)).append("\n");
    sb.append("    enc: ").append(toIndentedString(enc)).append("\n");
    sb.append("    gop: ").append(toIndentedString(gop)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    looping: ").append(toIndentedString(looping)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
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
