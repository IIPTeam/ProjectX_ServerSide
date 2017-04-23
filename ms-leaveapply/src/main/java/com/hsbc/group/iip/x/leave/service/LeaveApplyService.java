package com.hsbc.group.iip.x.leave.service;

import com.hsbc.group.iip.x.leave.beans.LeaveApplyRequest;
import com.hsbc.group.iip.x.leave.beans.LeaveApplyResponse;

public interface LeaveApplyService {
	LeaveApplyResponse leaveApply(LeaveApplyRequest leaveApplyReq);
}
