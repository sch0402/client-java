/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.20
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
 * Update Settings Flow with Lookup Method
 */
@ApiModel(description = "Update Settings Flow with Lookup Method")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-27T15:44:21.538695371Z[Etc/UTC]")
public class UpdateSettingsFlowWithLookupMethod {
  public static final String SERIALIZED_NAME_CSRF_TOKEN = "csrf_token";
  @SerializedName(SERIALIZED_NAME_CSRF_TOKEN)
  private String csrfToken;

  public static final String SERIALIZED_NAME_LOOKUP_SECRET_CONFIRM = "lookup_secret_confirm";
  @SerializedName(SERIALIZED_NAME_LOOKUP_SECRET_CONFIRM)
  private Boolean lookupSecretConfirm;

  public static final String SERIALIZED_NAME_LOOKUP_SECRET_DISABLE = "lookup_secret_disable";
  @SerializedName(SERIALIZED_NAME_LOOKUP_SECRET_DISABLE)
  private Boolean lookupSecretDisable;

  public static final String SERIALIZED_NAME_LOOKUP_SECRET_REGENERATE = "lookup_secret_regenerate";
  @SerializedName(SERIALIZED_NAME_LOOKUP_SECRET_REGENERATE)
  private Boolean lookupSecretRegenerate;

  public static final String SERIALIZED_NAME_LOOKUP_SECRET_REVEAL = "lookup_secret_reveal";
  @SerializedName(SERIALIZED_NAME_LOOKUP_SECRET_REVEAL)
  private Boolean lookupSecretReveal;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public UpdateSettingsFlowWithLookupMethod() {
  }

  public UpdateSettingsFlowWithLookupMethod csrfToken(String csrfToken) {
    
    this.csrfToken = csrfToken;
    return this;
  }

   /**
   * CSRFToken is the anti-CSRF token
   * @return csrfToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CSRFToken is the anti-CSRF token")

  public String getCsrfToken() {
    return csrfToken;
  }


  public void setCsrfToken(String csrfToken) {
    this.csrfToken = csrfToken;
  }


  public UpdateSettingsFlowWithLookupMethod lookupSecretConfirm(Boolean lookupSecretConfirm) {
    
    this.lookupSecretConfirm = lookupSecretConfirm;
    return this;
  }

   /**
   * If set to true will save the regenerated lookup secrets
   * @return lookupSecretConfirm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set to true will save the regenerated lookup secrets")

  public Boolean getLookupSecretConfirm() {
    return lookupSecretConfirm;
  }


  public void setLookupSecretConfirm(Boolean lookupSecretConfirm) {
    this.lookupSecretConfirm = lookupSecretConfirm;
  }


  public UpdateSettingsFlowWithLookupMethod lookupSecretDisable(Boolean lookupSecretDisable) {
    
    this.lookupSecretDisable = lookupSecretDisable;
    return this;
  }

   /**
   * Disables this method if true.
   * @return lookupSecretDisable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Disables this method if true.")

  public Boolean getLookupSecretDisable() {
    return lookupSecretDisable;
  }


  public void setLookupSecretDisable(Boolean lookupSecretDisable) {
    this.lookupSecretDisable = lookupSecretDisable;
  }


  public UpdateSettingsFlowWithLookupMethod lookupSecretRegenerate(Boolean lookupSecretRegenerate) {
    
    this.lookupSecretRegenerate = lookupSecretRegenerate;
    return this;
  }

   /**
   * If set to true will regenerate the lookup secrets
   * @return lookupSecretRegenerate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set to true will regenerate the lookup secrets")

  public Boolean getLookupSecretRegenerate() {
    return lookupSecretRegenerate;
  }


  public void setLookupSecretRegenerate(Boolean lookupSecretRegenerate) {
    this.lookupSecretRegenerate = lookupSecretRegenerate;
  }


  public UpdateSettingsFlowWithLookupMethod lookupSecretReveal(Boolean lookupSecretReveal) {
    
    this.lookupSecretReveal = lookupSecretReveal;
    return this;
  }

   /**
   * If set to true will reveal the lookup secrets
   * @return lookupSecretReveal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set to true will reveal the lookup secrets")

  public Boolean getLookupSecretReveal() {
    return lookupSecretReveal;
  }


  public void setLookupSecretReveal(Boolean lookupSecretReveal) {
    this.lookupSecretReveal = lookupSecretReveal;
  }


  public UpdateSettingsFlowWithLookupMethod method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Method  Should be set to \&quot;lookup\&quot; when trying to add, update, or remove a lookup pairing.
   * @return method
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Method  Should be set to \"lookup\" when trying to add, update, or remove a lookup pairing.")

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
    UpdateSettingsFlowWithLookupMethod updateSettingsFlowWithLookupMethod = (UpdateSettingsFlowWithLookupMethod) o;
    return Objects.equals(this.csrfToken, updateSettingsFlowWithLookupMethod.csrfToken) &&
        Objects.equals(this.lookupSecretConfirm, updateSettingsFlowWithLookupMethod.lookupSecretConfirm) &&
        Objects.equals(this.lookupSecretDisable, updateSettingsFlowWithLookupMethod.lookupSecretDisable) &&
        Objects.equals(this.lookupSecretRegenerate, updateSettingsFlowWithLookupMethod.lookupSecretRegenerate) &&
        Objects.equals(this.lookupSecretReveal, updateSettingsFlowWithLookupMethod.lookupSecretReveal) &&
        Objects.equals(this.method, updateSettingsFlowWithLookupMethod.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(csrfToken, lookupSecretConfirm, lookupSecretDisable, lookupSecretRegenerate, lookupSecretReveal, method);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSettingsFlowWithLookupMethod {\n");
    sb.append("    csrfToken: ").append(toIndentedString(csrfToken)).append("\n");
    sb.append("    lookupSecretConfirm: ").append(toIndentedString(lookupSecretConfirm)).append("\n");
    sb.append("    lookupSecretDisable: ").append(toIndentedString(lookupSecretDisable)).append("\n");
    sb.append("    lookupSecretRegenerate: ").append(toIndentedString(lookupSecretRegenerate)).append("\n");
    sb.append("    lookupSecretReveal: ").append(toIndentedString(lookupSecretReveal)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("csrf_token");
    openapiFields.add("lookup_secret_confirm");
    openapiFields.add("lookup_secret_disable");
    openapiFields.add("lookup_secret_regenerate");
    openapiFields.add("lookup_secret_reveal");
    openapiFields.add("method");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("method");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateSettingsFlowWithLookupMethod
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateSettingsFlowWithLookupMethod.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateSettingsFlowWithLookupMethod is not found in the empty JSON string", UpdateSettingsFlowWithLookupMethod.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateSettingsFlowWithLookupMethod.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateSettingsFlowWithLookupMethod` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateSettingsFlowWithLookupMethod.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("csrf_token") != null && !jsonObj.get("csrf_token").isJsonNull()) && !jsonObj.get("csrf_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `csrf_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("csrf_token").toString()));
      }
      if (!jsonObj.get("method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateSettingsFlowWithLookupMethod.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateSettingsFlowWithLookupMethod' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateSettingsFlowWithLookupMethod> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateSettingsFlowWithLookupMethod.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateSettingsFlowWithLookupMethod>() {
           @Override
           public void write(JsonWriter out, UpdateSettingsFlowWithLookupMethod value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateSettingsFlowWithLookupMethod read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateSettingsFlowWithLookupMethod given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateSettingsFlowWithLookupMethod
  * @throws IOException if the JSON string is invalid with respect to UpdateSettingsFlowWithLookupMethod
  */
  public static UpdateSettingsFlowWithLookupMethod fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateSettingsFlowWithLookupMethod.class);
  }

 /**
  * Convert an instance of UpdateSettingsFlowWithLookupMethod to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

