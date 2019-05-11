package com.p2p.qiyun.lxm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p2p.qiyun.lxm.dao.ProjectMapper;
import com.p2p.qiyun.lxm.domain.Project;
import com.p2p.qiyun.lxm.domain.ProjectExample;

@Service
public class ProjectServiceImpol implements ProjectService {
	@Autowired
	private ProjectMapper promap;
	
	
	
	public List<Project> selProject(){
		List<Project> list = promap.selectByExample(new ProjectExample());
		return list;
	}
	
	public Project selProjectById(int pid) {
		Project project = promap.selectByPrimaryKey(pid);
		return project;
	}
	
	
}
