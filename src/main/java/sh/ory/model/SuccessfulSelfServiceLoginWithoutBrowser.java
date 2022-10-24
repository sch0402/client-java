/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.60
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
import sh.ory.model.Session;

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
 * The Response for Login Flows via API
 */
@ApiModel(description = "The Response for Login Flows via API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-24T09:56:23.976880967Z[Etc/UTC]")
public class SuccessfulSelfServiceLoginWithoutBrowser {
  public static final String SERIALIZED_NAME_SESSION = "session";
  @SerializedName(SERIALIZED_NAME_SESSION)
  private Session session;

  public static final String SERIALIZED_NAME_SESSION_TOKEN = "session_token";
  @SerializedName(SERIALIZED_NAME_SESSION_TOKEN)
  private String sessionToken;

  public SuccessfulSelfServiceLoginWithoutBrowser() { 
  }

  public SuccessfulSelfServiceLoginWithoutBrowser session(Session session) {
    
    this.session = session;
    return this;
  }

   /**
   * Get session
   * @return session
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Session getSession() {
    return session;
  }


  public void setSession(Session session) {
    this.session = session;
  }


  public SuccessfulSelfServiceLoginWithoutBrowser sessionToken(String sessionToken) {
    
    this.sessionToken = sessionToken;
    return this;
  }

   /**
   * The Session Token  A session token is equivalent to a session cookie, but it can be sent in the HTTP Authorization Header:  Authorization: bearer ${session-token}  The session token is only issued for API flows, not for Browser flows!
   * @return sessionToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Session Token  A session token is equivalent to a session cookie, but it can be sent in the HTTP Authorization Header:  Authorization: bearer ${session-token}  The session token is only issued for API flows, not for Browser flows!")

  public String getSessionToken() {
    return sessionToken;
  }


  public void setSessionToken(String sessionToken) {
    this.sessionToken = sessionToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccessfulSelfServiceLoginWithoutBrowser successfulSelfServiceLoginWithoutBrowser = (SuccessfulSelfServiceLoginWithoutBrowser) o;
    return Objects.equals(this.session, successfulSelfServiceLoginWithoutBrowser.session) &&
        Objects.equals(this.sessionToken, successfulSelfServiceLoginWithoutBrowser.sessionToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(session, sessionToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessfulSelfServiceLoginWithoutBrowser {\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    sessionToken: ").append(toIndentedString(sessionToken)).append("\n");
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
    openapiFields.add("session");
    openapiFields.add("session_token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("session");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SuccessfulSelfServiceLoginWithoutBrowser
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SuccessfulSelfServiceLoginWithoutBrowser.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SuccessfulSelfServiceLoginWithoutBrowser is not found in the empty JSON string", SuccessfulSelfServiceLoginWithoutBrowser.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SuccessfulSelfServiceLoginWithoutBrowser.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SuccessfulSelfServiceLoginWithoutBrowser` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SuccessfulSelfServiceLoginWithoutBrowser.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `session`
      if (jsonObj.getAsJsonObject("session") != null) {
        Session.validateJsonObject(jsonObj.getAsJsonObject("session"));
      }
      if (jsonObj.get("session_token") != null && !jsonObj.get("session_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `session_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("session_token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SuccessfulSelfServiceLoginWithoutBrowser.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SuccessfulSelfServiceLoginWithoutBrowser' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SuccessfulSelfServiceLoginWithoutBrowser> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SuccessfulSelfServiceLoginWithoutBrowser.class));

       return (TypeAdapter<T>) new TypeAdapter<SuccessfulSelfServiceLoginWithoutBrowser>() {
           @Override
           public void write(JsonWriter out, SuccessfulSelfServiceLoginWithoutBrowser value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SuccessfulSelfServiceLoginWithoutBrowser read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SuccessfulSelfServiceLoginWithoutBrowser given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SuccessfulSelfServiceLoginWithoutBrowser
  * @throws IOException if the JSON string is invalid with respect to SuccessfulSelfServiceLoginWithoutBrowser
  */
  public static SuccessfulSelfServiceLoginWithoutBrowser fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SuccessfulSelfServiceLoginWithoutBrowser.class);
  }

 /**
  * Convert an instance of SuccessfulSelfServiceLoginWithoutBrowser to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

