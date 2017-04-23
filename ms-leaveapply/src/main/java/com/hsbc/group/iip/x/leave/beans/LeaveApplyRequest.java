package com.hsbc.group.iip.x.leave.beans;

import org.springframework.stereotype.Component;

import com.hsbc.group.iip.x.leave.beans.model.RequestInfo;

@Component
public class LeaveApplyRequest {
	
	private RequestInfo requestInfo;

	public RequestInfo getRequestInfo() {
		return requestInfo;
	}

	public void setRequestInfo(RequestInfo requestInfo) {
		this.requestInfo = requestInfo;
	}
	
	
}
