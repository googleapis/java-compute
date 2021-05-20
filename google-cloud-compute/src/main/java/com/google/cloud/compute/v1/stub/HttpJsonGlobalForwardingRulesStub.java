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

import static com.google.cloud.compute.v1.GlobalForwardingRulesClient.ListPagedResponse;

import com.google.api.client.http.HttpMethods;
import com.google.api.core.BetaApi;
import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.FieldsExtractor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.httpjson.ProtoMessageRequestFormatter;
import com.google.api.gax.httpjson.ProtoMessageResponseParser;
import com.google.api.gax.httpjson.ProtoRestSerializer;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.DeleteGlobalForwardingRuleRequest;
import com.google.cloud.compute.v1.ForwardingRule;
import com.google.cloud.compute.v1.ForwardingRuleList;
import com.google.cloud.compute.v1.GetGlobalForwardingRuleRequest;
import com.google.cloud.compute.v1.InsertGlobalForwardingRuleRequest;
import com.google.cloud.compute.v1.ListGlobalForwardingRulesRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.PatchGlobalForwardingRuleRequest;
import com.google.cloud.compute.v1.SetLabelsGlobalForwardingRuleRequest;
import com.google.cloud.compute.v1.SetTargetGlobalForwardingRuleRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * REST stub implementation for Google Compute Engine API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class HttpJsonGlobalForwardingRulesStub extends GlobalForwardingRulesStub {

  @InternalApi
  public static final ApiMethodDescriptor<DeleteGlobalForwardingRuleRequest, Operation>
      deleteMethodDescriptor =
          ApiMethodDescriptor.<DeleteGlobalForwardingRuleRequest, Operation>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.GlobalForwardingRules.Delete")
              .setHttpMethod(HttpMethods.DELETE)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<DeleteGlobalForwardingRuleRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/global/forwardingRules/{forwardingRule}",
                          new FieldsExtractor<
                              DeleteGlobalForwardingRuleRequest, Map<String, String>>() {
                            @Override
                            public Map<String, String> extract(
                                DeleteGlobalForwardingRuleRequest request) {
                              Map<String, String> fields = new HashMap<>();
                              ProtoRestSerializer<DeleteGlobalForwardingRuleRequest> serializer =
                                  ProtoRestSerializer.create();
                              serializer.putPathParam(fields, "project", request.getProject());
                              serializer.putPathParam(
                                  fields, "forwardingRule", request.getForwardingRule());
                              return fields;
                            }
                          })
                      .setQueryParamsExtractor(
                          new FieldsExtractor<
                              DeleteGlobalForwardingRuleRequest, Map<String, List<String>>>() {
                            @Override
                            public Map<String, List<String>> extract(
                                DeleteGlobalForwardingRuleRequest request) {
                              Map<String, List<String>> fields = new HashMap<>();
                              ProtoRestSerializer<DeleteGlobalForwardingRuleRequest> serializer =
                                  ProtoRestSerializer.create();
                              if (request.hasRequestId()) {
                                serializer.putQueryParam(
                                    fields, "requestId", request.getRequestId());
                              }
                              return fields;
                            }
                          })
                      .setRequestBodyExtractor(
                          new FieldsExtractor<DeleteGlobalForwardingRuleRequest, String>() {
                            @Override
                            public String extract(DeleteGlobalForwardingRuleRequest request) {
                              return "";
                            }
                          })
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<GetGlobalForwardingRuleRequest, ForwardingRule>
      getMethodDescriptor =
          ApiMethodDescriptor.<GetGlobalForwardingRuleRequest, ForwardingRule>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.GlobalForwardingRules.Get")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetGlobalForwardingRuleRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/global/forwardingRules/{forwardingRule}",
                          new FieldsExtractor<
                              GetGlobalForwardingRuleRequest, Map<String, String>>() {
                            @Override
                            public Map<String, String> extract(
                                GetGlobalForwardingRuleRequest request) {
                              Map<String, String> fields = new HashMap<>();
                              ProtoRestSerializer<GetGlobalForwardingRuleRequest> serializer =
                                  ProtoRestSerializer.create();
                              serializer.putPathParam(fields, "project", request.getProject());
                              serializer.putPathParam(
                                  fields, "forwardingRule", request.getForwardingRule());
                              return fields;
                            }
                          })
                      .setQueryParamsExtractor(
                          new FieldsExtractor<
                              GetGlobalForwardingRuleRequest, Map<String, List<String>>>() {
                            @Override
                            public Map<String, List<String>> extract(
                                GetGlobalForwardingRuleRequest request) {
                              Map<String, List<String>> fields = new HashMap<>();
                              ProtoRestSerializer<GetGlobalForwardingRuleRequest> serializer =
                                  ProtoRestSerializer.create();

                              return fields;
                            }
                          })
                      .setRequestBodyExtractor(
                          new FieldsExtractor<GetGlobalForwardingRuleRequest, String>() {
                            @Override
                            public String extract(GetGlobalForwardingRuleRequest request) {
                              return "";
                            }
                          })
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ForwardingRule>newBuilder()
                      .setDefaultInstance(ForwardingRule.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<InsertGlobalForwardingRuleRequest, Operation>
      insertMethodDescriptor =
          ApiMethodDescriptor.<InsertGlobalForwardingRuleRequest, Operation>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.GlobalForwardingRules.Insert")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<InsertGlobalForwardingRuleRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/global/forwardingRules",
                          new FieldsExtractor<
                              InsertGlobalForwardingRuleRequest, Map<String, String>>() {
                            @Override
                            public Map<String, String> extract(
                                InsertGlobalForwardingRuleRequest request) {
                              Map<String, String> fields = new HashMap<>();
                              ProtoRestSerializer<InsertGlobalForwardingRuleRequest> serializer =
                                  ProtoRestSerializer.create();
                              serializer.putPathParam(fields, "project", request.getProject());
                              return fields;
                            }
                          })
                      .setQueryParamsExtractor(
                          new FieldsExtractor<
                              InsertGlobalForwardingRuleRequest, Map<String, List<String>>>() {
                            @Override
                            public Map<String, List<String>> extract(
                                InsertGlobalForwardingRuleRequest request) {
                              Map<String, List<String>> fields = new HashMap<>();
                              ProtoRestSerializer<InsertGlobalForwardingRuleRequest> serializer =
                                  ProtoRestSerializer.create();
                              if (request.hasRequestId()) {
                                serializer.putQueryParam(
                                    fields, "requestId", request.getRequestId());
                              }
                              return fields;
                            }
                          })
                      .setRequestBodyExtractor(
                          new FieldsExtractor<InsertGlobalForwardingRuleRequest, String>() {
                            @Override
                            public String extract(InsertGlobalForwardingRuleRequest request) {
                              return ProtoRestSerializer.create()
                                  .toBody(
                                      "forwardingRuleResource",
                                      request.getForwardingRuleResource());
                            }
                          })
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<ListGlobalForwardingRulesRequest, ForwardingRuleList>
      listMethodDescriptor =
          ApiMethodDescriptor.<ListGlobalForwardingRulesRequest, ForwardingRuleList>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.GlobalForwardingRules.List")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListGlobalForwardingRulesRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/global/forwardingRules",
                          new FieldsExtractor<
                              ListGlobalForwardingRulesRequest, Map<String, String>>() {
                            @Override
                            public Map<String, String> extract(
                                ListGlobalForwardingRulesRequest request) {
                              Map<String, String> fields = new HashMap<>();
                              ProtoRestSerializer<ListGlobalForwardingRulesRequest> serializer =
                                  ProtoRestSerializer.create();
                              serializer.putPathParam(fields, "project", request.getProject());
                              return fields;
                            }
                          })
                      .setQueryParamsExtractor(
                          new FieldsExtractor<
                              ListGlobalForwardingRulesRequest, Map<String, List<String>>>() {
                            @Override
                            public Map<String, List<String>> extract(
                                ListGlobalForwardingRulesRequest request) {
                              Map<String, List<String>> fields = new HashMap<>();
                              ProtoRestSerializer<ListGlobalForwardingRulesRequest> serializer =
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
                                serializer.putQueryParam(
                                    fields, "pageToken", request.getPageToken());
                              }
                              if (request.hasReturnPartialSuccess()) {
                                serializer.putQueryParam(
                                    fields,
                                    "returnPartialSuccess",
                                    request.getReturnPartialSuccess());
                              }
                              return fields;
                            }
                          })
                      .setRequestBodyExtractor(
                          new FieldsExtractor<ListGlobalForwardingRulesRequest, String>() {
                            @Override
                            public String extract(ListGlobalForwardingRulesRequest request) {
                              return "";
                            }
                          })
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ForwardingRuleList>newBuilder()
                      .setDefaultInstance(ForwardingRuleList.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<PatchGlobalForwardingRuleRequest, Operation>
      patchMethodDescriptor =
          ApiMethodDescriptor.<PatchGlobalForwardingRuleRequest, Operation>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.GlobalForwardingRules.Patch")
              .setHttpMethod(HttpMethods.PATCH)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<PatchGlobalForwardingRuleRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/global/forwardingRules/{forwardingRule}",
                          new FieldsExtractor<
                              PatchGlobalForwardingRuleRequest, Map<String, String>>() {
                            @Override
                            public Map<String, String> extract(
                                PatchGlobalForwardingRuleRequest request) {
                              Map<String, String> fields = new HashMap<>();
                              ProtoRestSerializer<PatchGlobalForwardingRuleRequest> serializer =
                                  ProtoRestSerializer.create();
                              serializer.putPathParam(fields, "project", request.getProject());
                              serializer.putPathParam(
                                  fields, "forwardingRule", request.getForwardingRule());
                              return fields;
                            }
                          })
                      .setQueryParamsExtractor(
                          new FieldsExtractor<
                              PatchGlobalForwardingRuleRequest, Map<String, List<String>>>() {
                            @Override
                            public Map<String, List<String>> extract(
                                PatchGlobalForwardingRuleRequest request) {
                              Map<String, List<String>> fields = new HashMap<>();
                              ProtoRestSerializer<PatchGlobalForwardingRuleRequest> serializer =
                                  ProtoRestSerializer.create();
                              if (request.hasRequestId()) {
                                serializer.putQueryParam(
                                    fields, "requestId", request.getRequestId());
                              }
                              return fields;
                            }
                          })
                      .setRequestBodyExtractor(
                          new FieldsExtractor<PatchGlobalForwardingRuleRequest, String>() {
                            @Override
                            public String extract(PatchGlobalForwardingRuleRequest request) {
                              return ProtoRestSerializer.create()
                                  .toBody(
                                      "forwardingRuleResource",
                                      request.getForwardingRuleResource());
                            }
                          })
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<SetLabelsGlobalForwardingRuleRequest, Operation>
      setLabelsMethodDescriptor =
          ApiMethodDescriptor.<SetLabelsGlobalForwardingRuleRequest, Operation>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.GlobalForwardingRules.SetLabels")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<SetLabelsGlobalForwardingRuleRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/global/forwardingRules/{resource}/setLabels",
                          new FieldsExtractor<
                              SetLabelsGlobalForwardingRuleRequest, Map<String, String>>() {
                            @Override
                            public Map<String, String> extract(
                                SetLabelsGlobalForwardingRuleRequest request) {
                              Map<String, String> fields = new HashMap<>();
                              ProtoRestSerializer<SetLabelsGlobalForwardingRuleRequest> serializer =
                                  ProtoRestSerializer.create();
                              serializer.putPathParam(fields, "project", request.getProject());
                              serializer.putPathParam(fields, "resource", request.getResource());
                              return fields;
                            }
                          })
                      .setQueryParamsExtractor(
                          new FieldsExtractor<
                              SetLabelsGlobalForwardingRuleRequest, Map<String, List<String>>>() {
                            @Override
                            public Map<String, List<String>> extract(
                                SetLabelsGlobalForwardingRuleRequest request) {
                              Map<String, List<String>> fields = new HashMap<>();
                              ProtoRestSerializer<SetLabelsGlobalForwardingRuleRequest> serializer =
                                  ProtoRestSerializer.create();

                              return fields;
                            }
                          })
                      .setRequestBodyExtractor(
                          new FieldsExtractor<SetLabelsGlobalForwardingRuleRequest, String>() {
                            @Override
                            public String extract(SetLabelsGlobalForwardingRuleRequest request) {
                              return ProtoRestSerializer.create()
                                  .toBody(
                                      "globalSetLabelsRequestResource",
                                      request.getGlobalSetLabelsRequestResource());
                            }
                          })
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<SetTargetGlobalForwardingRuleRequest, Operation>
      setTargetMethodDescriptor =
          ApiMethodDescriptor.<SetTargetGlobalForwardingRuleRequest, Operation>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.GlobalForwardingRules.SetTarget")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<SetTargetGlobalForwardingRuleRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/global/forwardingRules/{forwardingRule}/setTarget",
                          new FieldsExtractor<
                              SetTargetGlobalForwardingRuleRequest, Map<String, String>>() {
                            @Override
                            public Map<String, String> extract(
                                SetTargetGlobalForwardingRuleRequest request) {
                              Map<String, String> fields = new HashMap<>();
                              ProtoRestSerializer<SetTargetGlobalForwardingRuleRequest> serializer =
                                  ProtoRestSerializer.create();
                              serializer.putPathParam(fields, "project", request.getProject());
                              serializer.putPathParam(
                                  fields, "forwardingRule", request.getForwardingRule());
                              return fields;
                            }
                          })
                      .setQueryParamsExtractor(
                          new FieldsExtractor<
                              SetTargetGlobalForwardingRuleRequest, Map<String, List<String>>>() {
                            @Override
                            public Map<String, List<String>> extract(
                                SetTargetGlobalForwardingRuleRequest request) {
                              Map<String, List<String>> fields = new HashMap<>();
                              ProtoRestSerializer<SetTargetGlobalForwardingRuleRequest> serializer =
                                  ProtoRestSerializer.create();
                              if (request.hasRequestId()) {
                                serializer.putQueryParam(
                                    fields, "requestId", request.getRequestId());
                              }
                              return fields;
                            }
                          })
                      .setRequestBodyExtractor(
                          new FieldsExtractor<SetTargetGlobalForwardingRuleRequest, String>() {
                            @Override
                            public String extract(SetTargetGlobalForwardingRuleRequest request) {
                              return ProtoRestSerializer.create()
                                  .toBody(
                                      "targetReferenceResource",
                                      request.getTargetReferenceResource());
                            }
                          })
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<DeleteGlobalForwardingRuleRequest, Operation> deleteCallable;
  private final UnaryCallable<GetGlobalForwardingRuleRequest, ForwardingRule> getCallable;
  private final UnaryCallable<InsertGlobalForwardingRuleRequest, Operation> insertCallable;
  private final UnaryCallable<ListGlobalForwardingRulesRequest, ForwardingRuleList> listCallable;
  private final UnaryCallable<ListGlobalForwardingRulesRequest, ListPagedResponse>
      listPagedCallable;
  private final UnaryCallable<PatchGlobalForwardingRuleRequest, Operation> patchCallable;
  private final UnaryCallable<SetLabelsGlobalForwardingRuleRequest, Operation> setLabelsCallable;
  private final UnaryCallable<SetTargetGlobalForwardingRuleRequest, Operation> setTargetCallable;

  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonGlobalForwardingRulesStub create(
      GlobalForwardingRulesStubSettings settings) throws IOException {
    return new HttpJsonGlobalForwardingRulesStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonGlobalForwardingRulesStub create(ClientContext clientContext)
      throws IOException {
    return new HttpJsonGlobalForwardingRulesStub(
        GlobalForwardingRulesStubSettings.newBuilder().build(), clientContext);
  }

  public static final HttpJsonGlobalForwardingRulesStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonGlobalForwardingRulesStub(
        GlobalForwardingRulesStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonGlobalForwardingRulesStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonGlobalForwardingRulesStub(
      GlobalForwardingRulesStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new HttpJsonGlobalForwardingRulesCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonGlobalForwardingRulesStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonGlobalForwardingRulesStub(
      GlobalForwardingRulesStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<DeleteGlobalForwardingRuleRequest, Operation> deleteTransportSettings =
        HttpJsonCallSettings.<DeleteGlobalForwardingRuleRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteMethodDescriptor)
            .build();
    HttpJsonCallSettings<GetGlobalForwardingRuleRequest, ForwardingRule> getTransportSettings =
        HttpJsonCallSettings.<GetGlobalForwardingRuleRequest, ForwardingRule>newBuilder()
            .setMethodDescriptor(getMethodDescriptor)
            .build();
    HttpJsonCallSettings<InsertGlobalForwardingRuleRequest, Operation> insertTransportSettings =
        HttpJsonCallSettings.<InsertGlobalForwardingRuleRequest, Operation>newBuilder()
            .setMethodDescriptor(insertMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListGlobalForwardingRulesRequest, ForwardingRuleList>
        listTransportSettings =
            HttpJsonCallSettings.<ListGlobalForwardingRulesRequest, ForwardingRuleList>newBuilder()
                .setMethodDescriptor(listMethodDescriptor)
                .build();
    HttpJsonCallSettings<PatchGlobalForwardingRuleRequest, Operation> patchTransportSettings =
        HttpJsonCallSettings.<PatchGlobalForwardingRuleRequest, Operation>newBuilder()
            .setMethodDescriptor(patchMethodDescriptor)
            .build();
    HttpJsonCallSettings<SetLabelsGlobalForwardingRuleRequest, Operation>
        setLabelsTransportSettings =
            HttpJsonCallSettings.<SetLabelsGlobalForwardingRuleRequest, Operation>newBuilder()
                .setMethodDescriptor(setLabelsMethodDescriptor)
                .build();
    HttpJsonCallSettings<SetTargetGlobalForwardingRuleRequest, Operation>
        setTargetTransportSettings =
            HttpJsonCallSettings.<SetTargetGlobalForwardingRuleRequest, Operation>newBuilder()
                .setMethodDescriptor(setTargetMethodDescriptor)
                .build();

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

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<DeleteGlobalForwardingRuleRequest, Operation> deleteCallable() {
    return deleteCallable;
  }

  public UnaryCallable<GetGlobalForwardingRuleRequest, ForwardingRule> getCallable() {
    return getCallable;
  }

  public UnaryCallable<InsertGlobalForwardingRuleRequest, Operation> insertCallable() {
    return insertCallable;
  }

  public UnaryCallable<ListGlobalForwardingRulesRequest, ListPagedResponse> listPagedCallable() {
    return listPagedCallable;
  }

  public UnaryCallable<ListGlobalForwardingRulesRequest, ForwardingRuleList> listCallable() {
    return listCallable;
  }

  public UnaryCallable<PatchGlobalForwardingRuleRequest, Operation> patchCallable() {
    return patchCallable;
  }

  public UnaryCallable<SetLabelsGlobalForwardingRuleRequest, Operation> setLabelsCallable() {
    return setLabelsCallable;
  }

  public UnaryCallable<SetTargetGlobalForwardingRuleRequest, Operation> setTargetCallable() {
    return setTargetCallable;
  }

  @Override
  public final void close() {
    shutdown();
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
