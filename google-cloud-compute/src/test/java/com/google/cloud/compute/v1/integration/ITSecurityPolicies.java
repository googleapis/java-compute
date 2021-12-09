/*
 * Copyright 2021 Google LLC
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
package com.google.cloud.compute.v1.integration;

import com.google.cloud.compute.v1.RemoveRuleSecurityPolicyRequest;
import com.google.cloud.compute.v1.SecurityPoliciesClient;
import com.google.cloud.compute.v1.SecurityPolicy;
import com.google.cloud.compute.v1.SecurityPolicyRule;
import com.google.cloud.compute.v1.SecurityPolicyRuleMatcher;
import com.google.cloud.compute.v1.SecurityPolicyRuleMatcherConfig;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import org.junit.Assert;
import org.junit.Test;

public class ITSecurityPolicies extends BaseTest {
  @Test
  public void testCreateGetDelete() throws IOException, ExecutionException, InterruptedException {
    // we want to test an optional query param field set to 0.
    String ruleName = generateRandomName("java-rule");
    SecurityPoliciesClient securityPoliciesClient = SecurityPoliciesClient.create();
    SecurityPolicyRuleMatcher securityPolicyRuleMatcher =
        SecurityPolicyRuleMatcher.newBuilder()
            .setVersionedExpr(SecurityPolicyRuleMatcher.VersionedExpr.SRC_IPS_V1.toString())
            .setConfig(SecurityPolicyRuleMatcherConfig.newBuilder().addSrcIpRanges("*").build())
            .build();
    SecurityPolicyRule securityPolicyRule =
        SecurityPolicyRule.newBuilder()
            .setAction("allow")
            .setPriority(0)
            .setDescription("test rule")
            .setMatch(securityPolicyRuleMatcher)
            .build();
    SecurityPolicyRule securityPolicyRuleDefault =
        SecurityPolicyRule.newBuilder()
            .setAction("allow")
            .setPriority(2147483647)
            .setDescription("default rule")
            .setMatch(securityPolicyRuleMatcher)
            .build();
    SecurityPolicy securityPolicy =
        SecurityPolicy.newBuilder()
            .setName(ruleName)
            .addRules(securityPolicyRule)
            .addRules(securityPolicyRuleDefault)
            .build();
    securityPoliciesClient.insertAsync(DEFAULT_PROJECT, securityPolicy).get();
    try {
      SecurityPolicy fetched = securityPoliciesClient.get(DEFAULT_PROJECT, ruleName);
      Assert.assertEquals("There should be two rules in this policy.", 2, fetched.getRulesCount());

      RemoveRuleSecurityPolicyRequest removeRuleSecurityPolicyRequest =
          RemoveRuleSecurityPolicyRequest.newBuilder()
              .setPriority(0)
              .setProject(DEFAULT_PROJECT)
              .setSecurityPolicy(ruleName)
              .build();
      securityPoliciesClient.removeRuleAsync(removeRuleSecurityPolicyRequest).get();

      SecurityPolicy removed = securityPoliciesClient.get(DEFAULT_PROJECT, ruleName);
      Assert.assertEquals("There should be only one rule.", 1, removed.getRulesCount());
    } finally {
      securityPoliciesClient.deleteAsync(DEFAULT_PROJECT, ruleName).get();
    }
  }
}
