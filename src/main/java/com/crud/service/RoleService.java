package com.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.entity.Role;
import com.crud.repo.RoleDao;

@Service
public class RoleService {
	@Autowired
	private RoleDao roleDao;
	
	
	public Role createRole(Role role) {
		return roleDao.save(role);
	}

}
