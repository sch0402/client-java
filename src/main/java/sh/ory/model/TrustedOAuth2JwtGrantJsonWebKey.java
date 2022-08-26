/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.19
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
 * TrustedOAuth2JwtGrantJsonWebKey
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-26T08:08:53.586776858Z[Etc/UTC]")
public class TrustedOAuth2JwtGrantJsonWebKey {
  public static final String SERIALIZED_NAME_KID = "kid";
  @SerializedName(SERIALIZED_NAME_KID)
  private String kid;

  public static final String SERIALIZED_NAME_SET = "set";
  @SerializedName(SERIALIZED_NAME_SET)
  private String set;

  public TrustedOAuth2JwtGrantJsonWebKey() { 
  }

  public TrustedOAuth2JwtGrantJsonWebKey kid(String kid) {
    
    this.kid = kid;
    return this;
  }

   /**
   * The \&quot;key_id\&quot; is key unique identifier (same as kid header in jws/jwt).
   * @return kid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426655440000", value = "The \"key_id\" is key unique identifier (same as kid header in jws/jwt).")

  public String getKid() {
    return kid;
  }


  public void setKid(String kid) {
    this.kid = kid;
  }


  public TrustedOAuth2JwtGrantJsonWebKey set(String set) {
    
    this.set = set;
    return this;
  }

   /**
   * The \&quot;set\&quot; is basically a name for a group(set) of keys. Will be the same as \&quot;issuer\&quot; in grant.
   * @return set
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://jwt-idp.example.com", value = "The \"set\" is basically a name for a group(set) of keys. Will be the same as \"issuer\" in grant.")

  public String getSet() {
    return set;
  }


  public void setSet(String set) {
    this.set = set;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrustedOAuth2JwtGrantJsonWebKey trustedOAuth2JwtGrantJsonWebKey = (TrustedOAuth2JwtGrantJsonWebKey) o;
    return Objects.equals(this.kid, trustedOAuth2JwtGrantJsonWebKey.kid) &&
        Objects.equals(this.set, trustedOAuth2JwtGrantJsonWebKey.set);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kid, set);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrustedOAuth2JwtGrantJsonWebKey {\n");
    sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
    sb.append("    set: ").append(toIndentedString(set)).append("\n");
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

