package com.hsbc.group.iip.x.resetpassword.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.group.iip.x.resetpassword.beans.ResetPasswordRequest;
import com.hsbc.group.iip.x.resetpassword.beans.ResetPasswordResponse;
import com.hsbc.group.iip.x.resetpassword.service.ResetPasswordService;

@RestController
public class ResetPasswordAction {
	
	@Autowired
	private ResetPasswordService service;
	
	@Autowired
	private ResetPasswordResponse response;
	
	@ResponseBody
	@RequestMapping(value="/resetPaswrd")
	public ResetPasswordResponse resetPaswrd(final @RequestBody ResetPasswordRequest request){
		this.response = service.resetPaswrd(request);
		return this.response;
	}
	
}
