/*
 * Copyright 2022 Google LLC
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

package com.google.cloud.compute.nativeimage;

import com.google.api.gax.nativeimage.NativeImageUtils;
import com.google.common.collect.ImmutableList;
import com.oracle.svm.core.annotate.AutomaticFeature;
import org.graalvm.nativeimage.hosted.Feature;

@AutomaticFeature
class ComputeFeature implements Feature {

  private final ImmutableList<String> protoGoogleCommonProtosClasses =
      ImmutableList.of(
          "com.google.protobuf.DescriptorProtos$FieldOptions$Builder",
          "com.google.protobuf.DescriptorProtos$FieldOptions$CType",
          "com.google.protobuf.DescriptorProtos$FieldOptions$JSType",
          "com.google.protobuf.DescriptorProtos$FieldOptions",
          "com.google.protobuf.DescriptorProtos$MethodOptions$Builder",
          "com.google.protobuf.DescriptorProtos$MethodOptions$IdempotencyLevel",
          "com.google.protobuf.DescriptorProtos$MethodOptions",
          "com.google.protobuf.DescriptorProtos$ServiceOptions$Builder",
          "com.google.protobuf.DescriptorProtos$ServiceOptions",
          "com.google.protobuf.DescriptorProtos$UninterpretedOption",
          "com.google.api.FieldBehavior",
          "com.google.cloud.OperationResponseMapping");

  @Override
  public void beforeAnalysis(BeforeAnalysisAccess access) {
    for (String targetClass : protoGoogleCommonProtosClasses) {
      if (access.findClassByName(targetClass) != null) {
        NativeImageUtils.registerClassHierarchyForReflection(access, targetClass);
      }
    }
  }
}
