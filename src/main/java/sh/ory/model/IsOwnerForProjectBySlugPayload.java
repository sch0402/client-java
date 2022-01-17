/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.49
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

/**
 * IsOwnerForProjectBySlugPayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-17T16:05:39.727411413Z[Etc/UTC]")
public class IsOwnerForProjectBySlugPayload {
  public static final String SERIALIZED_NAME_PROJECT_SCOPE = "project_scope";
  @SerializedName(SERIALIZED_NAME_PROJECT_SCOPE)
  private String projectScope;

  public static final String SERIALIZED_NAME_PROJECT_SLUG = "project_slug";
  @SerializedName(SERIALIZED_NAME_PROJECT_SLUG)
  private String projectSlug;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;


  public IsOwnerForProjectBySlugPayload projectScope(String projectScope) {
    
    this.projectScope = projectScope;
    return this;
  }

   /**
   * ProjectScope is the project_id resolved from the API Token.
   * @return projectScope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ProjectScope is the project_id resolved from the API Token.")

  public String getProjectScope() {
    return projectScope;
  }


  public void setProjectScope(String projectScope) {
    this.projectScope = projectScope;
  }


  public IsOwnerForProjectBySlugPayload projectSlug(String projectSlug) {
    
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


  public IsOwnerForProjectBySlugPayload subject(String subject) {
    
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
    IsOwnerForProjectBySlugPayload isOwnerForProjectBySlugPayload = (IsOwnerForProjectBySlugPayload) o;
    return Objects.equals(this.projectScope, isOwnerForProjectBySlugPayload.projectScope) &&
        Objects.equals(this.projectSlug, isOwnerForProjectBySlugPayload.projectSlug) &&
        Objects.equals(this.subject, isOwnerForProjectBySlugPayload.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectScope, projectSlug, subject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IsOwnerForProjectBySlugPayload {\n");
    sb.append("    projectScope: ").append(toIndentedString(projectScope)).append("\n");
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

}

