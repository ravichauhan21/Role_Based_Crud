package com.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.Role;
import com.crud.service.RoleService;


@RestController
public class RoleController {
	@Autowired
	private RoleService roleService;
	
	@PostMapping("/createRole")
	public Role createRole(@RequestBody Role role) {
		return roleService.createRole(role);
	}

}
