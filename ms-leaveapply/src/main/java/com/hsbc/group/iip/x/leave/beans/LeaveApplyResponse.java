package com.hsbc.group.iip.x.leave.beans;

import org.springframework.stereotype.Component;

import com.hsbc.group.iip.x.common.model.ResponseDetail;
import com.hsbc.group.iip.x.leave.beans.model.ResponseInfo;

@Component
public class LeaveApplyResponse {
	
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
