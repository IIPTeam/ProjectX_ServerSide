package com.hsbc.group.iip.x.resetpassword.service;

import com.hsbc.group.iip.x.resetpassword.beans.ResetPasswordRequest;
import com.hsbc.group.iip.x.resetpassword.beans.ResetPasswordResponse;

public interface ResetPasswordService {
	
	ResetPasswordResponse resetPaswrd(ResetPasswordRequest request);
}
