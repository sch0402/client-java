/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.56
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
 * SelfServiceLogoutUrl
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-20T21:47:26.946019758Z[Etc/UTC]")
public class SelfServiceLogoutUrl {
  public static final String SERIALIZED_NAME_LOGOUT_TOKEN = "logout_token";
  @SerializedName(SERIALIZED_NAME_LOGOUT_TOKEN)
  private String logoutToken;

  public static final String SERIALIZED_NAME_LOGOUT_URL = "logout_url";
  @SerializedName(SERIALIZED_NAME_LOGOUT_URL)
  private String logoutUrl;


  public SelfServiceLogoutUrl logoutToken(String logoutToken) {
    
    this.logoutToken = logoutToken;
    return this;
  }

   /**
   * LogoutToken can be used to perform logout using AJAX.
   * @return logoutToken
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "LogoutToken can be used to perform logout using AJAX.")

  public String getLogoutToken() {
    return logoutToken;
  }


  public void setLogoutToken(String logoutToken) {
    this.logoutToken = logoutToken;
  }


  public SelfServiceLogoutUrl logoutUrl(String logoutUrl) {
    
    this.logoutUrl = logoutUrl;
    return this;
  }

   /**
   * LogoutURL can be opened in a browser to sign the user out.  format: uri
   * @return logoutUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "LogoutURL can be opened in a browser to sign the user out.  format: uri")

  public String getLogoutUrl() {
    return logoutUrl;
  }


  public void setLogoutUrl(String logoutUrl) {
    this.logoutUrl = logoutUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelfServiceLogoutUrl selfServiceLogoutUrl = (SelfServiceLogoutUrl) o;
    return Objects.equals(this.logoutToken, selfServiceLogoutUrl.logoutToken) &&
        Objects.equals(this.logoutUrl, selfServiceLogoutUrl.logoutUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logoutToken, logoutUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelfServiceLogoutUrl {\n");
    sb.append("    logoutToken: ").append(toIndentedString(logoutToken)).append("\n");
    sb.append("    logoutUrl: ").append(toIndentedString(logoutUrl)).append("\n");
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

