/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.13
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

/**
 * PluginConfigArgs plugin config args
 */
@ApiModel(description = "PluginConfigArgs plugin config args")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-07T09:47:48.213157439Z[Etc/UTC]")
public class PluginConfigArgs {
  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SETTABLE = "Settable";
  @SerializedName(SERIALIZED_NAME_SETTABLE)
  private List<String> settable = new ArrayList<>();

  public static final String SERIALIZED_NAME_VALUE = "Value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private List<String> value = new ArrayList<>();


  public PluginConfigArgs description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public PluginConfigArgs name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PluginConfigArgs settable(List<String> settable) {
    
    this.settable = settable;
    return this;
  }

  public PluginConfigArgs addSettableItem(String settableItem) {
    this.settable.add(settableItem);
    return this;
  }

   /**
   * settable
   * @return settable
  **/
  @ApiModelProperty(required = true, value = "settable")

  public List<String> getSettable() {
    return settable;
  }


  public void setSettable(List<String> settable) {
    this.settable = settable;
  }


  public PluginConfigArgs value(List<String> value) {
    
    this.value = value;
    return this;
  }

  public PluginConfigArgs addValueItem(String valueItem) {
    this.value.add(valueItem);
    return this;
  }

   /**
   * value
   * @return value
  **/
  @ApiModelProperty(required = true, value = "value")

  public List<String> getValue() {
    return value;
  }


  public void setValue(List<String> value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginConfigArgs pluginConfigArgs = (PluginConfigArgs) o;
    return Objects.equals(this.description, pluginConfigArgs.description) &&
        Objects.equals(this.name, pluginConfigArgs.name) &&
        Objects.equals(this.settable, pluginConfigArgs.settable) &&
        Objects.equals(this.value, pluginConfigArgs.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, settable, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginConfigArgs {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    settable: ").append(toIndentedString(settable)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

