package com.synopsys.integration.blackduck.api.generated.component;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.generated.enumeration.RegistrationFeaturesFeatureType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class RegistrationFeaturesView extends BlackDuckComponent {
	public static final String mediaType = "application/vnd.blackducksoftware.status-4+json";

    private RegistrationFeaturesFeatureType feature;
    private BigDecimal warningValue;
    private BigDecimal limitValue;

    public RegistrationFeaturesFeatureType getFeature() {
	return feature;
    }

    public void setFeature(RegistrationFeaturesFeatureType feature) {
	this.feature = feature;
    }

    public BigDecimal getWarningValue() {
	return warningValue;
    }

    public void setWarningValue(BigDecimal warningValue) {
	this.warningValue = warningValue;
    }

    public BigDecimal getLimitValue() {
	return limitValue;
    }

    public void setLimitValue(BigDecimal limitValue) {
	this.limitValue = limitValue;
    }


    public String getMediaType() {
	return mediaType;
    }

}
