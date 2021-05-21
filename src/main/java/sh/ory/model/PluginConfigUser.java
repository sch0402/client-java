/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.9
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.model;

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
 * PluginConfigUser plugin config user
 */
@ApiModel(description = "PluginConfigUser plugin config user")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-21T11:25:53.964221423Z[Etc/UTC]")
public class PluginConfigUser {
  public static final String SERIALIZED_NAME_G_I_D = "GID";
  @SerializedName(SERIALIZED_NAME_G_I_D)
  private Integer GID;

  public static final String SERIALIZED_NAME_U_I_D = "UID";
  @SerializedName(SERIALIZED_NAME_U_I_D)
  private Integer UID;


  public PluginConfigUser GID(Integer GID) {
    
    this.GID = GID;
    return this;
  }

   /**
   * g ID
   * @return GID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "g ID")

  public Integer getGID() {
    return GID;
  }


  public void setGID(Integer GID) {
    this.GID = GID;
  }


  public PluginConfigUser UID(Integer UID) {
    
    this.UID = UID;
    return this;
  }

   /**
   * UID
   * @return UID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UID")

  public Integer getUID() {
    return UID;
  }


  public void setUID(Integer UID) {
    this.UID = UID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginConfigUser pluginConfigUser = (PluginConfigUser) o;
    return Objects.equals(this.GID, pluginConfigUser.GID) &&
        Objects.equals(this.UID, pluginConfigUser.UID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(GID, UID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginConfigUser {\n");
    sb.append("    GID: ").append(toIndentedString(GID)).append("\n");
    sb.append("    UID: ").append(toIndentedString(UID)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

