/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.11
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ImageSummary image summary
 */
@ApiModel(description = "ImageSummary image summary")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-07T09:16:24.404833525Z[Etc/UTC]")
public class ImageSummary {
  public static final String SERIALIZED_NAME_CONTAINERS = "Containers";
  @SerializedName(SERIALIZED_NAME_CONTAINERS)
  private Long containers;

  public static final String SERIALIZED_NAME_CREATED = "Created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private Long created;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LABELS = "Labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public static final String SERIALIZED_NAME_PARENT_ID = "ParentId";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private String parentId;

  public static final String SERIALIZED_NAME_REPO_DIGESTS = "RepoDigests";
  @SerializedName(SERIALIZED_NAME_REPO_DIGESTS)
  private List<String> repoDigests = new ArrayList<>();

  public static final String SERIALIZED_NAME_REPO_TAGS = "RepoTags";
  @SerializedName(SERIALIZED_NAME_REPO_TAGS)
  private List<String> repoTags = new ArrayList<>();

  public static final String SERIALIZED_NAME_SHARED_SIZE = "SharedSize";
  @SerializedName(SERIALIZED_NAME_SHARED_SIZE)
  private Long sharedSize;

  public static final String SERIALIZED_NAME_SIZE = "Size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_VIRTUAL_SIZE = "VirtualSize";
  @SerializedName(SERIALIZED_NAME_VIRTUAL_SIZE)
  private Long virtualSize;


  public ImageSummary containers(Long containers) {
    
    this.containers = containers;
    return this;
  }

   /**
   * containers
   * @return containers
  **/
  @ApiModelProperty(required = true, value = "containers")

  public Long getContainers() {
    return containers;
  }


  public void setContainers(Long containers) {
    this.containers = containers;
  }


  public ImageSummary created(Long created) {
    
    this.created = created;
    return this;
  }

   /**
   * created
   * @return created
  **/
  @ApiModelProperty(required = true, value = "created")

  public Long getCreated() {
    return created;
  }


  public void setCreated(Long created) {
    this.created = created;
  }


  public ImageSummary id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Id")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ImageSummary labels(Map<String, String> labels) {
    
    this.labels = labels;
    return this;
  }

  public ImageSummary putLabelsItem(String key, String labelsItem) {
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * labels
   * @return labels
  **/
  @ApiModelProperty(required = true, value = "labels")

  public Map<String, String> getLabels() {
    return labels;
  }


  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public ImageSummary parentId(String parentId) {
    
    this.parentId = parentId;
    return this;
  }

   /**
   * parent Id
   * @return parentId
  **/
  @ApiModelProperty(required = true, value = "parent Id")

  public String getParentId() {
    return parentId;
  }


  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  public ImageSummary repoDigests(List<String> repoDigests) {
    
    this.repoDigests = repoDigests;
    return this;
  }

  public ImageSummary addRepoDigestsItem(String repoDigestsItem) {
    this.repoDigests.add(repoDigestsItem);
    return this;
  }

   /**
   * repo digests
   * @return repoDigests
  **/
  @ApiModelProperty(required = true, value = "repo digests")

  public List<String> getRepoDigests() {
    return repoDigests;
  }


  public void setRepoDigests(List<String> repoDigests) {
    this.repoDigests = repoDigests;
  }


  public ImageSummary repoTags(List<String> repoTags) {
    
    this.repoTags = repoTags;
    return this;
  }

  public ImageSummary addRepoTagsItem(String repoTagsItem) {
    this.repoTags.add(repoTagsItem);
    return this;
  }

   /**
   * repo tags
   * @return repoTags
  **/
  @ApiModelProperty(required = true, value = "repo tags")

  public List<String> getRepoTags() {
    return repoTags;
  }


  public void setRepoTags(List<String> repoTags) {
    this.repoTags = repoTags;
  }


  public ImageSummary sharedSize(Long sharedSize) {
    
    this.sharedSize = sharedSize;
    return this;
  }

   /**
   * shared size
   * @return sharedSize
  **/
  @ApiModelProperty(required = true, value = "shared size")

  public Long getSharedSize() {
    return sharedSize;
  }


  public void setSharedSize(Long sharedSize) {
    this.sharedSize = sharedSize;
  }


  public ImageSummary size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * size
   * @return size
  **/
  @ApiModelProperty(required = true, value = "size")

  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    this.size = size;
  }


  public ImageSummary virtualSize(Long virtualSize) {
    
    this.virtualSize = virtualSize;
    return this;
  }

   /**
   * virtual size
   * @return virtualSize
  **/
  @ApiModelProperty(required = true, value = "virtual size")

  public Long getVirtualSize() {
    return virtualSize;
  }


  public void setVirtualSize(Long virtualSize) {
    this.virtualSize = virtualSize;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageSummary imageSummary = (ImageSummary) o;
    return Objects.equals(this.containers, imageSummary.containers) &&
        Objects.equals(this.created, imageSummary.created) &&
        Objects.equals(this.id, imageSummary.id) &&
        Objects.equals(this.labels, imageSummary.labels) &&
        Objects.equals(this.parentId, imageSummary.parentId) &&
        Objects.equals(this.repoDigests, imageSummary.repoDigests) &&
        Objects.equals(this.repoTags, imageSummary.repoTags) &&
        Objects.equals(this.sharedSize, imageSummary.sharedSize) &&
        Objects.equals(this.size, imageSummary.size) &&
        Objects.equals(this.virtualSize, imageSummary.virtualSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containers, created, id, labels, parentId, repoDigests, repoTags, sharedSize, size, virtualSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageSummary {\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    repoDigests: ").append(toIndentedString(repoDigests)).append("\n");
    sb.append("    repoTags: ").append(toIndentedString(repoTags)).append("\n");
    sb.append("    sharedSize: ").append(toIndentedString(sharedSize)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    virtualSize: ").append(toIndentedString(virtualSize)).append("\n");
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

