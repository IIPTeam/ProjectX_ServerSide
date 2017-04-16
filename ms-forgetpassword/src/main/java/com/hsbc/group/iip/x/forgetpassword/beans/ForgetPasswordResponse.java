package com.hsbc.group.iip.x.forgetpassword.beans;

import org.springframework.stereotype.Component;

import com.hsbc.group.iip.x.common.model.ResponseDetails;
import com.hsbc.group.iip.x.common.model.VerificationCode;

@Component
public class ForgetPasswordResponse {
	
	private ResponseDetails responseDetails;
	
	private boolean validUesr;
	
	private VerificationCode vCode;
	
	public boolean isValidUesr() {
		return validUesr;
	}
	public void setValidUesr(boolean validUesr) {
		this.validUesr = validUesr;
	}
	public VerificationCode getvCode() {
		return vCode;
	}
	public void setvCode(VerificationCode vCode) {
		this.vCode = vCode;
	}
	public ResponseDetails getResponseDetails() {
		return responseDetails;
	}
	public void setResponseDetails(ResponseDetails responseDetails) {
		this.responseDetails = responseDetails;
	}
	
	
}
