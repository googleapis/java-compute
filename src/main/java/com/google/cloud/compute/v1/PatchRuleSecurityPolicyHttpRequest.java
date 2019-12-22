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
 * Request object for method compute.securityPolicies.patchRule. Patches a rule at the specified
 * priority.
 */
public final class PatchRuleSecurityPolicyHttpRequest implements ApiMessage {
  private final String access_token;
  private final String callback;
  private final String fields;
  private final String key;
  private final String prettyPrint;
  private final Integer priority;
  private final String quotaUser;
  private final String securityPolicy;
  private final SecurityPolicyRule securityPolicyRuleResource;
  private final String userIp;

  private PatchRuleSecurityPolicyHttpRequest() {
    this.access_token = null;
    this.callback = null;
    this.fields = null;
    this.key = null;
    this.prettyPrint = null;
    this.priority = null;
    this.quotaUser = null;
    this.securityPolicy = null;
    this.securityPolicyRuleResource = null;
    this.userIp = null;
  }

  private PatchRuleSecurityPolicyHttpRequest(
      String access_token,
      String callback,
      String fields,
      String key,
      String prettyPrint,
      Integer priority,
      String quotaUser,
      String securityPolicy,
      SecurityPolicyRule securityPolicyRuleResource,
      String userIp) {
    this.access_token = access_token;
    this.callback = callback;
    this.fields = fields;
    this.key = key;
    this.prettyPrint = prettyPrint;
    this.priority = priority;
    this.quotaUser = quotaUser;
    this.securityPolicy = securityPolicy;
    this.securityPolicyRuleResource = securityPolicyRuleResource;
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
    if ("key".equals(fieldName)) {
      return key;
    }
    if ("prettyPrint".equals(fieldName)) {
      return prettyPrint;
    }
    if ("priority".equals(fieldName)) {
      return priority;
    }
    if ("quotaUser".equals(fieldName)) {
      return quotaUser;
    }
    if ("securityPolicy".equals(fieldName)) {
      return securityPolicy;
    }
    if ("securityPolicyRuleResource".equals(fieldName)) {
      return securityPolicyRuleResource;
    }
    if ("userIp".equals(fieldName)) {
      return userIp;
    }
    return null;
  }

  @Nullable
  @Override
  public SecurityPolicyRule getApiMessageRequestBody() {
    return securityPolicyRuleResource;
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

  /** API key. Required unless you provide an OAuth 2.0 token. */
  public String getKey() {
    return key;
  }

  /** Returns response with indentations and line breaks. */
  public String getPrettyPrint() {
    return prettyPrint;
  }

  /** The priority of the rule to patch. */
  public Integer getPriority() {
    return priority;
  }

  /** Alternative to userIp. */
  public String getQuotaUser() {
    return quotaUser;
  }

  /**
   * Name of the security policy to update. It must have the format
   * `{project}/global/securityPolicies/{securityPolicy}/patchRule`. \`{securityPolicy}\` must start
   * with a letter, and contain only letters (\`[A-Za-z]\`), numbers (\`[0-9]\`), dashes (\`-\`),
   * &#42; underscores (\`_\`), periods (\`.\`), tildes (\`~\`), plus (\`+\`) or percent &#42; signs
   * (\`%\`). It must be between 3 and 255 characters in length, and it &#42; must not start with
   * \`"goog"\`.
   */
  public String getSecurityPolicy() {
    return securityPolicy;
  }

  /**
   * Represents a rule that describes one or more match conditions along with the action to be taken
   * when traffic matches this condition (allow or deny).
   */
  public SecurityPolicyRule getSecurityPolicyRuleResource() {
    return securityPolicyRuleResource;
  }

  /** IP address of the end user for whom the API call is being made. */
  public String getUserIp() {
    return userIp;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(PatchRuleSecurityPolicyHttpRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static PatchRuleSecurityPolicyHttpRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final PatchRuleSecurityPolicyHttpRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new PatchRuleSecurityPolicyHttpRequest();
  }

  public static class Builder {
    private String access_token;
    private String callback;
    private String fields;
    private String key;
    private String prettyPrint;
    private Integer priority;
    private String quotaUser;
    private String securityPolicy;
    private SecurityPolicyRule securityPolicyRuleResource;
    private String userIp;

    Builder() {}

    public Builder mergeFrom(PatchRuleSecurityPolicyHttpRequest other) {
      if (other == PatchRuleSecurityPolicyHttpRequest.getDefaultInstance()) return this;
      if (other.getAccessToken() != null) {
        this.access_token = other.access_token;
      }
      if (other.getCallback() != null) {
        this.callback = other.callback;
      }
      if (other.getFields() != null) {
        this.fields = other.fields;
      }
      if (other.getKey() != null) {
        this.key = other.key;
      }
      if (other.getPrettyPrint() != null) {
        this.prettyPrint = other.prettyPrint;
      }
      if (other.getPriority() != null) {
        this.priority = other.priority;
      }
      if (other.getQuotaUser() != null) {
        this.quotaUser = other.quotaUser;
      }
      if (other.getSecurityPolicy() != null) {
        this.securityPolicy = other.securityPolicy;
      }
      if (other.getSecurityPolicyRuleResource() != null) {
        this.securityPolicyRuleResource = other.securityPolicyRuleResource;
      }
      if (other.getUserIp() != null) {
        this.userIp = other.userIp;
      }
      return this;
    }

    Builder(PatchRuleSecurityPolicyHttpRequest source) {
      this.access_token = source.access_token;
      this.callback = source.callback;
      this.fields = source.fields;
      this.key = source.key;
      this.prettyPrint = source.prettyPrint;
      this.priority = source.priority;
      this.quotaUser = source.quotaUser;
      this.securityPolicy = source.securityPolicy;
      this.securityPolicyRuleResource = source.securityPolicyRuleResource;
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

    /** The priority of the rule to patch. */
    public Integer getPriority() {
      return priority;
    }

    /** The priority of the rule to patch. */
    public Builder setPriority(Integer priority) {
      this.priority = priority;
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
     * Name of the security policy to update. It must have the format
     * `{project}/global/securityPolicies/{securityPolicy}/patchRule`. \`{securityPolicy}\` must
     * start with a letter, and contain only letters (\`[A-Za-z]\`), numbers (\`[0-9]\`), dashes
     * (\`-\`), &#42; underscores (\`_\`), periods (\`.\`), tildes (\`~\`), plus (\`+\`) or percent
     * &#42; signs (\`%\`). It must be between 3 and 255 characters in length, and it &#42; must not
     * start with \`"goog"\`.
     */
    public String getSecurityPolicy() {
      return securityPolicy;
    }

    /**
     * Name of the security policy to update. It must have the format
     * `{project}/global/securityPolicies/{securityPolicy}/patchRule`. \`{securityPolicy}\` must
     * start with a letter, and contain only letters (\`[A-Za-z]\`), numbers (\`[0-9]\`), dashes
     * (\`-\`), &#42; underscores (\`_\`), periods (\`.\`), tildes (\`~\`), plus (\`+\`) or percent
     * &#42; signs (\`%\`). It must be between 3 and 255 characters in length, and it &#42; must not
     * start with \`"goog"\`.
     */
    public Builder setSecurityPolicy(String securityPolicy) {
      this.securityPolicy = securityPolicy;
      return this;
    }

    /**
     * Represents a rule that describes one or more match conditions along with the action to be
     * taken when traffic matches this condition (allow or deny).
     */
    public SecurityPolicyRule getSecurityPolicyRuleResource() {
      return securityPolicyRuleResource;
    }

    /**
     * Represents a rule that describes one or more match conditions along with the action to be
     * taken when traffic matches this condition (allow or deny).
     */
    public Builder setSecurityPolicyRuleResource(SecurityPolicyRule securityPolicyRuleResource) {
      this.securityPolicyRuleResource = securityPolicyRuleResource;
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

    public PatchRuleSecurityPolicyHttpRequest build() {
      String missing = "";

      if (securityPolicy == null) {
        missing += " securityPolicy";
      }

      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new PatchRuleSecurityPolicyHttpRequest(
          access_token,
          callback,
          fields,
          key,
          prettyPrint,
          priority,
          quotaUser,
          securityPolicy,
          securityPolicyRuleResource,
          userIp);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setAccessToken(this.access_token);
      newBuilder.setCallback(this.callback);
      newBuilder.setFields(this.fields);
      newBuilder.setKey(this.key);
      newBuilder.setPrettyPrint(this.prettyPrint);
      newBuilder.setPriority(this.priority);
      newBuilder.setQuotaUser(this.quotaUser);
      newBuilder.setSecurityPolicy(this.securityPolicy);
      newBuilder.setSecurityPolicyRuleResource(this.securityPolicyRuleResource);
      newBuilder.setUserIp(this.userIp);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "PatchRuleSecurityPolicyHttpRequest{"
        + "access_token="
        + access_token
        + ", "
        + "callback="
        + callback
        + ", "
        + "fields="
        + fields
        + ", "
        + "key="
        + key
        + ", "
        + "prettyPrint="
        + prettyPrint
        + ", "
        + "priority="
        + priority
        + ", "
        + "quotaUser="
        + quotaUser
        + ", "
        + "securityPolicy="
        + securityPolicy
        + ", "
        + "securityPolicyRuleResource="
        + securityPolicyRuleResource
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
    if (o instanceof PatchRuleSecurityPolicyHttpRequest) {
      PatchRuleSecurityPolicyHttpRequest that = (PatchRuleSecurityPolicyHttpRequest) o;
      return Objects.equals(this.access_token, that.getAccessToken())
          && Objects.equals(this.callback, that.getCallback())
          && Objects.equals(this.fields, that.getFields())
          && Objects.equals(this.key, that.getKey())
          && Objects.equals(this.prettyPrint, that.getPrettyPrint())
          && Objects.equals(this.priority, that.getPriority())
          && Objects.equals(this.quotaUser, that.getQuotaUser())
          && Objects.equals(this.securityPolicy, that.getSecurityPolicy())
          && Objects.equals(this.securityPolicyRuleResource, that.getSecurityPolicyRuleResource())
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
        key,
        prettyPrint,
        priority,
        quotaUser,
        securityPolicy,
        securityPolicyRuleResource,
        userIp);
  }
}
