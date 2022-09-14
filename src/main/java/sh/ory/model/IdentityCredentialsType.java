/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.41
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * and so on.
 */
@JsonAdapter(IdentityCredentialsType.Adapter.class)
public enum IdentityCredentialsType {
  
  PASSWORD("password"),
  
  TOTP("totp"),
  
  OIDC("oidc"),
  
  WEBAUTHN("webauthn"),
  
  LOOKUP_SECRET("lookup_secret");

  private String value;

  IdentityCredentialsType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static IdentityCredentialsType fromValue(String value) {
    for (IdentityCredentialsType b : IdentityCredentialsType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<IdentityCredentialsType> {
    @Override
    public void write(final JsonWriter jsonWriter, final IdentityCredentialsType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public IdentityCredentialsType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return IdentityCredentialsType.fromValue(value);
    }
  }
}

