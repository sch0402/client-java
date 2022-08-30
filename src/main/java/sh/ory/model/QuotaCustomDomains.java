/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.23
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
 * QuotaCustomDomains
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-30T09:24:27.674927925Z[Etc/UTC]")
public class QuotaCustomDomains {
  public static final String SERIALIZED_NAME_AVAILABLE_DOMAINS = "available_domains";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_DOMAINS)
  private Long availableDomains;

  public static final String SERIALIZED_NAME_CAN_USE = "can_use";
  @SerializedName(SERIALIZED_NAME_CAN_USE)
  private Boolean canUse;

  public static final String SERIALIZED_NAME_USED_DOMAINS = "used_domains";
  @SerializedName(SERIALIZED_NAME_USED_DOMAINS)
  private Long usedDomains;

  public QuotaCustomDomains() { 
  }

  public QuotaCustomDomains availableDomains(Long availableDomains) {
    
    this.availableDomains = availableDomains;
    return this;
  }

   /**
   * Get availableDomains
   * @return availableDomains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getAvailableDomains() {
    return availableDomains;
  }


  public void setAvailableDomains(Long availableDomains) {
    this.availableDomains = availableDomains;
  }


  public QuotaCustomDomains canUse(Boolean canUse) {
    
    this.canUse = canUse;
    return this;
  }

   /**
   * Get canUse
   * @return canUse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCanUse() {
    return canUse;
  }


  public void setCanUse(Boolean canUse) {
    this.canUse = canUse;
  }


  public QuotaCustomDomains usedDomains(Long usedDomains) {
    
    this.usedDomains = usedDomains;
    return this;
  }

   /**
   * Get usedDomains
   * @return usedDomains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getUsedDomains() {
    return usedDomains;
  }


  public void setUsedDomains(Long usedDomains) {
    this.usedDomains = usedDomains;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuotaCustomDomains quotaCustomDomains = (QuotaCustomDomains) o;
    return Objects.equals(this.availableDomains, quotaCustomDomains.availableDomains) &&
        Objects.equals(this.canUse, quotaCustomDomains.canUse) &&
        Objects.equals(this.usedDomains, quotaCustomDomains.usedDomains);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableDomains, canUse, usedDomains);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuotaCustomDomains {\n");
    sb.append("    availableDomains: ").append(toIndentedString(availableDomains)).append("\n");
    sb.append("    canUse: ").append(toIndentedString(canUse)).append("\n");
    sb.append("    usedDomains: ").append(toIndentedString(usedDomains)).append("\n");
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

