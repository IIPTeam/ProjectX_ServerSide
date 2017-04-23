package com.hsbc.group.iip.x.common.model;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ResponseDetail {
	
	
	private List<Project> projects;
	
	private Map<String, PersonalAvailableLeave> availableLeaves;
	
	private String  cn_name;
	
	private String en_name;
	
	private String ehr_staffId;
	
	private String cs_staffId;
	
	private String staffId;
	
	private String mail;

	public Map<String, PersonalAvailableLeave> getAvailableLeaves() {
		return availableLeaves;
	}

	public void setAvailableLeaves(Map<String, PersonalAvailableLeave> map) {
		this.availableLeaves = map;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public String getCn_name() {
		return cn_name;
	}

	public void setCn_name(String cn_name) {
		this.cn_name = cn_name;
	}

	public String getEn_name() {
		return en_name;
	}

	public void setEn_name(String en_name) {
		this.en_name = en_name;
	}

	public String getEhr_staffId() {
		return ehr_staffId;
	}

	public void setEhr_staffId(String ehr_staffId) {
		this.ehr_staffId = ehr_staffId;
	}

	public String getCs_staffId() {
		return cs_staffId;
	}

	public void setCs_staffId(String cs_staffId) {
		this.cs_staffId = cs_staffId;
	}

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	
}
