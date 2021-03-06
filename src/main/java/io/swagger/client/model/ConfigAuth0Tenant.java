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
 * ConfigAuth0Tenant
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-20T09:54:33.803Z")
public class ConfigAuth0Tenant {
  @SerializedName("audience")
  private String audience = null;

  @SerializedName("clientid")
  private String clientid = null;

  @SerializedName("domain")
  private String domain = null;

  @SerializedName("users")
  private List<String> users = null;

  public ConfigAuth0Tenant audience(String audience) {
    this.audience = audience;
    return this;
  }

   /**
   * Get audience
   * @return audience
  **/
  @ApiModelProperty(value = "")
  public String getAudience() {
    return audience;
  }

  public void setAudience(String audience) {
    this.audience = audience;
  }

  public ConfigAuth0Tenant clientid(String clientid) {
    this.clientid = clientid;
    return this;
  }

   /**
   * Get clientid
   * @return clientid
  **/
  @ApiModelProperty(value = "")
  public String getClientid() {
    return clientid;
  }

  public void setClientid(String clientid) {
    this.clientid = clientid;
  }

  public ConfigAuth0Tenant domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @ApiModelProperty(value = "")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public ConfigAuth0Tenant users(List<String> users) {
    this.users = users;
    return this;
  }

  public ConfigAuth0Tenant addUsersItem(String usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<String>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @ApiModelProperty(value = "")
  public List<String> getUsers() {
    return users;
  }

  public void setUsers(List<String> users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigAuth0Tenant configAuth0Tenant = (ConfigAuth0Tenant) o;
    return Objects.equals(this.audience, configAuth0Tenant.audience) &&
        Objects.equals(this.clientid, configAuth0Tenant.clientid) &&
        Objects.equals(this.domain, configAuth0Tenant.domain) &&
        Objects.equals(this.users, configAuth0Tenant.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audience, clientid, domain, users);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigAuth0Tenant {\n");
    
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    clientid: ").append(toIndentedString(clientid)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

