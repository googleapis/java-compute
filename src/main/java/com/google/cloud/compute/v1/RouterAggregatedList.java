/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.compute.v1;

import com.google.api.core.BetaApi;
import com.google.api.gax.httpjson.ApiMessage;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
/** Contains a list of routers. */
public final class RouterAggregatedList implements ApiMessage {
  private final String id;
  private final Map<String, RoutersScopedList> items;
  private final String kind;
  private final String nextPageToken;
  private final String selfLink;
  private final Warning warning;

  private RouterAggregatedList() {
    this.id = null;
    this.items = null;
    this.kind = null;
    this.nextPageToken = null;
    this.selfLink = null;
    this.warning = null;
  }

  private RouterAggregatedList(
      String id,
      Map<String, RoutersScopedList> items,
      String kind,
      String nextPageToken,
      String selfLink,
      Warning warning) {
    this.id = id;
    this.items = items;
    this.kind = kind;
    this.nextPageToken = nextPageToken;
    this.selfLink = selfLink;
    this.warning = warning;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("id".equals(fieldName)) {
      return id;
    }
    if ("items".equals(fieldName)) {
      return items;
    }
    if ("kind".equals(fieldName)) {
      return kind;
    }
    if ("nextPageToken".equals(fieldName)) {
      return nextPageToken;
    }
    if ("selfLink".equals(fieldName)) {
      return selfLink;
    }
    if ("warning".equals(fieldName)) {
      return warning;
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  @Nullable
  @Override
  /**
   * The fields that should be serialized (even if they have empty values). If the containing
   * message object has a non-null fieldmask, then all the fields in the field mask (and only those
   * fields in the field mask) will be serialized. If the containing object does not have a
   * fieldmask, then only non-empty fields will be serialized.
   */
  public List<String> getFieldMask() {
    return null;
  }

  /** [Output Only] Unique identifier for the resource; defined by the server. */
  public String getId() {
    return id;
  }

  /**
   * A list of Router resources. The key for the map is: Name of the scope containing this set of
   * routers.
   */
  public Map<String, RoutersScopedList> getItemsMap() {
    return items;
  }

  /** Type of resource. */
  public String getKind() {
    return kind;
  }

  /**
   * [Output Only] This token allows you to get the next page of results for list requests. If the
   * number of results is larger than maxResults, use the nextPageToken as a value for the query
   * parameter pageToken in the next list request. Subsequent list requests will have their own
   * nextPageToken to continue paging through the results.
   */
  public String getNextPageToken() {
    return nextPageToken;
  }

  /** [Output Only] Server-defined URL for this resource. */
  public String getSelfLink() {
    return selfLink;
  }

  /** [Output Only] Informational warning message. */
  public Warning getWarning() {
    return warning;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(RouterAggregatedList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static RouterAggregatedList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final RouterAggregatedList DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new RouterAggregatedList();
  }

  public static class Builder {
    private String id;
    private Map<String, RoutersScopedList> items;
    private String kind;
    private String nextPageToken;
    private String selfLink;
    private Warning warning;

    Builder() {}

    public Builder mergeFrom(RouterAggregatedList other) {
      if (other == RouterAggregatedList.getDefaultInstance()) return this;
      if (other.getId() != null) {
        this.id = other.id;
      }
      if (other.getItemsMap() != null) {
        this.items = other.items;
      }
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      if (other.getNextPageToken() != null) {
        this.nextPageToken = other.nextPageToken;
      }
      if (other.getSelfLink() != null) {
        this.selfLink = other.selfLink;
      }
      if (other.getWarning() != null) {
        this.warning = other.warning;
      }
      return this;
    }

    Builder(RouterAggregatedList source) {
      this.id = source.id;
      this.items = source.items;
      this.kind = source.kind;
      this.nextPageToken = source.nextPageToken;
      this.selfLink = source.selfLink;
      this.warning = source.warning;
    }

    /** [Output Only] Unique identifier for the resource; defined by the server. */
    public String getId() {
      return id;
    }

    /** [Output Only] Unique identifier for the resource; defined by the server. */
    public Builder setId(String id) {
      this.id = id;
      return this;
    }

    /**
     * A list of Router resources. The key for the map is: Name of the scope containing this set of
     * routers.
     */
    public Map<String, RoutersScopedList> getItemsMap() {
      return items;
    }

    /**
     * A list of Router resources. The key for the map is: Name of the scope containing this set of
     * routers.
     */
    public Builder putAllItems(Map<String, RoutersScopedList> items) {
      this.items = items;
      return this;
    }

    /** Type of resource. */
    public String getKind() {
      return kind;
    }

    /** Type of resource. */
    public Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }

    /**
     * [Output Only] This token allows you to get the next page of results for list requests. If the
     * number of results is larger than maxResults, use the nextPageToken as a value for the query
     * parameter pageToken in the next list request. Subsequent list requests will have their own
     * nextPageToken to continue paging through the results.
     */
    public String getNextPageToken() {
      return nextPageToken;
    }

    /**
     * [Output Only] This token allows you to get the next page of results for list requests. If the
     * number of results is larger than maxResults, use the nextPageToken as a value for the query
     * parameter pageToken in the next list request. Subsequent list requests will have their own
     * nextPageToken to continue paging through the results.
     */
    public Builder setNextPageToken(String nextPageToken) {
      this.nextPageToken = nextPageToken;
      return this;
    }

    /** [Output Only] Server-defined URL for this resource. */
    public String getSelfLink() {
      return selfLink;
    }

    /** [Output Only] Server-defined URL for this resource. */
    public Builder setSelfLink(String selfLink) {
      this.selfLink = selfLink;
      return this;
    }

    /** [Output Only] Informational warning message. */
    public Warning getWarning() {
      return warning;
    }

    /** [Output Only] Informational warning message. */
    public Builder setWarning(Warning warning) {
      this.warning = warning;
      return this;
    }

    public RouterAggregatedList build() {

      return new RouterAggregatedList(id, items, kind, nextPageToken, selfLink, warning);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setId(this.id);
      newBuilder.putAllItems(this.items);
      newBuilder.setKind(this.kind);
      newBuilder.setNextPageToken(this.nextPageToken);
      newBuilder.setSelfLink(this.selfLink);
      newBuilder.setWarning(this.warning);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "RouterAggregatedList{"
        + "id="
        + id
        + ", "
        + "items="
        + items
        + ", "
        + "kind="
        + kind
        + ", "
        + "nextPageToken="
        + nextPageToken
        + ", "
        + "selfLink="
        + selfLink
        + ", "
        + "warning="
        + warning
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RouterAggregatedList) {
      RouterAggregatedList that = (RouterAggregatedList) o;
      return Objects.equals(this.id, that.getId())
          && Objects.equals(this.items, that.getItemsMap())
          && Objects.equals(this.kind, that.getKind())
          && Objects.equals(this.nextPageToken, that.getNextPageToken())
          && Objects.equals(this.selfLink, that.getSelfLink())
          && Objects.equals(this.warning, that.getWarning());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, items, kind, nextPageToken, selfLink, warning);
  }
}
