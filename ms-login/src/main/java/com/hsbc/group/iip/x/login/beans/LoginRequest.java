package com.hsbc.group.iip.x.login.beans;

import org.springframework.stereotype.Component;

import com.hsbc.group.iip.x.login.beans.model.RequestInfo;

@Component
public class LoginRequest {
	private RequestInfo requestInfo;

	public RequestInfo getRequestInfo() {
		return requestInfo;
	}

	public void setRequestInfo(RequestInfo requestInfo) {
		this.requestInfo = requestInfo;
	}
	
	
}
