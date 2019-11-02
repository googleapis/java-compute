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

import static com.google.cloud.compute.v1.ZoneOperationClient.ListZoneOperationsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.DeleteZoneOperationHttpRequest;
import com.google.cloud.compute.v1.GetZoneOperationHttpRequest;
import com.google.cloud.compute.v1.ListZoneOperationsHttpRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.OperationList;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class ZoneOperationStub implements BackgroundResource {

  @BetaApi
  public UnaryCallable<DeleteZoneOperationHttpRequest, Void> deleteZoneOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteZoneOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<GetZoneOperationHttpRequest, Operation> getZoneOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: getZoneOperationCallable()");
  }

  @BetaApi
  public UnaryCallable<ListZoneOperationsHttpRequest, ListZoneOperationsPagedResponse>
      listZoneOperationsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listZoneOperationsPagedCallable()");
  }

  @BetaApi
  public UnaryCallable<ListZoneOperationsHttpRequest, OperationList> listZoneOperationsCallable() {
    throw new UnsupportedOperationException("Not implemented: listZoneOperationsCallable()");
  }

  @Override
  public abstract void close();
}
