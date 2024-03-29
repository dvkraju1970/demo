package com.example.demo.vo;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable {
	private String username;
	private String password;
	
	public User() {
		super();
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
