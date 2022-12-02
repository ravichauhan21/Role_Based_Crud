package com.crud.entity;

public class JwtResponse {
	private User user;
	private String jwtToekn;
	
	

	public JwtResponse(User user, String jwtToekn) {
		super();
		this.user = user;
		this.jwtToekn = jwtToekn;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getJwtToekn() {
		return jwtToekn;
	}

	public void setJwtToekn(String jwtToekn) {
		this.jwtToekn = jwtToekn;
	}

}
