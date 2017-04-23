package com.hsbc.group.iip.x.login.service;

import com.hsbc.group.iip.x.login.beans.LoginRequest;
import com.hsbc.group.iip.x.login.beans.LoginResponse;

public interface LoginService {
	LoginResponse login(LoginRequest loginReq);
}
