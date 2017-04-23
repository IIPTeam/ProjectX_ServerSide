package com.hsbc.group.iip.x.login.beans.model;

import org.springframework.stereotype.Component;

@Component
public class RequestInfo {
	
	private String account;
	
	private String password;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
