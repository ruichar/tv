package com.tv.mapper;

import java.util.List;

import com.tv.entity.ActRole;

public interface ActRoleMapper 
{
	ActRole findRoleById(int id);
	void deleteRoleById(int id);
	void insertRole(ActRole role);
	void updateRole(ActRole role);
	List<ActRole>findAllRole();
}
