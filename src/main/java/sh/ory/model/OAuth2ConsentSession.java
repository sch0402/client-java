/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.14
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
import sh.ory.model.AcceptOAuth2ConsentRequestSession;
import sh.ory.model.OAuth2ConsentRequest;
import sh.ory.model.OAuth2ConsentSessionExpiresAt;

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
 * A completed OAuth 2.0 Consent Session.
 */
@ApiModel(description = "A completed OAuth 2.0 Consent Session.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-17T09:43:42.716496396Z[Etc/UTC]")
public class OAuth2ConsentSession {
  public static final String SERIALIZED_NAME_CONSENT_REQUEST = "consent_request";
  @SerializedName(SERIALIZED_NAME_CONSENT_REQUEST)
  private OAuth2ConsentRequest consentRequest;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OAuth2ConsentSessionExpiresAt expiresAt;

  public static final String SERIALIZED_NAME_GRANT_ACCESS_TOKEN_AUDIENCE = "grant_access_token_audience";
  @SerializedName(SERIALIZED_NAME_GRANT_ACCESS_TOKEN_AUDIENCE)
  private List<String> grantAccessTokenAudience = null;

  public static final String SERIALIZED_NAME_GRANT_SCOPE = "grant_scope";
  @SerializedName(SERIALIZED_NAME_GRANT_SCOPE)
  private List<String> grantScope = null;

  public static final String SERIALIZED_NAME_HANDLED_AT = "handled_at";
  @SerializedName(SERIALIZED_NAME_HANDLED_AT)
  private OffsetDateTime handledAt;

  public static final String SERIALIZED_NAME_REMEMBER = "remember";
  @SerializedName(SERIALIZED_NAME_REMEMBER)
  private Boolean remember;

  public static final String SERIALIZED_NAME_REMEMBER_FOR = "remember_for";
  @SerializedName(SERIALIZED_NAME_REMEMBER_FOR)
  private Long rememberFor;

  public static final String SERIALIZED_NAME_SESSION = "session";
  @SerializedName(SERIALIZED_NAME_SESSION)
  private AcceptOAuth2ConsentRequestSession session;

  public OAuth2ConsentSession() {
  }

  public OAuth2ConsentSession consentRequest(OAuth2ConsentRequest consentRequest) {
    
    this.consentRequest = consentRequest;
    return this;
  }

   /**
   * Get consentRequest
   * @return consentRequest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OAuth2ConsentRequest getConsentRequest() {
    return consentRequest;
  }


  public void setConsentRequest(OAuth2ConsentRequest consentRequest) {
    this.consentRequest = consentRequest;
  }


  public OAuth2ConsentSession expiresAt(OAuth2ConsentSessionExpiresAt expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Get expiresAt
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OAuth2ConsentSessionExpiresAt getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(OAuth2ConsentSessionExpiresAt expiresAt) {
    this.expiresAt = expiresAt;
  }


  public OAuth2ConsentSession grantAccessTokenAudience(List<String> grantAccessTokenAudience) {
    
    this.grantAccessTokenAudience = grantAccessTokenAudience;
    return this;
  }

  public OAuth2ConsentSession addGrantAccessTokenAudienceItem(String grantAccessTokenAudienceItem) {
    if (this.grantAccessTokenAudience == null) {
      this.grantAccessTokenAudience = new ArrayList<>();
    }
    this.grantAccessTokenAudience.add(grantAccessTokenAudienceItem);
    return this;
  }

   /**
   * Get grantAccessTokenAudience
   * @return grantAccessTokenAudience
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getGrantAccessTokenAudience() {
    return grantAccessTokenAudience;
  }


  public void setGrantAccessTokenAudience(List<String> grantAccessTokenAudience) {
    this.grantAccessTokenAudience = grantAccessTokenAudience;
  }


  public OAuth2ConsentSession grantScope(List<String> grantScope) {
    
    this.grantScope = grantScope;
    return this;
  }

  public OAuth2ConsentSession addGrantScopeItem(String grantScopeItem) {
    if (this.grantScope == null) {
      this.grantScope = new ArrayList<>();
    }
    this.grantScope.add(grantScopeItem);
    return this;
  }

   /**
   * Get grantScope
   * @return grantScope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getGrantScope() {
    return grantScope;
  }


  public void setGrantScope(List<String> grantScope) {
    this.grantScope = grantScope;
  }


  public OAuth2ConsentSession handledAt(OffsetDateTime handledAt) {
    
    this.handledAt = handledAt;
    return this;
  }

   /**
   * Get handledAt
   * @return handledAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getHandledAt() {
    return handledAt;
  }


  public void setHandledAt(OffsetDateTime handledAt) {
    this.handledAt = handledAt;
  }


  public OAuth2ConsentSession remember(Boolean remember) {
    
    this.remember = remember;
    return this;
  }

   /**
   * Remember Consent  Remember, if set to true, tells ORY Hydra to remember this consent authorization and reuse it if the same client asks the same user for the same, or a subset of, scope.
   * @return remember
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Remember Consent  Remember, if set to true, tells ORY Hydra to remember this consent authorization and reuse it if the same client asks the same user for the same, or a subset of, scope.")

  public Boolean getRemember() {
    return remember;
  }


  public void setRemember(Boolean remember) {
    this.remember = remember;
  }


  public OAuth2ConsentSession rememberFor(Long rememberFor) {
    
    this.rememberFor = rememberFor;
    return this;
  }

   /**
   * Remember Consent For  RememberFor sets how long the consent authorization should be remembered for in seconds. If set to &#x60;0&#x60;, the authorization will be remembered indefinitely.
   * @return rememberFor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Remember Consent For  RememberFor sets how long the consent authorization should be remembered for in seconds. If set to `0`, the authorization will be remembered indefinitely.")

  public Long getRememberFor() {
    return rememberFor;
  }


  public void setRememberFor(Long rememberFor) {
    this.rememberFor = rememberFor;
  }


  public OAuth2ConsentSession session(AcceptOAuth2ConsentRequestSession session) {
    
    this.session = session;
    return this;
  }

   /**
   * Get session
   * @return session
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AcceptOAuth2ConsentRequestSession getSession() {
    return session;
  }


  public void setSession(AcceptOAuth2ConsentRequestSession session) {
    this.session = session;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuth2ConsentSession oAuth2ConsentSession = (OAuth2ConsentSession) o;
    return Objects.equals(this.consentRequest, oAuth2ConsentSession.consentRequest) &&
        Objects.equals(this.expiresAt, oAuth2ConsentSession.expiresAt) &&
        Objects.equals(this.grantAccessTokenAudience, oAuth2ConsentSession.grantAccessTokenAudience) &&
        Objects.equals(this.grantScope, oAuth2ConsentSession.grantScope) &&
        Objects.equals(this.handledAt, oAuth2ConsentSession.handledAt) &&
        Objects.equals(this.remember, oAuth2ConsentSession.remember) &&
        Objects.equals(this.rememberFor, oAuth2ConsentSession.rememberFor) &&
        Objects.equals(this.session, oAuth2ConsentSession.session);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentRequest, expiresAt, grantAccessTokenAudience, grantScope, handledAt, remember, rememberFor, session);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuth2ConsentSession {\n");
    sb.append("    consentRequest: ").append(toIndentedString(consentRequest)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    grantAccessTokenAudience: ").append(toIndentedString(grantAccessTokenAudience)).append("\n");
    sb.append("    grantScope: ").append(toIndentedString(grantScope)).append("\n");
    sb.append("    handledAt: ").append(toIndentedString(handledAt)).append("\n");
    sb.append("    remember: ").append(toIndentedString(remember)).append("\n");
    sb.append("    rememberFor: ").append(toIndentedString(rememberFor)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
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
    openapiFields.add("consent_request");
    openapiFields.add("expires_at");
    openapiFields.add("grant_access_token_audience");
    openapiFields.add("grant_scope");
    openapiFields.add("handled_at");
    openapiFields.add("remember");
    openapiFields.add("remember_for");
    openapiFields.add("session");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OAuth2ConsentSession
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OAuth2ConsentSession.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OAuth2ConsentSession is not found in the empty JSON string", OAuth2ConsentSession.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OAuth2ConsentSession.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OAuth2ConsentSession` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `consent_request`
      if (jsonObj.get("consent_request") != null && !jsonObj.get("consent_request").isJsonNull()) {
        OAuth2ConsentRequest.validateJsonObject(jsonObj.getAsJsonObject("consent_request"));
      }
      // validate the optional field `expires_at`
      if (jsonObj.get("expires_at") != null && !jsonObj.get("expires_at").isJsonNull()) {
        OAuth2ConsentSessionExpiresAt.validateJsonObject(jsonObj.getAsJsonObject("expires_at"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("grant_access_token_audience") != null && !jsonObj.get("grant_access_token_audience").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `grant_access_token_audience` to be an array in the JSON string but got `%s`", jsonObj.get("grant_access_token_audience").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("grant_scope") != null && !jsonObj.get("grant_scope").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `grant_scope` to be an array in the JSON string but got `%s`", jsonObj.get("grant_scope").toString()));
      }
      // validate the optional field `session`
      if (jsonObj.get("session") != null && !jsonObj.get("session").isJsonNull()) {
        AcceptOAuth2ConsentRequestSession.validateJsonObject(jsonObj.getAsJsonObject("session"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OAuth2ConsentSession.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OAuth2ConsentSession' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OAuth2ConsentSession> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OAuth2ConsentSession.class));

       return (TypeAdapter<T>) new TypeAdapter<OAuth2ConsentSession>() {
           @Override
           public void write(JsonWriter out, OAuth2ConsentSession value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OAuth2ConsentSession read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OAuth2ConsentSession given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OAuth2ConsentSession
  * @throws IOException if the JSON string is invalid with respect to OAuth2ConsentSession
  */
  public static OAuth2ConsentSession fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OAuth2ConsentSession.class);
  }

 /**
  * Convert an instance of OAuth2ConsentSession to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

