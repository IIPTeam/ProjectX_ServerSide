package com.hsbc.group.iip.x.forgetpassword.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.group.iip.x.forgetpassword.beans.ForgetPasswordRequest;
import com.hsbc.group.iip.x.forgetpassword.beans.ForgetPasswordResponse;
import com.hsbc.group.iip.x.forgetpassword.service.ForgetPasswordService;

@RestController
public class ForgetPasswordAction {
	
	@Autowired
	private ForgetPasswordService forgetService;
	
	@Autowired
	private ForgetPasswordResponse forgetResp;
	
	@ResponseBody
	@RequestMapping(value="/fgtPaswrd", method=RequestMethod.POST)
	public ForgetPasswordResponse forgetPaswrd(final @RequestBody ForgetPasswordRequest forgetReq){
		forgetResp = forgetService.forgetPaswrd(forgetReq);
		return forgetResp;
	}
}
