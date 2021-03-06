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
 * ApiCommand
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-20T09:54:33.803Z")
public class ApiCommand {
  /**
   * Gets or Sets command
   */
  @JsonAdapter(CommandEnum.Adapter.class)
  public enum CommandEnum {
    START("start"),
    
    STOP("stop"),
    
    RESTART("restart"),
    
    RELOAD("reload");

    private String value;

    CommandEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CommandEnum fromValue(String text) {
      for (CommandEnum b : CommandEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CommandEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CommandEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CommandEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CommandEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("command")
  private CommandEnum command = null;

  public ApiCommand command(CommandEnum command) {
    this.command = command;
    return this;
  }

   /**
   * Get command
   * @return command
  **/
  @ApiModelProperty(required = true, value = "")
  public CommandEnum getCommand() {
    return command;
  }

  public void setCommand(CommandEnum command) {
    this.command = command;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiCommand apiCommand = (ApiCommand) o;
    return Objects.equals(this.command, apiCommand.command);
  }

  @Override
  public int hashCode() {
    return Objects.hash(command);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiCommand {\n");
    
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
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

