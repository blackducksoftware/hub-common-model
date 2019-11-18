/**
 * blackduck-common-api
 *
 * Copyright (c) 2019 Synopsys, Inc.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.synopsys.integration.blackduck.api.manual.throwaway.generated.component;

import java.util.ArrayList;
import java.util.List;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.PolicyRuleExpressionExpressionsParametersView;
import com.synopsys.integration.blackduck.api.generated.component.PolicyRuleExpressionExpressionsView;
import com.synopsys.integration.blackduck.api.generated.component.PolicyRuleExpressionView;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.enumeration.PolicyRuleExpressionSetOperatorType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class PolicyRuleExpressionSetView extends BlackDuckComponent {
    private java.util.List<PolicyRuleExpressionExpressionsView> expressions;
    private PolicyRuleExpressionSetOperatorType operator;

    public java.util.List<PolicyRuleExpressionExpressionsView> getExpressions() {
        return expressions;
    }

    public void setExpressions(java.util.List<PolicyRuleExpressionExpressionsView> expressions) {
        this.expressions = expressions;
    }

    public PolicyRuleExpressionSetOperatorType getOperator() {
        return operator;
    }

    public void setOperator(PolicyRuleExpressionSetOperatorType operator) {
        this.operator = operator;
    }

    // Method to build a PolicyRuleViewExpression from a PolicyRuleExpressionSetView
    public PolicyRuleExpressionView buildPolicyRuleViewExpression() {
        PolicyRuleExpressionView policyRuleExpressionView = new PolicyRuleExpressionView();

        // String operator
        policyRuleExpressionView.setOperator(operator.toString());

        // List<PolicyRuleExpressionExpressionsView> expressions
        List<PolicyRuleExpressionExpressionsView> expressionList = new ArrayList<>();
        PolicyRuleExpressionExpressionsView policyRuleExpressionExpressionsView = new PolicyRuleExpressionExpressionsView();
        PolicyRuleExpressionExpressionsView policyRuleExpressionExpressionsViewDataSource = expressions.get(0);

            // String name
        policyRuleExpressionExpressionsView.setName(policyRuleExpressionExpressionsViewDataSource.getName());
            // String operation
        policyRuleExpressionExpressionsView.setOperation(policyRuleExpressionExpressionsViewDataSource.getOperation());
            // PolicyRuleExpressionParameter parameters
        PolicyRuleExpressionExpressionsParametersView policyRuleExpressionExpressionParametersView = new PolicyRuleExpressionExpressionsParametersView();
        PolicyRuleExpressionExpressionsParametersView policyRuleExpressionExpressionsParametersViewDataSource = policyRuleExpressionExpressionsViewDataSource.getParameters();

            // java.util.List<String> values
        policyRuleExpressionExpressionParametersView.setValues(policyRuleExpressionExpressionsParametersViewDataSource.getValues());
        policyRuleExpressionExpressionsView.setParameters(policyRuleExpressionExpressionParametersView);

        expressionList.add(policyRuleExpressionExpressionsView);
        policyRuleExpressionView.setExpressions(expressionList);

        return policyRuleExpressionView;
    }

}