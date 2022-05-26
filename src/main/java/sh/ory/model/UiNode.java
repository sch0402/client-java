/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.184
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
import sh.ory.model.UiNodeAttributes;
import sh.ory.model.UiNodeMeta;
import sh.ory.model.UiText;

/**
 * Nodes are represented as HTML elements or their native UI equivalents. For example, a node can be an &#x60;&lt;img&gt;&#x60; tag, or an &#x60;&lt;input element&gt;&#x60; but also &#x60;some plain text&#x60;.
 */
@ApiModel(description = "Nodes are represented as HTML elements or their native UI equivalents. For example, a node can be an `<img>` tag, or an `<input element>` but also `some plain text`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-26T18:14:36.556359704Z[Etc/UTC]")
public class UiNode {
  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private UiNodeAttributes attributes;

  /**
   * Group specifies which group (e.g. password authenticator) this node belongs to.
   */
  @JsonAdapter(GroupEnum.Adapter.class)
  public enum GroupEnum {
    DEFAULT("default"),
    
    PASSWORD("password"),
    
    OIDC("oidc"),
    
    PROFILE("profile"),
    
    LINK("link"),
    
    TOTP("totp"),
    
    LOOKUP_SECRET("lookup_secret"),
    
    WEBAUTHN("webauthn");

    private String value;

    GroupEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GroupEnum fromValue(String value) {
      for (GroupEnum b : GroupEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<GroupEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GroupEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GroupEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return GroupEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private GroupEnum group;

  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<UiText> messages = new ArrayList<>();

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private UiNodeMeta meta;

  /**
   * The node&#39;s type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    TEXT("text"),
    
    INPUT("input"),
    
    IMG("img"),
    
    A("a"),
    
    SCRIPT("script");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public UiNode() { 
  }

  public UiNode attributes(UiNodeAttributes attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UiNodeAttributes getAttributes() {
    return attributes;
  }


  public void setAttributes(UiNodeAttributes attributes) {
    this.attributes = attributes;
  }


  public UiNode group(GroupEnum group) {
    
    this.group = group;
    return this;
  }

   /**
   * Group specifies which group (e.g. password authenticator) this node belongs to.
   * @return group
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Group specifies which group (e.g. password authenticator) this node belongs to.")

  public GroupEnum getGroup() {
    return group;
  }


  public void setGroup(GroupEnum group) {
    this.group = group;
  }


  public UiNode messages(List<UiText> messages) {
    
    this.messages = messages;
    return this;
  }

  public UiNode addMessagesItem(UiText messagesItem) {
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Get messages
   * @return messages
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<UiText> getMessages() {
    return messages;
  }


  public void setMessages(List<UiText> messages) {
    this.messages = messages;
  }


  public UiNode meta(UiNodeMeta meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UiNodeMeta getMeta() {
    return meta;
  }


  public void setMeta(UiNodeMeta meta) {
    this.meta = meta;
  }


  public UiNode type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The node&#39;s type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The node's type")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UiNode uiNode = (UiNode) o;
    return Objects.equals(this.attributes, uiNode.attributes) &&
        Objects.equals(this.group, uiNode.group) &&
        Objects.equals(this.messages, uiNode.messages) &&
        Objects.equals(this.meta, uiNode.meta) &&
        Objects.equals(this.type, uiNode.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, group, messages, meta, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UiNode {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

