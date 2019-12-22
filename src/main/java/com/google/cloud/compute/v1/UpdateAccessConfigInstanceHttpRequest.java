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
import java.util.Objects;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
/**
 * Request object for method compute.instances.updateAccessConfig. Updates the specified access
 * config from an instance's network interface with the data included in the request. This method
 * supports PATCH semantics and uses the JSON merge patch format and processing rules.
 */
public final class UpdateAccessConfigInstanceHttpRequest implements ApiMessage {
  private final AccessConfig accessConfigResource;
  private final String access_token;
  private final String callback;
  private final String fields;
  private final String instance;
  private final String key;
  private final String networkInterface;
  private final String prettyPrint;
  private final String quotaUser;
  private final String requestId;
  private final String userIp;

  private UpdateAccessConfigInstanceHttpRequest() {
    this.accessConfigResource = null;
    this.access_token = null;
    this.callback = null;
    this.fields = null;
    this.instance = null;
    this.key = null;
    this.networkInterface = null;
    this.prettyPrint = null;
    this.quotaUser = null;
    this.requestId = null;
    this.userIp = null;
  }

  private UpdateAccessConfigInstanceHttpRequest(
      AccessConfig accessConfigResource,
      String access_token,
      String callback,
      String fields,
      String instance,
      String key,
      String networkInterface,
      String prettyPrint,
      String quotaUser,
      String requestId,
      String userIp) {
    this.accessConfigResource = accessConfigResource;
    this.access_token = access_token;
    this.callback = callback;
    this.fields = fields;
    this.instance = instance;
    this.key = key;
    this.networkInterface = networkInterface;
    this.prettyPrint = prettyPrint;
    this.quotaUser = quotaUser;
    this.requestId = requestId;
    this.userIp = userIp;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("accessConfigResource".equals(fieldName)) {
      return accessConfigResource;
    }
    if ("access_token".equals(fieldName)) {
      return access_token;
    }
    if ("callback".equals(fieldName)) {
      return callback;
    }
    if ("fields".equals(fieldName)) {
      return fields;
    }
    if ("instance".equals(fieldName)) {
      return instance;
    }
    if ("key".equals(fieldName)) {
      return key;
    }
    if ("networkInterface".equals(fieldName)) {
      return networkInterface;
    }
    if ("prettyPrint".equals(fieldName)) {
      return prettyPrint;
    }
    if ("quotaUser".equals(fieldName)) {
      return quotaUser;
    }
    if ("requestId".equals(fieldName)) {
      return requestId;
    }
    if ("userIp".equals(fieldName)) {
      return userIp;
    }
    return null;
  }

  @Nullable
  @Override
  public AccessConfig getApiMessageRequestBody() {
    return accessConfigResource;
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

  /**
   * An access configuration attached to an instance's network interface. Only one access config per
   * instance is supported.
   */
  public AccessConfig getAccessConfigResource() {
    return accessConfigResource;
  }

  /** OAuth 2.0 token for the current user. */
  public String getAccessToken() {
    return access_token;
  }

  /** Name of the JavaScript callback function that handles the response. */
  public String getCallback() {
    return callback;
  }

  /** Selector specifying a subset of fields to include in the response. */
  public String getFields() {
    return fields;
  }

  /**
   * The instance name for this request. It must have the format
   * `{project}/zones/{zone}/instances/{instance}/updateAccessConfig`. \`{instance}\` must start
   * with a letter, and contain only letters (\`[A-Za-z]\`), numbers (\`[0-9]\`), dashes (\`-\`),
   * &#42; underscores (\`_\`), periods (\`.\`), tildes (\`~\`), plus (\`+\`) or percent &#42; signs
   * (\`%\`). It must be between 3 and 255 characters in length, and it &#42; must not start with
   * \`"goog"\`.
   */
  public String getInstance() {
    return instance;
  }

  /** API key. Required unless you provide an OAuth 2.0 token. */
  public String getKey() {
    return key;
  }

  /** The name of the network interface where the access config is attached. */
  public String getNetworkInterface() {
    return networkInterface;
  }

  /** Returns response with indentations and line breaks. */
  public String getPrettyPrint() {
    return prettyPrint;
  }

  /** Alternative to userIp. */
  public String getQuotaUser() {
    return quotaUser;
  }

  /**
   * An optional request ID to identify requests. Specify a unique request ID so that if you must
   * retry your request, the server will know to ignore the request if it has already been
   * completed.
   *
   * <p>For example, consider a situation where you make an initial request and the request times
   * out. If you make the request again with the same request ID, the server can check if original
   * operation with the same request ID was received, and if so, will ignore the second request.
   * This prevents clients from accidentally creating duplicate commitments.
   *
   * <p>The request ID must be a valid UUID with the exception that zero UUID is not supported
   * (00000000-0000-0000-0000-000000000000).
   */
  public String getRequestId() {
    return requestId;
  }

  /** IP address of the end user for whom the API call is being made. */
  public String getUserIp() {
    return userIp;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(UpdateAccessConfigInstanceHttpRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static UpdateAccessConfigInstanceHttpRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final UpdateAccessConfigInstanceHttpRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new UpdateAccessConfigInstanceHttpRequest();
  }

  public static class Builder {
    private AccessConfig accessConfigResource;
    private String access_token;
    private String callback;
    private String fields;
    private String instance;
    private String key;
    private String networkInterface;
    private String prettyPrint;
    private String quotaUser;
    private String requestId;
    private String userIp;

    Builder() {}

    public Builder mergeFrom(UpdateAccessConfigInstanceHttpRequest other) {
      if (other == UpdateAccessConfigInstanceHttpRequest.getDefaultInstance()) return this;
      if (other.getAccessConfigResource() != null) {
        this.accessConfigResource = other.accessConfigResource;
      }
      if (other.getAccessToken() != null) {
        this.access_token = other.access_token;
      }
      if (other.getCallback() != null) {
        this.callback = other.callback;
      }
      if (other.getFields() != null) {
        this.fields = other.fields;
      }
      if (other.getInstance() != null) {
        this.instance = other.instance;
      }
      if (other.getKey() != null) {
        this.key = other.key;
      }
      if (other.getNetworkInterface() != null) {
        this.networkInterface = other.networkInterface;
      }
      if (other.getPrettyPrint() != null) {
        this.prettyPrint = other.prettyPrint;
      }
      if (other.getQuotaUser() != null) {
        this.quotaUser = other.quotaUser;
      }
      if (other.getRequestId() != null) {
        this.requestId = other.requestId;
      }
      if (other.getUserIp() != null) {
        this.userIp = other.userIp;
      }
      return this;
    }

    Builder(UpdateAccessConfigInstanceHttpRequest source) {
      this.accessConfigResource = source.accessConfigResource;
      this.access_token = source.access_token;
      this.callback = source.callback;
      this.fields = source.fields;
      this.instance = source.instance;
      this.key = source.key;
      this.networkInterface = source.networkInterface;
      this.prettyPrint = source.prettyPrint;
      this.quotaUser = source.quotaUser;
      this.requestId = source.requestId;
      this.userIp = source.userIp;
    }

    /**
     * An access configuration attached to an instance's network interface. Only one access config
     * per instance is supported.
     */
    public AccessConfig getAccessConfigResource() {
      return accessConfigResource;
    }

    /**
     * An access configuration attached to an instance's network interface. Only one access config
     * per instance is supported.
     */
    public Builder setAccessConfigResource(AccessConfig accessConfigResource) {
      this.accessConfigResource = accessConfigResource;
      return this;
    }

    /** OAuth 2.0 token for the current user. */
    public String getAccessToken() {
      return access_token;
    }

    /** OAuth 2.0 token for the current user. */
    public Builder setAccessToken(String access_token) {
      this.access_token = access_token;
      return this;
    }

    /** Name of the JavaScript callback function that handles the response. */
    public String getCallback() {
      return callback;
    }

    /** Name of the JavaScript callback function that handles the response. */
    public Builder setCallback(String callback) {
      this.callback = callback;
      return this;
    }

    /** Selector specifying a subset of fields to include in the response. */
    public String getFields() {
      return fields;
    }

    /** Selector specifying a subset of fields to include in the response. */
    public Builder setFields(String fields) {
      this.fields = fields;
      return this;
    }

    /**
     * The instance name for this request. It must have the format
     * `{project}/zones/{zone}/instances/{instance}/updateAccessConfig`. \`{instance}\` must start
     * with a letter, and contain only letters (\`[A-Za-z]\`), numbers (\`[0-9]\`), dashes (\`-\`),
     * &#42; underscores (\`_\`), periods (\`.\`), tildes (\`~\`), plus (\`+\`) or percent &#42;
     * signs (\`%\`). It must be between 3 and 255 characters in length, and it &#42; must not start
     * with \`"goog"\`.
     */
    public String getInstance() {
      return instance;
    }

    /**
     * The instance name for this request. It must have the format
     * `{project}/zones/{zone}/instances/{instance}/updateAccessConfig`. \`{instance}\` must start
     * with a letter, and contain only letters (\`[A-Za-z]\`), numbers (\`[0-9]\`), dashes (\`-\`),
     * &#42; underscores (\`_\`), periods (\`.\`), tildes (\`~\`), plus (\`+\`) or percent &#42;
     * signs (\`%\`). It must be between 3 and 255 characters in length, and it &#42; must not start
     * with \`"goog"\`.
     */
    public Builder setInstance(String instance) {
      this.instance = instance;
      return this;
    }

    /** API key. Required unless you provide an OAuth 2.0 token. */
    public String getKey() {
      return key;
    }

    /** API key. Required unless you provide an OAuth 2.0 token. */
    public Builder setKey(String key) {
      this.key = key;
      return this;
    }

    /** The name of the network interface where the access config is attached. */
    public String getNetworkInterface() {
      return networkInterface;
    }

    /** The name of the network interface where the access config is attached. */
    public Builder setNetworkInterface(String networkInterface) {
      this.networkInterface = networkInterface;
      return this;
    }

    /** Returns response with indentations and line breaks. */
    public String getPrettyPrint() {
      return prettyPrint;
    }

    /** Returns response with indentations and line breaks. */
    public Builder setPrettyPrint(String prettyPrint) {
      this.prettyPrint = prettyPrint;
      return this;
    }

    /** Alternative to userIp. */
    public String getQuotaUser() {
      return quotaUser;
    }

    /** Alternative to userIp. */
    public Builder setQuotaUser(String quotaUser) {
      this.quotaUser = quotaUser;
      return this;
    }

    /**
     * An optional request ID to identify requests. Specify a unique request ID so that if you must
     * retry your request, the server will know to ignore the request if it has already been
     * completed.
     *
     * <p>For example, consider a situation where you make an initial request and the request times
     * out. If you make the request again with the same request ID, the server can check if original
     * operation with the same request ID was received, and if so, will ignore the second request.
     * This prevents clients from accidentally creating duplicate commitments.
     *
     * <p>The request ID must be a valid UUID with the exception that zero UUID is not supported
     * (00000000-0000-0000-0000-000000000000).
     */
    public String getRequestId() {
      return requestId;
    }

    /**
     * An optional request ID to identify requests. Specify a unique request ID so that if you must
     * retry your request, the server will know to ignore the request if it has already been
     * completed.
     *
     * <p>For example, consider a situation where you make an initial request and the request times
     * out. If you make the request again with the same request ID, the server can check if original
     * operation with the same request ID was received, and if so, will ignore the second request.
     * This prevents clients from accidentally creating duplicate commitments.
     *
     * <p>The request ID must be a valid UUID with the exception that zero UUID is not supported
     * (00000000-0000-0000-0000-000000000000).
     */
    public Builder setRequestId(String requestId) {
      this.requestId = requestId;
      return this;
    }

    /** IP address of the end user for whom the API call is being made. */
    public String getUserIp() {
      return userIp;
    }

    /** IP address of the end user for whom the API call is being made. */
    public Builder setUserIp(String userIp) {
      this.userIp = userIp;
      return this;
    }

    public UpdateAccessConfigInstanceHttpRequest build() {
      String missing = "";

      if (instance == null) {
        missing += " instance";
      }

      if (networkInterface == null) {
        missing += " networkInterface";
      }

      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new UpdateAccessConfigInstanceHttpRequest(
          accessConfigResource,
          access_token,
          callback,
          fields,
          instance,
          key,
          networkInterface,
          prettyPrint,
          quotaUser,
          requestId,
          userIp);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setAccessConfigResource(this.accessConfigResource);
      newBuilder.setAccessToken(this.access_token);
      newBuilder.setCallback(this.callback);
      newBuilder.setFields(this.fields);
      newBuilder.setInstance(this.instance);
      newBuilder.setKey(this.key);
      newBuilder.setNetworkInterface(this.networkInterface);
      newBuilder.setPrettyPrint(this.prettyPrint);
      newBuilder.setQuotaUser(this.quotaUser);
      newBuilder.setRequestId(this.requestId);
      newBuilder.setUserIp(this.userIp);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "UpdateAccessConfigInstanceHttpRequest{"
        + "accessConfigResource="
        + accessConfigResource
        + ", "
        + "access_token="
        + access_token
        + ", "
        + "callback="
        + callback
        + ", "
        + "fields="
        + fields
        + ", "
        + "instance="
        + instance
        + ", "
        + "key="
        + key
        + ", "
        + "networkInterface="
        + networkInterface
        + ", "
        + "prettyPrint="
        + prettyPrint
        + ", "
        + "quotaUser="
        + quotaUser
        + ", "
        + "requestId="
        + requestId
        + ", "
        + "userIp="
        + userIp
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof UpdateAccessConfigInstanceHttpRequest) {
      UpdateAccessConfigInstanceHttpRequest that = (UpdateAccessConfigInstanceHttpRequest) o;
      return Objects.equals(this.accessConfigResource, that.getAccessConfigResource())
          && Objects.equals(this.access_token, that.getAccessToken())
          && Objects.equals(this.callback, that.getCallback())
          && Objects.equals(this.fields, that.getFields())
          && Objects.equals(this.instance, that.getInstance())
          && Objects.equals(this.key, that.getKey())
          && Objects.equals(this.networkInterface, that.getNetworkInterface())
          && Objects.equals(this.prettyPrint, that.getPrettyPrint())
          && Objects.equals(this.quotaUser, that.getQuotaUser())
          && Objects.equals(this.requestId, that.getRequestId())
          && Objects.equals(this.userIp, that.getUserIp());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accessConfigResource,
        access_token,
        callback,
        fields,
        instance,
        key,
        networkInterface,
        prettyPrint,
        quotaUser,
        requestId,
        userIp);
  }
}
