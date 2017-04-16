package com.hsbc.group.iip.x.resetpassword.beans;

import com.hsbc.group.iip.x.common.model.User;
import com.hsbc.group.iip.x.common.model.VerificationCode;

public class ResetPasswordRequest {
	private User user;
	private VerificationCode vCode;

	
	public VerificationCode getvCode() {
		return vCode;
	}

	public void setvCode(VerificationCode vCode) {
		this.vCode = vCode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
