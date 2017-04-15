package com.hsbc.group.iip.x.common.model;

import org.springframework.stereotype.Component;

@Component
public class VerificationCode {
	private String vCode;

	public String getvCode() {
		return vCode;
	}

	public void setvCode(String vCode) {
		this.vCode = vCode;
	}
	
}
