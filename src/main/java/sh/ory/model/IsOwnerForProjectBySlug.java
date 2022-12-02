/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.0.2
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
 * IsOwnerForProjectBySlug
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-02T10:22:49.227448728Z[Etc/UTC]")
public class IsOwnerForProjectBySlug {
  public static final String SERIALIZED_NAME_PROJECT_SLUG = "ProjectSlug";
  @SerializedName(SERIALIZED_NAME_PROJECT_SLUG)
  private String projectSlug;

  public static final String SERIALIZED_NAME_SUBJECT = "Subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public IsOwnerForProjectBySlug() { 
  }

  public IsOwnerForProjectBySlug projectSlug(String projectSlug) {
    
    this.projectSlug = projectSlug;
    return this;
  }

   /**
   * ProjectSlug is the project&#39;s slug.
   * @return projectSlug
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ProjectSlug is the project's slug.")

  public String getProjectSlug() {
    return projectSlug;
  }


  public void setProjectSlug(String projectSlug) {
    this.projectSlug = projectSlug;
  }


  public IsOwnerForProjectBySlug subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Subject is the subject from the API Token.
   * @return subject
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Subject is the subject from the API Token.")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IsOwnerForProjectBySlug isOwnerForProjectBySlug = (IsOwnerForProjectBySlug) o;
    return Objects.equals(this.projectSlug, isOwnerForProjectBySlug.projectSlug) &&
        Objects.equals(this.subject, isOwnerForProjectBySlug.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectSlug, subject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IsOwnerForProjectBySlug {\n");
    sb.append("    projectSlug: ").append(toIndentedString(projectSlug)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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
    openapiFields.add("ProjectSlug");
    openapiFields.add("Subject");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ProjectSlug");
    openapiRequiredFields.add("Subject");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IsOwnerForProjectBySlug
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IsOwnerForProjectBySlug.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IsOwnerForProjectBySlug is not found in the empty JSON string", IsOwnerForProjectBySlug.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IsOwnerForProjectBySlug.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IsOwnerForProjectBySlug` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IsOwnerForProjectBySlug.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("ProjectSlug") != null && !jsonObj.get("ProjectSlug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ProjectSlug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ProjectSlug").toString()));
      }
      if (jsonObj.get("Subject") != null && !jsonObj.get("Subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Subject").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IsOwnerForProjectBySlug.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IsOwnerForProjectBySlug' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IsOwnerForProjectBySlug> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IsOwnerForProjectBySlug.class));

       return (TypeAdapter<T>) new TypeAdapter<IsOwnerForProjectBySlug>() {
           @Override
           public void write(JsonWriter out, IsOwnerForProjectBySlug value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IsOwnerForProjectBySlug read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IsOwnerForProjectBySlug given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IsOwnerForProjectBySlug
  * @throws IOException if the JSON string is invalid with respect to IsOwnerForProjectBySlug
  */
  public static IsOwnerForProjectBySlug fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IsOwnerForProjectBySlug.class);
  }

 /**
  * Convert an instance of IsOwnerForProjectBySlug to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

