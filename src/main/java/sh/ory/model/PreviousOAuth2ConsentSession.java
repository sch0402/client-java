/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.19
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

/**
 * The response used to return used consent requests same as HandledLoginRequest, just with consent_request exposed as json
 */
@ApiModel(description = "The response used to return used consent requests same as HandledLoginRequest, just with consent_request exposed as json")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-26T08:08:53.586776858Z[Etc/UTC]")
public class PreviousOAuth2ConsentSession {
  public static final String SERIALIZED_NAME_CONSENT_REQUEST = "consent_request";
  @SerializedName(SERIALIZED_NAME_CONSENT_REQUEST)
  private OAuth2ConsentRequest consentRequest;

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

  public PreviousOAuth2ConsentSession() { 
  }

  public PreviousOAuth2ConsentSession consentRequest(OAuth2ConsentRequest consentRequest) {
    
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


  public PreviousOAuth2ConsentSession grantAccessTokenAudience(List<String> grantAccessTokenAudience) {
    
    this.grantAccessTokenAudience = grantAccessTokenAudience;
    return this;
  }

  public PreviousOAuth2ConsentSession addGrantAccessTokenAudienceItem(String grantAccessTokenAudienceItem) {
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


  public PreviousOAuth2ConsentSession grantScope(List<String> grantScope) {
    
    this.grantScope = grantScope;
    return this;
  }

  public PreviousOAuth2ConsentSession addGrantScopeItem(String grantScopeItem) {
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


  public PreviousOAuth2ConsentSession handledAt(OffsetDateTime handledAt) {
    
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


  public PreviousOAuth2ConsentSession remember(Boolean remember) {
    
    this.remember = remember;
    return this;
  }

   /**
   * Remember, if set to true, tells ORY Hydra to remember this consent authorization and reuse it if the same client asks the same user for the same, or a subset of, scope.
   * @return remember
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Remember, if set to true, tells ORY Hydra to remember this consent authorization and reuse it if the same client asks the same user for the same, or a subset of, scope.")

  public Boolean getRemember() {
    return remember;
  }


  public void setRemember(Boolean remember) {
    this.remember = remember;
  }


  public PreviousOAuth2ConsentSession rememberFor(Long rememberFor) {
    
    this.rememberFor = rememberFor;
    return this;
  }

   /**
   * RememberFor sets how long the consent authorization should be remembered for in seconds. If set to &#x60;0&#x60;, the authorization will be remembered indefinitely.
   * @return rememberFor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RememberFor sets how long the consent authorization should be remembered for in seconds. If set to `0`, the authorization will be remembered indefinitely.")

  public Long getRememberFor() {
    return rememberFor;
  }


  public void setRememberFor(Long rememberFor) {
    this.rememberFor = rememberFor;
  }


  public PreviousOAuth2ConsentSession session(AcceptOAuth2ConsentRequestSession session) {
    
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
    PreviousOAuth2ConsentSession previousOAuth2ConsentSession = (PreviousOAuth2ConsentSession) o;
    return Objects.equals(this.consentRequest, previousOAuth2ConsentSession.consentRequest) &&
        Objects.equals(this.grantAccessTokenAudience, previousOAuth2ConsentSession.grantAccessTokenAudience) &&
        Objects.equals(this.grantScope, previousOAuth2ConsentSession.grantScope) &&
        Objects.equals(this.handledAt, previousOAuth2ConsentSession.handledAt) &&
        Objects.equals(this.remember, previousOAuth2ConsentSession.remember) &&
        Objects.equals(this.rememberFor, previousOAuth2ConsentSession.rememberFor) &&
        Objects.equals(this.session, previousOAuth2ConsentSession.session);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentRequest, grantAccessTokenAudience, grantScope, handledAt, remember, rememberFor, session);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreviousOAuth2ConsentSession {\n");
    sb.append("    consentRequest: ").append(toIndentedString(consentRequest)).append("\n");
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

}

