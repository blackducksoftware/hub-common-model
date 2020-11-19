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
package com.synopsys.integration.blackduck.api.generated.view;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.enumeration.ReportFormatType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ReportStatusType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ReportType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class LicenseReportsReportView extends BlackDuckView {
    private String fileName;
    private String locale;
    private java.util.Date finishedAt;
    private java.util.Date createdAt;
    private BigDecimal fileSize;
    private String createdBy;
    private java.util.Date updatedAt;
    private ReportType reportType;
    private ReportStatusType status;
    private String createdByUser;
    private String fileNamePrefix;
    private ReportFormatType reportFormat;

    public String getFileName() {
	    return fileName;
    }

    public void setFileName(String fileName) {
	    this.fileName = fileName;
    }

    public String getLocale() {
	    return locale;
    }

    public void setLocale(String locale) {
	    this.locale = locale;
    }

    public java.util.Date getFinishedAt() {
	    return finishedAt;
    }

    public void setFinishedAt(java.util.Date finishedAt) {
	    this.finishedAt = finishedAt;
    }

    public java.util.Date getCreatedAt() {
	    return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
	    this.createdAt = createdAt;
    }

    public BigDecimal getFileSize() {
	    return fileSize;
    }

    public void setFileSize(BigDecimal fileSize) {
	    this.fileSize = fileSize;
    }

    public String getCreatedBy() {
	    return createdBy;
    }

    public void setCreatedBy(String createdBy) {
	    this.createdBy = createdBy;
    }

    public java.util.Date getUpdatedAt() {
	    return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
	    this.updatedAt = updatedAt;
    }

    public ReportType getReportType() {
	    return reportType;
    }

    public void setReportType(ReportType reportType) {
	    this.reportType = reportType;
    }

    public ReportStatusType getStatus() {
	    return status;
    }

    public void setStatus(ReportStatusType status) {
	    this.status = status;
    }

    public String getCreatedByUser() {
	    return createdByUser;
    }

    public void setCreatedByUser(String createdByUser) {
	    this.createdByUser = createdByUser;
    }

    public String getFileNamePrefix() {
	    return fileNamePrefix;
    }

    public void setFileNamePrefix(String fileNamePrefix) {
	    this.fileNamePrefix = fileNamePrefix;
    }

    public ReportFormatType getReportFormat() {
	    return reportFormat;
    }

    public void setReportFormat(ReportFormatType reportFormat) {
	    this.reportFormat = reportFormat;
    }

}