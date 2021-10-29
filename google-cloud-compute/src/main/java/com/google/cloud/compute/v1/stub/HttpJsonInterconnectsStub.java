/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.compute.v1.stub;

import static com.google.cloud.compute.v1.InterconnectsClient.ListPagedResponse;

import com.google.api.client.http.HttpMethods;
import com.google.api.core.BetaApi;
import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.httpjson.ProtoMessageRequestFormatter;
import com.google.api.gax.httpjson.ProtoMessageResponseParser;
import com.google.api.gax.httpjson.ProtoRestSerializer;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.DeleteInterconnectRequest;
import com.google.cloud.compute.v1.GetDiagnosticsInterconnectRequest;
import com.google.cloud.compute.v1.GetInterconnectRequest;
import com.google.cloud.compute.v1.InsertInterconnectRequest;
import com.google.cloud.compute.v1.Interconnect;
import com.google.cloud.compute.v1.InterconnectList;
import com.google.cloud.compute.v1.InterconnectsGetDiagnosticsResponse;
import com.google.cloud.compute.v1.ListInterconnectsRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.PatchInterconnectRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * REST stub implementation for the Interconnects service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class HttpJsonInterconnectsStub extends InterconnectsStub {
  private static final ApiMethodDescriptor<DeleteInterconnectRequest, Operation>
      deleteMethodDescriptor =
          ApiMethodDescriptor.<DeleteInterconnectRequest, Operation>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.Interconnects/Delete")
              .setHttpMethod(HttpMethods.DELETE)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<DeleteInterconnectRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/global/interconnects/{interconnect}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteInterconnectRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields, "interconnect", request.getInterconnect());
                            serializer.putPathParam(fields, "project", request.getProject());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteInterconnectRequest> serializer =
                                ProtoRestSerializer.create();
                            if (request.hasRequestId()) {
                              serializer.putQueryParam(fields, "requestId", request.getRequestId());
                            }
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetInterconnectRequest, Interconnect>
      getMethodDescriptor =
          ApiMethodDescriptor.<GetInterconnectRequest, Interconnect>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.Interconnects/Get")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetInterconnectRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/global/interconnects/{interconnect}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetInterconnectRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields, "interconnect", request.getInterconnect());
                            serializer.putPathParam(fields, "project", request.getProject());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetInterconnectRequest> serializer =
                                ProtoRestSerializer.create();
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Interconnect>newBuilder()
                      .setDefaultInstance(Interconnect.getDefaultInstance())
                      .build())
              .build();

  private static final ApiMethodDescriptor<
          GetDiagnosticsInterconnectRequest, InterconnectsGetDiagnosticsResponse>
      getDiagnosticsMethodDescriptor =
          ApiMethodDescriptor
              .<GetDiagnosticsInterconnectRequest, InterconnectsGetDiagnosticsResponse>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.Interconnects/GetDiagnostics")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetDiagnosticsInterconnectRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/global/interconnects/{interconnect}/getDiagnostics",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetDiagnosticsInterconnectRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields, "interconnect", request.getInterconnect());
                            serializer.putPathParam(fields, "project", request.getProject());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetDiagnosticsInterconnectRequest> serializer =
                                ProtoRestSerializer.create();
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<InterconnectsGetDiagnosticsResponse>newBuilder()
                      .setDefaultInstance(InterconnectsGetDiagnosticsResponse.getDefaultInstance())
                      .build())
              .build();

  private static final ApiMethodDescriptor<InsertInterconnectRequest, Operation>
      insertMethodDescriptor =
          ApiMethodDescriptor.<InsertInterconnectRequest, Operation>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.Interconnects/Insert")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<InsertInterconnectRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/global/interconnects",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<InsertInterconnectRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "project", request.getProject());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<InsertInterconnectRequest> serializer =
                                ProtoRestSerializer.create();
                            if (request.hasRequestId()) {
                              serializer.putQueryParam(fields, "requestId", request.getRequestId());
                            }
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody(
                                      "interconnectResource", request.getInterconnectResource()))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  private static final ApiMethodDescriptor<ListInterconnectsRequest, InterconnectList>
      listMethodDescriptor =
          ApiMethodDescriptor.<ListInterconnectsRequest, InterconnectList>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.Interconnects/List")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListInterconnectsRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/global/interconnects",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListInterconnectsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "project", request.getProject());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListInterconnectsRequest> serializer =
                                ProtoRestSerializer.create();
                            if (request.hasFilter()) {
                              serializer.putQueryParam(fields, "filter", request.getFilter());
                            }
                            if (request.hasMaxResults()) {
                              serializer.putQueryParam(
                                  fields, "maxResults", request.getMaxResults());
                            }
                            if (request.hasOrderBy()) {
                              serializer.putQueryParam(fields, "orderBy", request.getOrderBy());
                            }
                            if (request.hasPageToken()) {
                              serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            }
                            if (request.hasReturnPartialSuccess()) {
                              serializer.putQueryParam(
                                  fields,
                                  "returnPartialSuccess",
                                  request.getReturnPartialSuccess());
                            }
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<InterconnectList>newBuilder()
                      .setDefaultInstance(InterconnectList.getDefaultInstance())
                      .build())
              .build();

  private static final ApiMethodDescriptor<PatchInterconnectRequest, Operation>
      patchMethodDescriptor =
          ApiMethodDescriptor.<PatchInterconnectRequest, Operation>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.Interconnects/Patch")
              .setHttpMethod(HttpMethods.PATCH)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<PatchInterconnectRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/global/interconnects/{interconnect}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<PatchInterconnectRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields, "interconnect", request.getInterconnect());
                            serializer.putPathParam(fields, "project", request.getProject());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<PatchInterconnectRequest> serializer =
                                ProtoRestSerializer.create();
                            if (request.hasRequestId()) {
                              serializer.putQueryParam(fields, "requestId", request.getRequestId());
                            }
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody(
                                      "interconnectResource", request.getInterconnectResource()))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  private final UnaryCallable<DeleteInterconnectRequest, Operation> deleteCallable;
  private final UnaryCallable<GetInterconnectRequest, Interconnect> getCallable;
  private final UnaryCallable<
          GetDiagnosticsInterconnectRequest, InterconnectsGetDiagnosticsResponse>
      getDiagnosticsCallable;
  private final UnaryCallable<InsertInterconnectRequest, Operation> insertCallable;
  private final UnaryCallable<ListInterconnectsRequest, InterconnectList> listCallable;
  private final UnaryCallable<ListInterconnectsRequest, ListPagedResponse> listPagedCallable;
  private final UnaryCallable<PatchInterconnectRequest, Operation> patchCallable;

  private final BackgroundResource backgroundResources;
  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonInterconnectsStub create(InterconnectsStubSettings settings)
      throws IOException {
    return new HttpJsonInterconnectsStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonInterconnectsStub create(ClientContext clientContext)
      throws IOException {
    return new HttpJsonInterconnectsStub(
        InterconnectsStubSettings.newBuilder().build(), clientContext);
  }

  public static final HttpJsonInterconnectsStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonInterconnectsStub(
        InterconnectsStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonInterconnectsStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonInterconnectsStub(
      InterconnectsStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new HttpJsonInterconnectsCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonInterconnectsStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonInterconnectsStub(
      InterconnectsStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<DeleteInterconnectRequest, Operation> deleteTransportSettings =
        HttpJsonCallSettings.<DeleteInterconnectRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetInterconnectRequest, Interconnect> getTransportSettings =
        HttpJsonCallSettings.<GetInterconnectRequest, Interconnect>newBuilder()
            .setMethodDescriptor(getMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetDiagnosticsInterconnectRequest, InterconnectsGetDiagnosticsResponse>
        getDiagnosticsTransportSettings =
            HttpJsonCallSettings
                .<GetDiagnosticsInterconnectRequest, InterconnectsGetDiagnosticsResponse>
                    newBuilder()
                .setMethodDescriptor(getDiagnosticsMethodDescriptor)
                .build();
    HttpJsonCallSettings<InsertInterconnectRequest, Operation> insertTransportSettings =
        HttpJsonCallSettings.<InsertInterconnectRequest, Operation>newBuilder()
            .setMethodDescriptor(insertMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListInterconnectsRequest, InterconnectList> listTransportSettings =
        HttpJsonCallSettings.<ListInterconnectsRequest, InterconnectList>newBuilder()
            .setMethodDescriptor(listMethodDescriptor)
            .build();
    HttpJsonCallSettings<PatchInterconnectRequest, Operation> patchTransportSettings =
        HttpJsonCallSettings.<PatchInterconnectRequest, Operation>newBuilder()
            .setMethodDescriptor(patchMethodDescriptor)
            .build();

    this.deleteCallable =
        callableFactory.createUnaryCallable(
            deleteTransportSettings, settings.deleteSettings(), clientContext);
    this.getCallable =
        callableFactory.createUnaryCallable(
            getTransportSettings, settings.getSettings(), clientContext);
    this.getDiagnosticsCallable =
        callableFactory.createUnaryCallable(
            getDiagnosticsTransportSettings, settings.getDiagnosticsSettings(), clientContext);
    this.insertCallable =
        callableFactory.createUnaryCallable(
            insertTransportSettings, settings.insertSettings(), clientContext);
    this.listCallable =
        callableFactory.createUnaryCallable(
            listTransportSettings, settings.listSettings(), clientContext);
    this.listPagedCallable =
        callableFactory.createPagedCallable(
            listTransportSettings, settings.listSettings(), clientContext);
    this.patchCallable =
        callableFactory.createUnaryCallable(
            patchTransportSettings, settings.patchSettings(), clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @InternalApi
  public static List<ApiMethodDescriptor> getMethodDescriptors() {
    List<ApiMethodDescriptor> methodDescriptors = new ArrayList<>();
    methodDescriptors.add(deleteMethodDescriptor);
    methodDescriptors.add(getMethodDescriptor);
    methodDescriptors.add(getDiagnosticsMethodDescriptor);
    methodDescriptors.add(insertMethodDescriptor);
    methodDescriptors.add(listMethodDescriptor);
    methodDescriptors.add(patchMethodDescriptor);
    return methodDescriptors;
  }

  @Override
  public UnaryCallable<DeleteInterconnectRequest, Operation> deleteCallable() {
    return deleteCallable;
  }

  @Override
  public UnaryCallable<GetInterconnectRequest, Interconnect> getCallable() {
    return getCallable;
  }

  @Override
  public UnaryCallable<GetDiagnosticsInterconnectRequest, InterconnectsGetDiagnosticsResponse>
      getDiagnosticsCallable() {
    return getDiagnosticsCallable;
  }

  @Override
  public UnaryCallable<InsertInterconnectRequest, Operation> insertCallable() {
    return insertCallable;
  }

  @Override
  public UnaryCallable<ListInterconnectsRequest, InterconnectList> listCallable() {
    return listCallable;
  }

  @Override
  public UnaryCallable<ListInterconnectsRequest, ListPagedResponse> listPagedCallable() {
    return listPagedCallable;
  }

  @Override
  public UnaryCallable<PatchInterconnectRequest, Operation> patchCallable() {
    return patchCallable;
  }

  @Override
  public final void close() {
    try {
      backgroundResources.close();
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException("Failed to close resource", e);
    }
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
