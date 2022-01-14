/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.45
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
import sh.ory.model.SubmitSelfServiceSettingsFlowWithOidcMethodBody;
import sh.ory.model.SubmitSelfServiceSettingsFlowWithPasswordMethodBody;
import sh.ory.model.SubmitSelfServiceSettingsFlowWithProfileMethodBody;
import sh.ory.model.SubmitSelfServiceSettingsFlowWithTotpMethodBody;

/**
 * SubmitSelfServiceSettingsFlowBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-14T15:07:22.446521956Z[Etc/UTC]")
public class SubmitSelfServiceSettingsFlowBody {
  public static final String SERIALIZED_NAME_CSRF_TOKEN = "csrf_token";
  @SerializedName(SERIALIZED_NAME_CSRF_TOKEN)
  private String csrfToken;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  protected String method;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_TRAITS = "traits";
  @SerializedName(SERIALIZED_NAME_TRAITS)
  private Object traits;

  public static final String SERIALIZED_NAME_FLOW = "flow";
  @SerializedName(SERIALIZED_NAME_FLOW)
  private String flow;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link;

  public static final String SERIALIZED_NAME_UNLINK = "unlink";
  @SerializedName(SERIALIZED_NAME_UNLINK)
  private String unlink;

  public static final String SERIALIZED_NAME_TOTP_CODE = "totp_code";
  @SerializedName(SERIALIZED_NAME_TOTP_CODE)
  private String totpCode;

  public static final String SERIALIZED_NAME_TOTP_UNLINK = "totp_unlink";
  @SerializedName(SERIALIZED_NAME_TOTP_UNLINK)
  private Boolean totpUnlink;

  public SubmitSelfServiceSettingsFlowBody() {
    this.method = this.getClass().getSimpleName();
  }

  public SubmitSelfServiceSettingsFlowBody csrfToken(String csrfToken) {
    
    this.csrfToken = csrfToken;
    return this;
  }

   /**
   * CSRFToken is the anti-CSRF token
   * @return csrfToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CSRFToken is the anti-CSRF token")

  public String getCsrfToken() {
    return csrfToken;
  }


  public void setCsrfToken(String csrfToken) {
    this.csrfToken = csrfToken;
  }


  public SubmitSelfServiceSettingsFlowBody method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Method  Should be set to \&quot;totp\&quot; when trying to add, update, or remove a totp pairing.
   * @return method
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Method  Should be set to \"totp\" when trying to add, update, or remove a totp pairing.")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public SubmitSelfServiceSettingsFlowBody password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Password is the updated password
   * @return password
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Password is the updated password")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public SubmitSelfServiceSettingsFlowBody traits(Object traits) {
    
    this.traits = traits;
    return this;
  }

   /**
   * The identity&#39;s traits  in: body
   * @return traits
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The identity's traits  in: body")

  public Object getTraits() {
    return traits;
  }


  public void setTraits(Object traits) {
    this.traits = traits;
  }


  public SubmitSelfServiceSettingsFlowBody flow(String flow) {
    
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


  public SubmitSelfServiceSettingsFlowBody link(String link) {
    
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


  public SubmitSelfServiceSettingsFlowBody unlink(String unlink) {
    
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


  public SubmitSelfServiceSettingsFlowBody totpCode(String totpCode) {
    
    this.totpCode = totpCode;
    return this;
  }

   /**
   * ValidationTOTP must contain a valid TOTP based on the
   * @return totpCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ValidationTOTP must contain a valid TOTP based on the")

  public String getTotpCode() {
    return totpCode;
  }


  public void setTotpCode(String totpCode) {
    this.totpCode = totpCode;
  }


  public SubmitSelfServiceSettingsFlowBody totpUnlink(Boolean totpUnlink) {
    
    this.totpUnlink = totpUnlink;
    return this;
  }

   /**
   * UnlinkTOTP if true will remove the TOTP pairing, effectively removing the credential. This can be used to set up a new TOTP device.
   * @return totpUnlink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UnlinkTOTP if true will remove the TOTP pairing, effectively removing the credential. This can be used to set up a new TOTP device.")

  public Boolean getTotpUnlink() {
    return totpUnlink;
  }


  public void setTotpUnlink(Boolean totpUnlink) {
    this.totpUnlink = totpUnlink;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitSelfServiceSettingsFlowBody submitSelfServiceSettingsFlowBody = (SubmitSelfServiceSettingsFlowBody) o;
    return Objects.equals(this.csrfToken, submitSelfServiceSettingsFlowBody.csrfToken) &&
        Objects.equals(this.method, submitSelfServiceSettingsFlowBody.method) &&
        Objects.equals(this.password, submitSelfServiceSettingsFlowBody.password) &&
        Objects.equals(this.traits, submitSelfServiceSettingsFlowBody.traits) &&
        Objects.equals(this.flow, submitSelfServiceSettingsFlowBody.flow) &&
        Objects.equals(this.link, submitSelfServiceSettingsFlowBody.link) &&
        Objects.equals(this.unlink, submitSelfServiceSettingsFlowBody.unlink) &&
        Objects.equals(this.totpCode, submitSelfServiceSettingsFlowBody.totpCode) &&
        Objects.equals(this.totpUnlink, submitSelfServiceSettingsFlowBody.totpUnlink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(csrfToken, method, password, traits, flow, link, unlink, totpCode, totpUnlink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitSelfServiceSettingsFlowBody {\n");
    sb.append("    csrfToken: ").append(toIndentedString(csrfToken)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    traits: ").append(toIndentedString(traits)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    unlink: ").append(toIndentedString(unlink)).append("\n");
    sb.append("    totpCode: ").append(toIndentedString(totpCode)).append("\n");
    sb.append("    totpUnlink: ").append(toIndentedString(totpUnlink)).append("\n");
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

