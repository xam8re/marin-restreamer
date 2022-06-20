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
import io.swagger.client.model.ApiProgressIO;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiProgress
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-20T09:54:33.803Z")
public class ApiProgress {
  @SerializedName("bitrate_kbit")
  private BigDecimal bitrateKbit = null;

  @SerializedName("drop")
  private Integer drop = null;

  @SerializedName("dup")
  private Integer dup = null;

  @SerializedName("fps")
  private BigDecimal fps = null;

  @SerializedName("frame")
  private Integer frame = null;

  @SerializedName("inputs")
  private List<ApiProgressIO> inputs = null;

  @SerializedName("outputs")
  private List<ApiProgressIO> outputs = null;

  @SerializedName("packet")
  private Integer packet = null;

  @SerializedName("q")
  private BigDecimal q = null;

  @SerializedName("size_kb")
  private Integer sizeKb = null;

  @SerializedName("speed")
  private BigDecimal speed = null;

  @SerializedName("time")
  private BigDecimal time = null;

  public ApiProgress bitrateKbit(BigDecimal bitrateKbit) {
    this.bitrateKbit = bitrateKbit;
    return this;
  }

   /**
   * kbit/s
   * @return bitrateKbit
  **/
  @ApiModelProperty(value = "kbit/s")
  public BigDecimal getBitrateKbit() {
    return bitrateKbit;
  }

  public void setBitrateKbit(BigDecimal bitrateKbit) {
    this.bitrateKbit = bitrateKbit;
  }

  public ApiProgress drop(Integer drop) {
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

  public ApiProgress dup(Integer dup) {
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

  public ApiProgress fps(BigDecimal fps) {
    this.fps = fps;
    return this;
  }

   /**
   * Get fps
   * @return fps
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getFps() {
    return fps;
  }

  public void setFps(BigDecimal fps) {
    this.fps = fps;
  }

  public ApiProgress frame(Integer frame) {
    this.frame = frame;
    return this;
  }

   /**
   * Get frame
   * @return frame
  **/
  @ApiModelProperty(value = "")
  public Integer getFrame() {
    return frame;
  }

  public void setFrame(Integer frame) {
    this.frame = frame;
  }

  public ApiProgress inputs(List<ApiProgressIO> inputs) {
    this.inputs = inputs;
    return this;
  }

  public ApiProgress addInputsItem(ApiProgressIO inputsItem) {
    if (this.inputs == null) {
      this.inputs = new ArrayList<ApiProgressIO>();
    }
    this.inputs.add(inputsItem);
    return this;
  }

   /**
   * Get inputs
   * @return inputs
  **/
  @ApiModelProperty(value = "")
  public List<ApiProgressIO> getInputs() {
    return inputs;
  }

  public void setInputs(List<ApiProgressIO> inputs) {
    this.inputs = inputs;
  }

  public ApiProgress outputs(List<ApiProgressIO> outputs) {
    this.outputs = outputs;
    return this;
  }

  public ApiProgress addOutputsItem(ApiProgressIO outputsItem) {
    if (this.outputs == null) {
      this.outputs = new ArrayList<ApiProgressIO>();
    }
    this.outputs.add(outputsItem);
    return this;
  }

   /**
   * Get outputs
   * @return outputs
  **/
  @ApiModelProperty(value = "")
  public List<ApiProgressIO> getOutputs() {
    return outputs;
  }

  public void setOutputs(List<ApiProgressIO> outputs) {
    this.outputs = outputs;
  }

  public ApiProgress packet(Integer packet) {
    this.packet = packet;
    return this;
  }

   /**
   * Get packet
   * @return packet
  **/
  @ApiModelProperty(value = "")
  public Integer getPacket() {
    return packet;
  }

  public void setPacket(Integer packet) {
    this.packet = packet;
  }

  public ApiProgress q(BigDecimal q) {
    this.q = q;
    return this;
  }

   /**
   * Get q
   * @return q
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getQ() {
    return q;
  }

  public void setQ(BigDecimal q) {
    this.q = q;
  }

  public ApiProgress sizeKb(Integer sizeKb) {
    this.sizeKb = sizeKb;
    return this;
  }

   /**
   * kbytes
   * @return sizeKb
  **/
  @ApiModelProperty(value = "kbytes")
  public Integer getSizeKb() {
    return sizeKb;
  }

  public void setSizeKb(Integer sizeKb) {
    this.sizeKb = sizeKb;
  }

  public ApiProgress speed(BigDecimal speed) {
    this.speed = speed;
    return this;
  }

   /**
   * Get speed
   * @return speed
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getSpeed() {
    return speed;
  }

  public void setSpeed(BigDecimal speed) {
    this.speed = speed;
  }

  public ApiProgress time(BigDecimal time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTime() {
    return time;
  }

  public void setTime(BigDecimal time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiProgress apiProgress = (ApiProgress) o;
    return Objects.equals(this.bitrateKbit, apiProgress.bitrateKbit) &&
        Objects.equals(this.drop, apiProgress.drop) &&
        Objects.equals(this.dup, apiProgress.dup) &&
        Objects.equals(this.fps, apiProgress.fps) &&
        Objects.equals(this.frame, apiProgress.frame) &&
        Objects.equals(this.inputs, apiProgress.inputs) &&
        Objects.equals(this.outputs, apiProgress.outputs) &&
        Objects.equals(this.packet, apiProgress.packet) &&
        Objects.equals(this.q, apiProgress.q) &&
        Objects.equals(this.sizeKb, apiProgress.sizeKb) &&
        Objects.equals(this.speed, apiProgress.speed) &&
        Objects.equals(this.time, apiProgress.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bitrateKbit, drop, dup, fps, frame, inputs, outputs, packet, q, sizeKb, speed, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiProgress {\n");
    
    sb.append("    bitrateKbit: ").append(toIndentedString(bitrateKbit)).append("\n");
    sb.append("    drop: ").append(toIndentedString(drop)).append("\n");
    sb.append("    dup: ").append(toIndentedString(dup)).append("\n");
    sb.append("    fps: ").append(toIndentedString(fps)).append("\n");
    sb.append("    frame: ").append(toIndentedString(frame)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    packet: ").append(toIndentedString(packet)).append("\n");
    sb.append("    q: ").append(toIndentedString(q)).append("\n");
    sb.append("    sizeKb: ").append(toIndentedString(sizeKb)).append("\n");
    sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
