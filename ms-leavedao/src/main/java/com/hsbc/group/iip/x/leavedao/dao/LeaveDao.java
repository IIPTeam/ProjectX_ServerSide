package com.hsbc.group.iip.x.leavedao.dao;

import java.util.Map;

import com.hsbc.group.iip.x.common.model.PersonalAvailableLeave;
import com.hsbc.group.iip.x.leavedao.model.Leave;

public interface LeaveDao {

	Map<String, PersonalAvailableLeave> getAvailableLeaveByUserId(String csStaffId);

	void saveLeave(Leave leave);


}
