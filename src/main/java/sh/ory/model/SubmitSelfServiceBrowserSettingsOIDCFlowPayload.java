/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.11
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
 * SubmitSelfServiceBrowserSettingsOIDCFlowPayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-07T09:16:24.404833525Z[Etc/UTC]")
public class SubmitSelfServiceBrowserSettingsOIDCFlowPayload {
  public static final String SERIALIZED_NAME_FLOW = "flow";
  @SerializedName(SERIALIZED_NAME_FLOW)
  private String flow;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link;

  public static final String SERIALIZED_NAME_UNLINK = "unlink";
  @SerializedName(SERIALIZED_NAME_UNLINK)
  private String unlink;


  public SubmitSelfServiceBrowserSettingsOIDCFlowPayload flow(String flow) {
    
    this.flow = flow;
    return this;
  }

   /**
   * Flow ID is the flow&#39;s ID.  in: query
   * @return flow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Flow ID is the flow's ID.  in: query")

  public String getFlow() {
    return flow;
  }


  public void setFlow(String flow) {
    this.flow = flow;
  }


  public SubmitSelfServiceBrowserSettingsOIDCFlowPayload link(String link) {
    
    this.link = link;
    return this;
  }

   /**
   * Link this provider  Either this or &#x60;unlink&#x60; must be set.  type: string in: body
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Link this provider  Either this or `unlink` must be set.  type: string in: body")

  public String getLink() {
    return link;
  }


  public void setLink(String link) {
    this.link = link;
  }


  public SubmitSelfServiceBrowserSettingsOIDCFlowPayload unlink(String unlink) {
    
    this.unlink = unlink;
    return this;
  }

   /**
   * Unlink this provider  Either this or &#x60;link&#x60; must be set.  type: string in: body
   * @return unlink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unlink this provider  Either this or `link` must be set.  type: string in: body")

  public String getUnlink() {
    return unlink;
  }


  public void setUnlink(String unlink) {
    this.unlink = unlink;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitSelfServiceBrowserSettingsOIDCFlowPayload submitSelfServiceBrowserSettingsOIDCFlowPayload = (SubmitSelfServiceBrowserSettingsOIDCFlowPayload) o;
    return Objects.equals(this.flow, submitSelfServiceBrowserSettingsOIDCFlowPayload.flow) &&
        Objects.equals(this.link, submitSelfServiceBrowserSettingsOIDCFlowPayload.link) &&
        Objects.equals(this.unlink, submitSelfServiceBrowserSettingsOIDCFlowPayload.unlink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flow, link, unlink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitSelfServiceBrowserSettingsOIDCFlowPayload {\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    unlink: ").append(toIndentedString(unlink)).append("\n");
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

