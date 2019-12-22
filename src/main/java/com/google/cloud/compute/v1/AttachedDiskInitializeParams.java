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
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
/**
 * [Input Only] Specifies the parameters for a new disk that will be created alongside the new
 * instance. Use initialization parameters to create boot disks or local SSDs attached to the new
 * instance.
 *
 * <p>This property is mutually exclusive with the source property; you can only define one or the
 * other, but not both.
 */
public final class AttachedDiskInitializeParams implements ApiMessage {
  private final String description;
  private final String diskName;
  private final String diskSizeGb;
  private final String diskType;
  private final Map<String, String> labels;
  private final List<String> resourcePolicies;
  private final String sourceImage;
  private final CustomerEncryptionKey sourceImageEncryptionKey;
  private final String sourceSnapshot;
  private final CustomerEncryptionKey sourceSnapshotEncryptionKey;

  private AttachedDiskInitializeParams() {
    this.description = null;
    this.diskName = null;
    this.diskSizeGb = null;
    this.diskType = null;
    this.labels = null;
    this.resourcePolicies = null;
    this.sourceImage = null;
    this.sourceImageEncryptionKey = null;
    this.sourceSnapshot = null;
    this.sourceSnapshotEncryptionKey = null;
  }

  private AttachedDiskInitializeParams(
      String description,
      String diskName,
      String diskSizeGb,
      String diskType,
      Map<String, String> labels,
      List<String> resourcePolicies,
      String sourceImage,
      CustomerEncryptionKey sourceImageEncryptionKey,
      String sourceSnapshot,
      CustomerEncryptionKey sourceSnapshotEncryptionKey) {
    this.description = description;
    this.diskName = diskName;
    this.diskSizeGb = diskSizeGb;
    this.diskType = diskType;
    this.labels = labels;
    this.resourcePolicies = resourcePolicies;
    this.sourceImage = sourceImage;
    this.sourceImageEncryptionKey = sourceImageEncryptionKey;
    this.sourceSnapshot = sourceSnapshot;
    this.sourceSnapshotEncryptionKey = sourceSnapshotEncryptionKey;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("description".equals(fieldName)) {
      return description;
    }
    if ("diskName".equals(fieldName)) {
      return diskName;
    }
    if ("diskSizeGb".equals(fieldName)) {
      return diskSizeGb;
    }
    if ("diskType".equals(fieldName)) {
      return diskType;
    }
    if ("labels".equals(fieldName)) {
      return labels;
    }
    if ("resourcePolicies".equals(fieldName)) {
      return resourcePolicies;
    }
    if ("sourceImage".equals(fieldName)) {
      return sourceImage;
    }
    if ("sourceImageEncryptionKey".equals(fieldName)) {
      return sourceImageEncryptionKey;
    }
    if ("sourceSnapshot".equals(fieldName)) {
      return sourceSnapshot;
    }
    if ("sourceSnapshotEncryptionKey".equals(fieldName)) {
      return sourceSnapshotEncryptionKey;
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

  /** An optional description. Provide this property when creating the disk. */
  public String getDescription() {
    return description;
  }

  /**
   * Specifies the disk name. If not specified, the default is to use the name of the instance. If
   * the disk with the instance name exists already in the given zone/region, a new name will be
   * automatically generated.
   */
  public String getDiskName() {
    return diskName;
  }

  /**
   * Specifies the size of the disk in base-2 GB. The size must be at least 10 GB. If you specify a
   * sourceImage, which is required for boot disks, the default size is the size of the sourceImage.
   * If you do not specify a sourceImage, the default disk size is 500 GB.
   */
  public String getDiskSizeGb() {
    return diskSizeGb;
  }

  /**
   * Specifies the disk type to use to create the instance. If not specified, the default is
   * pd-standard, specified using the full URL. For example:
   * https://www.googleapis.com/compute/v1/projects/project/zones/zone/diskTypes/pd-standard
   *
   * <p>Other values include pd-ssd and local-ssd. If you define this field, you can provide either
   * the full or partial URL. For example, the following are valid values: -
   * https://www.googleapis.com/compute/v1/projects/project/zones/zone/diskTypes/diskType -
   * projects/project/zones/zone/diskTypes/diskType - zones/zone/diskTypes/diskType Note that for
   * InstanceTemplate, this is the name of the disk type, not URL.
   */
  public String getDiskType() {
    return diskType;
  }

  /**
   * Labels to apply to this disk. These can be later modified by the disks.setLabels method. This
   * field is only applicable for persistent disks.
   */
  public Map<String, String> getLabelsMap() {
    return labels;
  }

  /**
   * Resource policies applied to this disk for automatic snapshot creations. Specified using the
   * full or partial URL. For instance template, specify only the resource policy name.
   */
  public List<String> getResourcePoliciesList() {
    return resourcePolicies;
  }

  /**
   * The source image to create this disk. When creating a new instance, one of
   * initializeParams.sourceImage or initializeParams.sourceSnapshot or disks.source is required
   * except for local SSD.
   *
   * <p>To create a disk with one of the public operating system images, specify the image by its
   * family name. For example, specify family/debian-9 to use the latest Debian 9 image:
   * projects/debian-cloud/global/images/family/debian-9
   *
   * <p>Alternatively, use a specific version of a public operating system image:
   * projects/debian-cloud/global/images/debian-9-stretch-vYYYYMMDD
   *
   * <p>To create a disk with a custom image that you created, specify the image name in the
   * following format: global/images/my-custom-image
   *
   * <p>You can also specify a custom image by its image family, which returns the latest version of
   * the image in that family. Replace the image name with family/family-name:
   * global/images/family/my-image-family
   *
   * <p>If the source image is deleted later, this field will not be set.
   */
  public String getSourceImage() {
    return sourceImage;
  }

  /**
   * The customer-supplied encryption key of the source image. Required if the source image is
   * protected by a customer-supplied encryption key.
   *
   * <p>Instance templates do not store customer-supplied encryption keys, so you cannot create
   * disks for instances in a managed instance group if the source images are encrypted with your
   * own keys.
   */
  public CustomerEncryptionKey getSourceImageEncryptionKey() {
    return sourceImageEncryptionKey;
  }

  /**
   * The source snapshot to create this disk. When creating a new instance, one of
   * initializeParams.sourceSnapshot or initializeParams.sourceImage or disks.source is required
   * except for local SSD.
   *
   * <p>To create a disk with a snapshot that you created, specify the snapshot name in the
   * following format: global/snapshots/my-backup
   *
   * <p>If the source snapshot is deleted later, this field will not be set.
   */
  public String getSourceSnapshot() {
    return sourceSnapshot;
  }

  /** The customer-supplied encryption key of the source snapshot. */
  public CustomerEncryptionKey getSourceSnapshotEncryptionKey() {
    return sourceSnapshotEncryptionKey;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(AttachedDiskInitializeParams prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static AttachedDiskInitializeParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final AttachedDiskInitializeParams DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new AttachedDiskInitializeParams();
  }

  public static class Builder {
    private String description;
    private String diskName;
    private String diskSizeGb;
    private String diskType;
    private Map<String, String> labels;
    private List<String> resourcePolicies;
    private String sourceImage;
    private CustomerEncryptionKey sourceImageEncryptionKey;
    private String sourceSnapshot;
    private CustomerEncryptionKey sourceSnapshotEncryptionKey;

    Builder() {}

    public Builder mergeFrom(AttachedDiskInitializeParams other) {
      if (other == AttachedDiskInitializeParams.getDefaultInstance()) return this;
      if (other.getDescription() != null) {
        this.description = other.description;
      }
      if (other.getDiskName() != null) {
        this.diskName = other.diskName;
      }
      if (other.getDiskSizeGb() != null) {
        this.diskSizeGb = other.diskSizeGb;
      }
      if (other.getDiskType() != null) {
        this.diskType = other.diskType;
      }
      if (other.getLabelsMap() != null) {
        this.labels = other.labels;
      }
      if (other.getResourcePoliciesList() != null) {
        this.resourcePolicies = other.resourcePolicies;
      }
      if (other.getSourceImage() != null) {
        this.sourceImage = other.sourceImage;
      }
      if (other.getSourceImageEncryptionKey() != null) {
        this.sourceImageEncryptionKey = other.sourceImageEncryptionKey;
      }
      if (other.getSourceSnapshot() != null) {
        this.sourceSnapshot = other.sourceSnapshot;
      }
      if (other.getSourceSnapshotEncryptionKey() != null) {
        this.sourceSnapshotEncryptionKey = other.sourceSnapshotEncryptionKey;
      }
      return this;
    }

    Builder(AttachedDiskInitializeParams source) {
      this.description = source.description;
      this.diskName = source.diskName;
      this.diskSizeGb = source.diskSizeGb;
      this.diskType = source.diskType;
      this.labels = source.labels;
      this.resourcePolicies = source.resourcePolicies;
      this.sourceImage = source.sourceImage;
      this.sourceImageEncryptionKey = source.sourceImageEncryptionKey;
      this.sourceSnapshot = source.sourceSnapshot;
      this.sourceSnapshotEncryptionKey = source.sourceSnapshotEncryptionKey;
    }

    /** An optional description. Provide this property when creating the disk. */
    public String getDescription() {
      return description;
    }

    /** An optional description. Provide this property when creating the disk. */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    /**
     * Specifies the disk name. If not specified, the default is to use the name of the instance. If
     * the disk with the instance name exists already in the given zone/region, a new name will be
     * automatically generated.
     */
    public String getDiskName() {
      return diskName;
    }

    /**
     * Specifies the disk name. If not specified, the default is to use the name of the instance. If
     * the disk with the instance name exists already in the given zone/region, a new name will be
     * automatically generated.
     */
    public Builder setDiskName(String diskName) {
      this.diskName = diskName;
      return this;
    }

    /**
     * Specifies the size of the disk in base-2 GB. The size must be at least 10 GB. If you specify
     * a sourceImage, which is required for boot disks, the default size is the size of the
     * sourceImage. If you do not specify a sourceImage, the default disk size is 500 GB.
     */
    public String getDiskSizeGb() {
      return diskSizeGb;
    }

    /**
     * Specifies the size of the disk in base-2 GB. The size must be at least 10 GB. If you specify
     * a sourceImage, which is required for boot disks, the default size is the size of the
     * sourceImage. If you do not specify a sourceImage, the default disk size is 500 GB.
     */
    public Builder setDiskSizeGb(String diskSizeGb) {
      this.diskSizeGb = diskSizeGb;
      return this;
    }

    /**
     * Specifies the disk type to use to create the instance. If not specified, the default is
     * pd-standard, specified using the full URL. For example:
     * https://www.googleapis.com/compute/v1/projects/project/zones/zone/diskTypes/pd-standard
     *
     * <p>Other values include pd-ssd and local-ssd. If you define this field, you can provide
     * either the full or partial URL. For example, the following are valid values: -
     * https://www.googleapis.com/compute/v1/projects/project/zones/zone/diskTypes/diskType -
     * projects/project/zones/zone/diskTypes/diskType - zones/zone/diskTypes/diskType Note that for
     * InstanceTemplate, this is the name of the disk type, not URL.
     */
    public String getDiskType() {
      return diskType;
    }

    /**
     * Specifies the disk type to use to create the instance. If not specified, the default is
     * pd-standard, specified using the full URL. For example:
     * https://www.googleapis.com/compute/v1/projects/project/zones/zone/diskTypes/pd-standard
     *
     * <p>Other values include pd-ssd and local-ssd. If you define this field, you can provide
     * either the full or partial URL. For example, the following are valid values: -
     * https://www.googleapis.com/compute/v1/projects/project/zones/zone/diskTypes/diskType -
     * projects/project/zones/zone/diskTypes/diskType - zones/zone/diskTypes/diskType Note that for
     * InstanceTemplate, this is the name of the disk type, not URL.
     */
    public Builder setDiskType(String diskType) {
      this.diskType = diskType;
      return this;
    }

    /**
     * Labels to apply to this disk. These can be later modified by the disks.setLabels method. This
     * field is only applicable for persistent disks.
     */
    public Map<String, String> getLabelsMap() {
      return labels;
    }

    /**
     * Labels to apply to this disk. These can be later modified by the disks.setLabels method. This
     * field is only applicable for persistent disks.
     */
    public Builder putAllLabels(Map<String, String> labels) {
      this.labels = labels;
      return this;
    }

    /**
     * Resource policies applied to this disk for automatic snapshot creations. Specified using the
     * full or partial URL. For instance template, specify only the resource policy name.
     */
    public List<String> getResourcePoliciesList() {
      return resourcePolicies;
    }

    /**
     * Resource policies applied to this disk for automatic snapshot creations. Specified using the
     * full or partial URL. For instance template, specify only the resource policy name.
     */
    public Builder addAllResourcePolicies(List<String> resourcePolicies) {
      if (this.resourcePolicies == null) {
        this.resourcePolicies = new LinkedList<>();
      }
      this.resourcePolicies.addAll(resourcePolicies);
      return this;
    }

    /**
     * Resource policies applied to this disk for automatic snapshot creations. Specified using the
     * full or partial URL. For instance template, specify only the resource policy name.
     */
    public Builder addResourcePolicies(String resourcePolicies) {
      if (this.resourcePolicies == null) {
        this.resourcePolicies = new LinkedList<>();
      }
      this.resourcePolicies.add(resourcePolicies);
      return this;
    }

    /**
     * The source image to create this disk. When creating a new instance, one of
     * initializeParams.sourceImage or initializeParams.sourceSnapshot or disks.source is required
     * except for local SSD.
     *
     * <p>To create a disk with one of the public operating system images, specify the image by its
     * family name. For example, specify family/debian-9 to use the latest Debian 9 image:
     * projects/debian-cloud/global/images/family/debian-9
     *
     * <p>Alternatively, use a specific version of a public operating system image:
     * projects/debian-cloud/global/images/debian-9-stretch-vYYYYMMDD
     *
     * <p>To create a disk with a custom image that you created, specify the image name in the
     * following format: global/images/my-custom-image
     *
     * <p>You can also specify a custom image by its image family, which returns the latest version
     * of the image in that family. Replace the image name with family/family-name:
     * global/images/family/my-image-family
     *
     * <p>If the source image is deleted later, this field will not be set.
     */
    public String getSourceImage() {
      return sourceImage;
    }

    /**
     * The source image to create this disk. When creating a new instance, one of
     * initializeParams.sourceImage or initializeParams.sourceSnapshot or disks.source is required
     * except for local SSD.
     *
     * <p>To create a disk with one of the public operating system images, specify the image by its
     * family name. For example, specify family/debian-9 to use the latest Debian 9 image:
     * projects/debian-cloud/global/images/family/debian-9
     *
     * <p>Alternatively, use a specific version of a public operating system image:
     * projects/debian-cloud/global/images/debian-9-stretch-vYYYYMMDD
     *
     * <p>To create a disk with a custom image that you created, specify the image name in the
     * following format: global/images/my-custom-image
     *
     * <p>You can also specify a custom image by its image family, which returns the latest version
     * of the image in that family. Replace the image name with family/family-name:
     * global/images/family/my-image-family
     *
     * <p>If the source image is deleted later, this field will not be set.
     */
    public Builder setSourceImage(String sourceImage) {
      this.sourceImage = sourceImage;
      return this;
    }

    /**
     * The customer-supplied encryption key of the source image. Required if the source image is
     * protected by a customer-supplied encryption key.
     *
     * <p>Instance templates do not store customer-supplied encryption keys, so you cannot create
     * disks for instances in a managed instance group if the source images are encrypted with your
     * own keys.
     */
    public CustomerEncryptionKey getSourceImageEncryptionKey() {
      return sourceImageEncryptionKey;
    }

    /**
     * The customer-supplied encryption key of the source image. Required if the source image is
     * protected by a customer-supplied encryption key.
     *
     * <p>Instance templates do not store customer-supplied encryption keys, so you cannot create
     * disks for instances in a managed instance group if the source images are encrypted with your
     * own keys.
     */
    public Builder setSourceImageEncryptionKey(CustomerEncryptionKey sourceImageEncryptionKey) {
      this.sourceImageEncryptionKey = sourceImageEncryptionKey;
      return this;
    }

    /**
     * The source snapshot to create this disk. When creating a new instance, one of
     * initializeParams.sourceSnapshot or initializeParams.sourceImage or disks.source is required
     * except for local SSD.
     *
     * <p>To create a disk with a snapshot that you created, specify the snapshot name in the
     * following format: global/snapshots/my-backup
     *
     * <p>If the source snapshot is deleted later, this field will not be set.
     */
    public String getSourceSnapshot() {
      return sourceSnapshot;
    }

    /**
     * The source snapshot to create this disk. When creating a new instance, one of
     * initializeParams.sourceSnapshot or initializeParams.sourceImage or disks.source is required
     * except for local SSD.
     *
     * <p>To create a disk with a snapshot that you created, specify the snapshot name in the
     * following format: global/snapshots/my-backup
     *
     * <p>If the source snapshot is deleted later, this field will not be set.
     */
    public Builder setSourceSnapshot(String sourceSnapshot) {
      this.sourceSnapshot = sourceSnapshot;
      return this;
    }

    /** The customer-supplied encryption key of the source snapshot. */
    public CustomerEncryptionKey getSourceSnapshotEncryptionKey() {
      return sourceSnapshotEncryptionKey;
    }

    /** The customer-supplied encryption key of the source snapshot. */
    public Builder setSourceSnapshotEncryptionKey(
        CustomerEncryptionKey sourceSnapshotEncryptionKey) {
      this.sourceSnapshotEncryptionKey = sourceSnapshotEncryptionKey;
      return this;
    }

    public AttachedDiskInitializeParams build() {

      return new AttachedDiskInitializeParams(
          description,
          diskName,
          diskSizeGb,
          diskType,
          labels,
          resourcePolicies,
          sourceImage,
          sourceImageEncryptionKey,
          sourceSnapshot,
          sourceSnapshotEncryptionKey);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setDescription(this.description);
      newBuilder.setDiskName(this.diskName);
      newBuilder.setDiskSizeGb(this.diskSizeGb);
      newBuilder.setDiskType(this.diskType);
      newBuilder.putAllLabels(this.labels);
      newBuilder.addAllResourcePolicies(this.resourcePolicies);
      newBuilder.setSourceImage(this.sourceImage);
      newBuilder.setSourceImageEncryptionKey(this.sourceImageEncryptionKey);
      newBuilder.setSourceSnapshot(this.sourceSnapshot);
      newBuilder.setSourceSnapshotEncryptionKey(this.sourceSnapshotEncryptionKey);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "AttachedDiskInitializeParams{"
        + "description="
        + description
        + ", "
        + "diskName="
        + diskName
        + ", "
        + "diskSizeGb="
        + diskSizeGb
        + ", "
        + "diskType="
        + diskType
        + ", "
        + "labels="
        + labels
        + ", "
        + "resourcePolicies="
        + resourcePolicies
        + ", "
        + "sourceImage="
        + sourceImage
        + ", "
        + "sourceImageEncryptionKey="
        + sourceImageEncryptionKey
        + ", "
        + "sourceSnapshot="
        + sourceSnapshot
        + ", "
        + "sourceSnapshotEncryptionKey="
        + sourceSnapshotEncryptionKey
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AttachedDiskInitializeParams) {
      AttachedDiskInitializeParams that = (AttachedDiskInitializeParams) o;
      return Objects.equals(this.description, that.getDescription())
          && Objects.equals(this.diskName, that.getDiskName())
          && Objects.equals(this.diskSizeGb, that.getDiskSizeGb())
          && Objects.equals(this.diskType, that.getDiskType())
          && Objects.equals(this.labels, that.getLabelsMap())
          && Objects.equals(this.resourcePolicies, that.getResourcePoliciesList())
          && Objects.equals(this.sourceImage, that.getSourceImage())
          && Objects.equals(this.sourceImageEncryptionKey, that.getSourceImageEncryptionKey())
          && Objects.equals(this.sourceSnapshot, that.getSourceSnapshot())
          && Objects.equals(
              this.sourceSnapshotEncryptionKey, that.getSourceSnapshotEncryptionKey());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description,
        diskName,
        diskSizeGb,
        diskType,
        labels,
        resourcePolicies,
        sourceImage,
        sourceImageEncryptionKey,
        sourceSnapshot,
        sourceSnapshotEncryptionKey);
  }
}
