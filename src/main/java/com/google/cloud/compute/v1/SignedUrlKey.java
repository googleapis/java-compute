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
/** Represents a customer-supplied Signing Key used by Cloud CDN Signed URLs */
public final class SignedUrlKey implements ApiMessage {
  private final String keyName;
  private final String keyValue;

  private SignedUrlKey() {
    this.keyName = null;
    this.keyValue = null;
  }

  private SignedUrlKey(String keyName, String keyValue) {
    this.keyName = keyName;
    this.keyValue = keyValue;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("keyName".equals(fieldName)) {
      return keyName;
    }
    if ("keyValue".equals(fieldName)) {
      return keyValue;
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

  /**
   * Name of the key. The name must be 1-63 characters long, and comply with RFC1035. Specifically,
   * the name must be 1-63 characters long and match the regular expression
   * `[a-z]([-a-z0-9]&#42;[a-z0-9])?` which means the first character must be a lowercase letter,
   * and all following characters must be a dash, lowercase letter, or digit, except the last
   * character, which cannot be a dash.
   */
  public String getKeyName() {
    return keyName;
  }

  /**
   * 128-bit key value used for signing the URL. The key value must be a valid RFC 4648 Section 5
   * base64url encoded string.
   */
  public String getKeyValue() {
    return keyValue;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(SignedUrlKey prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static SignedUrlKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final SignedUrlKey DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new SignedUrlKey();
  }

  public static class Builder {
    private String keyName;
    private String keyValue;

    Builder() {}

    public Builder mergeFrom(SignedUrlKey other) {
      if (other == SignedUrlKey.getDefaultInstance()) return this;
      if (other.getKeyName() != null) {
        this.keyName = other.keyName;
      }
      if (other.getKeyValue() != null) {
        this.keyValue = other.keyValue;
      }
      return this;
    }

    Builder(SignedUrlKey source) {
      this.keyName = source.keyName;
      this.keyValue = source.keyValue;
    }

    /**
     * Name of the key. The name must be 1-63 characters long, and comply with RFC1035.
     * Specifically, the name must be 1-63 characters long and match the regular expression
     * `[a-z]([-a-z0-9]&#42;[a-z0-9])?` which means the first character must be a lowercase letter,
     * and all following characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     */
    public String getKeyName() {
      return keyName;
    }

    /**
     * Name of the key. The name must be 1-63 characters long, and comply with RFC1035.
     * Specifically, the name must be 1-63 characters long and match the regular expression
     * `[a-z]([-a-z0-9]&#42;[a-z0-9])?` which means the first character must be a lowercase letter,
     * and all following characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     */
    public Builder setKeyName(String keyName) {
      this.keyName = keyName;
      return this;
    }

    /**
     * 128-bit key value used for signing the URL. The key value must be a valid RFC 4648 Section 5
     * base64url encoded string.
     */
    public String getKeyValue() {
      return keyValue;
    }

    /**
     * 128-bit key value used for signing the URL. The key value must be a valid RFC 4648 Section 5
     * base64url encoded string.
     */
    public Builder setKeyValue(String keyValue) {
      this.keyValue = keyValue;
      return this;
    }

    public SignedUrlKey build() {

      return new SignedUrlKey(keyName, keyValue);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setKeyName(this.keyName);
      newBuilder.setKeyValue(this.keyValue);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "SignedUrlKey{" + "keyName=" + keyName + ", " + "keyValue=" + keyValue + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SignedUrlKey) {
      SignedUrlKey that = (SignedUrlKey) o;
      return Objects.equals(this.keyName, that.getKeyName())
          && Objects.equals(this.keyValue, that.getKeyValue());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyName, keyValue);
  }
}
