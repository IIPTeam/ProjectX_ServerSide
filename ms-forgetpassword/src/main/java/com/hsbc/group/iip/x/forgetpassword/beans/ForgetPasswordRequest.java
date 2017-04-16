package com.hsbc.group.iip.x.forgetpassword.beans;

import org.springframework.stereotype.Component;

import com.hsbc.group.iip.x.common.model.User;

@Component
public class ForgetPasswordRequest {
	private  User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
