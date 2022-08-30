/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.24
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
 * Pagination
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-30T11:32:43.925337871Z[Etc/UTC]")
public class Pagination {
  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Long page = 1l;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Long pageSize = 250l;

  public static final String SERIALIZED_NAME_PAGE_TOKEN = "page_token";
  @SerializedName(SERIALIZED_NAME_PAGE_TOKEN)
  private String pageToken = "1";

  public static final String SERIALIZED_NAME_PER_PAGE = "per_page";
  @SerializedName(SERIALIZED_NAME_PER_PAGE)
  private Long perPage = 250l;

  public Pagination() { 
  }

  public Pagination page(Long page) {
    
    this.page = page;
    return this;
  }

   /**
   * Pagination Page  This value is currently an integer, but it is not sequential. The value is not the page number, but a reference. The next page can be any number and some numbers might return an empty list.  For example, page 2 might not follow after page 1. And even if page 3 and 5 exist, but page 4 might not exist.
   * minimum: 1
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pagination Page  This value is currently an integer, but it is not sequential. The value is not the page number, but a reference. The next page can be any number and some numbers might return an empty list.  For example, page 2 might not follow after page 1. And even if page 3 and 5 exist, but page 4 might not exist.")

  public Long getPage() {
    return page;
  }


  public void setPage(Long page) {
    this.page = page;
  }


  public Pagination pageSize(Long pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Items per page  This is the number of items per page to return. For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).
   * minimum: 1
   * maximum: 1000
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Items per page  This is the number of items per page to return. For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).")

  public Long getPageSize() {
    return pageSize;
  }


  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }


  public Pagination pageToken(String pageToken) {
    
    this.pageToken = pageToken;
    return this;
  }

   /**
   * Next Page Token  The next page token. For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).
   * @return pageToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Next Page Token  The next page token. For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).")

  public String getPageToken() {
    return pageToken;
  }


  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
  }


  public Pagination perPage(Long perPage) {
    
    this.perPage = perPage;
    return this;
  }

   /**
   * Items per Page  This is the number of items per page.
   * minimum: 1
   * maximum: 1000
   * @return perPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Items per Page  This is the number of items per page.")

  public Long getPerPage() {
    return perPage;
  }


  public void setPerPage(Long perPage) {
    this.perPage = perPage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pagination pagination = (Pagination) o;
    return Objects.equals(this.page, pagination.page) &&
        Objects.equals(this.pageSize, pagination.pageSize) &&
        Objects.equals(this.pageToken, pagination.pageToken) &&
        Objects.equals(this.perPage, pagination.perPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, pageSize, pageToken, perPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pagination {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageToken: ").append(toIndentedString(pageToken)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
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

