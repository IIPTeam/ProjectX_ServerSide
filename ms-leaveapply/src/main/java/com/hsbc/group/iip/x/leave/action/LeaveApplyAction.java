package com.hsbc.group.iip.x.leave.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.group.iip.x.leave.beans.LeaveApplyRequest;
import com.hsbc.group.iip.x.leave.beans.LeaveApplyResponse;
import com.hsbc.group.iip.x.leave.service.LeaveApplyService;

@RestController
public class LeaveApplyAction {
	
	@Autowired
	private LeaveApplyResponse leaveApplyResp;
	
	@Autowired
	private LeaveApplyService leaveApplyService;
	
	@RequestMapping(value="/leaveApply", method=RequestMethod.POST)
	public LeaveApplyResponse leaveApply(final @RequestBody LeaveApplyRequest leaveApplyReq){
		leaveApplyResp = leaveApplyService.leaveApply(leaveApplyReq);
		return leaveApplyResp;
	}
}
