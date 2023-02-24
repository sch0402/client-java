/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.18
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
import org.openapitools.jackson.nullable.JsonNullable;
import sh.ory.model.NullPlan;

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
 * Subscription
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T09:15:47.625077020Z[Etc/UTC]")
public class Subscription {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  /**
   * The currently active plan of the subscription unknown Unknown free Free start_up_monthly StartUpMonthly start_up_yearly StartUpYearly business_monthly BusinessMonthly business_yearly BusinessYearly custom Custom
   */
  @JsonAdapter(CurrentPlanEnum.Adapter.class)
  public enum CurrentPlanEnum {
    UNKNOWN("unknown"),
    
    FREE("free"),
    
    START_UP_MONTHLY("start_up_monthly"),
    
    START_UP_YEARLY("start_up_yearly"),
    
    BUSINESS_MONTHLY("business_monthly"),
    
    BUSINESS_YEARLY("business_yearly"),
    
    CUSTOM("custom");

    private String value;

    CurrentPlanEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CurrentPlanEnum fromValue(String value) {
      for (CurrentPlanEnum b : CurrentPlanEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CurrentPlanEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CurrentPlanEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CurrentPlanEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CurrentPlanEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CURRENT_PLAN = "current_plan";
  @SerializedName(SERIALIZED_NAME_CURRENT_PLAN)
  private CurrentPlanEnum currentPlan;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customer_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ONGOING_STRIPE_CHECKOUT_ID = "ongoing_stripe_checkout_id";
  @SerializedName(SERIALIZED_NAME_ONGOING_STRIPE_CHECKOUT_ID)
  private String ongoingStripeCheckoutId;

  public static final String SERIALIZED_NAME_PAYED_UNTIL = "payed_until";
  @SerializedName(SERIALIZED_NAME_PAYED_UNTIL)
  private OffsetDateTime payedUntil;

  public static final String SERIALIZED_NAME_PLAN_CHANGES_AT = "plan_changes_at";
  @SerializedName(SERIALIZED_NAME_PLAN_CHANGES_AT)
  private OffsetDateTime planChangesAt;

  public static final String SERIALIZED_NAME_PLAN_CHANGES_TO = "plan_changes_to";
  @SerializedName(SERIALIZED_NAME_PLAN_CHANGES_TO)
  private NullPlan planChangesTo;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public Subscription() {
  }

  
  public Subscription(
     OffsetDateTime createdAt, 
     CurrentPlanEnum currentPlan, 
     String customerId, 
     String id, 
     OffsetDateTime payedUntil, 
     OffsetDateTime updatedAt
  ) {
    this();
    this.createdAt = createdAt;
    this.currentPlan = currentPlan;
    this.customerId = customerId;
    this.id = id;
    this.payedUntil = payedUntil;
    this.updatedAt = updatedAt;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




   /**
   * The currently active plan of the subscription unknown Unknown free Free start_up_monthly StartUpMonthly start_up_yearly StartUpYearly business_monthly BusinessMonthly business_yearly BusinessYearly custom Custom
   * @return currentPlan
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The currently active plan of the subscription unknown Unknown free Free start_up_monthly StartUpMonthly start_up_yearly StartUpYearly business_monthly BusinessMonthly business_yearly BusinessYearly custom Custom")

  public CurrentPlanEnum getCurrentPlan() {
    return currentPlan;
  }




   /**
   * The ID of the stripe customer
   * @return customerId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the stripe customer")

  public String getCustomerId() {
    return customerId;
  }




   /**
   * The ID of the subscription
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the subscription")

  public String getId() {
    return id;
  }




  public Subscription ongoingStripeCheckoutId(String ongoingStripeCheckoutId) {
    
    this.ongoingStripeCheckoutId = ongoingStripeCheckoutId;
    return this;
  }

   /**
   * Get ongoingStripeCheckoutId
   * @return ongoingStripeCheckoutId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOngoingStripeCheckoutId() {
    return ongoingStripeCheckoutId;
  }


  public void setOngoingStripeCheckoutId(String ongoingStripeCheckoutId) {
    this.ongoingStripeCheckoutId = ongoingStripeCheckoutId;
  }


   /**
   * Until when the subscription is payed
   * @return payedUntil
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Until when the subscription is payed")

  public OffsetDateTime getPayedUntil() {
    return payedUntil;
  }




  public Subscription planChangesAt(OffsetDateTime planChangesAt) {
    
    this.planChangesAt = planChangesAt;
    return this;
  }

   /**
   * Get planChangesAt
   * @return planChangesAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getPlanChangesAt() {
    return planChangesAt;
  }


  public void setPlanChangesAt(OffsetDateTime planChangesAt) {
    this.planChangesAt = planChangesAt;
  }


  public Subscription planChangesTo(NullPlan planChangesTo) {
    
    this.planChangesTo = planChangesTo;
    return this;
  }

   /**
   * Get planChangesTo
   * @return planChangesTo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public NullPlan getPlanChangesTo() {
    return planChangesTo;
  }


  public void setPlanChangesTo(NullPlan planChangesTo) {
    this.planChangesTo = planChangesTo;
  }


  public Subscription status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * For &#x60;collection_method&#x3D;charge_automatically&#x60; a subscription moves into &#x60;incomplete&#x60; if the initial payment attempt fails. A subscription in this state can only have metadata and default_source updated. Once the first invoice is paid, the subscription moves into an &#x60;active&#x60; state. If the first invoice is not paid within 23 hours, the subscription transitions to &#x60;incomplete_expired&#x60;. This is a terminal state, the open invoice will be voided and no further invoices will be generated.  A subscription that is currently in a trial period is &#x60;trialing&#x60; and moves to &#x60;active&#x60; when the trial period is over.  If subscription &#x60;collection_method&#x3D;charge_automatically&#x60; it becomes &#x60;past_due&#x60; when payment to renew it fails and &#x60;canceled&#x60; or &#x60;unpaid&#x60; (depending on your subscriptions settings) when Stripe has exhausted all payment retry attempts.  If subscription &#x60;collection_method&#x3D;send_invoice&#x60; it becomes &#x60;past_due&#x60; when its invoice is not paid by the due date, and &#x60;canceled&#x60; or &#x60;unpaid&#x60; if it is still not paid by an additional deadline after that. Note that when a subscription has a status of &#x60;unpaid&#x60;, no subsequent invoices will be attempted (invoices will be created, but then immediately automatically closed). After receiving updated payment information from a customer, you may choose to reopen and pay their closed invoices.
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "For `collection_method=charge_automatically` a subscription moves into `incomplete` if the initial payment attempt fails. A subscription in this state can only have metadata and default_source updated. Once the first invoice is paid, the subscription moves into an `active` state. If the first invoice is not paid within 23 hours, the subscription transitions to `incomplete_expired`. This is a terminal state, the open invoice will be voided and no further invoices will be generated.  A subscription that is currently in a trial period is `trialing` and moves to `active` when the trial period is over.  If subscription `collection_method=charge_automatically` it becomes `past_due` when payment to renew it fails and `canceled` or `unpaid` (depending on your subscriptions settings) when Stripe has exhausted all payment retry attempts.  If subscription `collection_method=send_invoice` it becomes `past_due` when its invoice is not paid by the due date, and `canceled` or `unpaid` if it is still not paid by an additional deadline after that. Note that when a subscription has a status of `unpaid`, no subsequent invoices will be attempted (invoices will be created, but then immediately automatically closed). After receiving updated payment information from a customer, you may choose to reopen and pay their closed invoices.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

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
    Subscription subscription = (Subscription) o;
    return Objects.equals(this.createdAt, subscription.createdAt) &&
        Objects.equals(this.currentPlan, subscription.currentPlan) &&
        Objects.equals(this.customerId, subscription.customerId) &&
        Objects.equals(this.id, subscription.id) &&
        Objects.equals(this.ongoingStripeCheckoutId, subscription.ongoingStripeCheckoutId) &&
        Objects.equals(this.payedUntil, subscription.payedUntil) &&
        Objects.equals(this.planChangesAt, subscription.planChangesAt) &&
        Objects.equals(this.planChangesTo, subscription.planChangesTo) &&
        Objects.equals(this.status, subscription.status) &&
        Objects.equals(this.updatedAt, subscription.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, currentPlan, customerId, id, ongoingStripeCheckoutId, payedUntil, planChangesAt, planChangesTo, status, updatedAt);
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
    sb.append("class Subscription {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    currentPlan: ").append(toIndentedString(currentPlan)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ongoingStripeCheckoutId: ").append(toIndentedString(ongoingStripeCheckoutId)).append("\n");
    sb.append("    payedUntil: ").append(toIndentedString(payedUntil)).append("\n");
    sb.append("    planChangesAt: ").append(toIndentedString(planChangesAt)).append("\n");
    sb.append("    planChangesTo: ").append(toIndentedString(planChangesTo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("current_plan");
    openapiFields.add("customer_id");
    openapiFields.add("id");
    openapiFields.add("ongoing_stripe_checkout_id");
    openapiFields.add("payed_until");
    openapiFields.add("plan_changes_at");
    openapiFields.add("plan_changes_to");
    openapiFields.add("status");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("current_plan");
    openapiRequiredFields.add("customer_id");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("payed_until");
    openapiRequiredFields.add("plan_changes_to");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("updated_at");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Subscription
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Subscription.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Subscription is not found in the empty JSON string", Subscription.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Subscription.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Subscription` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Subscription.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("current_plan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `current_plan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("current_plan").toString()));
      }
      if (!jsonObj.get("customer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_id").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("ongoing_stripe_checkout_id") != null && !jsonObj.get("ongoing_stripe_checkout_id").isJsonNull()) && !jsonObj.get("ongoing_stripe_checkout_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ongoing_stripe_checkout_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ongoing_stripe_checkout_id").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Subscription.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Subscription' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Subscription> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Subscription.class));

       return (TypeAdapter<T>) new TypeAdapter<Subscription>() {
           @Override
           public void write(JsonWriter out, Subscription value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Subscription read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Subscription given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Subscription
  * @throws IOException if the JSON string is invalid with respect to Subscription
  */
  public static Subscription fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Subscription.class);
  }

 /**
  * Convert an instance of Subscription to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

