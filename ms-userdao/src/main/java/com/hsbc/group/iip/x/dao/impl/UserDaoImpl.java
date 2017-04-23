package com.hsbc.group.iip.x.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.hsbc.group.iip.x.common.model.CsStaff;
import com.hsbc.group.iip.x.dao.UserDao;

@Service
public class UserDaoImpl implements UserDao{

	@Autowired
	private CsStaff staff;
	
	@Override
	public CsStaff findUserById(String account) {
		if(StringUtils.isEmpty(account)){
			return null;
		}
		
		staff.setCsCnName("李达康");
		staff.setCsEhrStaffId("E000b05657");
		staff.setCsStaffId("44888890");
		staff.setCsEnName("Mark");
		staff.setCsPassword("12345678");
		staff.setCsMailBox("lidakang@chinasofti.com");
		staff.setCsPhoneNumber("13888889");
		
		return staff;
	}

}
