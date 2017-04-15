package com.hsbc.group.iip.x.forgetpassword.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsbc.group.iip.x.common.model.ResponseDetails;
import com.hsbc.group.iip.x.common.model.VerificationCode;
import com.hsbc.group.iip.x.common.utils.CheckUser;
import com.hsbc.group.iip.x.forgetpassword.beans.ForgetPasswordRequest;
import com.hsbc.group.iip.x.forgetpassword.beans.ForgetPasswordResponse;
import com.hsbc.group.iip.x.forgetpassword.beans.model.VCodeConfig;
import com.hsbc.group.iip.x.forgetpassword.service.ForgetPasswordService;

@Service
public class ForgetPasswordServiceImpl implements ForgetPasswordService {
	
	@Autowired
	private ForgetPasswordResponse forgetResp;
	
	@Autowired
	private ResponseDetails responseDetails;
	
	@Autowired
	private VCodeConfig vCodeConfig;
	
	@Autowired
	private VerificationCode vCode;
	@Override
	public ForgetPasswordResponse forgetPaswrd(ForgetPasswordRequest forgetReq) {
		
		String staffId = forgetReq.getUser().getStaffId();
		
		if(CheckUser.checkUser(staffId)){
			vCode.setvCode(CheckUser.genVCode(vCodeConfig.getSize(), vCodeConfig.getSource()));
			responseDetails.setResponseCode("0");
			forgetResp.setResponseDetails(responseDetails);
			forgetResp.setvCode(vCode);
			forgetResp.setValidUesr(true);
		}else{
			responseDetails.setResponseCode("1");
			forgetResp.setResponseDetails(responseDetails);
			forgetResp.setValidUesr(false);
		}
		
		return forgetResp;
	}

}
