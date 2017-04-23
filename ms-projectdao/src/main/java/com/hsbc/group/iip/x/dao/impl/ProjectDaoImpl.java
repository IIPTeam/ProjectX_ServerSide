package com.hsbc.group.iip.x.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.hsbc.group.iip.x.common.model.Project;
import com.hsbc.group.iip.x.dao.ProjectDao;

@Service
public class ProjectDaoImpl implements ProjectDao {
	
	@Autowired
	private Project project;
	
	@Override
	public List<Project> findProjectByUserId(String account) {
		List<Project> projects = new ArrayList<Project>();
		if(StringUtils.isEmpty(account)){
			return null;
		}
		
		project.setProjectId("0001");
		project.setStaffId("201704192132");
		project.setProjectName("X");
		projects.add(project);
		
		project.setProjectId("010");
		project.setStaffId("201704192132");
		project.setProjectName("Y");
		projects.add(project);
		
		return projects;
	}

}
