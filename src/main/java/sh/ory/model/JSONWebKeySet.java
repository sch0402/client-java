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
import java.util.ArrayList;
import java.util.List;
import sh.ory.model.JSONWebKey;

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
 * It is important that this model object is named JSONWebKeySet for \&quot;swagger generate spec\&quot; to generate only on definition of a JSONWebKeySet. Since one with the same name is previously defined as client.Client.JSONWebKeys and this one is last, this one will be effectively written in the swagger spec.
 */
@ApiModel(description = "It is important that this model object is named JSONWebKeySet for \"swagger generate spec\" to generate only on definition of a JSONWebKeySet. Since one with the same name is previously defined as client.Client.JSONWebKeys and this one is last, this one will be effectively written in the swagger spec.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-12T13:39:28.630998806Z[Etc/UTC]")
public class JSONWebKeySet {
  public static final String SERIALIZED_NAME_KEYS = "keys";
  @SerializedName(SERIALIZED_NAME_KEYS)
  private List<JSONWebKey> keys = null;

  public JSONWebKeySet() { 
  }

  public JSONWebKeySet keys(List<JSONWebKey> keys) {
    
    this.keys = keys;
    return this;
  }

  public JSONWebKeySet addKeysItem(JSONWebKey keysItem) {
    if (this.keys == null) {
      this.keys = new ArrayList<>();
    }
    this.keys.add(keysItem);
    return this;
  }

   /**
   * The value of the \&quot;keys\&quot; parameter is an array of JWK values.  By default, the order of the JWK values within the array does not imply an order of preference among them, although applications of JWK Sets can choose to assign a meaning to the order for their purposes, if desired.
   * @return keys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value of the \"keys\" parameter is an array of JWK values.  By default, the order of the JWK values within the array does not imply an order of preference among them, although applications of JWK Sets can choose to assign a meaning to the order for their purposes, if desired.")

  public List<JSONWebKey> getKeys() {
    return keys;
  }


  public void setKeys(List<JSONWebKey> keys) {
    this.keys = keys;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JSONWebKeySet jsONWebKeySet = (JSONWebKeySet) o;
    return Objects.equals(this.keys, jsONWebKeySet.keys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JSONWebKeySet {\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
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
    openapiFields.add("keys");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JSONWebKeySet
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JSONWebKeySet.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JSONWebKeySet is not found in the empty JSON string", JSONWebKeySet.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JSONWebKeySet.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JSONWebKeySet` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraykeys = jsonObj.getAsJsonArray("keys");
      if (jsonArraykeys != null) {
        // ensure the json data is an array
        if (!jsonObj.get("keys").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `keys` to be an array in the JSON string but got `%s`", jsonObj.get("keys").toString()));
        }

        // validate the optional field `keys` (array)
        for (int i = 0; i < jsonArraykeys.size(); i++) {
          JSONWebKey.validateJsonObject(jsonArraykeys.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JSONWebKeySet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JSONWebKeySet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JSONWebKeySet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JSONWebKeySet.class));

       return (TypeAdapter<T>) new TypeAdapter<JSONWebKeySet>() {
           @Override
           public void write(JsonWriter out, JSONWebKeySet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JSONWebKeySet read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JSONWebKeySet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JSONWebKeySet
  * @throws IOException if the JSON string is invalid with respect to JSONWebKeySet
  */
  public static JSONWebKeySet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JSONWebKeySet.class);
  }

 /**
  * Convert an instance of JSONWebKeySet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

