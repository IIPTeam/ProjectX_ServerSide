package com.hsbc.group.iip.x.common.model;

import org.springframework.stereotype.Component;

/**
 * CsStaff entity. @author MyEclipse Persistence Tools
 */

@Component
public class CsStaff implements java.io.Serializable {

	// Fields

	private String csStaffId;
	private String csEhrStaffId;
	private String csCsStaffId;
	private String csCnName;
	private String csEnName;
	private String csPhoneNumber;
	private String csPassword;
	private String csMailBox;

	// Constructors

	/** default constructor */
	public CsStaff() {
	}

	/** full constructor */
	public CsStaff(String csEhrStaffId, String csCsStaffId, String csCnName,
			String csEnName, String csPhoneNumber, String csPassword,
			String csMailBox) {
		this.csEhrStaffId = csEhrStaffId;
		this.csCsStaffId = csCsStaffId;
		this.csCnName = csCnName;
		this.csEnName = csEnName;
		this.csPhoneNumber = csPhoneNumber;
		this.csPassword = csPassword;
		this.csMailBox = csMailBox;
	}

	// Property accessors

	public String getCsStaffId() {
		return this.csStaffId;
	}

	public void setCsStaffId(String csStaffId) {
		this.csStaffId = csStaffId;
	}

	public String getCsEhrStaffId() {
		return this.csEhrStaffId;
	}

	public void setCsEhrStaffId(String csEhrStaffId) {
		this.csEhrStaffId = csEhrStaffId;
	}

	public String getCsCsStaffId() {
		return this.csCsStaffId;
	}

	public void setCsCsStaffId(String csCsStaffId) {
		this.csCsStaffId = csCsStaffId;
	}

	public String getCsCnName() {
		return this.csCnName;
	}

	public void setCsCnName(String csCnName) {
		this.csCnName = csCnName;
	}

	public String getCsEnName() {
		return this.csEnName;
	}

	public void setCsEnName(String csEnName) {
		this.csEnName = csEnName;
	}

	public String getCsPhoneNumber() {
		return this.csPhoneNumber;
	}

	public void setCsPhoneNumber(String csPhoneNumber) {
		this.csPhoneNumber = csPhoneNumber;
	}

	public String getCsPassword() {
		return this.csPassword;
	}

	public void setCsPassword(String csPassword) {
		this.csPassword = csPassword;
	}

	public String getCsMailBox() {
		return this.csMailBox;
	}

	public void setCsMailBox(String csMailBox) {
		this.csMailBox = csMailBox;
	}

}