/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.10
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
import java.util.UUID;

/**
 * VerifiableAddress is an identity&#39;s verifiable address
 */
@ApiModel(description = "VerifiableAddress is an identity's verifiable address")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-07T08:40:18.946504666Z[Etc/UTC]")
public class VerifiableIdentityAddress {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_VERIFIED = "verified";
  @SerializedName(SERIALIZED_NAME_VERIFIED)
  private Boolean verified;

  public static final String SERIALIZED_NAME_VERIFIED_AT = "verified_at";
  @SerializedName(SERIALIZED_NAME_VERIFIED_AT)
  private OffsetDateTime verifiedAt;

  public static final String SERIALIZED_NAME_VIA = "via";
  @SerializedName(SERIALIZED_NAME_VIA)
  private String via;


  public VerifiableIdentityAddress createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * When this entry was created
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2014-01-01T23:28:56.782Z", value = "When this entry was created")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public VerifiableIdentityAddress id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public VerifiableIdentityAddress status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * VerifiableAddressStatus must not exceed 16 characters as that is the limitation in the SQL Schema
   * @return status
  **/
  @ApiModelProperty(required = true, value = "VerifiableAddressStatus must not exceed 16 characters as that is the limitation in the SQL Schema")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public VerifiableIdentityAddress updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * When this entry was last updated
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2014-01-01T23:28:56.782Z", value = "When this entry was last updated")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public VerifiableIdentityAddress value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The address value  example foo@user.com
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The address value  example foo@user.com")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public VerifiableIdentityAddress verified(Boolean verified) {
    
    this.verified = verified;
    return this;
  }

   /**
   * Indicates if the address has already been verified
   * @return verified
  **/
  @ApiModelProperty(example = "true", required = true, value = "Indicates if the address has already been verified")

  public Boolean getVerified() {
    return verified;
  }


  public void setVerified(Boolean verified) {
    this.verified = verified;
  }


  public VerifiableIdentityAddress verifiedAt(OffsetDateTime verifiedAt) {
    
    this.verifiedAt = verifiedAt;
    return this;
  }

   /**
   * Get verifiedAt
   * @return verifiedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getVerifiedAt() {
    return verifiedAt;
  }


  public void setVerifiedAt(OffsetDateTime verifiedAt) {
    this.verifiedAt = verifiedAt;
  }


  public VerifiableIdentityAddress via(String via) {
    
    this.via = via;
    return this;
  }

   /**
   * VerifiableAddressType must not exceed 16 characters as that is the limitation in the SQL Schema
   * @return via
  **/
  @ApiModelProperty(required = true, value = "VerifiableAddressType must not exceed 16 characters as that is the limitation in the SQL Schema")

  public String getVia() {
    return via;
  }


  public void setVia(String via) {
    this.via = via;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifiableIdentityAddress verifiableIdentityAddress = (VerifiableIdentityAddress) o;
    return Objects.equals(this.createdAt, verifiableIdentityAddress.createdAt) &&
        Objects.equals(this.id, verifiableIdentityAddress.id) &&
        Objects.equals(this.status, verifiableIdentityAddress.status) &&
        Objects.equals(this.updatedAt, verifiableIdentityAddress.updatedAt) &&
        Objects.equals(this.value, verifiableIdentityAddress.value) &&
        Objects.equals(this.verified, verifiableIdentityAddress.verified) &&
        Objects.equals(this.verifiedAt, verifiableIdentityAddress.verifiedAt) &&
        Objects.equals(this.via, verifiableIdentityAddress.via);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, status, updatedAt, value, verified, verifiedAt, via);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifiableIdentityAddress {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
    sb.append("    verifiedAt: ").append(toIndentedString(verifiedAt)).append("\n");
    sb.append("    via: ").append(toIndentedString(via)).append("\n");
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

