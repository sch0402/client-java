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
import sh.ory.model.SubmitSelfServiceLoginFlowWithOidcMethodBody;
import sh.ory.model.SubmitSelfServiceLoginFlowWithPasswordMethodBody;
import sh.ory.model.SubmitSelfServiceLoginFlowWithTotpMethodBody;

/**
 * SubmitSelfServiceLoginFlowBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-14T15:07:22.446521956Z[Etc/UTC]")
public class SubmitSelfServiceLoginFlowBody {
  public static final String SERIALIZED_NAME_CSRF_TOKEN = "csrf_token";
  @SerializedName(SERIALIZED_NAME_CSRF_TOKEN)
  private String csrfToken;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  protected String method;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PASSWORD_IDENTIFIER = "password_identifier";
  @SerializedName(SERIALIZED_NAME_PASSWORD_IDENTIFIER)
  private String passwordIdentifier;

  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private String provider;

  public static final String SERIALIZED_NAME_TRAITS = "traits";
  @SerializedName(SERIALIZED_NAME_TRAITS)
  private Object traits;

  public static final String SERIALIZED_NAME_TOTP_CODE = "totp_code";
  @SerializedName(SERIALIZED_NAME_TOTP_CODE)
  private String totpCode;

  public SubmitSelfServiceLoginFlowBody() {
    this.method = this.getClass().getSimpleName();
  }

  public SubmitSelfServiceLoginFlowBody csrfToken(String csrfToken) {
    
    this.csrfToken = csrfToken;
    return this;
  }

   /**
   * Sending the anti-csrf token is only required for browser login flows.
   * @return csrfToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sending the anti-csrf token is only required for browser login flows.")

  public String getCsrfToken() {
    return csrfToken;
  }


  public void setCsrfToken(String csrfToken) {
    this.csrfToken = csrfToken;
  }


  public SubmitSelfServiceLoginFlowBody method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Method should be set to \&quot;totp\&quot; when logging in using the TOTP strategy.
   * @return method
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Method should be set to \"totp\" when logging in using the TOTP strategy.")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public SubmitSelfServiceLoginFlowBody password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * The user&#39;s password.
   * @return password
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The user's password.")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public SubmitSelfServiceLoginFlowBody passwordIdentifier(String passwordIdentifier) {
    
    this.passwordIdentifier = passwordIdentifier;
    return this;
  }

   /**
   * Identifier is the email or username of the user trying to log in.
   * @return passwordIdentifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Identifier is the email or username of the user trying to log in.")

  public String getPasswordIdentifier() {
    return passwordIdentifier;
  }


  public void setPasswordIdentifier(String passwordIdentifier) {
    this.passwordIdentifier = passwordIdentifier;
  }


  public SubmitSelfServiceLoginFlowBody provider(String provider) {
    
    this.provider = provider;
    return this;
  }

   /**
   * The provider to register with
   * @return provider
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The provider to register with")

  public String getProvider() {
    return provider;
  }


  public void setProvider(String provider) {
    this.provider = provider;
  }


  public SubmitSelfServiceLoginFlowBody traits(Object traits) {
    
    this.traits = traits;
    return this;
  }

   /**
   * The identity traits. This is a placeholder for the registration flow.
   * @return traits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The identity traits. This is a placeholder for the registration flow.")

  public Object getTraits() {
    return traits;
  }


  public void setTraits(Object traits) {
    this.traits = traits;
  }


  public SubmitSelfServiceLoginFlowBody totpCode(String totpCode) {
    
    this.totpCode = totpCode;
    return this;
  }

   /**
   * The TOTP code.
   * @return totpCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The TOTP code.")

  public String getTotpCode() {
    return totpCode;
  }


  public void setTotpCode(String totpCode) {
    this.totpCode = totpCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitSelfServiceLoginFlowBody submitSelfServiceLoginFlowBody = (SubmitSelfServiceLoginFlowBody) o;
    return Objects.equals(this.csrfToken, submitSelfServiceLoginFlowBody.csrfToken) &&
        Objects.equals(this.method, submitSelfServiceLoginFlowBody.method) &&
        Objects.equals(this.password, submitSelfServiceLoginFlowBody.password) &&
        Objects.equals(this.passwordIdentifier, submitSelfServiceLoginFlowBody.passwordIdentifier) &&
        Objects.equals(this.provider, submitSelfServiceLoginFlowBody.provider) &&
        Objects.equals(this.traits, submitSelfServiceLoginFlowBody.traits) &&
        Objects.equals(this.totpCode, submitSelfServiceLoginFlowBody.totpCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(csrfToken, method, password, passwordIdentifier, provider, traits, totpCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitSelfServiceLoginFlowBody {\n");
    sb.append("    csrfToken: ").append(toIndentedString(csrfToken)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    passwordIdentifier: ").append(toIndentedString(passwordIdentifier)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    traits: ").append(toIndentedString(traits)).append("\n");
    sb.append("    totpCode: ").append(toIndentedString(totpCode)).append("\n");
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

