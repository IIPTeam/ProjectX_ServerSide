package com.hsbc.group.iip.x.common.model;

import org.springframework.stereotype.Component;

@Component
public class User {
	private String staffId;
	private String ehrId;
	private String enName;
	private String cnName;
	private String password;
	private String phoneNumber;
	private String mailbox;
	
	
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	public String getEhrId() {
		return ehrId;
	}
	public void setEhrId(String ehrId) {
		this.ehrId = ehrId;
	}
	public String getEnName() {
		return enName;
	}
	public void setEnName(String enName) {
		this.enName = enName;
	}
	public String getCnName() {
		return cnName;
	}
	public void setCnName(String cnName) {
		this.cnName = cnName;
	}
	public String getMailbox() {
		return mailbox;
	}
	public void setMailbox(String mailbox) {
		this.mailbox = mailbox;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnName == null) ? 0 : cnName.hashCode());
		result = prime * result + ((ehrId == null) ? 0 : ehrId.hashCode());
		result = prime * result + ((enName == null) ? 0 : enName.hashCode());
		result = prime * result + ((mailbox == null) ? 0 : mailbox.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + ((staffId == null) ? 0 : staffId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (cnName == null) {
			if (other.cnName != null)
				return false;
		} else if (!cnName.equals(other.cnName))
			return false;
		if (ehrId == null) {
			if (other.ehrId != null)
				return false;
		} else if (!ehrId.equals(other.ehrId))
			return false;
		if (enName == null) {
			if (other.enName != null)
				return false;
		} else if (!enName.equals(other.enName))
			return false;
		if (mailbox == null) {
			if (other.mailbox != null)
				return false;
		} else if (!mailbox.equals(other.mailbox))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (staffId == null) {
			if (other.staffId != null)
				return false;
		} else if (!staffId.equals(other.staffId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User [staffId=" + staffId + ", ehrId=" + ehrId + ", enName=" + enName + ", cnName=" + cnName
				+ ", password=" + password + ", phoneNumber=" + phoneNumber + ", mailbox=" + mailbox + "]";
	}

	
	
}
