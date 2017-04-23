package com.hsbc.group.iip.x.leave.beans.model;

import org.springframework.stereotype.Component;

import com.hsbc.group.iip.x.leavedao.model.Leave;

@Component
public class RequestInfo {
	
	private Leave leave;

	public Leave getLeave() {
		return leave;
	}

	public void setLeave(Leave leave) {
		this.leave = leave;
	}
	
	
}
