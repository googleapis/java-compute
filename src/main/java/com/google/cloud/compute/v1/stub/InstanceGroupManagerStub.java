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
package com.google.cloud.compute.v1.stub;

import static com.google.cloud.compute.v1.InstanceGroupManagerClient.AggregatedListInstanceGroupManagersPagedResponse;
import static com.google.cloud.compute.v1.InstanceGroupManagerClient.ListErrorsInstanceGroupManagersPagedResponse;
import static com.google.cloud.compute.v1.InstanceGroupManagerClient.ListInstanceGroupManagersPagedResponse;
import static com.google.cloud.compute.v1.InstanceGroupManagerClient.ListManagedInstancesInstanceGroupManagersPagedResponse;
import static com.google.cloud.compute.v1.InstanceGroupManagerClient.ListPerInstanceConfigsInstanceGroupManagersPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.AbandonInstancesInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.AggregatedListInstanceGroupManagersHttpRequest;
import com.google.cloud.compute.v1.ApplyUpdatesToInstancesInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.CreateInstancesInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.DeleteInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.DeleteInstancesInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.DeletePerInstanceConfigsInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.GetInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.InsertInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.InstanceGroupManager;
import com.google.cloud.compute.v1.InstanceGroupManagerAggregatedList;
import com.google.cloud.compute.v1.InstanceGroupManagerList;
import com.google.cloud.compute.v1.InstanceGroupManagersListErrorsResponse;
import com.google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse;
import com.google.cloud.compute.v1.InstanceGroupManagersListPerInstanceConfigsResp;
import com.google.cloud.compute.v1.ListErrorsInstanceGroupManagersHttpRequest;
import com.google.cloud.compute.v1.ListInstanceGroupManagersHttpRequest;
import com.google.cloud.compute.v1.ListManagedInstancesInstanceGroupManagersHttpRequest;
import com.google.cloud.compute.v1.ListPerInstanceConfigsInstanceGroupManagersHttpRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.PatchInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.PatchPerInstanceConfigsInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.RecreateInstancesInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.SetInstanceTemplateInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.SetTargetPoolsInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.UpdatePerInstanceConfigsInstanceGroupManagerHttpRequest;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class InstanceGroupManagerStub implements BackgroundResource {

  @BetaApi
  public UnaryCallable<AbandonInstancesInstanceGroupManagerHttpRequest, Operation>
      abandonInstancesInstanceGroupManagerCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: abandonInstancesInstanceGroupManagerCallable()");
  }

  @BetaApi
  public UnaryCallable<
          AggregatedListInstanceGroupManagersHttpRequest,
          AggregatedListInstanceGroupManagersPagedResponse>
      aggregatedListInstanceGroupManagersPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: aggregatedListInstanceGroupManagersPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<
          AggregatedListInstanceGroupManagersHttpRequest, InstanceGroupManagerAggregatedList>
      aggregatedListInstanceGroupManagersCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: aggregatedListInstanceGroupManagersCallable()");
  }

  @BetaApi
  public UnaryCallable<ApplyUpdatesToInstancesInstanceGroupManagerHttpRequest, Operation>
      applyUpdatesToInstancesInstanceGroupManagerCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: applyUpdatesToInstancesInstanceGroupManagerCallable()");
  }

  @BetaApi
  public UnaryCallable<CreateInstancesInstanceGroupManagerHttpRequest, Operation>
      createInstancesInstanceGroupManagerCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: createInstancesInstanceGroupManagerCallable()");
  }

  @BetaApi
  public UnaryCallable<DeleteInstanceGroupManagerHttpRequest, Operation>
      deleteInstanceGroupManagerCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteInstanceGroupManagerCallable()");
  }

  @BetaApi
  public UnaryCallable<DeleteInstancesInstanceGroupManagerHttpRequest, Operation>
      deleteInstancesInstanceGroupManagerCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteInstancesInstanceGroupManagerCallable()");
  }

  @BetaApi
  public UnaryCallable<DeletePerInstanceConfigsInstanceGroupManagerHttpRequest, Operation>
      deletePerInstanceConfigsInstanceGroupManagerCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deletePerInstanceConfigsInstanceGroupManagerCallable()");
  }

  @BetaApi
  public UnaryCallable<GetInstanceGroupManagerHttpRequest, InstanceGroupManager>
      getInstanceGroupManagerCallable() {
    throw new UnsupportedOperationException("Not implemented: getInstanceGroupManagerCallable()");
  }

  @BetaApi
  public UnaryCallable<InsertInstanceGroupManagerHttpRequest, Operation>
      insertInstanceGroupManagerCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: insertInstanceGroupManagerCallable()");
  }

  @BetaApi
  public UnaryCallable<ListInstanceGroupManagersHttpRequest, ListInstanceGroupManagersPagedResponse>
      listInstanceGroupManagersPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listInstanceGroupManagersPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListInstanceGroupManagersHttpRequest, InstanceGroupManagerList>
      listInstanceGroupManagersCallable() {
    throw new UnsupportedOperationException("Not implemented: listInstanceGroupManagersCallable()");
  }

  @BetaApi
  public UnaryCallable<
          ListErrorsInstanceGroupManagersHttpRequest, ListErrorsInstanceGroupManagersPagedResponse>
      listErrorsInstanceGroupManagersPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listErrorsInstanceGroupManagersPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<
          ListErrorsInstanceGroupManagersHttpRequest, InstanceGroupManagersListErrorsResponse>
      listErrorsInstanceGroupManagersCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listErrorsInstanceGroupManagersCallable()");
  }

  @BetaApi
  public UnaryCallable<
          ListManagedInstancesInstanceGroupManagersHttpRequest,
          ListManagedInstancesInstanceGroupManagersPagedResponse>
      listManagedInstancesInstanceGroupManagersPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listManagedInstancesInstanceGroupManagersPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<
          ListManagedInstancesInstanceGroupManagersHttpRequest,
          InstanceGroupManagersListManagedInstancesResponse>
      listManagedInstancesInstanceGroupManagersCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listManagedInstancesInstanceGroupManagersCallable()");
  }

  @BetaApi
  public UnaryCallable<
          ListPerInstanceConfigsInstanceGroupManagersHttpRequest,
          ListPerInstanceConfigsInstanceGroupManagersPagedResponse>
      listPerInstanceConfigsInstanceGroupManagersPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listPerInstanceConfigsInstanceGroupManagersPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<
          ListPerInstanceConfigsInstanceGroupManagersHttpRequest,
          InstanceGroupManagersListPerInstanceConfigsResp>
      listPerInstanceConfigsInstanceGroupManagersCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listPerInstanceConfigsInstanceGroupManagersCallable()");
  }

  @BetaApi
  public UnaryCallable<PatchInstanceGroupManagerHttpRequest, Operation>
      patchInstanceGroupManagerCallable() {
    throw new UnsupportedOperationException("Not implemented: patchInstanceGroupManagerCallable()");
  }

  @BetaApi
  public UnaryCallable<PatchPerInstanceConfigsInstanceGroupManagerHttpRequest, Operation>
      patchPerInstanceConfigsInstanceGroupManagerCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: patchPerInstanceConfigsInstanceGroupManagerCallable()");
  }

  @BetaApi
  public UnaryCallable<RecreateInstancesInstanceGroupManagerHttpRequest, Operation>
      recreateInstancesInstanceGroupManagerCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: recreateInstancesInstanceGroupManagerCallable()");
  }

  @BetaApi
  public UnaryCallable<ResizeInstanceGroupManagerHttpRequest, Operation>
      resizeInstanceGroupManagerCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: resizeInstanceGroupManagerCallable()");
  }

  @BetaApi
  public UnaryCallable<SetInstanceTemplateInstanceGroupManagerHttpRequest, Operation>
      setInstanceTemplateInstanceGroupManagerCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setInstanceTemplateInstanceGroupManagerCallable()");
  }

  @BetaApi
  public UnaryCallable<SetTargetPoolsInstanceGroupManagerHttpRequest, Operation>
      setTargetPoolsInstanceGroupManagerCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: setTargetPoolsInstanceGroupManagerCallable()");
  }

  @BetaApi
  public UnaryCallable<UpdatePerInstanceConfigsInstanceGroupManagerHttpRequest, Operation>
      updatePerInstanceConfigsInstanceGroupManagerCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: updatePerInstanceConfigsInstanceGroupManagerCallable()");
  }

  @Override
  public abstract void close();
}
