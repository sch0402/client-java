/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.31
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
 * TokenPaginationHeaders
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T11:00:01.465965011Z[Etc/UTC]")
public class TokenPaginationHeaders {
  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link;

  public static final String SERIALIZED_NAME_X_TOTAL_COUNT = "x-total-count";
  @SerializedName(SERIALIZED_NAME_X_TOTAL_COUNT)
  private String xTotalCount;

  public TokenPaginationHeaders() { 
  }

  public TokenPaginationHeaders link(String link) {
    
    this.link = link;
    return this;
  }

   /**
   * The link header contains pagination links.  For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).  in: header
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The link header contains pagination links.  For details on pagination please head over to the [pagination documentation](https://www.ory.sh/docs/ecosystem/api-design#pagination).  in: header")

  public String getLink() {
    return link;
  }


  public void setLink(String link) {
    this.link = link;
  }


  public TokenPaginationHeaders xTotalCount(String xTotalCount) {
    
    this.xTotalCount = xTotalCount;
    return this;
  }

   /**
   * The total number of clients.  in: header
   * @return xTotalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of clients.  in: header")

  public String getxTotalCount() {
    return xTotalCount;
  }


  public void setxTotalCount(String xTotalCount) {
    this.xTotalCount = xTotalCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenPaginationHeaders tokenPaginationHeaders = (TokenPaginationHeaders) o;
    return Objects.equals(this.link, tokenPaginationHeaders.link) &&
        Objects.equals(this.xTotalCount, tokenPaginationHeaders.xTotalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, xTotalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenPaginationHeaders {\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    xTotalCount: ").append(toIndentedString(xTotalCount)).append("\n");
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

