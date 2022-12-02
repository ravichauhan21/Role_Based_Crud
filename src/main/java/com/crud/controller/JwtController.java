package com.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.JwtRequest;
import com.crud.entity.JwtResponse;
import com.crud.service.JwtService;

@RestController
@CrossOrigin
public class JwtController {
	
	@Autowired
	private JwtService jwtService;
	
	@PostMapping("/authentication")
	public JwtResponse createJwtToekn(@RequestBody JwtRequest jwtRequest) throws Exception {
		return jwtService.createJwtToken(jwtRequest);
		
	}

}
