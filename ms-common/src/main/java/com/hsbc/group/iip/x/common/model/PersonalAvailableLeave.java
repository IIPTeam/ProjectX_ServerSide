package com.hsbc.group.iip.x.common.model;

import org.springframework.stereotype.Component;

@Component
public class PersonalAvailableLeave {
	
	private String leaveType;
	
	private String avialableTime;
	
	private String staffId;

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public String getAvialableTime() {
		return avialableTime;
	}

	public void setAvialableTime(String avialableTime) {
		this.avialableTime = avialableTime;
	}

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	
	
	
}
