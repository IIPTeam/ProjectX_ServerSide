package com.hsbc.group.iip.x.login.beans.model;

import org.springframework.stereotype.Component;

@Component
public class ResponseInfo {
	private String responseCode;
	
	private Boolean loginIndication;

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public Boolean getLoginIndication() {
		return loginIndication;
	}

	public void setLoginIndication(Boolean loginIndication) {
		this.loginIndication = loginIndication;
	}
	
}
