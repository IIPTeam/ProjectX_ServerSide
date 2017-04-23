package com.hsbc.group.iip.x.login.beans;

import org.springframework.stereotype.Component;

import com.hsbc.group.iip.x.common.model.ResponseDetail;
import com.hsbc.group.iip.x.login.beans.model.ResponseInfo;

@Component
public class LoginResponse {
	private ResponseInfo responseInfo;
	
	private ResponseDetail responseDetail;

	public ResponseInfo getResponseInfo() {
		return responseInfo;
	}

	public void setResponseInfo(ResponseInfo responseInfo) {
		this.responseInfo = responseInfo;
	}

	public ResponseDetail getResponseDetail() {
		return responseDetail;
	}

	public void setResponseDetail(ResponseDetail responseDetail) {
		this.responseDetail = responseDetail;
	}
	
	
}
