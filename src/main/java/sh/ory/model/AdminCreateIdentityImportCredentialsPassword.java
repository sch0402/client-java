/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.44
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
import sh.ory.model.AdminCreateIdentityImportCredentialsPasswordConfig;

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
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import sh.ory.JSON;

/**
 * AdminCreateIdentityImportCredentialsPassword
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-15T06:36:32.008616029Z[Etc/UTC]")
public class AdminCreateIdentityImportCredentialsPassword {
  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private AdminCreateIdentityImportCredentialsPasswordConfig config;

  public AdminCreateIdentityImportCredentialsPassword() { 
  }

  public AdminCreateIdentityImportCredentialsPassword config(AdminCreateIdentityImportCredentialsPasswordConfig config) {
    
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdminCreateIdentityImportCredentialsPasswordConfig getConfig() {
    return config;
  }


  public void setConfig(AdminCreateIdentityImportCredentialsPasswordConfig config) {
    this.config = config;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminCreateIdentityImportCredentialsPassword adminCreateIdentityImportCredentialsPassword = (AdminCreateIdentityImportCredentialsPassword) o;
    return Objects.equals(this.config, adminCreateIdentityImportCredentialsPassword.config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminCreateIdentityImportCredentialsPassword {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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
    openapiFields.add("config");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AdminCreateIdentityImportCredentialsPassword
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AdminCreateIdentityImportCredentialsPassword.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdminCreateIdentityImportCredentialsPassword is not found in the empty JSON string", AdminCreateIdentityImportCredentialsPassword.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AdminCreateIdentityImportCredentialsPassword.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdminCreateIdentityImportCredentialsPassword` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `config`
      if (jsonObj.getAsJsonObject("config") != null) {
        AdminCreateIdentityImportCredentialsPasswordConfig.validateJsonObject(jsonObj.getAsJsonObject("config"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdminCreateIdentityImportCredentialsPassword.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdminCreateIdentityImportCredentialsPassword' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdminCreateIdentityImportCredentialsPassword> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdminCreateIdentityImportCredentialsPassword.class));

       return (TypeAdapter<T>) new TypeAdapter<AdminCreateIdentityImportCredentialsPassword>() {
           @Override
           public void write(JsonWriter out, AdminCreateIdentityImportCredentialsPassword value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdminCreateIdentityImportCredentialsPassword read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdminCreateIdentityImportCredentialsPassword given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdminCreateIdentityImportCredentialsPassword
  * @throws IOException if the JSON string is invalid with respect to AdminCreateIdentityImportCredentialsPassword
  */
  public static AdminCreateIdentityImportCredentialsPassword fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdminCreateIdentityImportCredentialsPassword.class);
  }

 /**
  * Convert an instance of AdminCreateIdentityImportCredentialsPassword to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

