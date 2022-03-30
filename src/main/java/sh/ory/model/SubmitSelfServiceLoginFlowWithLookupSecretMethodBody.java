/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.149
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
 * SubmitSelfServiceLoginFlowWithLookupSecretMethodBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-30T13:47:28.174373706Z[Etc/UTC]")
public class SubmitSelfServiceLoginFlowWithLookupSecretMethodBody {
  public static final String SERIALIZED_NAME_CSRF_TOKEN = "csrf_token";
  @SerializedName(SERIALIZED_NAME_CSRF_TOKEN)
  private String csrfToken;

  public static final String SERIALIZED_NAME_LOOKUP_SECRET = "lookup_secret";
  @SerializedName(SERIALIZED_NAME_LOOKUP_SECRET)
  private String lookupSecret;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public SubmitSelfServiceLoginFlowWithLookupSecretMethodBody() { 
  }

  public SubmitSelfServiceLoginFlowWithLookupSecretMethodBody csrfToken(String csrfToken) {
    
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


  public SubmitSelfServiceLoginFlowWithLookupSecretMethodBody lookupSecret(String lookupSecret) {
    
    this.lookupSecret = lookupSecret;
    return this;
  }

   /**
   * The lookup secret.
   * @return lookupSecret
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The lookup secret.")

  public String getLookupSecret() {
    return lookupSecret;
  }


  public void setLookupSecret(String lookupSecret) {
    this.lookupSecret = lookupSecret;
  }


  public SubmitSelfServiceLoginFlowWithLookupSecretMethodBody method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Method should be set to \&quot;lookup_secret\&quot; when logging in using the lookup_secret strategy.
   * @return method
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Method should be set to \"lookup_secret\" when logging in using the lookup_secret strategy.")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitSelfServiceLoginFlowWithLookupSecretMethodBody submitSelfServiceLoginFlowWithLookupSecretMethodBody = (SubmitSelfServiceLoginFlowWithLookupSecretMethodBody) o;
    return Objects.equals(this.csrfToken, submitSelfServiceLoginFlowWithLookupSecretMethodBody.csrfToken) &&
        Objects.equals(this.lookupSecret, submitSelfServiceLoginFlowWithLookupSecretMethodBody.lookupSecret) &&
        Objects.equals(this.method, submitSelfServiceLoginFlowWithLookupSecretMethodBody.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(csrfToken, lookupSecret, method);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitSelfServiceLoginFlowWithLookupSecretMethodBody {\n");
    sb.append("    csrfToken: ").append(toIndentedString(csrfToken)).append("\n");
    sb.append("    lookupSecret: ").append(toIndentedString(lookupSecret)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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

