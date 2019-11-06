package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseLicenseSourceType;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseOwnershipType;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseCodeSharingType;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseLicenseStatusType;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.LinkStringResponse;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LicenseViewV4 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.component-detail-4+json";

	public static final Map<String, LinkResponse> links = new HashMap<>();
        public static final String TEXT_LINK = "text";

	public static final LinkStringResponse TEXT_LINK_RESPONSE = new LinkStringResponse(TEXT_LINK, String.class);

    static {
	links.put(TEXT_LINK, TEXT_LINK_RESPONSE);
    }

    private String name;
    private String expirationDate;
    private String notes;
    private String createdBy;
    private String createdByUser;
    private LicenseLicenseSourceType licenseSource;
    private String statusUpdatedAt;
    private String statusUpdatedBy;
    private String updatedByUser;
    private String updatedAt;
    private String createdAt;
    private String statusUpdatedByUser;
    private LicenseOwnershipType ownership;
    private String spdxId;
    private LicenseCodeSharingType codeSharing;
    private LicenseLicenseStatusType licenseStatus;
    private String updatedBy;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getExpirationDate() {
	return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
	this.expirationDate = expirationDate;
    }

    public String getNotes() {
	return notes;
    }

    public void setNotes(String notes) {
	this.notes = notes;
    }

    public String getCreatedBy() {
	return createdBy;
    }

    public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
    }

    public String getCreatedByUser() {
	return createdByUser;
    }

    public void setCreatedByUser(String createdByUser) {
	this.createdByUser = createdByUser;
    }

    public LicenseLicenseSourceType getLicenseSource() {
	return licenseSource;
    }

    public void setLicenseSource(LicenseLicenseSourceType licenseSource) {
	this.licenseSource = licenseSource;
    }

    public String getStatusUpdatedAt() {
	return statusUpdatedAt;
    }

    public void setStatusUpdatedAt(String statusUpdatedAt) {
	this.statusUpdatedAt = statusUpdatedAt;
    }

    public String getStatusUpdatedBy() {
	return statusUpdatedBy;
    }

    public void setStatusUpdatedBy(String statusUpdatedBy) {
	this.statusUpdatedBy = statusUpdatedBy;
    }

    public String getUpdatedByUser() {
	return updatedByUser;
    }

    public void setUpdatedByUser(String updatedByUser) {
	this.updatedByUser = updatedByUser;
    }

    public String getUpdatedAt() {
	return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
	this.updatedAt = updatedAt;
    }

    public String getCreatedAt() {
	return createdAt;
    }

    public void setCreatedAt(String createdAt) {
	this.createdAt = createdAt;
    }

    public String getStatusUpdatedByUser() {
	return statusUpdatedByUser;
    }

    public void setStatusUpdatedByUser(String statusUpdatedByUser) {
	this.statusUpdatedByUser = statusUpdatedByUser;
    }

    public LicenseOwnershipType getOwnership() {
	return ownership;
    }

    public void setOwnership(LicenseOwnershipType ownership) {
	this.ownership = ownership;
    }

    public String getSpdxId() {
	return spdxId;
    }

    public void setSpdxId(String spdxId) {
	this.spdxId = spdxId;
    }

    public LicenseCodeSharingType getCodeSharing() {
	return codeSharing;
    }

    public void setCodeSharing(LicenseCodeSharingType codeSharing) {
	this.codeSharing = codeSharing;
    }

    public LicenseLicenseStatusType getLicenseStatus() {
	return licenseStatus;
    }

    public void setLicenseStatus(LicenseLicenseStatusType licenseStatus) {
	this.licenseStatus = licenseStatus;
    }

    public String getUpdatedBy() {
	return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
	this.updatedBy = updatedBy;
    }


    public String getMediaType() {
	return mediaType;
    }

}