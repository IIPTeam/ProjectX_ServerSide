package com.hsbc.group.iip.x.forgetpassword.service;

import com.hsbc.group.iip.x.forgetpassword.beans.ForgetPasswordRequest;
import com.hsbc.group.iip.x.forgetpassword.beans.ForgetPasswordResponse;

public interface ForgetPasswordService {

	ForgetPasswordResponse forgetPaswrd(ForgetPasswordRequest forgetReq);

}
