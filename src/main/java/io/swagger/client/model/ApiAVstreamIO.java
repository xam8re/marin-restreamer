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

/**
 * ApiAVstreamIO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-20T09:54:33.803Z")
public class ApiAVstreamIO {
  @SerializedName("packet")
  private Integer packet = null;

  @SerializedName("size_kb")
  private Integer sizeKb = null;

  /**
   * Gets or Sets state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    RUNNING("running"),
    
    IDLE("idle");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("time")
  private Integer time = null;

  public ApiAVstreamIO packet(Integer packet) {
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

  public ApiAVstreamIO sizeKb(Integer sizeKb) {
    this.sizeKb = sizeKb;
    return this;
  }

   /**
   * Get sizeKb
   * @return sizeKb
  **/
  @ApiModelProperty(value = "")
  public Integer getSizeKb() {
    return sizeKb;
  }

  public void setSizeKb(Integer sizeKb) {
    this.sizeKb = sizeKb;
  }

  public ApiAVstreamIO state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public ApiAVstreamIO time(Integer time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(value = "")
  public Integer getTime() {
    return time;
  }

  public void setTime(Integer time) {
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
    ApiAVstreamIO apiAVstreamIO = (ApiAVstreamIO) o;
    return Objects.equals(this.packet, apiAVstreamIO.packet) &&
        Objects.equals(this.sizeKb, apiAVstreamIO.sizeKb) &&
        Objects.equals(this.state, apiAVstreamIO.state) &&
        Objects.equals(this.time, apiAVstreamIO.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packet, sizeKb, state, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiAVstreamIO {\n");
    
    sb.append("    packet: ").append(toIndentedString(packet)).append("\n");
    sb.append("    sizeKb: ").append(toIndentedString(sizeKb)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

