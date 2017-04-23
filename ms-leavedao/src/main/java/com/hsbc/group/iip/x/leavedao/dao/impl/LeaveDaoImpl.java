package com.hsbc.group.iip.x.leavedao.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.hsbc.group.iip.x.common.model.PersonalAvailableLeave;
import com.hsbc.group.iip.x.leavedao.dao.LeaveDao;
import com.hsbc.group.iip.x.leavedao.model.Leave;

@Service
public class LeaveDaoImpl implements LeaveDao {

	@Override
	public Map<String, PersonalAvailableLeave> getAvailableLeaveByUserId(String csStaffId) {
		if(StringUtils.isEmpty(csStaffId)){
			return null;
		}
		Map<String, PersonalAvailableLeave> availableLeaves = new HashMap<String, PersonalAvailableLeave>();
		PersonalAvailableLeave nLeave = new PersonalAvailableLeave();
		nLeave.setLeaveType("NLeave");
		nLeave.setAvialableTime("40");
		nLeave.setStaffId(csStaffId);
		availableLeaves.put("NLeave", nLeave);
		
		PersonalAvailableLeave tLeave = new PersonalAvailableLeave();
		tLeave.setLeaveType("TLeave");
		tLeave.setAvialableTime("24");
		tLeave.setStaffId(csStaffId);
		availableLeaves.put("TLeave", tLeave);
		return availableLeaves;
	}

	@Override
	public void saveLeave(Leave leave) {
		// TODO Auto-generated method stub
		
	}


}
