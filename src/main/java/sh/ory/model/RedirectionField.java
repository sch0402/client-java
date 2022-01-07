/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.42
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
 * RedirectionField
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-07T20:26:34.917598036Z[Etc/UTC]")
public class RedirectionField {
  public static final String SERIALIZED_NAME_MAIN = "main";
  @SerializedName(SERIALIZED_NAME_MAIN)
  private String main;

  public static final String SERIALIZED_NAME_OIDC = "oidc";
  @SerializedName(SERIALIZED_NAME_OIDC)
  private String oidc;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PROFILE = "profile";
  @SerializedName(SERIALIZED_NAME_PROFILE)
  private String profile;


  public RedirectionField main(String main) {
    
    this.main = main;
    return this;
  }

   /**
   * Get main
   * @return main
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMain() {
    return main;
  }


  public void setMain(String main) {
    this.main = main;
  }


  public RedirectionField oidc(String oidc) {
    
    this.oidc = oidc;
    return this;
  }

   /**
   * Get oidc
   * @return oidc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOidc() {
    return oidc;
  }


  public void setOidc(String oidc) {
    this.oidc = oidc;
  }


  public RedirectionField password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public RedirectionField profile(String profile) {
    
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProfile() {
    return profile;
  }


  public void setProfile(String profile) {
    this.profile = profile;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedirectionField redirectionField = (RedirectionField) o;
    return Objects.equals(this.main, redirectionField.main) &&
        Objects.equals(this.oidc, redirectionField.oidc) &&
        Objects.equals(this.password, redirectionField.password) &&
        Objects.equals(this.profile, redirectionField.profile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(main, oidc, password, profile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedirectionField {\n");
    sb.append("    main: ").append(toIndentedString(main)).append("\n");
    sb.append("    oidc: ").append(toIndentedString(oidc)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
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

