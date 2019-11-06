package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.LinkStringResponse;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class CodeLocationViewV4 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.scan-4+json";

	public static final Map<String, LinkResponse> links = new HashMap<>();
        public static final String SCANS_LINK = "scans";

	public static final LinkStringResponse SCANS_LINK_RESPONSE = new LinkStringResponse(SCANS_LINK, String.class);

    static {
	links.put(SCANS_LINK, SCANS_LINK_RESPONSE);
    }

    private BigDecimal scanSize;
    private String name;
    private String updatedAt;
    private String url;
    private String mappedProjectVersion;
    private String createdAt;

    public BigDecimal getScanSize() {
	return scanSize;
    }

    public void setScanSize(BigDecimal scanSize) {
	this.scanSize = scanSize;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getUpdatedAt() {
	return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
	this.updatedAt = updatedAt;
    }

    public String getUrl() {
	return url;
    }

    public void setUrl(String url) {
	this.url = url;
    }

    public String getMappedProjectVersion() {
	return mappedProjectVersion;
    }

    public void setMappedProjectVersion(String mappedProjectVersion) {
	this.mappedProjectVersion = mappedProjectVersion;
    }

    public String getCreatedAt() {
	return createdAt;
    }

    public void setCreatedAt(String createdAt) {
	this.createdAt = createdAt;
    }


    public String getMediaType() {
	return mediaType;
    }

}
