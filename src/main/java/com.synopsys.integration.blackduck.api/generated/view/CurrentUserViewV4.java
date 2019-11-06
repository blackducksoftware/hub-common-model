package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class CurrentUserViewV4 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.user-4+json";

    private String email;
    private String lastName;
    private String user;
    private String firstName;
    private Boolean active;
    private String type;
    private String externalUserName;
    private String userName;

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public String getUser() {
	return user;
    }

    public void setUser(String user) {
	this.user = user;
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public Boolean getActive() {
	return active;
    }

    public void setActive(Boolean active) {
	this.active = active;
    }

    public String getType() {
	return type;
    }

    public void setType(String type) {
	this.type = type;
    }

    public String getExternalUserName() {
	return externalUserName;
    }

    public void setExternalUserName(String externalUserName) {
	this.externalUserName = externalUserName;
    }

    public String getUserName() {
	return userName;
    }

    public void setUserName(String userName) {
	this.userName = userName;
    }


    public String getMediaType() {
	return mediaType;
    }

}