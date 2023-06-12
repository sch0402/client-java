/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.34
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import sh.ory.model.IdentityCredentials;
import sh.ory.model.IdentityState;
import sh.ory.model.RecoveryIdentityAddress;
import sh.ory.model.VerifiableIdentityAddress;

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
 * An [identity](https://www.ory.sh/docs/kratos/concepts/identity-user-model) represents a (human) user in Ory.
 */
@ApiModel(description = "An [identity](https://www.ory.sh/docs/kratos/concepts/identity-user-model) represents a (human) user in Ory.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-12T19:11:50.466866580Z[Etc/UTC]")
public class Identity {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CREDENTIALS = "credentials";
  @SerializedName(SERIALIZED_NAME_CREDENTIALS)
  private Map<String, IdentityCredentials> credentials = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_METADATA_ADMIN = "metadata_admin";
  @SerializedName(SERIALIZED_NAME_METADATA_ADMIN)
  private Object metadataAdmin;

  public static final String SERIALIZED_NAME_METADATA_PUBLIC = "metadata_public";
  @SerializedName(SERIALIZED_NAME_METADATA_PUBLIC)
  private Object metadataPublic;

  public static final String SERIALIZED_NAME_RECOVERY_ADDRESSES = "recovery_addresses";
  @SerializedName(SERIALIZED_NAME_RECOVERY_ADDRESSES)
  private List<RecoveryIdentityAddress> recoveryAddresses = null;

  public static final String SERIALIZED_NAME_SCHEMA_ID = "schema_id";
  @SerializedName(SERIALIZED_NAME_SCHEMA_ID)
  private String schemaId;

  public static final String SERIALIZED_NAME_SCHEMA_URL = "schema_url";
  @SerializedName(SERIALIZED_NAME_SCHEMA_URL)
  private String schemaUrl;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private IdentityState state;

  public static final String SERIALIZED_NAME_STATE_CHANGED_AT = "state_changed_at";
  @SerializedName(SERIALIZED_NAME_STATE_CHANGED_AT)
  private OffsetDateTime stateChangedAt;

  public static final String SERIALIZED_NAME_TRAITS = "traits";
  @SerializedName(SERIALIZED_NAME_TRAITS)
  private Object traits = null;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_VERIFIABLE_ADDRESSES = "verifiable_addresses";
  @SerializedName(SERIALIZED_NAME_VERIFIABLE_ADDRESSES)
  private List<VerifiableIdentityAddress> verifiableAddresses = null;

  public Identity() {
  }

  public Identity createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * CreatedAt is a helper struct field for gobuffalo.pop.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CreatedAt is a helper struct field for gobuffalo.pop.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Identity credentials(Map<String, IdentityCredentials> credentials) {
    
    this.credentials = credentials;
    return this;
  }

  public Identity putCredentialsItem(String key, IdentityCredentials credentialsItem) {
    if (this.credentials == null) {
      this.credentials = new HashMap<>();
    }
    this.credentials.put(key, credentialsItem);
    return this;
  }

   /**
   * Credentials represents all credentials that can be used for authenticating this identity.
   * @return credentials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Credentials represents all credentials that can be used for authenticating this identity.")

  public Map<String, IdentityCredentials> getCredentials() {
    return credentials;
  }


  public void setCredentials(Map<String, IdentityCredentials> credentials) {
    this.credentials = credentials;
  }


  public Identity id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID is the identity&#39;s unique identifier.  The Identity ID can not be changed and can not be chosen. This ensures future compatibility and optimization for distributed stores such as CockroachDB.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ID is the identity's unique identifier.  The Identity ID can not be changed and can not be chosen. This ensures future compatibility and optimization for distributed stores such as CockroachDB.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Identity metadataAdmin(Object metadataAdmin) {
    
    this.metadataAdmin = metadataAdmin;
    return this;
  }

   /**
   * NullJSONRawMessage represents a json.RawMessage that works well with JSON, SQL, and Swagger and is NULLable-
   * @return metadataAdmin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NullJSONRawMessage represents a json.RawMessage that works well with JSON, SQL, and Swagger and is NULLable-")

  public Object getMetadataAdmin() {
    return metadataAdmin;
  }


  public void setMetadataAdmin(Object metadataAdmin) {
    this.metadataAdmin = metadataAdmin;
  }


  public Identity metadataPublic(Object metadataPublic) {
    
    this.metadataPublic = metadataPublic;
    return this;
  }

   /**
   * NullJSONRawMessage represents a json.RawMessage that works well with JSON, SQL, and Swagger and is NULLable-
   * @return metadataPublic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NullJSONRawMessage represents a json.RawMessage that works well with JSON, SQL, and Swagger and is NULLable-")

  public Object getMetadataPublic() {
    return metadataPublic;
  }


  public void setMetadataPublic(Object metadataPublic) {
    this.metadataPublic = metadataPublic;
  }


  public Identity recoveryAddresses(List<RecoveryIdentityAddress> recoveryAddresses) {
    
    this.recoveryAddresses = recoveryAddresses;
    return this;
  }

  public Identity addRecoveryAddressesItem(RecoveryIdentityAddress recoveryAddressesItem) {
    if (this.recoveryAddresses == null) {
      this.recoveryAddresses = new ArrayList<>();
    }
    this.recoveryAddresses.add(recoveryAddressesItem);
    return this;
  }

   /**
   * RecoveryAddresses contains all the addresses that can be used to recover an identity.
   * @return recoveryAddresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RecoveryAddresses contains all the addresses that can be used to recover an identity.")

  public List<RecoveryIdentityAddress> getRecoveryAddresses() {
    return recoveryAddresses;
  }


  public void setRecoveryAddresses(List<RecoveryIdentityAddress> recoveryAddresses) {
    this.recoveryAddresses = recoveryAddresses;
  }


  public Identity schemaId(String schemaId) {
    
    this.schemaId = schemaId;
    return this;
  }

   /**
   * SchemaID is the ID of the JSON Schema to be used for validating the identity&#39;s traits.
   * @return schemaId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "SchemaID is the ID of the JSON Schema to be used for validating the identity's traits.")

  public String getSchemaId() {
    return schemaId;
  }


  public void setSchemaId(String schemaId) {
    this.schemaId = schemaId;
  }


  public Identity schemaUrl(String schemaUrl) {
    
    this.schemaUrl = schemaUrl;
    return this;
  }

   /**
   * SchemaURL is the URL of the endpoint where the identity&#39;s traits schema can be fetched from.  format: url
   * @return schemaUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "SchemaURL is the URL of the endpoint where the identity's traits schema can be fetched from.  format: url")

  public String getSchemaUrl() {
    return schemaUrl;
  }


  public void setSchemaUrl(String schemaUrl) {
    this.schemaUrl = schemaUrl;
  }


  public Identity state(IdentityState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityState getState() {
    return state;
  }


  public void setState(IdentityState state) {
    this.state = state;
  }


  public Identity stateChangedAt(OffsetDateTime stateChangedAt) {
    
    this.stateChangedAt = stateChangedAt;
    return this;
  }

   /**
   * Get stateChangedAt
   * @return stateChangedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getStateChangedAt() {
    return stateChangedAt;
  }


  public void setStateChangedAt(OffsetDateTime stateChangedAt) {
    this.stateChangedAt = stateChangedAt;
  }


  public Identity traits(Object traits) {
    
    this.traits = traits;
    return this;
  }

   /**
   * Traits represent an identity&#39;s traits. The identity is able to create, modify, and delete traits in a self-service manner. The input will always be validated against the JSON Schema defined in &#x60;schema_url&#x60;.
   * @return traits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Traits represent an identity's traits. The identity is able to create, modify, and delete traits in a self-service manner. The input will always be validated against the JSON Schema defined in `schema_url`.")

  public Object getTraits() {
    return traits;
  }


  public void setTraits(Object traits) {
    this.traits = traits;
  }


  public Identity updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * UpdatedAt is a helper struct field for gobuffalo.pop.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UpdatedAt is a helper struct field for gobuffalo.pop.")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public Identity verifiableAddresses(List<VerifiableIdentityAddress> verifiableAddresses) {
    
    this.verifiableAddresses = verifiableAddresses;
    return this;
  }

  public Identity addVerifiableAddressesItem(VerifiableIdentityAddress verifiableAddressesItem) {
    if (this.verifiableAddresses == null) {
      this.verifiableAddresses = new ArrayList<>();
    }
    this.verifiableAddresses.add(verifiableAddressesItem);
    return this;
  }

   /**
   * VerifiableAddresses contains all the addresses that can be verified by the user.
   * @return verifiableAddresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "VerifiableAddresses contains all the addresses that can be verified by the user.")

  public List<VerifiableIdentityAddress> getVerifiableAddresses() {
    return verifiableAddresses;
  }


  public void setVerifiableAddresses(List<VerifiableIdentityAddress> verifiableAddresses) {
    this.verifiableAddresses = verifiableAddresses;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Identity identity = (Identity) o;
    return Objects.equals(this.createdAt, identity.createdAt) &&
        Objects.equals(this.credentials, identity.credentials) &&
        Objects.equals(this.id, identity.id) &&
        Objects.equals(this.metadataAdmin, identity.metadataAdmin) &&
        Objects.equals(this.metadataPublic, identity.metadataPublic) &&
        Objects.equals(this.recoveryAddresses, identity.recoveryAddresses) &&
        Objects.equals(this.schemaId, identity.schemaId) &&
        Objects.equals(this.schemaUrl, identity.schemaUrl) &&
        Objects.equals(this.state, identity.state) &&
        Objects.equals(this.stateChangedAt, identity.stateChangedAt) &&
        Objects.equals(this.traits, identity.traits) &&
        Objects.equals(this.updatedAt, identity.updatedAt) &&
        Objects.equals(this.verifiableAddresses, identity.verifiableAddresses);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, credentials, id, metadataAdmin, metadataPublic, recoveryAddresses, schemaId, schemaUrl, state, stateChangedAt, traits, updatedAt, verifiableAddresses);
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
    sb.append("class Identity {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metadataAdmin: ").append(toIndentedString(metadataAdmin)).append("\n");
    sb.append("    metadataPublic: ").append(toIndentedString(metadataPublic)).append("\n");
    sb.append("    recoveryAddresses: ").append(toIndentedString(recoveryAddresses)).append("\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    schemaUrl: ").append(toIndentedString(schemaUrl)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateChangedAt: ").append(toIndentedString(stateChangedAt)).append("\n");
    sb.append("    traits: ").append(toIndentedString(traits)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    verifiableAddresses: ").append(toIndentedString(verifiableAddresses)).append("\n");
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
    openapiFields.add("credentials");
    openapiFields.add("id");
    openapiFields.add("metadata_admin");
    openapiFields.add("metadata_public");
    openapiFields.add("recovery_addresses");
    openapiFields.add("schema_id");
    openapiFields.add("schema_url");
    openapiFields.add("state");
    openapiFields.add("state_changed_at");
    openapiFields.add("traits");
    openapiFields.add("updated_at");
    openapiFields.add("verifiable_addresses");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("schema_id");
    openapiRequiredFields.add("schema_url");
    openapiRequiredFields.add("traits");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Identity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Identity.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Identity is not found in the empty JSON string", Identity.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Identity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Identity` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Identity.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("recovery_addresses") != null && !jsonObj.get("recovery_addresses").isJsonNull()) {
        JsonArray jsonArrayrecoveryAddresses = jsonObj.getAsJsonArray("recovery_addresses");
        if (jsonArrayrecoveryAddresses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("recovery_addresses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `recovery_addresses` to be an array in the JSON string but got `%s`", jsonObj.get("recovery_addresses").toString()));
          }

          // validate the optional field `recovery_addresses` (array)
          for (int i = 0; i < jsonArrayrecoveryAddresses.size(); i++) {
            RecoveryIdentityAddress.validateJsonObject(jsonArrayrecoveryAddresses.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("schema_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `schema_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("schema_id").toString()));
      }
      if (!jsonObj.get("schema_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `schema_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("schema_url").toString()));
      }
      if (jsonObj.get("verifiable_addresses") != null && !jsonObj.get("verifiable_addresses").isJsonNull()) {
        JsonArray jsonArrayverifiableAddresses = jsonObj.getAsJsonArray("verifiable_addresses");
        if (jsonArrayverifiableAddresses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("verifiable_addresses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `verifiable_addresses` to be an array in the JSON string but got `%s`", jsonObj.get("verifiable_addresses").toString()));
          }

          // validate the optional field `verifiable_addresses` (array)
          for (int i = 0; i < jsonArrayverifiableAddresses.size(); i++) {
            VerifiableIdentityAddress.validateJsonObject(jsonArrayverifiableAddresses.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Identity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Identity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Identity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Identity.class));

       return (TypeAdapter<T>) new TypeAdapter<Identity>() {
           @Override
           public void write(JsonWriter out, Identity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Identity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Identity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Identity
  * @throws IOException if the JSON string is invalid with respect to Identity
  */
  public static Identity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Identity.class);
  }

 /**
  * Convert an instance of Identity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

