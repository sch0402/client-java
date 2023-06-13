/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.35
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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import sh.ory.JSON;

/**
 * QuotaUsage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-13T11:09:14.508307711Z[Etc/UTC]")
public class QuotaUsage {
  public static final String SERIALIZED_NAME_ADDITIONAL_PRICE = "additional_price";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_PRICE)
  private Long additionalPrice;

  public static final String SERIALIZED_NAME_CAN_USE_MORE = "can_use_more";
  @SerializedName(SERIALIZED_NAME_CAN_USE_MORE)
  private Boolean canUseMore;

  /**
   *  region_eu RegionEU region_us RegionUS region_apac RegionAPAC region_global RegionGlobal production_projects ProductionProjects daily_active_users DailyActiveUsers custom_domains CustomDomains sla SLA collaborator_seats CollaboratorSeats edge_cache EdgeCache branding_themes BrandingThemes zendesk_support ZendeskSupport project_metrics ProjectMetrics rate_limit_tier RateLimitTier session_rate_limit_tier RateLimitTierSessions
   */
  @JsonAdapter(FeatureEnum.Adapter.class)
  public enum FeatureEnum {
    REGION_EU("region_eu"),
    
    REGION_US("region_us"),
    
    REGION_APAC("region_apac"),
    
    REGION_GLOBAL("region_global"),
    
    PRODUCTION_PROJECTS("production_projects"),
    
    DAILY_ACTIVE_USERS("daily_active_users"),
    
    CUSTOM_DOMAINS("custom_domains"),
    
    SLA("sla"),
    
    COLLABORATOR_SEATS("collaborator_seats"),
    
    EDGE_CACHE("edge_cache"),
    
    BRANDING_THEMES("branding_themes"),
    
    ZENDESK_SUPPORT("zendesk_support"),
    
    PROJECT_METRICS("project_metrics"),
    
    RATE_LIMIT_TIER("rate_limit_tier"),
    
    SESSION_RATE_LIMIT_TIER("session_rate_limit_tier");

    private String value;

    FeatureEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FeatureEnum fromValue(String value) {
      for (FeatureEnum b : FeatureEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FeatureEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FeatureEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FeatureEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FeatureEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FEATURE = "feature";
  @SerializedName(SERIALIZED_NAME_FEATURE)
  private FeatureEnum feature;

  public static final String SERIALIZED_NAME_FEATURE_AVAILABLE = "feature_available";
  @SerializedName(SERIALIZED_NAME_FEATURE_AVAILABLE)
  private Boolean featureAvailable;

  public static final String SERIALIZED_NAME_INCLUDED = "included";
  @SerializedName(SERIALIZED_NAME_INCLUDED)
  private Long included;

  public static final String SERIALIZED_NAME_USED = "used";
  @SerializedName(SERIALIZED_NAME_USED)
  private Long used;

  public QuotaUsage() {
  }

  public QuotaUsage additionalPrice(Long additionalPrice) {
    
    this.additionalPrice = additionalPrice;
    return this;
  }

   /**
   * Get additionalPrice
   * @return additionalPrice
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getAdditionalPrice() {
    return additionalPrice;
  }


  public void setAdditionalPrice(Long additionalPrice) {
    this.additionalPrice = additionalPrice;
  }


  public QuotaUsage canUseMore(Boolean canUseMore) {
    
    this.canUseMore = canUseMore;
    return this;
  }

   /**
   * Get canUseMore
   * @return canUseMore
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getCanUseMore() {
    return canUseMore;
  }


  public void setCanUseMore(Boolean canUseMore) {
    this.canUseMore = canUseMore;
  }


  public QuotaUsage feature(FeatureEnum feature) {
    
    this.feature = feature;
    return this;
  }

   /**
   *  region_eu RegionEU region_us RegionUS region_apac RegionAPAC region_global RegionGlobal production_projects ProductionProjects daily_active_users DailyActiveUsers custom_domains CustomDomains sla SLA collaborator_seats CollaboratorSeats edge_cache EdgeCache branding_themes BrandingThemes zendesk_support ZendeskSupport project_metrics ProjectMetrics rate_limit_tier RateLimitTier session_rate_limit_tier RateLimitTierSessions
   * @return feature
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = " region_eu RegionEU region_us RegionUS region_apac RegionAPAC region_global RegionGlobal production_projects ProductionProjects daily_active_users DailyActiveUsers custom_domains CustomDomains sla SLA collaborator_seats CollaboratorSeats edge_cache EdgeCache branding_themes BrandingThemes zendesk_support ZendeskSupport project_metrics ProjectMetrics rate_limit_tier RateLimitTier session_rate_limit_tier RateLimitTierSessions")

  public FeatureEnum getFeature() {
    return feature;
  }


  public void setFeature(FeatureEnum feature) {
    this.feature = feature;
  }


  public QuotaUsage featureAvailable(Boolean featureAvailable) {
    
    this.featureAvailable = featureAvailable;
    return this;
  }

   /**
   * Get featureAvailable
   * @return featureAvailable
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getFeatureAvailable() {
    return featureAvailable;
  }


  public void setFeatureAvailable(Boolean featureAvailable) {
    this.featureAvailable = featureAvailable;
  }


  public QuotaUsage included(Long included) {
    
    this.included = included;
    return this;
  }

   /**
   * Get included
   * @return included
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getIncluded() {
    return included;
  }


  public void setIncluded(Long included) {
    this.included = included;
  }


  public QuotaUsage used(Long used) {
    
    this.used = used;
    return this;
  }

   /**
   * Get used
   * @return used
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getUsed() {
    return used;
  }


  public void setUsed(Long used) {
    this.used = used;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuotaUsage quotaUsage = (QuotaUsage) o;
    return Objects.equals(this.additionalPrice, quotaUsage.additionalPrice) &&
        Objects.equals(this.canUseMore, quotaUsage.canUseMore) &&
        Objects.equals(this.feature, quotaUsage.feature) &&
        Objects.equals(this.featureAvailable, quotaUsage.featureAvailable) &&
        Objects.equals(this.included, quotaUsage.included) &&
        Objects.equals(this.used, quotaUsage.used);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalPrice, canUseMore, feature, featureAvailable, included, used);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuotaUsage {\n");
    sb.append("    additionalPrice: ").append(toIndentedString(additionalPrice)).append("\n");
    sb.append("    canUseMore: ").append(toIndentedString(canUseMore)).append("\n");
    sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
    sb.append("    featureAvailable: ").append(toIndentedString(featureAvailable)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("additional_price");
    openapiFields.add("can_use_more");
    openapiFields.add("feature");
    openapiFields.add("feature_available");
    openapiFields.add("included");
    openapiFields.add("used");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("additional_price");
    openapiRequiredFields.add("can_use_more");
    openapiRequiredFields.add("feature");
    openapiRequiredFields.add("feature_available");
    openapiRequiredFields.add("included");
    openapiRequiredFields.add("used");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to QuotaUsage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!QuotaUsage.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QuotaUsage is not found in the empty JSON string", QuotaUsage.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!QuotaUsage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QuotaUsage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : QuotaUsage.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("feature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `feature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("feature").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QuotaUsage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QuotaUsage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QuotaUsage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QuotaUsage.class));

       return (TypeAdapter<T>) new TypeAdapter<QuotaUsage>() {
           @Override
           public void write(JsonWriter out, QuotaUsage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QuotaUsage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QuotaUsage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QuotaUsage
  * @throws IOException if the JSON string is invalid with respect to QuotaUsage
  */
  public static QuotaUsage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QuotaUsage.class);
  }

 /**
  * Convert an instance of QuotaUsage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

