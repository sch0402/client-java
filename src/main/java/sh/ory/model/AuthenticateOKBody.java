/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.17
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
 * AuthenticateOKBody authenticate o k body
 */
@ApiModel(description = "AuthenticateOKBody authenticate o k body")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-01T10:37:52.194203415Z[Etc/UTC]")
public class AuthenticateOKBody {
  public static final String SERIALIZED_NAME_IDENTITY_TOKEN = "IdentityToken";
  @SerializedName(SERIALIZED_NAME_IDENTITY_TOKEN)
  private String identityToken;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;


  public AuthenticateOKBody identityToken(String identityToken) {
    
    this.identityToken = identityToken;
    return this;
  }

   /**
   * An opaque token used to authenticate a user after a successful login
   * @return identityToken
  **/
  @ApiModelProperty(required = true, value = "An opaque token used to authenticate a user after a successful login")

  public String getIdentityToken() {
    return identityToken;
  }


  public void setIdentityToken(String identityToken) {
    this.identityToken = identityToken;
  }


  public AuthenticateOKBody status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the authentication
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The status of the authentication")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticateOKBody authenticateOKBody = (AuthenticateOKBody) o;
    return Objects.equals(this.identityToken, authenticateOKBody.identityToken) &&
        Objects.equals(this.status, authenticateOKBody.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identityToken, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticateOKBody {\n");
    sb.append("    identityToken: ").append(toIndentedString(identityToken)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

