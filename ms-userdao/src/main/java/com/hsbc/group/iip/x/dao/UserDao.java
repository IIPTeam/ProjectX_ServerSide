package com.hsbc.group.iip.x.dao;

import com.hsbc.group.iip.x.common.model.CsStaff;

public interface UserDao {

	CsStaff findUserById(String account);

}
