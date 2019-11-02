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
public final class InstancesStartWithEncryptionKeyRequest implements ApiMessage {
  private final List<CustomerEncryptionKeyProtectedDisk> disks;

  private InstancesStartWithEncryptionKeyRequest() {
    this.disks = null;
  }

  private InstancesStartWithEncryptionKeyRequest(List<CustomerEncryptionKeyProtectedDisk> disks) {
    this.disks = disks;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("disks".equals(fieldName)) {
      return disks;
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
   * Array of disks associated with this instance that are protected with a customer-supplied
   * encryption key.
   *
   * <p>In order to start the instance, the disk url and its corresponding key must be provided.
   *
   * <p>If the disk is not protected with a customer-supplied encryption key it should not be
   * specified.
   */
  public List<CustomerEncryptionKeyProtectedDisk> getDisksList() {
    return disks;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(InstancesStartWithEncryptionKeyRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static InstancesStartWithEncryptionKeyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final InstancesStartWithEncryptionKeyRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new InstancesStartWithEncryptionKeyRequest();
  }

  public static class Builder {
    private List<CustomerEncryptionKeyProtectedDisk> disks;

    Builder() {}

    public Builder mergeFrom(InstancesStartWithEncryptionKeyRequest other) {
      if (other == InstancesStartWithEncryptionKeyRequest.getDefaultInstance()) return this;
      if (other.getDisksList() != null) {
        this.disks = other.disks;
      }
      return this;
    }

    Builder(InstancesStartWithEncryptionKeyRequest source) {
      this.disks = source.disks;
    }

    /**
     * Array of disks associated with this instance that are protected with a customer-supplied
     * encryption key.
     *
     * <p>In order to start the instance, the disk url and its corresponding key must be provided.
     *
     * <p>If the disk is not protected with a customer-supplied encryption key it should not be
     * specified.
     */
    public List<CustomerEncryptionKeyProtectedDisk> getDisksList() {
      return disks;
    }

    /**
     * Array of disks associated with this instance that are protected with a customer-supplied
     * encryption key.
     *
     * <p>In order to start the instance, the disk url and its corresponding key must be provided.
     *
     * <p>If the disk is not protected with a customer-supplied encryption key it should not be
     * specified.
     */
    public Builder addAllDisks(List<CustomerEncryptionKeyProtectedDisk> disks) {
      if (this.disks == null) {
        this.disks = new LinkedList<>();
      }
      this.disks.addAll(disks);
      return this;
    }

    /**
     * Array of disks associated with this instance that are protected with a customer-supplied
     * encryption key.
     *
     * <p>In order to start the instance, the disk url and its corresponding key must be provided.
     *
     * <p>If the disk is not protected with a customer-supplied encryption key it should not be
     * specified.
     */
    public Builder addDisks(CustomerEncryptionKeyProtectedDisk disks) {
      if (this.disks == null) {
        this.disks = new LinkedList<>();
      }
      this.disks.add(disks);
      return this;
    }

    public InstancesStartWithEncryptionKeyRequest build() {
      return new InstancesStartWithEncryptionKeyRequest(disks);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.addAllDisks(this.disks);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "InstancesStartWithEncryptionKeyRequest{" + "disks=" + disks + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InstancesStartWithEncryptionKeyRequest) {
      InstancesStartWithEncryptionKeyRequest that = (InstancesStartWithEncryptionKeyRequest) o;
      return Objects.equals(this.disks, that.getDisksList());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(disks);
  }
}
