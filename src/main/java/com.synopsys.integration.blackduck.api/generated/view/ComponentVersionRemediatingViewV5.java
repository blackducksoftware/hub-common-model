package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.generated.component.ComponentVersionRemediatingLatestAfterCurrentView;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.generated.component.ComponentVersionRemediatingNoVulnerabilitiesView;
import com.synopsys.integration.blackduck.api.generated.component.ComponentVersionRemediatingFixesPreviousVulnerabilitiesView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentVersionRemediatingViewV5 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.component-detail-5+json";

    private ComponentVersionRemediatingLatestAfterCurrentView latestAfterCurrent;
    private ComponentVersionRemediatingNoVulnerabilitiesView noVulnerabilities;
    private ComponentVersionRemediatingFixesPreviousVulnerabilitiesView fixesPreviousVulnerabilities;

    public ComponentVersionRemediatingLatestAfterCurrentView getLatestAfterCurrent() {
	return latestAfterCurrent;
    }

    public void setLatestAfterCurrent(ComponentVersionRemediatingLatestAfterCurrentView latestAfterCurrent) {
	this.latestAfterCurrent = latestAfterCurrent;
    }

    public ComponentVersionRemediatingNoVulnerabilitiesView getNoVulnerabilities() {
	return noVulnerabilities;
    }

    public void setNoVulnerabilities(ComponentVersionRemediatingNoVulnerabilitiesView noVulnerabilities) {
	this.noVulnerabilities = noVulnerabilities;
    }

    public ComponentVersionRemediatingFixesPreviousVulnerabilitiesView getFixesPreviousVulnerabilities() {
	return fixesPreviousVulnerabilities;
    }

    public void setFixesPreviousVulnerabilities(ComponentVersionRemediatingFixesPreviousVulnerabilitiesView fixesPreviousVulnerabilities) {
	this.fixesPreviousVulnerabilities = fixesPreviousVulnerabilities;
    }


    public String getMediaType() {
	return mediaType;
    }

}
