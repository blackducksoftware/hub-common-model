package com.synopsys.integration.blackduck.api.generated.component;

import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComponentReviewedDetailsReviewingUserView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ProjectVersionComponentReviewedDetailsView extends BlackDuckComponent {
    private java.util.Date reviewedAt;
    private ProjectVersionComponentReviewedDetailsReviewingUserView reviewingUser;
    private String reviewedBy;

    public java.util.Date getReviewedAt() {
	    return reviewedAt;
    }

    public void setReviewedAt(java.util.Date reviewedAt) {
	    this.reviewedAt = reviewedAt;
    }

    public ProjectVersionComponentReviewedDetailsReviewingUserView getReviewingUser() {
	    return reviewingUser;
    }

    public void setReviewingUser(ProjectVersionComponentReviewedDetailsReviewingUserView reviewingUser) {
	    this.reviewingUser = reviewingUser;
    }

    public String getReviewedBy() {
	    return reviewedBy;
    }

    public void setReviewedBy(String reviewedBy) {
	    this.reviewedBy = reviewedBy;
    }

}
