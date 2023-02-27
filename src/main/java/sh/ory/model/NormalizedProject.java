/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.21
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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import sh.ory.model.NormalizedProjectRevision;

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
 * NormalizedProject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-27T16:38:42.861955397Z[Etc/UTC]")
public class NormalizedProject {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CURRENT_REVISION = "current_revision";
  @SerializedName(SERIALIZED_NAME_CURRENT_REVISION)
  private NormalizedProjectRevision currentRevision;

  public static final String SERIALIZED_NAME_HOSTS = "hosts";
  @SerializedName(SERIALIZED_NAME_HOSTS)
  private List<String> hosts = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  /**
   * The state of the project. running Running halted Halted
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    RUNNING("running"),
    
    HALTED("halted");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_ID = "subscription_id";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_ID)
  private String subscriptionId;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public NormalizedProject() {
  }

  
  public NormalizedProject(
     OffsetDateTime createdAt, 
     String id, 
     String slug, 
     StateEnum state, 
     OffsetDateTime updatedAt
  ) {
    this();
    this.createdAt = createdAt;
    this.id = id;
    this.slug = slug;
    this.state = state;
    this.updatedAt = updatedAt;
  }

   /**
   * The Project&#39;s Creation Date
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The Project's Creation Date")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




  public NormalizedProject currentRevision(NormalizedProjectRevision currentRevision) {
    
    this.currentRevision = currentRevision;
    return this;
  }

   /**
   * Get currentRevision
   * @return currentRevision
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NormalizedProjectRevision getCurrentRevision() {
    return currentRevision;
  }


  public void setCurrentRevision(NormalizedProjectRevision currentRevision) {
    this.currentRevision = currentRevision;
  }


  public NormalizedProject hosts(List<String> hosts) {
    
    this.hosts = hosts;
    return this;
  }

  public NormalizedProject addHostsItem(String hostsItem) {
    this.hosts.add(hostsItem);
    return this;
  }

   /**
   * Get hosts
   * @return hosts
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getHosts() {
    return hosts;
  }


  public void setHosts(List<String> hosts) {
    this.hosts = hosts;
  }


   /**
   * The project&#39;s ID.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The project's ID.")

  public String getId() {
    return id;
  }




   /**
   * The project&#39;s slug
   * @return slug
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The project's slug")

  public String getSlug() {
    return slug;
  }




   /**
   * The state of the project. running Running halted Halted
   * @return state
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The state of the project. running Running halted Halted")

  public StateEnum getState() {
    return state;
  }




  public NormalizedProject subscriptionId(String subscriptionId) {
    
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * Get subscriptionId
   * @return subscriptionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubscriptionId() {
    return subscriptionId;
  }


  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


   /**
   * Last Time Project was Updated
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Last Time Project was Updated")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NormalizedProject normalizedProject = (NormalizedProject) o;
    return Objects.equals(this.createdAt, normalizedProject.createdAt) &&
        Objects.equals(this.currentRevision, normalizedProject.currentRevision) &&
        Objects.equals(this.hosts, normalizedProject.hosts) &&
        Objects.equals(this.id, normalizedProject.id) &&
        Objects.equals(this.slug, normalizedProject.slug) &&
        Objects.equals(this.state, normalizedProject.state) &&
        Objects.equals(this.subscriptionId, normalizedProject.subscriptionId) &&
        Objects.equals(this.updatedAt, normalizedProject.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, currentRevision, hosts, id, slug, state, subscriptionId, updatedAt);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NormalizedProject {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    currentRevision: ").append(toIndentedString(currentRevision)).append("\n");
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("created_at");
    openapiFields.add("current_revision");
    openapiFields.add("hosts");
    openapiFields.add("id");
    openapiFields.add("slug");
    openapiFields.add("state");
    openapiFields.add("subscription_id");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("current_revision");
    openapiRequiredFields.add("hosts");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("slug");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("updated_at");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NormalizedProject
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!NormalizedProject.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NormalizedProject is not found in the empty JSON string", NormalizedProject.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!NormalizedProject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NormalizedProject` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NormalizedProject.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `current_revision`
      NormalizedProjectRevision.validateJsonObject(jsonObj.getAsJsonObject("current_revision"));
      // ensure the required json array is present
      if (jsonObj.get("hosts") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("hosts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `hosts` to be an array in the JSON string but got `%s`", jsonObj.get("hosts").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slug").toString()));
      }
      if (!jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("subscription_id") != null && !jsonObj.get("subscription_id").isJsonNull()) && !jsonObj.get("subscription_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NormalizedProject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NormalizedProject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NormalizedProject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NormalizedProject.class));

       return (TypeAdapter<T>) new TypeAdapter<NormalizedProject>() {
           @Override
           public void write(JsonWriter out, NormalizedProject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NormalizedProject read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NormalizedProject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NormalizedProject
  * @throws IOException if the JSON string is invalid with respect to NormalizedProject
  */
  public static NormalizedProject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NormalizedProject.class);
  }

 /**
  * Convert an instance of NormalizedProject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

