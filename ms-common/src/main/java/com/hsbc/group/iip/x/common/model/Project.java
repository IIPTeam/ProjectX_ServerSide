package com.hsbc.group.iip.x.common.model;

import org.springframework.stereotype.Component;

@Component
public class Project {
	
	private String staffId;
	
	private String projectName;
	
	private String projectId;

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	
	
}
