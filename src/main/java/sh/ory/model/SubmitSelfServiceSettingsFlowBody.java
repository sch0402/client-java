/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.44
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
import sh.ory.model.SubmitSelfServiceSettingsFlowWithLookupMethodBody;
import sh.ory.model.SubmitSelfServiceSettingsFlowWithOidcMethodBody;
import sh.ory.model.SubmitSelfServiceSettingsFlowWithPasswordMethodBody;
import sh.ory.model.SubmitSelfServiceSettingsFlowWithProfileMethodBody;
import sh.ory.model.SubmitSelfServiceSettingsFlowWithTotpMethodBody;
import sh.ory.model.SubmitSelfServiceSettingsFlowWithWebAuthnMethodBody;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import sh.ory.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-15T06:36:32.008616029Z[Etc/UTC]")
public class SubmitSelfServiceSettingsFlowBody extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(SubmitSelfServiceSettingsFlowBody.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SubmitSelfServiceSettingsFlowBody.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SubmitSelfServiceSettingsFlowBody' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SubmitSelfServiceSettingsFlowWithLookupMethodBody> adapterSubmitSelfServiceSettingsFlowWithLookupMethodBody = gson.getDelegateAdapter(this, TypeToken.get(SubmitSelfServiceSettingsFlowWithLookupMethodBody.class));
            final TypeAdapter<SubmitSelfServiceSettingsFlowWithOidcMethodBody> adapterSubmitSelfServiceSettingsFlowWithOidcMethodBody = gson.getDelegateAdapter(this, TypeToken.get(SubmitSelfServiceSettingsFlowWithOidcMethodBody.class));
            final TypeAdapter<SubmitSelfServiceSettingsFlowWithPasswordMethodBody> adapterSubmitSelfServiceSettingsFlowWithPasswordMethodBody = gson.getDelegateAdapter(this, TypeToken.get(SubmitSelfServiceSettingsFlowWithPasswordMethodBody.class));
            final TypeAdapter<SubmitSelfServiceSettingsFlowWithProfileMethodBody> adapterSubmitSelfServiceSettingsFlowWithProfileMethodBody = gson.getDelegateAdapter(this, TypeToken.get(SubmitSelfServiceSettingsFlowWithProfileMethodBody.class));
            final TypeAdapter<SubmitSelfServiceSettingsFlowWithTotpMethodBody> adapterSubmitSelfServiceSettingsFlowWithTotpMethodBody = gson.getDelegateAdapter(this, TypeToken.get(SubmitSelfServiceSettingsFlowWithTotpMethodBody.class));
            final TypeAdapter<SubmitSelfServiceSettingsFlowWithWebAuthnMethodBody> adapterSubmitSelfServiceSettingsFlowWithWebAuthnMethodBody = gson.getDelegateAdapter(this, TypeToken.get(SubmitSelfServiceSettingsFlowWithWebAuthnMethodBody.class));

            return (TypeAdapter<T>) new TypeAdapter<SubmitSelfServiceSettingsFlowBody>() {
                @Override
                public void write(JsonWriter out, SubmitSelfServiceSettingsFlowBody value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `SubmitSelfServiceSettingsFlowWithLookupMethodBody`
                    if (value.getActualInstance() instanceof SubmitSelfServiceSettingsFlowWithLookupMethodBody) {
                        JsonObject obj = adapterSubmitSelfServiceSettingsFlowWithLookupMethodBody.toJsonTree((SubmitSelfServiceSettingsFlowWithLookupMethodBody)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `SubmitSelfServiceSettingsFlowWithOidcMethodBody`
                    if (value.getActualInstance() instanceof SubmitSelfServiceSettingsFlowWithOidcMethodBody) {
                        JsonObject obj = adapterSubmitSelfServiceSettingsFlowWithOidcMethodBody.toJsonTree((SubmitSelfServiceSettingsFlowWithOidcMethodBody)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `SubmitSelfServiceSettingsFlowWithPasswordMethodBody`
                    if (value.getActualInstance() instanceof SubmitSelfServiceSettingsFlowWithPasswordMethodBody) {
                        JsonObject obj = adapterSubmitSelfServiceSettingsFlowWithPasswordMethodBody.toJsonTree((SubmitSelfServiceSettingsFlowWithPasswordMethodBody)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `SubmitSelfServiceSettingsFlowWithProfileMethodBody`
                    if (value.getActualInstance() instanceof SubmitSelfServiceSettingsFlowWithProfileMethodBody) {
                        JsonObject obj = adapterSubmitSelfServiceSettingsFlowWithProfileMethodBody.toJsonTree((SubmitSelfServiceSettingsFlowWithProfileMethodBody)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `SubmitSelfServiceSettingsFlowWithTotpMethodBody`
                    if (value.getActualInstance() instanceof SubmitSelfServiceSettingsFlowWithTotpMethodBody) {
                        JsonObject obj = adapterSubmitSelfServiceSettingsFlowWithTotpMethodBody.toJsonTree((SubmitSelfServiceSettingsFlowWithTotpMethodBody)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `SubmitSelfServiceSettingsFlowWithWebAuthnMethodBody`
                    if (value.getActualInstance() instanceof SubmitSelfServiceSettingsFlowWithWebAuthnMethodBody) {
                        JsonObject obj = adapterSubmitSelfServiceSettingsFlowWithWebAuthnMethodBody.toJsonTree((SubmitSelfServiceSettingsFlowWithWebAuthnMethodBody)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: SubmitSelfServiceSettingsFlowWithLookupMethodBody, SubmitSelfServiceSettingsFlowWithOidcMethodBody, SubmitSelfServiceSettingsFlowWithPasswordMethodBody, SubmitSelfServiceSettingsFlowWithProfileMethodBody, SubmitSelfServiceSettingsFlowWithTotpMethodBody, SubmitSelfServiceSettingsFlowWithWebAuthnMethodBody");
                }

                @Override
                public SubmitSelfServiceSettingsFlowBody read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize SubmitSelfServiceSettingsFlowWithLookupMethodBody
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SubmitSelfServiceSettingsFlowWithLookupMethodBody.validateJsonObject(jsonObject);
                        actualAdapter = adapterSubmitSelfServiceSettingsFlowWithLookupMethodBody;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'SubmitSelfServiceSettingsFlowWithLookupMethodBody'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for SubmitSelfServiceSettingsFlowWithLookupMethodBody failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'SubmitSelfServiceSettingsFlowWithLookupMethodBody'", e);
                    }

                    // deserialize SubmitSelfServiceSettingsFlowWithOidcMethodBody
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SubmitSelfServiceSettingsFlowWithOidcMethodBody.validateJsonObject(jsonObject);
                        actualAdapter = adapterSubmitSelfServiceSettingsFlowWithOidcMethodBody;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'SubmitSelfServiceSettingsFlowWithOidcMethodBody'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for SubmitSelfServiceSettingsFlowWithOidcMethodBody failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'SubmitSelfServiceSettingsFlowWithOidcMethodBody'", e);
                    }

                    // deserialize SubmitSelfServiceSettingsFlowWithPasswordMethodBody
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SubmitSelfServiceSettingsFlowWithPasswordMethodBody.validateJsonObject(jsonObject);
                        actualAdapter = adapterSubmitSelfServiceSettingsFlowWithPasswordMethodBody;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'SubmitSelfServiceSettingsFlowWithPasswordMethodBody'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for SubmitSelfServiceSettingsFlowWithPasswordMethodBody failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'SubmitSelfServiceSettingsFlowWithPasswordMethodBody'", e);
                    }

                    // deserialize SubmitSelfServiceSettingsFlowWithProfileMethodBody
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SubmitSelfServiceSettingsFlowWithProfileMethodBody.validateJsonObject(jsonObject);
                        actualAdapter = adapterSubmitSelfServiceSettingsFlowWithProfileMethodBody;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'SubmitSelfServiceSettingsFlowWithProfileMethodBody'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for SubmitSelfServiceSettingsFlowWithProfileMethodBody failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'SubmitSelfServiceSettingsFlowWithProfileMethodBody'", e);
                    }

                    // deserialize SubmitSelfServiceSettingsFlowWithTotpMethodBody
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SubmitSelfServiceSettingsFlowWithTotpMethodBody.validateJsonObject(jsonObject);
                        actualAdapter = adapterSubmitSelfServiceSettingsFlowWithTotpMethodBody;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'SubmitSelfServiceSettingsFlowWithTotpMethodBody'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for SubmitSelfServiceSettingsFlowWithTotpMethodBody failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'SubmitSelfServiceSettingsFlowWithTotpMethodBody'", e);
                    }

                    // deserialize SubmitSelfServiceSettingsFlowWithWebAuthnMethodBody
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SubmitSelfServiceSettingsFlowWithWebAuthnMethodBody.validateJsonObject(jsonObject);
                        actualAdapter = adapterSubmitSelfServiceSettingsFlowWithWebAuthnMethodBody;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'SubmitSelfServiceSettingsFlowWithWebAuthnMethodBody'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for SubmitSelfServiceSettingsFlowWithWebAuthnMethodBody failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'SubmitSelfServiceSettingsFlowWithWebAuthnMethodBody'", e);
                    }

                    if (match == 1) {
                        SubmitSelfServiceSettingsFlowBody ret = new SubmitSelfServiceSettingsFlowBody();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for SubmitSelfServiceSettingsFlowBody: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public SubmitSelfServiceSettingsFlowBody() {
        super("oneOf", Boolean.FALSE);
    }

    public SubmitSelfServiceSettingsFlowBody(SubmitSelfServiceSettingsFlowWithLookupMethodBody o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public SubmitSelfServiceSettingsFlowBody(SubmitSelfServiceSettingsFlowWithOidcMethodBody o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public SubmitSelfServiceSettingsFlowBody(SubmitSelfServiceSettingsFlowWithPasswordMethodBody o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public SubmitSelfServiceSettingsFlowBody(SubmitSelfServiceSettingsFlowWithProfileMethodBody o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public SubmitSelfServiceSettingsFlowBody(SubmitSelfServiceSettingsFlowWithTotpMethodBody o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public SubmitSelfServiceSettingsFlowBody(SubmitSelfServiceSettingsFlowWithWebAuthnMethodBody o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("SubmitSelfServiceSettingsFlowWithLookupMethodBody", new GenericType<SubmitSelfServiceSettingsFlowWithLookupMethodBody>() {
        });
        schemas.put("SubmitSelfServiceSettingsFlowWithOidcMethodBody", new GenericType<SubmitSelfServiceSettingsFlowWithOidcMethodBody>() {
        });
        schemas.put("SubmitSelfServiceSettingsFlowWithPasswordMethodBody", new GenericType<SubmitSelfServiceSettingsFlowWithPasswordMethodBody>() {
        });
        schemas.put("SubmitSelfServiceSettingsFlowWithProfileMethodBody", new GenericType<SubmitSelfServiceSettingsFlowWithProfileMethodBody>() {
        });
        schemas.put("SubmitSelfServiceSettingsFlowWithTotpMethodBody", new GenericType<SubmitSelfServiceSettingsFlowWithTotpMethodBody>() {
        });
        schemas.put("SubmitSelfServiceSettingsFlowWithWebAuthnMethodBody", new GenericType<SubmitSelfServiceSettingsFlowWithWebAuthnMethodBody>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return SubmitSelfServiceSettingsFlowBody.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * SubmitSelfServiceSettingsFlowWithLookupMethodBody, SubmitSelfServiceSettingsFlowWithOidcMethodBody, SubmitSelfServiceSettingsFlowWithPasswordMethodBody, SubmitSelfServiceSettingsFlowWithProfileMethodBody, SubmitSelfServiceSettingsFlowWithTotpMethodBody, SubmitSelfServiceSettingsFlowWithWebAuthnMethodBody
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof SubmitSelfServiceSettingsFlowWithLookupMethodBody) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SubmitSelfServiceSettingsFlowWithOidcMethodBody) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SubmitSelfServiceSettingsFlowWithPasswordMethodBody) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SubmitSelfServiceSettingsFlowWithProfileMethodBody) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SubmitSelfServiceSettingsFlowWithTotpMethodBody) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SubmitSelfServiceSettingsFlowWithWebAuthnMethodBody) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be SubmitSelfServiceSettingsFlowWithLookupMethodBody, SubmitSelfServiceSettingsFlowWithOidcMethodBody, SubmitSelfServiceSettingsFlowWithPasswordMethodBody, SubmitSelfServiceSettingsFlowWithProfileMethodBody, SubmitSelfServiceSettingsFlowWithTotpMethodBody, SubmitSelfServiceSettingsFlowWithWebAuthnMethodBody");
    }

    /**
     * Get the actual instance, which can be the following:
     * SubmitSelfServiceSettingsFlowWithLookupMethodBody, SubmitSelfServiceSettingsFlowWithOidcMethodBody, SubmitSelfServiceSettingsFlowWithPasswordMethodBody, SubmitSelfServiceSettingsFlowWithProfileMethodBody, SubmitSelfServiceSettingsFlowWithTotpMethodBody, SubmitSelfServiceSettingsFlowWithWebAuthnMethodBody
     *
     * @return The actual instance (SubmitSelfServiceSettingsFlowWithLookupMethodBody, SubmitSelfServiceSettingsFlowWithOidcMethodBody, SubmitSelfServiceSettingsFlowWithPasswordMethodBody, SubmitSelfServiceSettingsFlowWithProfileMethodBody, SubmitSelfServiceSettingsFlowWithTotpMethodBody, SubmitSelfServiceSettingsFlowWithWebAuthnMethodBody)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `SubmitSelfServiceSettingsFlowWithLookupMethodBody`. If the actual instance is not `SubmitSelfServiceSettingsFlowWithLookupMethodBody`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SubmitSelfServiceSettingsFlowWithLookupMethodBody`
     * @throws ClassCastException if the instance is not `SubmitSelfServiceSettingsFlowWithLookupMethodBody`
     */
    public SubmitSelfServiceSettingsFlowWithLookupMethodBody getSubmitSelfServiceSettingsFlowWithLookupMethodBody() throws ClassCastException {
        return (SubmitSelfServiceSettingsFlowWithLookupMethodBody)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SubmitSelfServiceSettingsFlowWithOidcMethodBody`. If the actual instance is not `SubmitSelfServiceSettingsFlowWithOidcMethodBody`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SubmitSelfServiceSettingsFlowWithOidcMethodBody`
     * @throws ClassCastException if the instance is not `SubmitSelfServiceSettingsFlowWithOidcMethodBody`
     */
    public SubmitSelfServiceSettingsFlowWithOidcMethodBody getSubmitSelfServiceSettingsFlowWithOidcMethodBody() throws ClassCastException {
        return (SubmitSelfServiceSettingsFlowWithOidcMethodBody)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SubmitSelfServiceSettingsFlowWithPasswordMethodBody`. If the actual instance is not `SubmitSelfServiceSettingsFlowWithPasswordMethodBody`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SubmitSelfServiceSettingsFlowWithPasswordMethodBody`
     * @throws ClassCastException if the instance is not `SubmitSelfServiceSettingsFlowWithPasswordMethodBody`
     */
    public SubmitSelfServiceSettingsFlowWithPasswordMethodBody getSubmitSelfServiceSettingsFlowWithPasswordMethodBody() throws ClassCastException {
        return (SubmitSelfServiceSettingsFlowWithPasswordMethodBody)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SubmitSelfServiceSettingsFlowWithProfileMethodBody`. If the actual instance is not `SubmitSelfServiceSettingsFlowWithProfileMethodBody`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SubmitSelfServiceSettingsFlowWithProfileMethodBody`
     * @throws ClassCastException if the instance is not `SubmitSelfServiceSettingsFlowWithProfileMethodBody`
     */
    public SubmitSelfServiceSettingsFlowWithProfileMethodBody getSubmitSelfServiceSettingsFlowWithProfileMethodBody() throws ClassCastException {
        return (SubmitSelfServiceSettingsFlowWithProfileMethodBody)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SubmitSelfServiceSettingsFlowWithTotpMethodBody`. If the actual instance is not `SubmitSelfServiceSettingsFlowWithTotpMethodBody`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SubmitSelfServiceSettingsFlowWithTotpMethodBody`
     * @throws ClassCastException if the instance is not `SubmitSelfServiceSettingsFlowWithTotpMethodBody`
     */
    public SubmitSelfServiceSettingsFlowWithTotpMethodBody getSubmitSelfServiceSettingsFlowWithTotpMethodBody() throws ClassCastException {
        return (SubmitSelfServiceSettingsFlowWithTotpMethodBody)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SubmitSelfServiceSettingsFlowWithWebAuthnMethodBody`. If the actual instance is not `SubmitSelfServiceSettingsFlowWithWebAuthnMethodBody`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SubmitSelfServiceSettingsFlowWithWebAuthnMethodBody`
     * @throws ClassCastException if the instance is not `SubmitSelfServiceSettingsFlowWithWebAuthnMethodBody`
     */
    public SubmitSelfServiceSettingsFlowWithWebAuthnMethodBody getSubmitSelfServiceSettingsFlowWithWebAuthnMethodBody() throws ClassCastException {
        return (SubmitSelfServiceSettingsFlowWithWebAuthnMethodBody)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubmitSelfServiceSettingsFlowBody
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with SubmitSelfServiceSettingsFlowWithLookupMethodBody
    try {
      SubmitSelfServiceSettingsFlowWithLookupMethodBody.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for SubmitSelfServiceSettingsFlowWithLookupMethodBody failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with SubmitSelfServiceSettingsFlowWithOidcMethodBody
    try {
      SubmitSelfServiceSettingsFlowWithOidcMethodBody.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for SubmitSelfServiceSettingsFlowWithOidcMethodBody failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with SubmitSelfServiceSettingsFlowWithPasswordMethodBody
    try {
      SubmitSelfServiceSettingsFlowWithPasswordMethodBody.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for SubmitSelfServiceSettingsFlowWithPasswordMethodBody failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with SubmitSelfServiceSettingsFlowWithProfileMethodBody
    try {
      SubmitSelfServiceSettingsFlowWithProfileMethodBody.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for SubmitSelfServiceSettingsFlowWithProfileMethodBody failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with SubmitSelfServiceSettingsFlowWithTotpMethodBody
    try {
      SubmitSelfServiceSettingsFlowWithTotpMethodBody.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for SubmitSelfServiceSettingsFlowWithTotpMethodBody failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with SubmitSelfServiceSettingsFlowWithWebAuthnMethodBody
    try {
      SubmitSelfServiceSettingsFlowWithWebAuthnMethodBody.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for SubmitSelfServiceSettingsFlowWithWebAuthnMethodBody failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for SubmitSelfServiceSettingsFlowBody with oneOf schemas: SubmitSelfServiceSettingsFlowWithLookupMethodBody, SubmitSelfServiceSettingsFlowWithOidcMethodBody, SubmitSelfServiceSettingsFlowWithPasswordMethodBody, SubmitSelfServiceSettingsFlowWithProfileMethodBody, SubmitSelfServiceSettingsFlowWithTotpMethodBody, SubmitSelfServiceSettingsFlowWithWebAuthnMethodBody. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of SubmitSelfServiceSettingsFlowBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubmitSelfServiceSettingsFlowBody
  * @throws IOException if the JSON string is invalid with respect to SubmitSelfServiceSettingsFlowBody
  */
  public static SubmitSelfServiceSettingsFlowBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubmitSelfServiceSettingsFlowBody.class);
  }

 /**
  * Convert an instance of SubmitSelfServiceSettingsFlowBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

