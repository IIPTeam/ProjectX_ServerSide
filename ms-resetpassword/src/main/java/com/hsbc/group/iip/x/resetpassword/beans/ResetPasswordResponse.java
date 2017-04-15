package com.hsbc.group.iip.x.resetpassword.beans;

import org.springframework.stereotype.Component;

import com.hsbc.group.iip.x.common.model.ResponseDetails;

@Component
public class ResetPasswordResponse {
	
	private ResponseDetails responseDetails;

	public ResponseDetails getResponseDetails() {
		return responseDetails;
	}

	public void setResponseDetails(ResponseDetails responseDetails) {
		this.responseDetails = responseDetails;
	}
	
}
