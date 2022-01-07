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
import java.util.ArrayList;
import java.util.List;
import sh.ory.model.RedirectionField;

/**
 * RedirectionConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-07T20:26:34.917598036Z[Etc/UTC]")
public class RedirectionConfig {
  public static final String SERIALIZED_NAME_GLOBAL = "global";
  @SerializedName(SERIALIZED_NAME_GLOBAL)
  private RedirectionField global;

  public static final String SERIALIZED_NAME_LOGIN = "login";
  @SerializedName(SERIALIZED_NAME_LOGIN)
  private RedirectionField login;

  public static final String SERIALIZED_NAME_LOGOUT = "logout";
  @SerializedName(SERIALIZED_NAME_LOGOUT)
  private RedirectionField logout;

  public static final String SERIALIZED_NAME_RECOVERY = "recovery";
  @SerializedName(SERIALIZED_NAME_RECOVERY)
  private RedirectionField recovery;

  public static final String SERIALIZED_NAME_REGISTRATION = "registration";
  @SerializedName(SERIALIZED_NAME_REGISTRATION)
  private RedirectionField registration;

  public static final String SERIALIZED_NAME_SETTINGS = "settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  private RedirectionField settings;

  public static final String SERIALIZED_NAME_URL_ALLOWLIST = "url_allowlist";
  @SerializedName(SERIALIZED_NAME_URL_ALLOWLIST)
  private List<String> urlAllowlist = null;

  public static final String SERIALIZED_NAME_VERIFICATION = "verification";
  @SerializedName(SERIALIZED_NAME_VERIFICATION)
  private RedirectionField verification;


  public RedirectionConfig global(RedirectionField global) {
    
    this.global = global;
    return this;
  }

   /**
   * Get global
   * @return global
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RedirectionField getGlobal() {
    return global;
  }


  public void setGlobal(RedirectionField global) {
    this.global = global;
  }


  public RedirectionConfig login(RedirectionField login) {
    
    this.login = login;
    return this;
  }

   /**
   * Get login
   * @return login
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RedirectionField getLogin() {
    return login;
  }


  public void setLogin(RedirectionField login) {
    this.login = login;
  }


  public RedirectionConfig logout(RedirectionField logout) {
    
    this.logout = logout;
    return this;
  }

   /**
   * Get logout
   * @return logout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RedirectionField getLogout() {
    return logout;
  }


  public void setLogout(RedirectionField logout) {
    this.logout = logout;
  }


  public RedirectionConfig recovery(RedirectionField recovery) {
    
    this.recovery = recovery;
    return this;
  }

   /**
   * Get recovery
   * @return recovery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RedirectionField getRecovery() {
    return recovery;
  }


  public void setRecovery(RedirectionField recovery) {
    this.recovery = recovery;
  }


  public RedirectionConfig registration(RedirectionField registration) {
    
    this.registration = registration;
    return this;
  }

   /**
   * Get registration
   * @return registration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RedirectionField getRegistration() {
    return registration;
  }


  public void setRegistration(RedirectionField registration) {
    this.registration = registration;
  }


  public RedirectionConfig settings(RedirectionField settings) {
    
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RedirectionField getSettings() {
    return settings;
  }


  public void setSettings(RedirectionField settings) {
    this.settings = settings;
  }


  public RedirectionConfig urlAllowlist(List<String> urlAllowlist) {
    
    this.urlAllowlist = urlAllowlist;
    return this;
  }

  public RedirectionConfig addUrlAllowlistItem(String urlAllowlistItem) {
    if (this.urlAllowlist == null) {
      this.urlAllowlist = new ArrayList<>();
    }
    this.urlAllowlist.add(urlAllowlistItem);
    return this;
  }

   /**
   * Get urlAllowlist
   * @return urlAllowlist
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getUrlAllowlist() {
    return urlAllowlist;
  }


  public void setUrlAllowlist(List<String> urlAllowlist) {
    this.urlAllowlist = urlAllowlist;
  }


  public RedirectionConfig verification(RedirectionField verification) {
    
    this.verification = verification;
    return this;
  }

   /**
   * Get verification
   * @return verification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RedirectionField getVerification() {
    return verification;
  }


  public void setVerification(RedirectionField verification) {
    this.verification = verification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedirectionConfig redirectionConfig = (RedirectionConfig) o;
    return Objects.equals(this.global, redirectionConfig.global) &&
        Objects.equals(this.login, redirectionConfig.login) &&
        Objects.equals(this.logout, redirectionConfig.logout) &&
        Objects.equals(this.recovery, redirectionConfig.recovery) &&
        Objects.equals(this.registration, redirectionConfig.registration) &&
        Objects.equals(this.settings, redirectionConfig.settings) &&
        Objects.equals(this.urlAllowlist, redirectionConfig.urlAllowlist) &&
        Objects.equals(this.verification, redirectionConfig.verification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(global, login, logout, recovery, registration, settings, urlAllowlist, verification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedirectionConfig {\n");
    sb.append("    global: ").append(toIndentedString(global)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    logout: ").append(toIndentedString(logout)).append("\n");
    sb.append("    recovery: ").append(toIndentedString(recovery)).append("\n");
    sb.append("    registration: ").append(toIndentedString(registration)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    urlAllowlist: ").append(toIndentedString(urlAllowlist)).append("\n");
    sb.append("    verification: ").append(toIndentedString(verification)).append("\n");
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

