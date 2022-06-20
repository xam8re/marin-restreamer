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
import io.swagger.client.model.ApiSessionPeers;
import io.swagger.client.model.ApiSessionStats;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ApiSessionSummarySummary
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-20T09:54:33.803Z")
public class ApiSessionSummarySummary {
  @SerializedName("local")
  private Map<String, ApiSessionStats> local = null;

  @SerializedName("reference")
  private Map<String, ApiSessionStats> reference = null;

  @SerializedName("remote")
  private Map<String, ApiSessionPeers> remote = null;

  @SerializedName("sessions")
  private Integer sessions = null;

  @SerializedName("traffic_rx_mb")
  private Integer trafficRxMb = null;

  @SerializedName("traffic_tx_mb")
  private Integer trafficTxMb = null;

  public ApiSessionSummarySummary local(Map<String, ApiSessionStats> local) {
    this.local = local;
    return this;
  }

  public ApiSessionSummarySummary putLocalItem(String key, ApiSessionStats localItem) {
    if (this.local == null) {
      this.local = new HashMap<String, ApiSessionStats>();
    }
    this.local.put(key, localItem);
    return this;
  }

   /**
   * Get local
   * @return local
  **/
  @ApiModelProperty(value = "")
  public Map<String, ApiSessionStats> getLocal() {
    return local;
  }

  public void setLocal(Map<String, ApiSessionStats> local) {
    this.local = local;
  }

  public ApiSessionSummarySummary reference(Map<String, ApiSessionStats> reference) {
    this.reference = reference;
    return this;
  }

  public ApiSessionSummarySummary putReferenceItem(String key, ApiSessionStats referenceItem) {
    if (this.reference == null) {
      this.reference = new HashMap<String, ApiSessionStats>();
    }
    this.reference.put(key, referenceItem);
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @ApiModelProperty(value = "")
  public Map<String, ApiSessionStats> getReference() {
    return reference;
  }

  public void setReference(Map<String, ApiSessionStats> reference) {
    this.reference = reference;
  }

  public ApiSessionSummarySummary remote(Map<String, ApiSessionPeers> remote) {
    this.remote = remote;
    return this;
  }

  public ApiSessionSummarySummary putRemoteItem(String key, ApiSessionPeers remoteItem) {
    if (this.remote == null) {
      this.remote = new HashMap<String, ApiSessionPeers>();
    }
    this.remote.put(key, remoteItem);
    return this;
  }

   /**
   * Get remote
   * @return remote
  **/
  @ApiModelProperty(value = "")
  public Map<String, ApiSessionPeers> getRemote() {
    return remote;
  }

  public void setRemote(Map<String, ApiSessionPeers> remote) {
    this.remote = remote;
  }

  public ApiSessionSummarySummary sessions(Integer sessions) {
    this.sessions = sessions;
    return this;
  }

   /**
   * Get sessions
   * @return sessions
  **/
  @ApiModelProperty(value = "")
  public Integer getSessions() {
    return sessions;
  }

  public void setSessions(Integer sessions) {
    this.sessions = sessions;
  }

  public ApiSessionSummarySummary trafficRxMb(Integer trafficRxMb) {
    this.trafficRxMb = trafficRxMb;
    return this;
  }

   /**
   * Get trafficRxMb
   * @return trafficRxMb
  **/
  @ApiModelProperty(value = "")
  public Integer getTrafficRxMb() {
    return trafficRxMb;
  }

  public void setTrafficRxMb(Integer trafficRxMb) {
    this.trafficRxMb = trafficRxMb;
  }

  public ApiSessionSummarySummary trafficTxMb(Integer trafficTxMb) {
    this.trafficTxMb = trafficTxMb;
    return this;
  }

   /**
   * Get trafficTxMb
   * @return trafficTxMb
  **/
  @ApiModelProperty(value = "")
  public Integer getTrafficTxMb() {
    return trafficTxMb;
  }

  public void setTrafficTxMb(Integer trafficTxMb) {
    this.trafficTxMb = trafficTxMb;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiSessionSummarySummary apiSessionSummarySummary = (ApiSessionSummarySummary) o;
    return Objects.equals(this.local, apiSessionSummarySummary.local) &&
        Objects.equals(this.reference, apiSessionSummarySummary.reference) &&
        Objects.equals(this.remote, apiSessionSummarySummary.remote) &&
        Objects.equals(this.sessions, apiSessionSummarySummary.sessions) &&
        Objects.equals(this.trafficRxMb, apiSessionSummarySummary.trafficRxMb) &&
        Objects.equals(this.trafficTxMb, apiSessionSummarySummary.trafficTxMb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(local, reference, remote, sessions, trafficRxMb, trafficTxMb);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiSessionSummarySummary {\n");
    
    sb.append("    local: ").append(toIndentedString(local)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    remote: ").append(toIndentedString(remote)).append("\n");
    sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
    sb.append("    trafficRxMb: ").append(toIndentedString(trafficRxMb)).append("\n");
    sb.append("    trafficTxMb: ").append(toIndentedString(trafficTxMb)).append("\n");
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
