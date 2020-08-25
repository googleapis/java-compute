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
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
public final class NodeGroupNode implements ApiMessage {
  private final String cpuOvercommitType;
  private final List<String> instances;
  private final String name;
  private final String nodeType;
  private final ServerBinding serverBinding;
  private final String serverId;
  private final String status;

  private NodeGroupNode() {
    this.cpuOvercommitType = null;
    this.instances = null;
    this.name = null;
    this.nodeType = null;
    this.serverBinding = null;
    this.serverId = null;
    this.status = null;
  }

  private NodeGroupNode(
      String cpuOvercommitType,
      List<String> instances,
      String name,
      String nodeType,
      ServerBinding serverBinding,
      String serverId,
      String status) {
    this.cpuOvercommitType = cpuOvercommitType;
    this.instances = instances;
    this.name = name;
    this.nodeType = nodeType;
    this.serverBinding = serverBinding;
    this.serverId = serverId;
    this.status = status;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("cpuOvercommitType".equals(fieldName)) {
      return cpuOvercommitType;
    }
    if ("instances".equals(fieldName)) {
      return instances;
    }
    if ("name".equals(fieldName)) {
      return name;
    }
    if ("nodeType".equals(fieldName)) {
      return nodeType;
    }
    if ("serverBinding".equals(fieldName)) {
      return serverBinding;
    }
    if ("serverId".equals(fieldName)) {
      return serverId;
    }
    if ("status".equals(fieldName)) {
      return status;
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

  /** CPU overcommit. */
  public String getCpuOvercommitType() {
    return cpuOvercommitType;
  }

  /** Instances scheduled on this node. */
  public List<String> getInstancesList() {
    return instances;
  }

  /** The name of the node. */
  public String getName() {
    return name;
  }

  /** The type of this node. */
  public String getNodeType() {
    return nodeType;
  }

  /** Binding properties for the physical server. */
  public ServerBinding getServerBinding() {
    return serverBinding;
  }

  /** Server ID associated with this node. */
  public String getServerId() {
    return serverId;
  }

  public String getStatus() {
    return status;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(NodeGroupNode prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static NodeGroupNode getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final NodeGroupNode DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new NodeGroupNode();
  }

  public static class Builder {
    private String cpuOvercommitType;
    private List<String> instances;
    private String name;
    private String nodeType;
    private ServerBinding serverBinding;
    private String serverId;
    private String status;

    Builder() {}

    public Builder mergeFrom(NodeGroupNode other) {
      if (other == NodeGroupNode.getDefaultInstance()) return this;
      if (other.getCpuOvercommitType() != null) {
        this.cpuOvercommitType = other.cpuOvercommitType;
      }
      if (other.getInstancesList() != null) {
        this.instances = other.instances;
      }
      if (other.getName() != null) {
        this.name = other.name;
      }
      if (other.getNodeType() != null) {
        this.nodeType = other.nodeType;
      }
      if (other.getServerBinding() != null) {
        this.serverBinding = other.serverBinding;
      }
      if (other.getServerId() != null) {
        this.serverId = other.serverId;
      }
      if (other.getStatus() != null) {
        this.status = other.status;
      }
      return this;
    }

    Builder(NodeGroupNode source) {
      this.cpuOvercommitType = source.cpuOvercommitType;
      this.instances = source.instances;
      this.name = source.name;
      this.nodeType = source.nodeType;
      this.serverBinding = source.serverBinding;
      this.serverId = source.serverId;
      this.status = source.status;
    }

    /** CPU overcommit. */
    public String getCpuOvercommitType() {
      return cpuOvercommitType;
    }

    /** CPU overcommit. */
    public Builder setCpuOvercommitType(String cpuOvercommitType) {
      this.cpuOvercommitType = cpuOvercommitType;
      return this;
    }

    /** Instances scheduled on this node. */
    public List<String> getInstancesList() {
      return instances;
    }

    /** Instances scheduled on this node. */
    public Builder addAllInstances(List<String> instances) {
      if (this.instances == null) {
        this.instances = new LinkedList<>();
      }
      this.instances.addAll(instances);
      return this;
    }

    /** Instances scheduled on this node. */
    public Builder addInstances(String instances) {
      if (this.instances == null) {
        this.instances = new LinkedList<>();
      }
      this.instances.add(instances);
      return this;
    }

    /** The name of the node. */
    public String getName() {
      return name;
    }

    /** The name of the node. */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /** The type of this node. */
    public String getNodeType() {
      return nodeType;
    }

    /** The type of this node. */
    public Builder setNodeType(String nodeType) {
      this.nodeType = nodeType;
      return this;
    }

    /** Binding properties for the physical server. */
    public ServerBinding getServerBinding() {
      return serverBinding;
    }

    /** Binding properties for the physical server. */
    public Builder setServerBinding(ServerBinding serverBinding) {
      this.serverBinding = serverBinding;
      return this;
    }

    /** Server ID associated with this node. */
    public String getServerId() {
      return serverId;
    }

    /** Server ID associated with this node. */
    public Builder setServerId(String serverId) {
      this.serverId = serverId;
      return this;
    }

    public String getStatus() {
      return status;
    }

    public Builder setStatus(String status) {
      this.status = status;
      return this;
    }

    public NodeGroupNode build() {

      return new NodeGroupNode(
          cpuOvercommitType, instances, name, nodeType, serverBinding, serverId, status);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setCpuOvercommitType(this.cpuOvercommitType);
      newBuilder.addAllInstances(this.instances);
      newBuilder.setName(this.name);
      newBuilder.setNodeType(this.nodeType);
      newBuilder.setServerBinding(this.serverBinding);
      newBuilder.setServerId(this.serverId);
      newBuilder.setStatus(this.status);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "NodeGroupNode{"
        + "cpuOvercommitType="
        + cpuOvercommitType
        + ", "
        + "instances="
        + instances
        + ", "
        + "name="
        + name
        + ", "
        + "nodeType="
        + nodeType
        + ", "
        + "serverBinding="
        + serverBinding
        + ", "
        + "serverId="
        + serverId
        + ", "
        + "status="
        + status
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof NodeGroupNode) {
      NodeGroupNode that = (NodeGroupNode) o;
      return Objects.equals(this.cpuOvercommitType, that.getCpuOvercommitType())
          && Objects.equals(this.instances, that.getInstancesList())
          && Objects.equals(this.name, that.getName())
          && Objects.equals(this.nodeType, that.getNodeType())
          && Objects.equals(this.serverBinding, that.getServerBinding())
          && Objects.equals(this.serverId, that.getServerId())
          && Objects.equals(this.status, that.getStatus());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cpuOvercommitType, instances, name, nodeType, serverBinding, serverId, status);
  }
}
