package com.hsbc.group.iip.x.leave.action;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.group.iip.x.leave.beans.LeaveRequest;
import com.hsbc.group.iip.x.leave.beans.LeaveResponse;

@RestController
public class LeaveAction {
	
	public LeaveResponse leave(final @RequestBody LeaveRequest leaveRequest){
		
		return null;
	}
	
}
