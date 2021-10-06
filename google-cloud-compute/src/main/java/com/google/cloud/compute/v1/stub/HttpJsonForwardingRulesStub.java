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

import static com.google.cloud.compute.v1.ForwardingRulesClient.AggregatedListPagedResponse;
import static com.google.cloud.compute.v1.ForwardingRulesClient.ListPagedResponse;

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
import com.google.cloud.compute.v1.AggregatedListForwardingRulesRequest;
import com.google.cloud.compute.v1.DeleteForwardingRuleRequest;
import com.google.cloud.compute.v1.ForwardingRule;
import com.google.cloud.compute.v1.ForwardingRuleAggregatedList;
import com.google.cloud.compute.v1.ForwardingRuleList;
import com.google.cloud.compute.v1.GetForwardingRuleRequest;
import com.google.cloud.compute.v1.InsertForwardingRuleRequest;
import com.google.cloud.compute.v1.ListForwardingRulesRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.PatchForwardingRuleRequest;
import com.google.cloud.compute.v1.SetLabelsForwardingRuleRequest;
import com.google.cloud.compute.v1.SetTargetForwardingRuleRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * REST stub implementation for the ForwardingRules service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class HttpJsonForwardingRulesStub extends ForwardingRulesStub {
  private static final ApiMethodDescriptor<
          AggregatedListForwardingRulesRequest, ForwardingRuleAggregatedList>
      aggregatedListMethodDescriptor =
          ApiMethodDescriptor
              .<AggregatedListForwardingRulesRequest, ForwardingRuleAggregatedList>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.ForwardingRules/AggregatedList")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<AggregatedListForwardingRulesRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/aggregated/forwardingRules",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<AggregatedListForwardingRulesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "project", request.getProject());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<AggregatedListForwardingRulesRequest> serializer =
                                ProtoRestSerializer.create();
                            if (request.hasFilter()) {
                              serializer.putQueryParam(fields, "filter", request.getFilter());
                            }
                            if (request.hasIncludeAllScopes()) {
                              serializer.putQueryParam(
                                  fields, "includeAllScopes", request.getIncludeAllScopes());
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
                  ProtoMessageResponseParser.<ForwardingRuleAggregatedList>newBuilder()
                      .setDefaultInstance(ForwardingRuleAggregatedList.getDefaultInstance())
                      .build())
              .build();

  private static final ApiMethodDescriptor<DeleteForwardingRuleRequest, Operation>
      deleteMethodDescriptor =
          ApiMethodDescriptor.<DeleteForwardingRuleRequest, Operation>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.ForwardingRules/Delete")
              .setHttpMethod(HttpMethods.DELETE)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<DeleteForwardingRuleRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/regions/{region}/forwardingRules/{forwardingRule}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteForwardingRuleRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields, "forwardingRule", request.getForwardingRule());
                            serializer.putPathParam(fields, "project", request.getProject());
                            serializer.putPathParam(fields, "region", request.getRegion());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteForwardingRuleRequest> serializer =
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

  private static final ApiMethodDescriptor<GetForwardingRuleRequest, ForwardingRule>
      getMethodDescriptor =
          ApiMethodDescriptor.<GetForwardingRuleRequest, ForwardingRule>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.ForwardingRules/Get")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetForwardingRuleRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/regions/{region}/forwardingRules/{forwardingRule}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetForwardingRuleRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields, "forwardingRule", request.getForwardingRule());
                            serializer.putPathParam(fields, "project", request.getProject());
                            serializer.putPathParam(fields, "region", request.getRegion());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetForwardingRuleRequest> serializer =
                                ProtoRestSerializer.create();
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ForwardingRule>newBuilder()
                      .setDefaultInstance(ForwardingRule.getDefaultInstance())
                      .build())
              .build();

  private static final ApiMethodDescriptor<InsertForwardingRuleRequest, Operation>
      insertMethodDescriptor =
          ApiMethodDescriptor.<InsertForwardingRuleRequest, Operation>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.ForwardingRules/Insert")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<InsertForwardingRuleRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/regions/{region}/forwardingRules",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<InsertForwardingRuleRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "project", request.getProject());
                            serializer.putPathParam(fields, "region", request.getRegion());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<InsertForwardingRuleRequest> serializer =
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
                                      "forwardingRuleResource",
                                      request.getForwardingRuleResource()))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  private static final ApiMethodDescriptor<ListForwardingRulesRequest, ForwardingRuleList>
      listMethodDescriptor =
          ApiMethodDescriptor.<ListForwardingRulesRequest, ForwardingRuleList>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.ForwardingRules/List")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListForwardingRulesRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/regions/{region}/forwardingRules",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListForwardingRulesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "project", request.getProject());
                            serializer.putPathParam(fields, "region", request.getRegion());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListForwardingRulesRequest> serializer =
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
                  ProtoMessageResponseParser.<ForwardingRuleList>newBuilder()
                      .setDefaultInstance(ForwardingRuleList.getDefaultInstance())
                      .build())
              .build();

  private static final ApiMethodDescriptor<PatchForwardingRuleRequest, Operation>
      patchMethodDescriptor =
          ApiMethodDescriptor.<PatchForwardingRuleRequest, Operation>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.ForwardingRules/Patch")
              .setHttpMethod(HttpMethods.PATCH)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<PatchForwardingRuleRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/regions/{region}/forwardingRules/{forwardingRule}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<PatchForwardingRuleRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields, "forwardingRule", request.getForwardingRule());
                            serializer.putPathParam(fields, "project", request.getProject());
                            serializer.putPathParam(fields, "region", request.getRegion());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<PatchForwardingRuleRequest> serializer =
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
                                      "forwardingRuleResource",
                                      request.getForwardingRuleResource()))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  private static final ApiMethodDescriptor<SetLabelsForwardingRuleRequest, Operation>
      setLabelsMethodDescriptor =
          ApiMethodDescriptor.<SetLabelsForwardingRuleRequest, Operation>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.ForwardingRules/SetLabels")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<SetLabelsForwardingRuleRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/regions/{region}/forwardingRules/{resource}/setLabels",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<SetLabelsForwardingRuleRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "project", request.getProject());
                            serializer.putPathParam(fields, "region", request.getRegion());
                            serializer.putPathParam(fields, "resource", request.getResource());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<SetLabelsForwardingRuleRequest> serializer =
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
                                      "regionSetLabelsRequestResource",
                                      request.getRegionSetLabelsRequestResource()))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  private static final ApiMethodDescriptor<SetTargetForwardingRuleRequest, Operation>
      setTargetMethodDescriptor =
          ApiMethodDescriptor.<SetTargetForwardingRuleRequest, Operation>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.ForwardingRules/SetTarget")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<SetTargetForwardingRuleRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/regions/{region}/forwardingRules/{forwardingRule}/setTarget",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<SetTargetForwardingRuleRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields, "forwardingRule", request.getForwardingRule());
                            serializer.putPathParam(fields, "project", request.getProject());
                            serializer.putPathParam(fields, "region", request.getRegion());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<SetTargetForwardingRuleRequest> serializer =
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
                                      "targetReferenceResource",
                                      request.getTargetReferenceResource()))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  private final UnaryCallable<AggregatedListForwardingRulesRequest, ForwardingRuleAggregatedList>
      aggregatedListCallable;
  private final UnaryCallable<AggregatedListForwardingRulesRequest, AggregatedListPagedResponse>
      aggregatedListPagedCallable;
  private final UnaryCallable<DeleteForwardingRuleRequest, Operation> deleteCallable;
  private final UnaryCallable<GetForwardingRuleRequest, ForwardingRule> getCallable;
  private final UnaryCallable<InsertForwardingRuleRequest, Operation> insertCallable;
  private final UnaryCallable<ListForwardingRulesRequest, ForwardingRuleList> listCallable;
  private final UnaryCallable<ListForwardingRulesRequest, ListPagedResponse> listPagedCallable;
  private final UnaryCallable<PatchForwardingRuleRequest, Operation> patchCallable;
  private final UnaryCallable<SetLabelsForwardingRuleRequest, Operation> setLabelsCallable;
  private final UnaryCallable<SetTargetForwardingRuleRequest, Operation> setTargetCallable;

  private final BackgroundResource backgroundResources;
  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonForwardingRulesStub create(ForwardingRulesStubSettings settings)
      throws IOException {
    return new HttpJsonForwardingRulesStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonForwardingRulesStub create(ClientContext clientContext)
      throws IOException {
    return new HttpJsonForwardingRulesStub(
        ForwardingRulesStubSettings.newBuilder().build(), clientContext);
  }

  public static final HttpJsonForwardingRulesStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonForwardingRulesStub(
        ForwardingRulesStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonForwardingRulesStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonForwardingRulesStub(
      ForwardingRulesStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new HttpJsonForwardingRulesCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonForwardingRulesStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonForwardingRulesStub(
      ForwardingRulesStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<AggregatedListForwardingRulesRequest, ForwardingRuleAggregatedList>
        aggregatedListTransportSettings =
            HttpJsonCallSettings
                .<AggregatedListForwardingRulesRequest, ForwardingRuleAggregatedList>newBuilder()
                .setMethodDescriptor(aggregatedListMethodDescriptor)
                .build();
    HttpJsonCallSettings<DeleteForwardingRuleRequest, Operation> deleteTransportSettings =
        HttpJsonCallSettings.<DeleteForwardingRuleRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetForwardingRuleRequest, ForwardingRule> getTransportSettings =
        HttpJsonCallSettings.<GetForwardingRuleRequest, ForwardingRule>newBuilder()
            .setMethodDescriptor(getMethodDescriptor)
            .build();
    HttpJsonCallSettings<InsertForwardingRuleRequest, Operation> insertTransportSettings =
        HttpJsonCallSettings.<InsertForwardingRuleRequest, Operation>newBuilder()
            .setMethodDescriptor(insertMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListForwardingRulesRequest, ForwardingRuleList> listTransportSettings =
        HttpJsonCallSettings.<ListForwardingRulesRequest, ForwardingRuleList>newBuilder()
            .setMethodDescriptor(listMethodDescriptor)
            .build();
    HttpJsonCallSettings<PatchForwardingRuleRequest, Operation> patchTransportSettings =
        HttpJsonCallSettings.<PatchForwardingRuleRequest, Operation>newBuilder()
            .setMethodDescriptor(patchMethodDescriptor)
            .build();
    HttpJsonCallSettings<SetLabelsForwardingRuleRequest, Operation> setLabelsTransportSettings =
        HttpJsonCallSettings.<SetLabelsForwardingRuleRequest, Operation>newBuilder()
            .setMethodDescriptor(setLabelsMethodDescriptor)
            .build();
    HttpJsonCallSettings<SetTargetForwardingRuleRequest, Operation> setTargetTransportSettings =
        HttpJsonCallSettings.<SetTargetForwardingRuleRequest, Operation>newBuilder()
            .setMethodDescriptor(setTargetMethodDescriptor)
            .build();

    this.aggregatedListCallable =
        callableFactory.createUnaryCallable(
            aggregatedListTransportSettings, settings.aggregatedListSettings(), clientContext);
    this.aggregatedListPagedCallable =
        callableFactory.createPagedCallable(
            aggregatedListTransportSettings, settings.aggregatedListSettings(), clientContext);
    this.deleteCallable =
        callableFactory.createUnaryCallable(
            deleteTransportSettings, settings.deleteSettings(), clientContext);
    this.getCallable =
        callableFactory.createUnaryCallable(
            getTransportSettings, settings.getSettings(), clientContext);
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
    this.setLabelsCallable =
        callableFactory.createUnaryCallable(
            setLabelsTransportSettings, settings.setLabelsSettings(), clientContext);
    this.setTargetCallable =
        callableFactory.createUnaryCallable(
            setTargetTransportSettings, settings.setTargetSettings(), clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @InternalApi
  public static List<ApiMethodDescriptor> getMethodDescriptors() {
    List<ApiMethodDescriptor> methodDescriptors = new ArrayList<>();
    methodDescriptors.add(aggregatedListMethodDescriptor);
    methodDescriptors.add(deleteMethodDescriptor);
    methodDescriptors.add(getMethodDescriptor);
    methodDescriptors.add(insertMethodDescriptor);
    methodDescriptors.add(listMethodDescriptor);
    methodDescriptors.add(patchMethodDescriptor);
    methodDescriptors.add(setLabelsMethodDescriptor);
    methodDescriptors.add(setTargetMethodDescriptor);
    return methodDescriptors;
  }

  @Override
  public UnaryCallable<AggregatedListForwardingRulesRequest, ForwardingRuleAggregatedList>
      aggregatedListCallable() {
    return aggregatedListCallable;
  }

  @Override
  public UnaryCallable<AggregatedListForwardingRulesRequest, AggregatedListPagedResponse>
      aggregatedListPagedCallable() {
    return aggregatedListPagedCallable;
  }

  @Override
  public UnaryCallable<DeleteForwardingRuleRequest, Operation> deleteCallable() {
    return deleteCallable;
  }

  @Override
  public UnaryCallable<GetForwardingRuleRequest, ForwardingRule> getCallable() {
    return getCallable;
  }

  @Override
  public UnaryCallable<InsertForwardingRuleRequest, Operation> insertCallable() {
    return insertCallable;
  }

  @Override
  public UnaryCallable<ListForwardingRulesRequest, ForwardingRuleList> listCallable() {
    return listCallable;
  }

  @Override
  public UnaryCallable<ListForwardingRulesRequest, ListPagedResponse> listPagedCallable() {
    return listPagedCallable;
  }

  @Override
  public UnaryCallable<PatchForwardingRuleRequest, Operation> patchCallable() {
    return patchCallable;
  }

  @Override
  public UnaryCallable<SetLabelsForwardingRuleRequest, Operation> setLabelsCallable() {
    return setLabelsCallable;
  }

  @Override
  public UnaryCallable<SetTargetForwardingRuleRequest, Operation> setTargetCallable() {
    return setTargetCallable;
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
