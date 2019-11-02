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
public final class InterconnectAttachmentsScopedList implements ApiMessage {
  private final List<InterconnectAttachment> interconnectAttachments;
  private final Warning warning;

  private InterconnectAttachmentsScopedList() {
    this.interconnectAttachments = null;
    this.warning = null;
  }

  private InterconnectAttachmentsScopedList(
      List<InterconnectAttachment> interconnectAttachments, Warning warning) {
    this.interconnectAttachments = interconnectAttachments;
    this.warning = warning;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("interconnectAttachments".equals(fieldName)) {
      return interconnectAttachments;
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

  /** A list of interconnect attachments contained in this scope. */
  public List<InterconnectAttachment> getInterconnectAttachmentsList() {
    return interconnectAttachments;
  }

  /** Informational warning which replaces the list of addresses when the list is empty. */
  public Warning getWarning() {
    return warning;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(InterconnectAttachmentsScopedList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static InterconnectAttachmentsScopedList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final InterconnectAttachmentsScopedList DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new InterconnectAttachmentsScopedList();
  }

  public static class Builder {
    private List<InterconnectAttachment> interconnectAttachments;
    private Warning warning;

    Builder() {}

    public Builder mergeFrom(InterconnectAttachmentsScopedList other) {
      if (other == InterconnectAttachmentsScopedList.getDefaultInstance()) return this;
      if (other.getInterconnectAttachmentsList() != null) {
        this.interconnectAttachments = other.interconnectAttachments;
      }
      if (other.getWarning() != null) {
        this.warning = other.warning;
      }
      return this;
    }

    Builder(InterconnectAttachmentsScopedList source) {
      this.interconnectAttachments = source.interconnectAttachments;
      this.warning = source.warning;
    }

    /** A list of interconnect attachments contained in this scope. */
    public List<InterconnectAttachment> getInterconnectAttachmentsList() {
      return interconnectAttachments;
    }

    /** A list of interconnect attachments contained in this scope. */
    public Builder addAllInterconnectAttachments(
        List<InterconnectAttachment> interconnectAttachments) {
      if (this.interconnectAttachments == null) {
        this.interconnectAttachments = new LinkedList<>();
      }
      this.interconnectAttachments.addAll(interconnectAttachments);
      return this;
    }

    /** A list of interconnect attachments contained in this scope. */
    public Builder addInterconnectAttachments(InterconnectAttachment interconnectAttachments) {
      if (this.interconnectAttachments == null) {
        this.interconnectAttachments = new LinkedList<>();
      }
      this.interconnectAttachments.add(interconnectAttachments);
      return this;
    }

    /** Informational warning which replaces the list of addresses when the list is empty. */
    public Warning getWarning() {
      return warning;
    }

    /** Informational warning which replaces the list of addresses when the list is empty. */
    public Builder setWarning(Warning warning) {
      this.warning = warning;
      return this;
    }

    public InterconnectAttachmentsScopedList build() {

      return new InterconnectAttachmentsScopedList(interconnectAttachments, warning);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.addAllInterconnectAttachments(this.interconnectAttachments);
      newBuilder.setWarning(this.warning);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "InterconnectAttachmentsScopedList{"
        + "interconnectAttachments="
        + interconnectAttachments
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
    if (o instanceof InterconnectAttachmentsScopedList) {
      InterconnectAttachmentsScopedList that = (InterconnectAttachmentsScopedList) o;
      return Objects.equals(this.interconnectAttachments, that.getInterconnectAttachmentsList())
          && Objects.equals(this.warning, that.getWarning());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(interconnectAttachments, warning);
  }
}
