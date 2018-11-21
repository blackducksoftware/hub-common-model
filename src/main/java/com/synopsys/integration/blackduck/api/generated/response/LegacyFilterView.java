package com.synopsys.integration.blackduck.api.generated.response;

import com.synopsys.integration.blackduck.api.core.BlackDuckResponse;
import com.synopsys.integration.blackduck.api.generated.component.LegacyFilterValueView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LegacyFilterView extends BlackDuckResponse {
    private String label;
    private String name;
    private java.util.List<LegacyFilterValueView> values;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.util.List<LegacyFilterValueView> getValues() {
        return values;
    }

    public void setValues(java.util.List<LegacyFilterValueView> values) {
        this.values = values;
    }

}