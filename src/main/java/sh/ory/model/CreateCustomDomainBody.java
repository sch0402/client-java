/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.0
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
 * Create Custom Hostname Request Body
 */
@ApiModel(description = "Create Custom Hostname Request Body")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-12T08:35:41.287963370Z[Etc/UTC]")
public class CreateCustomDomainBody {
  public static final String SERIALIZED_NAME_COOKIE_DOMAIN = "cookie_domain";
  @SerializedName(SERIALIZED_NAME_COOKIE_DOMAIN)
  private String cookieDomain;

  public static final String SERIALIZED_NAME_CORS_ALLOWED_ORIGINS = "cors_allowed_origins";
  @SerializedName(SERIALIZED_NAME_CORS_ALLOWED_ORIGINS)
  private List<String> corsAllowedOrigins = null;

  public static final String SERIALIZED_NAME_CORS_ENABLED = "cors_enabled";
  @SerializedName(SERIALIZED_NAME_CORS_ENABLED)
  private Boolean corsEnabled;

  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public CreateCustomDomainBody() {
  }

  public CreateCustomDomainBody cookieDomain(String cookieDomain) {
    
    this.cookieDomain = cookieDomain;
    return this;
  }

   /**
   * The domain where cookies will be set. Has to be a parent domain of the custom hostname to work.
   * @return cookieDomain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The domain where cookies will be set. Has to be a parent domain of the custom hostname to work.")

  public String getCookieDomain() {
    return cookieDomain;
  }


  public void setCookieDomain(String cookieDomain) {
    this.cookieDomain = cookieDomain;
  }


  public CreateCustomDomainBody corsAllowedOrigins(List<String> corsAllowedOrigins) {
    
    this.corsAllowedOrigins = corsAllowedOrigins;
    return this;
  }

  public CreateCustomDomainBody addCorsAllowedOriginsItem(String corsAllowedOriginsItem) {
    if (this.corsAllowedOrigins == null) {
      this.corsAllowedOrigins = new ArrayList<>();
    }
    this.corsAllowedOrigins.add(corsAllowedOriginsItem);
    return this;
  }

   /**
   * CORS Allowed origins for the custom hostname.
   * @return corsAllowedOrigins
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CORS Allowed origins for the custom hostname.")

  public List<String> getCorsAllowedOrigins() {
    return corsAllowedOrigins;
  }


  public void setCorsAllowedOrigins(List<String> corsAllowedOrigins) {
    this.corsAllowedOrigins = corsAllowedOrigins;
  }


  public CreateCustomDomainBody corsEnabled(Boolean corsEnabled) {
    
    this.corsEnabled = corsEnabled;
    return this;
  }

   /**
   * CORS Enabled for the custom hostname.
   * @return corsEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CORS Enabled for the custom hostname.")

  public Boolean getCorsEnabled() {
    return corsEnabled;
  }


  public void setCorsEnabled(Boolean corsEnabled) {
    this.corsEnabled = corsEnabled;
  }


  public CreateCustomDomainBody hostname(String hostname) {
    
    this.hostname = hostname;
    return this;
  }

   /**
   * The custom hostname where the API will be exposed.
   * @return hostname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The custom hostname where the API will be exposed.")

  public String getHostname() {
    return hostname;
  }


  public void setHostname(String hostname) {
    this.hostname = hostname;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCustomDomainBody createCustomDomainBody = (CreateCustomDomainBody) o;
    return Objects.equals(this.cookieDomain, createCustomDomainBody.cookieDomain) &&
        Objects.equals(this.corsAllowedOrigins, createCustomDomainBody.corsAllowedOrigins) &&
        Objects.equals(this.corsEnabled, createCustomDomainBody.corsEnabled) &&
        Objects.equals(this.hostname, createCustomDomainBody.hostname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cookieDomain, corsAllowedOrigins, corsEnabled, hostname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCustomDomainBody {\n");
    sb.append("    cookieDomain: ").append(toIndentedString(cookieDomain)).append("\n");
    sb.append("    corsAllowedOrigins: ").append(toIndentedString(corsAllowedOrigins)).append("\n");
    sb.append("    corsEnabled: ").append(toIndentedString(corsEnabled)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
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
    openapiFields.add("cookie_domain");
    openapiFields.add("cors_allowed_origins");
    openapiFields.add("cors_enabled");
    openapiFields.add("hostname");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateCustomDomainBody
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateCustomDomainBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCustomDomainBody is not found in the empty JSON string", CreateCustomDomainBody.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateCustomDomainBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateCustomDomainBody` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("cookie_domain") != null && !jsonObj.get("cookie_domain").isJsonNull()) && !jsonObj.get("cookie_domain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cookie_domain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cookie_domain").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("cors_allowed_origins") != null && !jsonObj.get("cors_allowed_origins").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cors_allowed_origins` to be an array in the JSON string but got `%s`", jsonObj.get("cors_allowed_origins").toString()));
      }
      if ((jsonObj.get("hostname") != null && !jsonObj.get("hostname").isJsonNull()) && !jsonObj.get("hostname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostname").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateCustomDomainBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCustomDomainBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCustomDomainBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCustomDomainBody.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCustomDomainBody>() {
           @Override
           public void write(JsonWriter out, CreateCustomDomainBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateCustomDomainBody read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateCustomDomainBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateCustomDomainBody
  * @throws IOException if the JSON string is invalid with respect to CreateCustomDomainBody
  */
  public static CreateCustomDomainBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCustomDomainBody.class);
  }

 /**
  * Convert an instance of CreateCustomDomainBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

