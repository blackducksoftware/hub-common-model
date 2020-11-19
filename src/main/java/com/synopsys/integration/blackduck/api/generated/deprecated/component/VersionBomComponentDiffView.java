/**
 * blackduck-common-api
 *
 * Copyright (c) 2020 Synopsys, Inc.
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
package com.synopsys.integration.blackduck.api.generated.deprecated.component;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComparisonItemsView;

@Deprecated
/**
* VersionBomComponentDiffView from the previous API is now called ProjectVersionComparisonView
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class VersionBomComponentDiffView extends BlackDuckComponent {
    private BigDecimal totalCount;
    private java.util.List<ProjectVersionComparisonItemsView> items;
    private BigDecimal totalRemovedComponentVersions;
    private BigDecimal totalUnchangedComponents;
    private BigDecimal totalUnchangedComponentVersions;
    private BigDecimal totalChangedComponentVersions;
    private BigDecimal totalRemovedComponents;
    private BigDecimal totalAddedComponentVersions;
    private BigDecimal totalChangedComponents;
    private BigDecimal totalAddedComponents;

    public BigDecimal getTotalCount() {
	    return totalCount;
    }

    public void setTotalCount(BigDecimal totalCount) {
	    this.totalCount = totalCount;
    }

    public java.util.List<ProjectVersionComparisonItemsView> getItems() {
	    return items;
    }

    public void setItems(java.util.List<ProjectVersionComparisonItemsView> items) {
	    this.items = items;
    }

    public BigDecimal getTotalRemovedComponentVersions() {
	    return totalRemovedComponentVersions;
    }

    public void setTotalRemovedComponentVersions(BigDecimal totalRemovedComponentVersions) {
	    this.totalRemovedComponentVersions = totalRemovedComponentVersions;
    }

    public BigDecimal getTotalUnchangedComponents() {
	    return totalUnchangedComponents;
    }

    public void setTotalUnchangedComponents(BigDecimal totalUnchangedComponents) {
	    this.totalUnchangedComponents = totalUnchangedComponents;
    }

    public BigDecimal getTotalUnchangedComponentVersions() {
	    return totalUnchangedComponentVersions;
    }

    public void setTotalUnchangedComponentVersions(BigDecimal totalUnchangedComponentVersions) {
	    this.totalUnchangedComponentVersions = totalUnchangedComponentVersions;
    }

    public BigDecimal getTotalChangedComponentVersions() {
	    return totalChangedComponentVersions;
    }

    public void setTotalChangedComponentVersions(BigDecimal totalChangedComponentVersions) {
	    this.totalChangedComponentVersions = totalChangedComponentVersions;
    }

    public BigDecimal getTotalRemovedComponents() {
	    return totalRemovedComponents;
    }

    public void setTotalRemovedComponents(BigDecimal totalRemovedComponents) {
	    this.totalRemovedComponents = totalRemovedComponents;
    }

    public BigDecimal getTotalAddedComponentVersions() {
	    return totalAddedComponentVersions;
    }

    public void setTotalAddedComponentVersions(BigDecimal totalAddedComponentVersions) {
	    this.totalAddedComponentVersions = totalAddedComponentVersions;
    }

    public BigDecimal getTotalChangedComponents() {
	    return totalChangedComponents;
    }

    public void setTotalChangedComponents(BigDecimal totalChangedComponents) {
	    this.totalChangedComponents = totalChangedComponents;
    }

    public BigDecimal getTotalAddedComponents() {
	    return totalAddedComponents;
    }

    public void setTotalAddedComponents(BigDecimal totalAddedComponents) {
	    this.totalAddedComponents = totalAddedComponents;
    }

}