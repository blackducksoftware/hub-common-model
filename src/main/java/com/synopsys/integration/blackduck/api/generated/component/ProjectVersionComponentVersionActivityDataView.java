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
package com.synopsys.integration.blackduck.api.generated.component;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionComponentActivityDataTrendingType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ProjectVersionComponentVersionActivityDataView extends BlackDuckComponent {
    private ProjectVersionComponentActivityDataTrendingType trending;
    private BigDecimal contributorCount12Month;
    private BigDecimal commitCount12Month;
    private BigDecimal newerReleases;
    private java.util.Date lastCommitDate;

    public ProjectVersionComponentActivityDataTrendingType getTrending() {
	    return trending;
    }

    public void setTrending(ProjectVersionComponentActivityDataTrendingType trending) {
	    this.trending = trending;
    }

    public BigDecimal getContributorCount12Month() {
	    return contributorCount12Month;
    }

    public void setContributorCount12Month(BigDecimal contributorCount12Month) {
	    this.contributorCount12Month = contributorCount12Month;
    }

    public BigDecimal getCommitCount12Month() {
	    return commitCount12Month;
    }

    public void setCommitCount12Month(BigDecimal commitCount12Month) {
	    this.commitCount12Month = commitCount12Month;
    }

    public BigDecimal getNewerReleases() {
	    return newerReleases;
    }

    public void setNewerReleases(BigDecimal newerReleases) {
	    this.newerReleases = newerReleases;
    }

    public java.util.Date getLastCommitDate() {
	    return lastCommitDate;
    }

    public void setLastCommitDate(java.util.Date lastCommitDate) {
	    this.lastCommitDate = lastCommitDate;
    }

}