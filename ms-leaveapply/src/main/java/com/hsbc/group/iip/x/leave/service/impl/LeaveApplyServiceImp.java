package com.hsbc.group.iip.x.leave.service.impl;

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
import com.hsbc.group.iip.x.leave.beans.LeaveApplyRequest;
import com.hsbc.group.iip.x.leave.beans.LeaveApplyResponse;
import com.hsbc.group.iip.x.leave.beans.model.ResponseInfo;
import com.hsbc.group.iip.x.leave.service.LeaveApplyService;
import com.hsbc.group.iip.x.leavedao.dao.LeaveDao;

@Service
public class LeaveApplyServiceImp implements LeaveApplyService {

	@Autowired
	private LeaveApplyResponse leaveApplyResp; 
	
	@Autowired
	private LeaveDao leaveDao;
	
	@Autowired
	private ProjectDao projectDao;
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private ResponseDetail responseDetail;
	
	@Autowired
	private ResponseInfo responseInfo;
	
	@Override
	public LeaveApplyResponse leaveApply(LeaveApplyRequest leaveApplyReq) {
		leaveDao.saveLeave(leaveApplyReq.getRequestInfo().getLeave());
		responseInfo.setResponseCode("0");
		leaveApplyResp.setResponseInfo(responseInfo);
		leaveApplyResp.setResponseDetail(getResponseDetail(leaveApplyReq.getRequestInfo().getLeave().getStaffId()));
		return leaveApplyResp;
	}


	private ResponseDetail getResponseDetail(String csStaffId) {
			CsStaff staff = userDao.findUserById(csStaffId);
			responseDetail.setProjects(getProjectsByUserId(csStaffId));
			responseDetail.setAvailableLeaves(getAvailableLeafeByUserId(csStaffId));
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
