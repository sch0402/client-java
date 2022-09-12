/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.38
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
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import sh.ory.JSON;

/**
 * SubmitSelfServiceLoginFlowWithTotpMethodBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-12T13:39:28.630998806Z[Etc/UTC]")
public class SubmitSelfServiceLoginFlowWithTotpMethodBody {
  public static final String SERIALIZED_NAME_CSRF_TOKEN = "csrf_token";
  @SerializedName(SERIALIZED_NAME_CSRF_TOKEN)
  private String csrfToken;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_TOTP_CODE = "totp_code";
  @SerializedName(SERIALIZED_NAME_TOTP_CODE)
  private String totpCode;

  public SubmitSelfServiceLoginFlowWithTotpMethodBody() { 
  }

  public SubmitSelfServiceLoginFlowWithTotpMethodBody csrfToken(String csrfToken) {
    
    this.csrfToken = csrfToken;
    return this;
  }

   /**
   * Sending the anti-csrf token is only required for browser login flows.
   * @return csrfToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sending the anti-csrf token is only required for browser login flows.")

  public String getCsrfToken() {
    return csrfToken;
  }


  public void setCsrfToken(String csrfToken) {
    this.csrfToken = csrfToken;
  }


  public SubmitSelfServiceLoginFlowWithTotpMethodBody method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Method should be set to \&quot;totp\&quot; when logging in using the TOTP strategy.
   * @return method
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Method should be set to \"totp\" when logging in using the TOTP strategy.")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public SubmitSelfServiceLoginFlowWithTotpMethodBody totpCode(String totpCode) {
    
    this.totpCode = totpCode;
    return this;
  }

   /**
   * The TOTP code.
   * @return totpCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The TOTP code.")

  public String getTotpCode() {
    return totpCode;
  }


  public void setTotpCode(String totpCode) {
    this.totpCode = totpCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitSelfServiceLoginFlowWithTotpMethodBody submitSelfServiceLoginFlowWithTotpMethodBody = (SubmitSelfServiceLoginFlowWithTotpMethodBody) o;
    return Objects.equals(this.csrfToken, submitSelfServiceLoginFlowWithTotpMethodBody.csrfToken) &&
        Objects.equals(this.method, submitSelfServiceLoginFlowWithTotpMethodBody.method) &&
        Objects.equals(this.totpCode, submitSelfServiceLoginFlowWithTotpMethodBody.totpCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(csrfToken, method, totpCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitSelfServiceLoginFlowWithTotpMethodBody {\n");
    sb.append("    csrfToken: ").append(toIndentedString(csrfToken)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    totpCode: ").append(toIndentedString(totpCode)).append("\n");
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
    openapiFields.add("method");
    openapiFields.add("totp_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("method");
    openapiRequiredFields.add("totp_code");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubmitSelfServiceLoginFlowWithTotpMethodBody
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SubmitSelfServiceLoginFlowWithTotpMethodBody.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubmitSelfServiceLoginFlowWithTotpMethodBody is not found in the empty JSON string", SubmitSelfServiceLoginFlowWithTotpMethodBody.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SubmitSelfServiceLoginFlowWithTotpMethodBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubmitSelfServiceLoginFlowWithTotpMethodBody` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SubmitSelfServiceLoginFlowWithTotpMethodBody.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("csrf_token") != null && !jsonObj.get("csrf_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `csrf_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("csrf_token").toString()));
      }
      if (jsonObj.get("method") != null && !jsonObj.get("method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method").toString()));
      }
      if (jsonObj.get("totp_code") != null && !jsonObj.get("totp_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `totp_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("totp_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubmitSelfServiceLoginFlowWithTotpMethodBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubmitSelfServiceLoginFlowWithTotpMethodBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubmitSelfServiceLoginFlowWithTotpMethodBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubmitSelfServiceLoginFlowWithTotpMethodBody.class));

       return (TypeAdapter<T>) new TypeAdapter<SubmitSelfServiceLoginFlowWithTotpMethodBody>() {
           @Override
           public void write(JsonWriter out, SubmitSelfServiceLoginFlowWithTotpMethodBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubmitSelfServiceLoginFlowWithTotpMethodBody read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubmitSelfServiceLoginFlowWithTotpMethodBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubmitSelfServiceLoginFlowWithTotpMethodBody
  * @throws IOException if the JSON string is invalid with respect to SubmitSelfServiceLoginFlowWithTotpMethodBody
  */
  public static SubmitSelfServiceLoginFlowWithTotpMethodBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubmitSelfServiceLoginFlowWithTotpMethodBody.class);
  }

 /**
  * Convert an instance of SubmitSelfServiceLoginFlowWithTotpMethodBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

