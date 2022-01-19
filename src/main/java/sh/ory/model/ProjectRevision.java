/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.51
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
import java.util.UUID;
import sh.ory.model.ProjectLookupSecretConfig;
import sh.ory.model.ProjectOidcConfig;
import sh.ory.model.ProjectPasswordConfig;
import sh.ory.model.ProjectRecoveryConfig;
import sh.ory.model.ProjectTotpConfig;
import sh.ory.model.ProjectVerificationConfig;
import sh.ory.model.ProjectWebAuthnConfig;
import sh.ory.model.RedirectionConfig;

/**
 * ProjectRevision
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-19T13:19:22.090676685Z[Etc/UTC]")
public class ProjectRevision {
  public static final String SERIALIZED_NAME_API_URL = "api_url";
  @SerializedName(SERIALIZED_NAME_API_URL)
  private String apiUrl;

  public static final String SERIALIZED_NAME_APPLICATION_URL = "application_url";
  @SerializedName(SERIALIZED_NAME_APPLICATION_URL)
  private String applicationUrl;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DEFAULT_IDENTITY_SCHEMA_URL = "default_identity_schema_url";
  @SerializedName(SERIALIZED_NAME_DEFAULT_IDENTITY_SCHEMA_URL)
  private String defaultIdentitySchemaUrl;

  public static final String SERIALIZED_NAME_ERROR_UI_URL = "error_ui_url";
  @SerializedName(SERIALIZED_NAME_ERROR_UI_URL)
  private String errorUiUrl;

  public static final String SERIALIZED_NAME_HOSTS = "hosts";
  @SerializedName(SERIALIZED_NAME_HOSTS)
  private List<String> hosts = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_KRATOS_CONFIG_VERSION = "kratos_config_version";
  @SerializedName(SERIALIZED_NAME_KRATOS_CONFIG_VERSION)
  private String kratosConfigVersion;

  public static final String SERIALIZED_NAME_KRATOS_CUSTOM_SCHEMA_ID = "kratos_custom_schema_id";
  @SerializedName(SERIALIZED_NAME_KRATOS_CUSTOM_SCHEMA_ID)
  private String kratosCustomSchemaId;

  public static final String SERIALIZED_NAME_LOGIN_UI_URL = "login_ui_url";
  @SerializedName(SERIALIZED_NAME_LOGIN_UI_URL)
  private String loginUiUrl;

  public static final String SERIALIZED_NAME_LOOKUP_SECRET = "lookup_secret";
  @SerializedName(SERIALIZED_NAME_LOOKUP_SECRET)
  private ProjectLookupSecretConfig lookupSecret;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OIDC_PROVIDERS = "oidc_providers";
  @SerializedName(SERIALIZED_NAME_OIDC_PROVIDERS)
  private List<ProjectOidcConfig> oidcProviders = null;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private ProjectPasswordConfig password;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private UUID projectId;

  public static final String SERIALIZED_NAME_RECOVERY = "recovery";
  @SerializedName(SERIALIZED_NAME_RECOVERY)
  private ProjectRecoveryConfig recovery;

  public static final String SERIALIZED_NAME_RECOVERY_UI_URL = "recovery_ui_url";
  @SerializedName(SERIALIZED_NAME_RECOVERY_UI_URL)
  private String recoveryUiUrl;

  public static final String SERIALIZED_NAME_REDIRECTION_CONFIG = "redirection_config";
  @SerializedName(SERIALIZED_NAME_REDIRECTION_CONFIG)
  private RedirectionConfig redirectionConfig;

  public static final String SERIALIZED_NAME_REGISTRATION_UI_URL = "registration_ui_url";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_UI_URL)
  private String registrationUiUrl;

  public static final String SERIALIZED_NAME_SESSION_AFTER_SIGN_UP = "session_after_sign_up";
  @SerializedName(SERIALIZED_NAME_SESSION_AFTER_SIGN_UP)
  private Boolean sessionAfterSignUp;

  public static final String SERIALIZED_NAME_SESSION_SOFT2FA = "session_soft_2fa";
  @SerializedName(SERIALIZED_NAME_SESSION_SOFT2FA)
  private Boolean sessionSoft2fa;

  public static final String SERIALIZED_NAME_SETTINGS_PRIVILEGED_SESSION_MAX_AGE_SECONDS = "settings_privileged_session_max_age_seconds";
  @SerializedName(SERIALIZED_NAME_SETTINGS_PRIVILEGED_SESSION_MAX_AGE_SECONDS)
  private Long settingsPrivilegedSessionMaxAgeSeconds;

  public static final String SERIALIZED_NAME_SETTINGS_SOFT2FA = "settings_soft_2fa";
  @SerializedName(SERIALIZED_NAME_SETTINGS_SOFT2FA)
  private Boolean settingsSoft2fa;

  public static final String SERIALIZED_NAME_SETTINGS_UI_URL = "settings_ui_url";
  @SerializedName(SERIALIZED_NAME_SETTINGS_UI_URL)
  private String settingsUiUrl;

  public static final String SERIALIZED_NAME_TOTP = "totp";
  @SerializedName(SERIALIZED_NAME_TOTP)
  private ProjectTotpConfig totp;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_VERIFICATION = "verification";
  @SerializedName(SERIALIZED_NAME_VERIFICATION)
  private ProjectVerificationConfig verification;

  public static final String SERIALIZED_NAME_VERIFICATION_UI_URL = "verification_ui_url";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_UI_URL)
  private String verificationUiUrl;

  public static final String SERIALIZED_NAME_WEBAUTHN = "webauthn";
  @SerializedName(SERIALIZED_NAME_WEBAUTHN)
  private ProjectWebAuthnConfig webauthn;


  public ProjectRevision apiUrl(String apiUrl) {
    
    this.apiUrl = apiUrl;
    return this;
  }

   /**
   * The Project API URL  The URL where the Project&#39;s APIs are available.
   * @return apiUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The Project API URL  The URL where the Project's APIs are available.")

  public String getApiUrl() {
    return apiUrl;
  }


  public void setApiUrl(String apiUrl) {
    this.apiUrl = apiUrl;
  }


  public ProjectRevision applicationUrl(String applicationUrl) {
    
    this.applicationUrl = applicationUrl;
    return this;
  }

   /**
   * Your Application URL  The URL where your application is available. Your users will be redirected to this URL when they successfully complete a login, logout, verification, recovery, or registration flow.  More fine-grained redirection patterns are available for the individual flows.
   * @return applicationUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Your Application URL  The URL where your application is available. Your users will be redirected to this URL when they successfully complete a login, logout, verification, recovery, or registration flow.  More fine-grained redirection patterns are available for the individual flows.")

  public String getApplicationUrl() {
    return applicationUrl;
  }


  public void setApplicationUrl(String applicationUrl) {
    this.applicationUrl = applicationUrl;
  }


   /**
   * The Project&#39;s Revision Creation Date
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The Project's Revision Creation Date")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




  public ProjectRevision defaultIdentitySchemaUrl(String defaultIdentitySchemaUrl) {
    
    this.defaultIdentitySchemaUrl = defaultIdentitySchemaUrl;
    return this;
  }

   /**
   * Default Identity Schema URL  This represents your Ory Kratos Default Identity Schema. It is your identity&#39;s default schema. This allows setting custom fields such as \&quot;address\&quot;, specifying whether you want to log in using email or a username, and more. For more information on this topic, please check out the identity documentation.  The value of this field can be either any \&quot;https://\&quot; URL - for example a file hosted at GitHub, or a &#x60;preset://&#x60;-prefixed string. Available profiles are:  profile://email profile://username
   * @return defaultIdentitySchemaUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Default Identity Schema URL  This represents your Ory Kratos Default Identity Schema. It is your identity's default schema. This allows setting custom fields such as \"address\", specifying whether you want to log in using email or a username, and more. For more information on this topic, please check out the identity documentation.  The value of this field can be either any \"https://\" URL - for example a file hosted at GitHub, or a `preset://`-prefixed string. Available profiles are:  profile://email profile://username")

  public String getDefaultIdentitySchemaUrl() {
    return defaultIdentitySchemaUrl;
  }


  public void setDefaultIdentitySchemaUrl(String defaultIdentitySchemaUrl) {
    this.defaultIdentitySchemaUrl = defaultIdentitySchemaUrl;
  }


  public ProjectRevision errorUiUrl(String errorUiUrl) {
    
    this.errorUiUrl = errorUiUrl;
    return this;
  }

   /**
   * Self-Service Error UI URL  Sets the UI URL for the error UI. If left empty, this will use Ory&#39;s hosted pages.
   * @return errorUiUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Self-Service Error UI URL  Sets the UI URL for the error UI. If left empty, this will use Ory's hosted pages.")

  public String getErrorUiUrl() {
    return errorUiUrl;
  }


  public void setErrorUiUrl(String errorUiUrl) {
    this.errorUiUrl = errorUiUrl;
  }


  public ProjectRevision hosts(List<String> hosts) {
    
    this.hosts = hosts;
    return this;
  }

  public ProjectRevision addHostsItem(String hostsItem) {
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


  public ProjectRevision id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


   /**
   * The Project&#39;s Kratos Config Version
   * @return kratosConfigVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Project's Kratos Config Version")

  public String getKratosConfigVersion() {
    return kratosConfigVersion;
  }




  public ProjectRevision kratosCustomSchemaId(String kratosCustomSchemaId) {
    
    this.kratosCustomSchemaId = kratosCustomSchemaId;
    return this;
  }

   /**
   * Get kratosCustomSchemaId
   * @return kratosCustomSchemaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKratosCustomSchemaId() {
    return kratosCustomSchemaId;
  }


  public void setKratosCustomSchemaId(String kratosCustomSchemaId) {
    this.kratosCustomSchemaId = kratosCustomSchemaId;
  }


  public ProjectRevision loginUiUrl(String loginUiUrl) {
    
    this.loginUiUrl = loginUiUrl;
    return this;
  }

   /**
   * Self-Service Login UI URL  Sets the UI URL for the login UI. If left empty, this will use Ory&#39;s hosted pages.
   * @return loginUiUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Self-Service Login UI URL  Sets the UI URL for the login UI. If left empty, this will use Ory's hosted pages.")

  public String getLoginUiUrl() {
    return loginUiUrl;
  }


  public void setLoginUiUrl(String loginUiUrl) {
    this.loginUiUrl = loginUiUrl;
  }


  public ProjectRevision lookupSecret(ProjectLookupSecretConfig lookupSecret) {
    
    this.lookupSecret = lookupSecret;
    return this;
  }

   /**
   * Get lookupSecret
   * @return lookupSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProjectLookupSecretConfig getLookupSecret() {
    return lookupSecret;
  }


  public void setLookupSecret(ProjectLookupSecretConfig lookupSecret) {
    this.lookupSecret = lookupSecret;
  }


  public ProjectRevision name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The project&#39;s name.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The project's name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ProjectRevision oidcProviders(List<ProjectOidcConfig> oidcProviders) {
    
    this.oidcProviders = oidcProviders;
    return this;
  }

  public ProjectRevision addOidcProvidersItem(ProjectOidcConfig oidcProvidersItem) {
    if (this.oidcProviders == null) {
      this.oidcProviders = new ArrayList<>();
    }
    this.oidcProviders.add(oidcProvidersItem);
    return this;
  }

   /**
   * Get oidcProviders
   * @return oidcProviders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ProjectOidcConfig> getOidcProviders() {
    return oidcProviders;
  }


  public void setOidcProviders(List<ProjectOidcConfig> oidcProviders) {
    this.oidcProviders = oidcProviders;
  }


  public ProjectRevision password(ProjectPasswordConfig password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProjectPasswordConfig getPassword() {
    return password;
  }


  public void setPassword(ProjectPasswordConfig password) {
    this.password = password;
  }


  public ProjectRevision projectId(UUID projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getProjectId() {
    return projectId;
  }


  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }


  public ProjectRevision recovery(ProjectRecoveryConfig recovery) {
    
    this.recovery = recovery;
    return this;
  }

   /**
   * Get recovery
   * @return recovery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProjectRecoveryConfig getRecovery() {
    return recovery;
  }


  public void setRecovery(ProjectRecoveryConfig recovery) {
    this.recovery = recovery;
  }


  public ProjectRevision recoveryUiUrl(String recoveryUiUrl) {
    
    this.recoveryUiUrl = recoveryUiUrl;
    return this;
  }

   /**
   * Self-Service Login UI URL  Sets the UI URL for the recovery UI. If left empty, this will use Ory&#39;s hosted pages.
   * @return recoveryUiUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Self-Service Login UI URL  Sets the UI URL for the recovery UI. If left empty, this will use Ory's hosted pages.")

  public String getRecoveryUiUrl() {
    return recoveryUiUrl;
  }


  public void setRecoveryUiUrl(String recoveryUiUrl) {
    this.recoveryUiUrl = recoveryUiUrl;
  }


  public ProjectRevision redirectionConfig(RedirectionConfig redirectionConfig) {
    
    this.redirectionConfig = redirectionConfig;
    return this;
  }

   /**
   * Get redirectionConfig
   * @return redirectionConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RedirectionConfig getRedirectionConfig() {
    return redirectionConfig;
  }


  public void setRedirectionConfig(RedirectionConfig redirectionConfig) {
    this.redirectionConfig = redirectionConfig;
  }


  public ProjectRevision registrationUiUrl(String registrationUiUrl) {
    
    this.registrationUiUrl = registrationUiUrl;
    return this;
  }

   /**
   * Self-Service Login UI URL  Sets the UI URL for the registration UI. If left empty, this will use Ory&#39;s hosted pages.
   * @return registrationUiUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Self-Service Login UI URL  Sets the UI URL for the registration UI. If left empty, this will use Ory's hosted pages.")

  public String getRegistrationUiUrl() {
    return registrationUiUrl;
  }


  public void setRegistrationUiUrl(String registrationUiUrl) {
    this.registrationUiUrl = registrationUiUrl;
  }


  public ProjectRevision sessionAfterSignUp(Boolean sessionAfterSignUp) {
    
    this.sessionAfterSignUp = sessionAfterSignUp;
    return this;
  }

   /**
   * Issue Session after Sign Up  If set to true, users will receive a session after they successfully signed up. Enabling this option allows account enumeration during registration flows. Read more: https://www.ory.sh/kratos/docs/self-service/flows/user-registration#successful-registration
   * @return sessionAfterSignUp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Issue Session after Sign Up  If set to true, users will receive a session after they successfully signed up. Enabling this option allows account enumeration during registration flows. Read more: https://www.ory.sh/kratos/docs/self-service/flows/user-registration#successful-registration")

  public Boolean getSessionAfterSignUp() {
    return sessionAfterSignUp;
  }


  public void setSessionAfterSignUp(Boolean sessionAfterSignUp) {
    this.sessionAfterSignUp = sessionAfterSignUp;
  }


  public ProjectRevision sessionSoft2fa(Boolean sessionSoft2fa) {
    
    this.sessionSoft2fa = sessionSoft2fa;
    return this;
  }

   /**
   * Enable Soft 2FA for Login Sessions
   * @return sessionSoft2fa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enable Soft 2FA for Login Sessions")

  public Boolean getSessionSoft2fa() {
    return sessionSoft2fa;
  }


  public void setSessionSoft2fa(Boolean sessionSoft2fa) {
    this.sessionSoft2fa = sessionSoft2fa;
  }


  public ProjectRevision settingsPrivilegedSessionMaxAgeSeconds(Long settingsPrivilegedSessionMaxAgeSeconds) {
    
    this.settingsPrivilegedSessionMaxAgeSeconds = settingsPrivilegedSessionMaxAgeSeconds;
    return this;
  }

   /**
   * Duration in Seconds of how long a Session is Privileged  Defines how long a session is considered privileged in seconds. If the session&#39;s authenticated_at is older than the value specified here, the user needs to re-authenticate to perform certain actions (e.g. password change).
   * @return settingsPrivilegedSessionMaxAgeSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Duration in Seconds of how long a Session is Privileged  Defines how long a session is considered privileged in seconds. If the session's authenticated_at is older than the value specified here, the user needs to re-authenticate to perform certain actions (e.g. password change).")

  public Long getSettingsPrivilegedSessionMaxAgeSeconds() {
    return settingsPrivilegedSessionMaxAgeSeconds;
  }


  public void setSettingsPrivilegedSessionMaxAgeSeconds(Long settingsPrivilegedSessionMaxAgeSeconds) {
    this.settingsPrivilegedSessionMaxAgeSeconds = settingsPrivilegedSessionMaxAgeSeconds;
  }


  public ProjectRevision settingsSoft2fa(Boolean settingsSoft2fa) {
    
    this.settingsSoft2fa = settingsSoft2fa;
    return this;
  }

   /**
   * Enable Soft 2FA for Self-Service Settings Flows
   * @return settingsSoft2fa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enable Soft 2FA for Self-Service Settings Flows")

  public Boolean getSettingsSoft2fa() {
    return settingsSoft2fa;
  }


  public void setSettingsSoft2fa(Boolean settingsSoft2fa) {
    this.settingsSoft2fa = settingsSoft2fa;
  }


  public ProjectRevision settingsUiUrl(String settingsUiUrl) {
    
    this.settingsUiUrl = settingsUiUrl;
    return this;
  }

   /**
   * Self-Service Settings UI URL  Sets the UI URL for the settings UI. If left empty, this will use Ory&#39;s hosted pages.
   * @return settingsUiUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Self-Service Settings UI URL  Sets the UI URL for the settings UI. If left empty, this will use Ory's hosted pages.")

  public String getSettingsUiUrl() {
    return settingsUiUrl;
  }


  public void setSettingsUiUrl(String settingsUiUrl) {
    this.settingsUiUrl = settingsUiUrl;
  }


  public ProjectRevision totp(ProjectTotpConfig totp) {
    
    this.totp = totp;
    return this;
  }

   /**
   * Get totp
   * @return totp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProjectTotpConfig getTotp() {
    return totp;
  }


  public void setTotp(ProjectTotpConfig totp) {
    this.totp = totp;
  }


   /**
   * Last Time Project&#39;s Revision was Updated
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Last Time Project's Revision was Updated")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }




  public ProjectRevision verification(ProjectVerificationConfig verification) {
    
    this.verification = verification;
    return this;
  }

   /**
   * Get verification
   * @return verification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProjectVerificationConfig getVerification() {
    return verification;
  }


  public void setVerification(ProjectVerificationConfig verification) {
    this.verification = verification;
  }


  public ProjectRevision verificationUiUrl(String verificationUiUrl) {
    
    this.verificationUiUrl = verificationUiUrl;
    return this;
  }

   /**
   * Self-Service Login UI URL  Sets the UI URL for the verification UI. If left empty, this will use Ory&#39;s hosted pages.
   * @return verificationUiUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Self-Service Login UI URL  Sets the UI URL for the verification UI. If left empty, this will use Ory's hosted pages.")

  public String getVerificationUiUrl() {
    return verificationUiUrl;
  }


  public void setVerificationUiUrl(String verificationUiUrl) {
    this.verificationUiUrl = verificationUiUrl;
  }


  public ProjectRevision webauthn(ProjectWebAuthnConfig webauthn) {
    
    this.webauthn = webauthn;
    return this;
  }

   /**
   * Get webauthn
   * @return webauthn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProjectWebAuthnConfig getWebauthn() {
    return webauthn;
  }


  public void setWebauthn(ProjectWebAuthnConfig webauthn) {
    this.webauthn = webauthn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectRevision projectRevision = (ProjectRevision) o;
    return Objects.equals(this.apiUrl, projectRevision.apiUrl) &&
        Objects.equals(this.applicationUrl, projectRevision.applicationUrl) &&
        Objects.equals(this.createdAt, projectRevision.createdAt) &&
        Objects.equals(this.defaultIdentitySchemaUrl, projectRevision.defaultIdentitySchemaUrl) &&
        Objects.equals(this.errorUiUrl, projectRevision.errorUiUrl) &&
        Objects.equals(this.hosts, projectRevision.hosts) &&
        Objects.equals(this.id, projectRevision.id) &&
        Objects.equals(this.kratosConfigVersion, projectRevision.kratosConfigVersion) &&
        Objects.equals(this.kratosCustomSchemaId, projectRevision.kratosCustomSchemaId) &&
        Objects.equals(this.loginUiUrl, projectRevision.loginUiUrl) &&
        Objects.equals(this.lookupSecret, projectRevision.lookupSecret) &&
        Objects.equals(this.name, projectRevision.name) &&
        Objects.equals(this.oidcProviders, projectRevision.oidcProviders) &&
        Objects.equals(this.password, projectRevision.password) &&
        Objects.equals(this.projectId, projectRevision.projectId) &&
        Objects.equals(this.recovery, projectRevision.recovery) &&
        Objects.equals(this.recoveryUiUrl, projectRevision.recoveryUiUrl) &&
        Objects.equals(this.redirectionConfig, projectRevision.redirectionConfig) &&
        Objects.equals(this.registrationUiUrl, projectRevision.registrationUiUrl) &&
        Objects.equals(this.sessionAfterSignUp, projectRevision.sessionAfterSignUp) &&
        Objects.equals(this.sessionSoft2fa, projectRevision.sessionSoft2fa) &&
        Objects.equals(this.settingsPrivilegedSessionMaxAgeSeconds, projectRevision.settingsPrivilegedSessionMaxAgeSeconds) &&
        Objects.equals(this.settingsSoft2fa, projectRevision.settingsSoft2fa) &&
        Objects.equals(this.settingsUiUrl, projectRevision.settingsUiUrl) &&
        Objects.equals(this.totp, projectRevision.totp) &&
        Objects.equals(this.updatedAt, projectRevision.updatedAt) &&
        Objects.equals(this.verification, projectRevision.verification) &&
        Objects.equals(this.verificationUiUrl, projectRevision.verificationUiUrl) &&
        Objects.equals(this.webauthn, projectRevision.webauthn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiUrl, applicationUrl, createdAt, defaultIdentitySchemaUrl, errorUiUrl, hosts, id, kratosConfigVersion, kratosCustomSchemaId, loginUiUrl, lookupSecret, name, oidcProviders, password, projectId, recovery, recoveryUiUrl, redirectionConfig, registrationUiUrl, sessionAfterSignUp, sessionSoft2fa, settingsPrivilegedSessionMaxAgeSeconds, settingsSoft2fa, settingsUiUrl, totp, updatedAt, verification, verificationUiUrl, webauthn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectRevision {\n");
    sb.append("    apiUrl: ").append(toIndentedString(apiUrl)).append("\n");
    sb.append("    applicationUrl: ").append(toIndentedString(applicationUrl)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    defaultIdentitySchemaUrl: ").append(toIndentedString(defaultIdentitySchemaUrl)).append("\n");
    sb.append("    errorUiUrl: ").append(toIndentedString(errorUiUrl)).append("\n");
    sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kratosConfigVersion: ").append(toIndentedString(kratosConfigVersion)).append("\n");
    sb.append("    kratosCustomSchemaId: ").append(toIndentedString(kratosCustomSchemaId)).append("\n");
    sb.append("    loginUiUrl: ").append(toIndentedString(loginUiUrl)).append("\n");
    sb.append("    lookupSecret: ").append(toIndentedString(lookupSecret)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oidcProviders: ").append(toIndentedString(oidcProviders)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    recovery: ").append(toIndentedString(recovery)).append("\n");
    sb.append("    recoveryUiUrl: ").append(toIndentedString(recoveryUiUrl)).append("\n");
    sb.append("    redirectionConfig: ").append(toIndentedString(redirectionConfig)).append("\n");
    sb.append("    registrationUiUrl: ").append(toIndentedString(registrationUiUrl)).append("\n");
    sb.append("    sessionAfterSignUp: ").append(toIndentedString(sessionAfterSignUp)).append("\n");
    sb.append("    sessionSoft2fa: ").append(toIndentedString(sessionSoft2fa)).append("\n");
    sb.append("    settingsPrivilegedSessionMaxAgeSeconds: ").append(toIndentedString(settingsPrivilegedSessionMaxAgeSeconds)).append("\n");
    sb.append("    settingsSoft2fa: ").append(toIndentedString(settingsSoft2fa)).append("\n");
    sb.append("    settingsUiUrl: ").append(toIndentedString(settingsUiUrl)).append("\n");
    sb.append("    totp: ").append(toIndentedString(totp)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    verification: ").append(toIndentedString(verification)).append("\n");
    sb.append("    verificationUiUrl: ").append(toIndentedString(verificationUiUrl)).append("\n");
    sb.append("    webauthn: ").append(toIndentedString(webauthn)).append("\n");
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

