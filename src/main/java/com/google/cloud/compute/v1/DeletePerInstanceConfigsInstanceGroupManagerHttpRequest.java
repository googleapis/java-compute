/*
 * Copyright 2020 Google LLC
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
 * Request object for method compute.instanceGroupManagers.deletePerInstanceConfigs. Deletes
 * selected per-instance configs for the managed instance group.
 */
public final class DeletePerInstanceConfigsInstanceGroupManagerHttpRequest implements ApiMessage {
  private final String access_token;
  private final String callback;
  private final String fields;
  private final String instanceGroupManager;
  private final InstanceGroupManagersDeletePerInstanceConfigsReq
      instanceGroupManagersDeletePerInstanceConfigsReqResource;
  private final String key;
  private final String prettyPrint;
  private final String quotaUser;
  private final String userIp;

  private DeletePerInstanceConfigsInstanceGroupManagerHttpRequest() {
    this.access_token = null;
    this.callback = null;
    this.fields = null;
    this.instanceGroupManager = null;
    this.instanceGroupManagersDeletePerInstanceConfigsReqResource = null;
    this.key = null;
    this.prettyPrint = null;
    this.quotaUser = null;
    this.userIp = null;
  }

  private DeletePerInstanceConfigsInstanceGroupManagerHttpRequest(
      String access_token,
      String callback,
      String fields,
      String instanceGroupManager,
      InstanceGroupManagersDeletePerInstanceConfigsReq
          instanceGroupManagersDeletePerInstanceConfigsReqResource,
      String key,
      String prettyPrint,
      String quotaUser,
      String userIp) {
    this.access_token = access_token;
    this.callback = callback;
    this.fields = fields;
    this.instanceGroupManager = instanceGroupManager;
    this.instanceGroupManagersDeletePerInstanceConfigsReqResource =
        instanceGroupManagersDeletePerInstanceConfigsReqResource;
    this.key = key;
    this.prettyPrint = prettyPrint;
    this.quotaUser = quotaUser;
    this.userIp = userIp;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("access_token".equals(fieldName)) {
      return access_token;
    }
    if ("callback".equals(fieldName)) {
      return callback;
    }
    if ("fields".equals(fieldName)) {
      return fields;
    }
    if ("instanceGroupManager".equals(fieldName)) {
      return instanceGroupManager;
    }
    if ("instanceGroupManagersDeletePerInstanceConfigsReqResource".equals(fieldName)) {
      return instanceGroupManagersDeletePerInstanceConfigsReqResource;
    }
    if ("key".equals(fieldName)) {
      return key;
    }
    if ("prettyPrint".equals(fieldName)) {
      return prettyPrint;
    }
    if ("quotaUser".equals(fieldName)) {
      return quotaUser;
    }
    if ("userIp".equals(fieldName)) {
      return userIp;
    }
    return null;
  }

  @Nullable
  @Override
  public InstanceGroupManagersDeletePerInstanceConfigsReq getApiMessageRequestBody() {
    return instanceGroupManagersDeletePerInstanceConfigsReqResource;
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
   * The name of the managed instance group. It should conform to RFC1035. It must have the format
   * `{project}/zones/{zone}/instanceGroupManagers/{instanceGroupManager}/deletePerInstanceConfigs`.
   * \`{instanceGroupManager}\` must start with a letter, and contain only letters (\`[A-Za-z]\`),
   * numbers (\`[0-9]\`), dashes (\`-\`), &#42; underscores (\`_\`), periods (\`.\`), tildes
   * (\`~\`), plus (\`+\`) or percent &#42; signs (\`%\`). It must be between 3 and 255 characters
   * in length, and it &#42; must not start with \`"goog"\`.
   */
  public String getInstanceGroupManager() {
    return instanceGroupManager;
  }

  /** InstanceGroupManagers.deletePerInstanceConfigs */
  public InstanceGroupManagersDeletePerInstanceConfigsReq
      getInstanceGroupManagersDeletePerInstanceConfigsReqResource() {
    return instanceGroupManagersDeletePerInstanceConfigsReqResource;
  }

  /** API key. Required unless you provide an OAuth 2.0 token. */
  public String getKey() {
    return key;
  }

  /** Returns response with indentations and line breaks. */
  public String getPrettyPrint() {
    return prettyPrint;
  }

  /** Alternative to userIp. */
  public String getQuotaUser() {
    return quotaUser;
  }

  /** IP address of the end user for whom the API call is being made. */
  public String getUserIp() {
    return userIp;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      DeletePerInstanceConfigsInstanceGroupManagerHttpRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static DeletePerInstanceConfigsInstanceGroupManagerHttpRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final DeletePerInstanceConfigsInstanceGroupManagerHttpRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new DeletePerInstanceConfigsInstanceGroupManagerHttpRequest();
  }

  public static class Builder {
    private String access_token;
    private String callback;
    private String fields;
    private String instanceGroupManager;
    private InstanceGroupManagersDeletePerInstanceConfigsReq
        instanceGroupManagersDeletePerInstanceConfigsReqResource;
    private String key;
    private String prettyPrint;
    private String quotaUser;
    private String userIp;

    Builder() {}

    public Builder mergeFrom(DeletePerInstanceConfigsInstanceGroupManagerHttpRequest other) {
      if (other == DeletePerInstanceConfigsInstanceGroupManagerHttpRequest.getDefaultInstance())
        return this;
      if (other.getAccessToken() != null) {
        this.access_token = other.access_token;
      }
      if (other.getCallback() != null) {
        this.callback = other.callback;
      }
      if (other.getFields() != null) {
        this.fields = other.fields;
      }
      if (other.getInstanceGroupManager() != null) {
        this.instanceGroupManager = other.instanceGroupManager;
      }
      if (other.getInstanceGroupManagersDeletePerInstanceConfigsReqResource() != null) {
        this.instanceGroupManagersDeletePerInstanceConfigsReqResource =
            other.instanceGroupManagersDeletePerInstanceConfigsReqResource;
      }
      if (other.getKey() != null) {
        this.key = other.key;
      }
      if (other.getPrettyPrint() != null) {
        this.prettyPrint = other.prettyPrint;
      }
      if (other.getQuotaUser() != null) {
        this.quotaUser = other.quotaUser;
      }
      if (other.getUserIp() != null) {
        this.userIp = other.userIp;
      }
      return this;
    }

    Builder(DeletePerInstanceConfigsInstanceGroupManagerHttpRequest source) {
      this.access_token = source.access_token;
      this.callback = source.callback;
      this.fields = source.fields;
      this.instanceGroupManager = source.instanceGroupManager;
      this.instanceGroupManagersDeletePerInstanceConfigsReqResource =
          source.instanceGroupManagersDeletePerInstanceConfigsReqResource;
      this.key = source.key;
      this.prettyPrint = source.prettyPrint;
      this.quotaUser = source.quotaUser;
      this.userIp = source.userIp;
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
     * The name of the managed instance group. It should conform to RFC1035. It must have the format
     * `{project}/zones/{zone}/instanceGroupManagers/{instanceGroupManager}/deletePerInstanceConfigs`.
     * \`{instanceGroupManager}\` must start with a letter, and contain only letters (\`[A-Za-z]\`),
     * numbers (\`[0-9]\`), dashes (\`-\`), &#42; underscores (\`_\`), periods (\`.\`), tildes
     * (\`~\`), plus (\`+\`) or percent &#42; signs (\`%\`). It must be between 3 and 255 characters
     * in length, and it &#42; must not start with \`"goog"\`.
     */
    public String getInstanceGroupManager() {
      return instanceGroupManager;
    }

    /**
     * The name of the managed instance group. It should conform to RFC1035. It must have the format
     * `{project}/zones/{zone}/instanceGroupManagers/{instanceGroupManager}/deletePerInstanceConfigs`.
     * \`{instanceGroupManager}\` must start with a letter, and contain only letters (\`[A-Za-z]\`),
     * numbers (\`[0-9]\`), dashes (\`-\`), &#42; underscores (\`_\`), periods (\`.\`), tildes
     * (\`~\`), plus (\`+\`) or percent &#42; signs (\`%\`). It must be between 3 and 255 characters
     * in length, and it &#42; must not start with \`"goog"\`.
     */
    public Builder setInstanceGroupManager(String instanceGroupManager) {
      this.instanceGroupManager = instanceGroupManager;
      return this;
    }

    /** InstanceGroupManagers.deletePerInstanceConfigs */
    public InstanceGroupManagersDeletePerInstanceConfigsReq
        getInstanceGroupManagersDeletePerInstanceConfigsReqResource() {
      return instanceGroupManagersDeletePerInstanceConfigsReqResource;
    }

    /** InstanceGroupManagers.deletePerInstanceConfigs */
    public Builder setInstanceGroupManagersDeletePerInstanceConfigsReqResource(
        InstanceGroupManagersDeletePerInstanceConfigsReq
            instanceGroupManagersDeletePerInstanceConfigsReqResource) {
      this.instanceGroupManagersDeletePerInstanceConfigsReqResource =
          instanceGroupManagersDeletePerInstanceConfigsReqResource;
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

    /** IP address of the end user for whom the API call is being made. */
    public String getUserIp() {
      return userIp;
    }

    /** IP address of the end user for whom the API call is being made. */
    public Builder setUserIp(String userIp) {
      this.userIp = userIp;
      return this;
    }

    public DeletePerInstanceConfigsInstanceGroupManagerHttpRequest build() {
      String missing = "";

      if (instanceGroupManager == null) {
        missing += " instanceGroupManager";
      }

      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new DeletePerInstanceConfigsInstanceGroupManagerHttpRequest(
          access_token,
          callback,
          fields,
          instanceGroupManager,
          instanceGroupManagersDeletePerInstanceConfigsReqResource,
          key,
          prettyPrint,
          quotaUser,
          userIp);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setAccessToken(this.access_token);
      newBuilder.setCallback(this.callback);
      newBuilder.setFields(this.fields);
      newBuilder.setInstanceGroupManager(this.instanceGroupManager);
      newBuilder.setInstanceGroupManagersDeletePerInstanceConfigsReqResource(
          this.instanceGroupManagersDeletePerInstanceConfigsReqResource);
      newBuilder.setKey(this.key);
      newBuilder.setPrettyPrint(this.prettyPrint);
      newBuilder.setQuotaUser(this.quotaUser);
      newBuilder.setUserIp(this.userIp);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "DeletePerInstanceConfigsInstanceGroupManagerHttpRequest{"
        + "access_token="
        + access_token
        + ", "
        + "callback="
        + callback
        + ", "
        + "fields="
        + fields
        + ", "
        + "instanceGroupManager="
        + instanceGroupManager
        + ", "
        + "instanceGroupManagersDeletePerInstanceConfigsReqResource="
        + instanceGroupManagersDeletePerInstanceConfigsReqResource
        + ", "
        + "key="
        + key
        + ", "
        + "prettyPrint="
        + prettyPrint
        + ", "
        + "quotaUser="
        + quotaUser
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
    if (o instanceof DeletePerInstanceConfigsInstanceGroupManagerHttpRequest) {
      DeletePerInstanceConfigsInstanceGroupManagerHttpRequest that =
          (DeletePerInstanceConfigsInstanceGroupManagerHttpRequest) o;
      return Objects.equals(this.access_token, that.getAccessToken())
          && Objects.equals(this.callback, that.getCallback())
          && Objects.equals(this.fields, that.getFields())
          && Objects.equals(this.instanceGroupManager, that.getInstanceGroupManager())
          && Objects.equals(
              this.instanceGroupManagersDeletePerInstanceConfigsReqResource,
              that.getInstanceGroupManagersDeletePerInstanceConfigsReqResource())
          && Objects.equals(this.key, that.getKey())
          && Objects.equals(this.prettyPrint, that.getPrettyPrint())
          && Objects.equals(this.quotaUser, that.getQuotaUser())
          && Objects.equals(this.userIp, that.getUserIp());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        access_token,
        callback,
        fields,
        instanceGroupManager,
        instanceGroupManagersDeletePerInstanceConfigsReqResource,
        key,
        prettyPrint,
        quotaUser,
        userIp);
  }
}
