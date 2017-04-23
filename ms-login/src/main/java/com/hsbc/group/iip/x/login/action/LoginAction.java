package com.hsbc.group.iip.x.login.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.group.iip.x.login.beans.LoginRequest;
import com.hsbc.group.iip.x.login.beans.LoginResponse;
import com.hsbc.group.iip.x.login.service.LoginService;

@RestController
public class LoginAction {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public LoginResponse login(final @RequestBody LoginRequest loginReq){
		
		return loginService.login(loginReq);
	}
}
