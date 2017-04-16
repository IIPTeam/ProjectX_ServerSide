package com.hsbc.group.iip.x.resetpassword.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.hsbc.group.iip.x.common.model.ResponseDetails;
import com.hsbc.group.iip.x.common.utils.CheckUser;
import com.hsbc.group.iip.x.resetpassword.beans.ResetPasswordRequest;
import com.hsbc.group.iip.x.resetpassword.beans.ResetPasswordResponse;
import com.hsbc.group.iip.x.resetpassword.service.ResetPasswordService;

@Service
public class ResetPasswordServiceImpl implements ResetPasswordService{

	@Autowired
	private ResetPasswordResponse resetResp;
	
	@Autowired
	private ResponseDetails responseDetails;
	
	@Override
	public ResetPasswordResponse resetPaswrd(ResetPasswordRequest request) {
		if(!StringUtils.isEmpty(request.getvCode())){
			if(CheckUser.checkUser(request.getUser())){
				//update user's password into DB
				
				responseDetails.setResponseCode("0");
				resetResp.setResponseDetails(responseDetails);
			}else{
				responseDetails.setResponseCode("1");
				resetResp.setResponseDetails(responseDetails);
			}
		}else{
			responseDetails.setResponseCode("1");
			resetResp.setResponseDetails(responseDetails);
		}
		return resetResp;
	}

}
