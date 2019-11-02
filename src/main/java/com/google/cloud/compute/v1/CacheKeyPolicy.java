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
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
/** Message containing what to include in the cache key for a request for Cloud CDN. */
public final class CacheKeyPolicy implements ApiMessage {
  private final Boolean includeHost;
  private final Boolean includeProtocol;
  private final Boolean includeQueryString;
  private final List<String> queryStringBlacklist;
  private final List<String> queryStringWhitelist;

  private CacheKeyPolicy() {
    this.includeHost = null;
    this.includeProtocol = null;
    this.includeQueryString = null;
    this.queryStringBlacklist = null;
    this.queryStringWhitelist = null;
  }

  private CacheKeyPolicy(
      Boolean includeHost,
      Boolean includeProtocol,
      Boolean includeQueryString,
      List<String> queryStringBlacklist,
      List<String> queryStringWhitelist) {
    this.includeHost = includeHost;
    this.includeProtocol = includeProtocol;
    this.includeQueryString = includeQueryString;
    this.queryStringBlacklist = queryStringBlacklist;
    this.queryStringWhitelist = queryStringWhitelist;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("includeHost".equals(fieldName)) {
      return includeHost;
    }
    if ("includeProtocol".equals(fieldName)) {
      return includeProtocol;
    }
    if ("includeQueryString".equals(fieldName)) {
      return includeQueryString;
    }
    if ("queryStringBlacklist".equals(fieldName)) {
      return queryStringBlacklist;
    }
    if ("queryStringWhitelist".equals(fieldName)) {
      return queryStringWhitelist;
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

  /** If true, requests to different hosts will be cached separately. */
  public Boolean getIncludeHost() {
    return includeHost;
  }

  /** If true, http and https requests will be cached separately. */
  public Boolean getIncludeProtocol() {
    return includeProtocol;
  }

  /**
   * If true, include query string parameters in the cache key according to query_string_whitelist
   * and query_string_blacklist. If neither is set, the entire query string will be included. If
   * false, the query string will be excluded from the cache key entirely.
   */
  public Boolean getIncludeQueryString() {
    return includeQueryString;
  }

  /**
   * Names of query string parameters to exclude in cache keys. All other parameters will be
   * included. Either specify query_string_whitelist or query_string_blacklist, not both. '&amp;'
   * and '=' will be percent encoded and not treated as delimiters.
   */
  public List<String> getQueryStringBlacklistList() {
    return queryStringBlacklist;
  }

  /**
   * Names of query string parameters to include in cache keys. All other parameters will be
   * excluded. Either specify query_string_whitelist or query_string_blacklist, not both. '&amp;'
   * and '=' will be percent encoded and not treated as delimiters.
   */
  public List<String> getQueryStringWhitelistList() {
    return queryStringWhitelist;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(CacheKeyPolicy prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static CacheKeyPolicy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final CacheKeyPolicy DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new CacheKeyPolicy();
  }

  public static class Builder {
    private Boolean includeHost;
    private Boolean includeProtocol;
    private Boolean includeQueryString;
    private List<String> queryStringBlacklist;
    private List<String> queryStringWhitelist;

    Builder() {}

    public Builder mergeFrom(CacheKeyPolicy other) {
      if (other == CacheKeyPolicy.getDefaultInstance()) return this;
      if (other.getIncludeHost() != null) {
        this.includeHost = other.includeHost;
      }
      if (other.getIncludeProtocol() != null) {
        this.includeProtocol = other.includeProtocol;
      }
      if (other.getIncludeQueryString() != null) {
        this.includeQueryString = other.includeQueryString;
      }
      if (other.getQueryStringBlacklistList() != null) {
        this.queryStringBlacklist = other.queryStringBlacklist;
      }
      if (other.getQueryStringWhitelistList() != null) {
        this.queryStringWhitelist = other.queryStringWhitelist;
      }
      return this;
    }

    Builder(CacheKeyPolicy source) {
      this.includeHost = source.includeHost;
      this.includeProtocol = source.includeProtocol;
      this.includeQueryString = source.includeQueryString;
      this.queryStringBlacklist = source.queryStringBlacklist;
      this.queryStringWhitelist = source.queryStringWhitelist;
    }

    /** If true, requests to different hosts will be cached separately. */
    public Boolean getIncludeHost() {
      return includeHost;
    }

    /** If true, requests to different hosts will be cached separately. */
    public Builder setIncludeHost(Boolean includeHost) {
      this.includeHost = includeHost;
      return this;
    }

    /** If true, http and https requests will be cached separately. */
    public Boolean getIncludeProtocol() {
      return includeProtocol;
    }

    /** If true, http and https requests will be cached separately. */
    public Builder setIncludeProtocol(Boolean includeProtocol) {
      this.includeProtocol = includeProtocol;
      return this;
    }

    /**
     * If true, include query string parameters in the cache key according to query_string_whitelist
     * and query_string_blacklist. If neither is set, the entire query string will be included. If
     * false, the query string will be excluded from the cache key entirely.
     */
    public Boolean getIncludeQueryString() {
      return includeQueryString;
    }

    /**
     * If true, include query string parameters in the cache key according to query_string_whitelist
     * and query_string_blacklist. If neither is set, the entire query string will be included. If
     * false, the query string will be excluded from the cache key entirely.
     */
    public Builder setIncludeQueryString(Boolean includeQueryString) {
      this.includeQueryString = includeQueryString;
      return this;
    }

    /**
     * Names of query string parameters to exclude in cache keys. All other parameters will be
     * included. Either specify query_string_whitelist or query_string_blacklist, not both. '&amp;'
     * and '=' will be percent encoded and not treated as delimiters.
     */
    public List<String> getQueryStringBlacklistList() {
      return queryStringBlacklist;
    }

    /**
     * Names of query string parameters to exclude in cache keys. All other parameters will be
     * included. Either specify query_string_whitelist or query_string_blacklist, not both. '&amp;'
     * and '=' will be percent encoded and not treated as delimiters.
     */
    public Builder addAllQueryStringBlacklist(List<String> queryStringBlacklist) {
      if (this.queryStringBlacklist == null) {
        this.queryStringBlacklist = new LinkedList<>();
      }
      this.queryStringBlacklist.addAll(queryStringBlacklist);
      return this;
    }

    /**
     * Names of query string parameters to exclude in cache keys. All other parameters will be
     * included. Either specify query_string_whitelist or query_string_blacklist, not both. '&amp;'
     * and '=' will be percent encoded and not treated as delimiters.
     */
    public Builder addQueryStringBlacklist(String queryStringBlacklist) {
      if (this.queryStringBlacklist == null) {
        this.queryStringBlacklist = new LinkedList<>();
      }
      this.queryStringBlacklist.add(queryStringBlacklist);
      return this;
    }

    /**
     * Names of query string parameters to include in cache keys. All other parameters will be
     * excluded. Either specify query_string_whitelist or query_string_blacklist, not both. '&amp;'
     * and '=' will be percent encoded and not treated as delimiters.
     */
    public List<String> getQueryStringWhitelistList() {
      return queryStringWhitelist;
    }

    /**
     * Names of query string parameters to include in cache keys. All other parameters will be
     * excluded. Either specify query_string_whitelist or query_string_blacklist, not both. '&amp;'
     * and '=' will be percent encoded and not treated as delimiters.
     */
    public Builder addAllQueryStringWhitelist(List<String> queryStringWhitelist) {
      if (this.queryStringWhitelist == null) {
        this.queryStringWhitelist = new LinkedList<>();
      }
      this.queryStringWhitelist.addAll(queryStringWhitelist);
      return this;
    }

    /**
     * Names of query string parameters to include in cache keys. All other parameters will be
     * excluded. Either specify query_string_whitelist or query_string_blacklist, not both. '&amp;'
     * and '=' will be percent encoded and not treated as delimiters.
     */
    public Builder addQueryStringWhitelist(String queryStringWhitelist) {
      if (this.queryStringWhitelist == null) {
        this.queryStringWhitelist = new LinkedList<>();
      }
      this.queryStringWhitelist.add(queryStringWhitelist);
      return this;
    }

    public CacheKeyPolicy build() {

      return new CacheKeyPolicy(
          includeHost,
          includeProtocol,
          includeQueryString,
          queryStringBlacklist,
          queryStringWhitelist);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setIncludeHost(this.includeHost);
      newBuilder.setIncludeProtocol(this.includeProtocol);
      newBuilder.setIncludeQueryString(this.includeQueryString);
      newBuilder.addAllQueryStringBlacklist(this.queryStringBlacklist);
      newBuilder.addAllQueryStringWhitelist(this.queryStringWhitelist);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "CacheKeyPolicy{"
        + "includeHost="
        + includeHost
        + ", "
        + "includeProtocol="
        + includeProtocol
        + ", "
        + "includeQueryString="
        + includeQueryString
        + ", "
        + "queryStringBlacklist="
        + queryStringBlacklist
        + ", "
        + "queryStringWhitelist="
        + queryStringWhitelist
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CacheKeyPolicy) {
      CacheKeyPolicy that = (CacheKeyPolicy) o;
      return Objects.equals(this.includeHost, that.getIncludeHost())
          && Objects.equals(this.includeProtocol, that.getIncludeProtocol())
          && Objects.equals(this.includeQueryString, that.getIncludeQueryString())
          && Objects.equals(this.queryStringBlacklist, that.getQueryStringBlacklistList())
          && Objects.equals(this.queryStringWhitelist, that.getQueryStringWhitelistList());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        includeHost,
        includeProtocol,
        includeQueryString,
        queryStringBlacklist,
        queryStringWhitelist);
  }
}
