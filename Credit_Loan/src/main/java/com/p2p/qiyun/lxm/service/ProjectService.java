package com.p2p.qiyun.lxm.service;

import java.util.List;

import com.p2p.qiyun.lxm.domain.Balancelxm;
import com.p2p.qiyun.lxm.domain.Project;

public interface ProjectService {
	List<Project> selProject();
	Project selProjectById(int pid);
	Balancelxm selBalance(int uid);
}
