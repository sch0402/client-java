/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.183
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
import java.util.Map;
import sh.ory.model.GenericErrorContent;

/**
 * Error responses are sent when an error (e.g. unauthorized, bad request, ...) occurred.
 */
@ApiModel(description = "Error responses are sent when an error (e.g. unauthorized, bad request, ...) occurred.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-26T13:14:27.382370198Z[Etc/UTC]")
public class GenericError {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Long code;

  public static final String SERIALIZED_NAME_DEBUG = "debug";
  @SerializedName(SERIALIZED_NAME_DEBUG)
  private String debug;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private List<Map<String, Object>> details = null;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private GenericErrorContent error;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_REQUEST = "request";
  @SerializedName(SERIALIZED_NAME_REQUEST)
  private String request;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public GenericError() { 
  }

  public GenericError code(Long code) {
    
    this.code = code;
    return this;
  }

   /**
   * The status code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "404", value = "The status code")

  public Long getCode() {
    return code;
  }


  public void setCode(Long code) {
    this.code = code;
  }


  public GenericError debug(String debug) {
    
    this.debug = debug;
    return this;
  }

   /**
   * Debug information  This field is often not exposed to protect against leaking sensitive information.
   * @return debug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SQL field \"foo\" is not a bool.", value = "Debug information  This field is often not exposed to protect against leaking sensitive information.")

  public String getDebug() {
    return debug;
  }


  public void setDebug(String debug) {
    this.debug = debug;
  }


  public GenericError details(List<Map<String, Object>> details) {
    
    this.details = details;
    return this;
  }

  public GenericError addDetailsItem(Map<String, Object> detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Further error details
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Further error details")

  public List<Map<String, Object>> getDetails() {
    return details;
  }


  public void setDetails(List<Map<String, Object>> details) {
    this.details = details;
  }


  public GenericError error(GenericErrorContent error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GenericErrorContent getError() {
    return error;
  }


  public void setError(GenericErrorContent error) {
    this.error = error;
  }


  public GenericError id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The error ID  Useful when trying to identify various errors in application logic.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The error ID  Useful when trying to identify various errors in application logic.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public GenericError message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Error message  The error&#39;s message.
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "The resource could not be found", required = true, value = "Error message  The error's message.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public GenericError reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * A human-readable reason for the error
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "User with ID 1234 does not exist.", value = "A human-readable reason for the error")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public GenericError request(String request) {
    
    this.request = request;
    return this;
  }

   /**
   * The request ID  The request ID is often exposed internally in order to trace errors across service architectures. This is often a UUID.
   * @return request
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "d7ef54b1-ec15-46e6-bccb-524b82c035e6", value = "The request ID  The request ID is often exposed internally in order to trace errors across service architectures. This is often a UUID.")

  public String getRequest() {
    return request;
  }


  public void setRequest(String request) {
    this.request = request;
  }


  public GenericError status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status description
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Not Found", value = "The status description")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericError genericError = (GenericError) o;
    return Objects.equals(this.code, genericError.code) &&
        Objects.equals(this.debug, genericError.debug) &&
        Objects.equals(this.details, genericError.details) &&
        Objects.equals(this.error, genericError.error) &&
        Objects.equals(this.id, genericError.id) &&
        Objects.equals(this.message, genericError.message) &&
        Objects.equals(this.reason, genericError.reason) &&
        Objects.equals(this.request, genericError.request) &&
        Objects.equals(this.status, genericError.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, debug, details, error, id, message, reason, request, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericError {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    debug: ").append(toIndentedString(debug)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

