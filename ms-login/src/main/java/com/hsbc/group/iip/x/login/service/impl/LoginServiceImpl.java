package com.hsbc.group.iip.x.login.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsbc.group.iip.x.common.model.CsStaff;
import com.hsbc.group.iip.x.common.model.PersonalAvailableLeave;
import com.hsbc.group.iip.x.common.model.Project;
import com.hsbc.group.iip.x.common.model.ResponseDetail;
import com.hsbc.group.iip.x.dao.ProjectDao;
import com.hsbc.group.iip.x.dao.UserDao;
import com.hsbc.group.iip.x.leavedao.dao.LeaveDao;
import com.hsbc.group.iip.x.login.beans.LoginRequest;
import com.hsbc.group.iip.x.login.beans.LoginResponse;
import com.hsbc.group.iip.x.login.beans.model.ResponseInfo;
import com.hsbc.group.iip.x.login.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginResponse loginResp;
	
	@Autowired
	private UserDao userDao;

	@Autowired
	private ProjectDao projectDao;
	
	@Autowired
	private LeaveDao leaveDao;
	
	@Autowired
	private ResponseDetail responseDetail;
	
	@Autowired
	private ResponseInfo responseInfo;
	
	@Override
	public LoginResponse login(LoginRequest loginReq) {
		
		String account = loginReq.getRequestInfo().getAccount();
		String password = loginReq.getRequestInfo().getPassword();
		
		CsStaff staff = userDao.findUserById(account);
		
		if(null!=staff){
			if(password.equals(staff.getCsPassword())){
				responseInfo.setLoginIndication(true);
				responseInfo.setResponseCode("0");
				loginResp.setResponseInfo(responseInfo);
				loginResp.setResponseDetail(getResponseDetail(staff));
				return loginResp;
			}
		}
		responseInfo.setLoginIndication(false);
		responseInfo.setResponseCode("1");
		loginResp.setResponseInfo(responseInfo);
		return loginResp;
	}

	private ResponseDetail getResponseDetail(CsStaff staff) {
			responseDetail.setProjects(getProjectsByUserId(staff.getCsStaffId()));
			responseDetail.setAvailableLeaves(getAvailableLeafeByUserId(staff.getCsStaffId()));
			responseDetail.setCn_name(staff.getCsCnName());
			responseDetail.setEn_name(staff.getCsEnName());
			responseDetail.setEhr_staffId(staff.getCsEhrStaffId());
			responseDetail.setCs_staffId(staff.getCsStaffId());
			responseDetail.setMail(staff.getCsMailBox());
			
		return responseDetail;
	}

	private Map<String, PersonalAvailableLeave> getAvailableLeafeByUserId(String csStaffId) {
		
		return leaveDao.getAvailableLeaveByUserId(csStaffId);
	}

	private List<Project> getProjectsByUserId(String account) {
		
		return projectDao.findProjectByUserId(account);
	}

}
