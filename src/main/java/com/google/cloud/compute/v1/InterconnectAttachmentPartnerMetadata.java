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
 * Informational metadata about Partner attachments from Partners to display to customers. These
 * fields are propagated from PARTNER_PROVIDER attachments to their corresponding PARTNER
 * attachments.
 */
public final class InterconnectAttachmentPartnerMetadata implements ApiMessage {
  private final String interconnectName;
  private final String partnerName;
  private final String portalUrl;

  private InterconnectAttachmentPartnerMetadata() {
    this.interconnectName = null;
    this.partnerName = null;
    this.portalUrl = null;
  }

  private InterconnectAttachmentPartnerMetadata(
      String interconnectName, String partnerName, String portalUrl) {
    this.interconnectName = interconnectName;
    this.partnerName = partnerName;
    this.portalUrl = portalUrl;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("interconnectName".equals(fieldName)) {
      return interconnectName;
    }
    if ("partnerName".equals(fieldName)) {
      return partnerName;
    }
    if ("portalUrl".equals(fieldName)) {
      return portalUrl;
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
   * Plain text name of the Interconnect this attachment is connected to, as displayed in the
   * Partner?s portal. For instance "Chicago 1". This value may be validated to match approved
   * Partner values.
   */
  public String getInterconnectName() {
    return interconnectName;
  }

  /**
   * Plain text name of the Partner providing this attachment. This value may be validated to match
   * approved Partner values.
   */
  public String getPartnerName() {
    return partnerName;
  }

  /**
   * URL of the Partner?s portal for this Attachment. Partners may customise this to be a deep link
   * to the specific resource on the Partner portal. This value may be validated to match approved
   * Partner values.
   */
  public String getPortalUrl() {
    return portalUrl;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(InterconnectAttachmentPartnerMetadata prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static InterconnectAttachmentPartnerMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final InterconnectAttachmentPartnerMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new InterconnectAttachmentPartnerMetadata();
  }

  public static class Builder {
    private String interconnectName;
    private String partnerName;
    private String portalUrl;

    Builder() {}

    public Builder mergeFrom(InterconnectAttachmentPartnerMetadata other) {
      if (other == InterconnectAttachmentPartnerMetadata.getDefaultInstance()) return this;
      if (other.getInterconnectName() != null) {
        this.interconnectName = other.interconnectName;
      }
      if (other.getPartnerName() != null) {
        this.partnerName = other.partnerName;
      }
      if (other.getPortalUrl() != null) {
        this.portalUrl = other.portalUrl;
      }
      return this;
    }

    Builder(InterconnectAttachmentPartnerMetadata source) {
      this.interconnectName = source.interconnectName;
      this.partnerName = source.partnerName;
      this.portalUrl = source.portalUrl;
    }

    /**
     * Plain text name of the Interconnect this attachment is connected to, as displayed in the
     * Partner?s portal. For instance "Chicago 1". This value may be validated to match approved
     * Partner values.
     */
    public String getInterconnectName() {
      return interconnectName;
    }

    /**
     * Plain text name of the Interconnect this attachment is connected to, as displayed in the
     * Partner?s portal. For instance "Chicago 1". This value may be validated to match approved
     * Partner values.
     */
    public Builder setInterconnectName(String interconnectName) {
      this.interconnectName = interconnectName;
      return this;
    }

    /**
     * Plain text name of the Partner providing this attachment. This value may be validated to
     * match approved Partner values.
     */
    public String getPartnerName() {
      return partnerName;
    }

    /**
     * Plain text name of the Partner providing this attachment. This value may be validated to
     * match approved Partner values.
     */
    public Builder setPartnerName(String partnerName) {
      this.partnerName = partnerName;
      return this;
    }

    /**
     * URL of the Partner?s portal for this Attachment. Partners may customise this to be a deep
     * link to the specific resource on the Partner portal. This value may be validated to match
     * approved Partner values.
     */
    public String getPortalUrl() {
      return portalUrl;
    }

    /**
     * URL of the Partner?s portal for this Attachment. Partners may customise this to be a deep
     * link to the specific resource on the Partner portal. This value may be validated to match
     * approved Partner values.
     */
    public Builder setPortalUrl(String portalUrl) {
      this.portalUrl = portalUrl;
      return this;
    }

    public InterconnectAttachmentPartnerMetadata build() {

      return new InterconnectAttachmentPartnerMetadata(interconnectName, partnerName, portalUrl);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setInterconnectName(this.interconnectName);
      newBuilder.setPartnerName(this.partnerName);
      newBuilder.setPortalUrl(this.portalUrl);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "InterconnectAttachmentPartnerMetadata{"
        + "interconnectName="
        + interconnectName
        + ", "
        + "partnerName="
        + partnerName
        + ", "
        + "portalUrl="
        + portalUrl
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InterconnectAttachmentPartnerMetadata) {
      InterconnectAttachmentPartnerMetadata that = (InterconnectAttachmentPartnerMetadata) o;
      return Objects.equals(this.interconnectName, that.getInterconnectName())
          && Objects.equals(this.partnerName, that.getPartnerName())
          && Objects.equals(this.portalUrl, that.getPortalUrl());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(interconnectName, partnerName, portalUrl);
  }
}
