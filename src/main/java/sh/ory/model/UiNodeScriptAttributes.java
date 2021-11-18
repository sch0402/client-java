/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.23
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
 * UiNodeScriptAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-18T10:15:58.140655562Z[Etc/UTC]")
public class UiNodeScriptAttributes {
  public static final String SERIALIZED_NAME_ASYNC = "async";
  @SerializedName(SERIALIZED_NAME_ASYNC)
  private Boolean async;

  public static final String SERIALIZED_NAME_CROSSORIGIN = "crossorigin";
  @SerializedName(SERIALIZED_NAME_CROSSORIGIN)
  private String crossorigin;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INTEGRITY = "integrity";
  @SerializedName(SERIALIZED_NAME_INTEGRITY)
  private String integrity;

  public static final String SERIALIZED_NAME_NODE_TYPE = "node_type";
  @SerializedName(SERIALIZED_NAME_NODE_TYPE)
  private String nodeType;

  public static final String SERIALIZED_NAME_REFERRERPOLICY = "referrerpolicy";
  @SerializedName(SERIALIZED_NAME_REFERRERPOLICY)
  private String referrerpolicy;

  public static final String SERIALIZED_NAME_SRC = "src";
  @SerializedName(SERIALIZED_NAME_SRC)
  private String src;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public UiNodeScriptAttributes async(Boolean async) {
    
    this.async = async;
    return this;
  }

   /**
   * The script async type
   * @return async
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The script async type")

  public Boolean getAsync() {
    return async;
  }


  public void setAsync(Boolean async) {
    this.async = async;
  }


  public UiNodeScriptAttributes crossorigin(String crossorigin) {
    
    this.crossorigin = crossorigin;
    return this;
  }

   /**
   * The script cross origin policy
   * @return crossorigin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The script cross origin policy")

  public String getCrossorigin() {
    return crossorigin;
  }


  public void setCrossorigin(String crossorigin) {
    this.crossorigin = crossorigin;
  }


  public UiNodeScriptAttributes id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * A unique identifier
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A unique identifier")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public UiNodeScriptAttributes integrity(String integrity) {
    
    this.integrity = integrity;
    return this;
  }

   /**
   * The script&#39;s integrity hash
   * @return integrity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The script's integrity hash")

  public String getIntegrity() {
    return integrity;
  }


  public void setIntegrity(String integrity) {
    this.integrity = integrity;
  }


  public UiNodeScriptAttributes nodeType(String nodeType) {
    
    this.nodeType = nodeType;
    return this;
  }

   /**
   * Get nodeType
   * @return nodeType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getNodeType() {
    return nodeType;
  }


  public void setNodeType(String nodeType) {
    this.nodeType = nodeType;
  }


  public UiNodeScriptAttributes referrerpolicy(String referrerpolicy) {
    
    this.referrerpolicy = referrerpolicy;
    return this;
  }

   /**
   * The script referrer policy
   * @return referrerpolicy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The script referrer policy")

  public String getReferrerpolicy() {
    return referrerpolicy;
  }


  public void setReferrerpolicy(String referrerpolicy) {
    this.referrerpolicy = referrerpolicy;
  }


  public UiNodeScriptAttributes src(String src) {
    
    this.src = src;
    return this;
  }

   /**
   * The script source
   * @return src
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The script source")

  public String getSrc() {
    return src;
  }


  public void setSrc(String src) {
    this.src = src;
  }


  public UiNodeScriptAttributes type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The script MIME type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The script MIME type")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UiNodeScriptAttributes uiNodeScriptAttributes = (UiNodeScriptAttributes) o;
    return Objects.equals(this.async, uiNodeScriptAttributes.async) &&
        Objects.equals(this.crossorigin, uiNodeScriptAttributes.crossorigin) &&
        Objects.equals(this.id, uiNodeScriptAttributes.id) &&
        Objects.equals(this.integrity, uiNodeScriptAttributes.integrity) &&
        Objects.equals(this.nodeType, uiNodeScriptAttributes.nodeType) &&
        Objects.equals(this.referrerpolicy, uiNodeScriptAttributes.referrerpolicy) &&
        Objects.equals(this.src, uiNodeScriptAttributes.src) &&
        Objects.equals(this.type, uiNodeScriptAttributes.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(async, crossorigin, id, integrity, nodeType, referrerpolicy, src, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UiNodeScriptAttributes {\n");
    sb.append("    async: ").append(toIndentedString(async)).append("\n");
    sb.append("    crossorigin: ").append(toIndentedString(crossorigin)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    integrity: ").append(toIndentedString(integrity)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    referrerpolicy: ").append(toIndentedString(referrerpolicy)).append("\n");
    sb.append("    src: ").append(toIndentedString(src)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

