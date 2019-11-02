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
package com.google.cloud.compute.v1.stub;

import static com.google.cloud.compute.v1.DiskTypeClient.AggregatedListDiskTypesPagedResponse;
import static com.google.cloud.compute.v1.DiskTypeClient.ListDiskTypesPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.AggregatedListDiskTypesHttpRequest;
import com.google.cloud.compute.v1.DiskType;
import com.google.cloud.compute.v1.DiskTypeAggregatedList;
import com.google.cloud.compute.v1.DiskTypeList;
import com.google.cloud.compute.v1.GetDiskTypeHttpRequest;
import com.google.cloud.compute.v1.ListDiskTypesHttpRequest;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class DiskTypeStub implements BackgroundResource {

  @BetaApi
  public UnaryCallable<AggregatedListDiskTypesHttpRequest, AggregatedListDiskTypesPagedResponse>
      aggregatedListDiskTypesPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: aggregatedListDiskTypesPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<AggregatedListDiskTypesHttpRequest, DiskTypeAggregatedList>
      aggregatedListDiskTypesCallable() {
    throw new UnsupportedOperationException("Not implemented: aggregatedListDiskTypesCallable()");
  }

  @BetaApi
  public UnaryCallable<GetDiskTypeHttpRequest, DiskType> getDiskTypeCallable() {
    throw new UnsupportedOperationException("Not implemented: getDiskTypeCallable()");
  }

  @BetaApi
  public UnaryCallable<ListDiskTypesHttpRequest, ListDiskTypesPagedResponse>
      listDiskTypesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listDiskTypesPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListDiskTypesHttpRequest, DiskTypeList> listDiskTypesCallable() {
    throw new UnsupportedOperationException("Not implemented: listDiskTypesCallable()");
  }

  @Override
  public abstract void close();
}
