package com.hsbc.group.iip.x.dao;

import java.util.List;

import com.hsbc.group.iip.x.common.model.Project;

public interface ProjectDao {

	List<Project> findProjectByUserId(String account);

}
