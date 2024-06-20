package com.app.core;

public class User {
	private String email;
	private String password;
	private UserAuth user;
	

	public UserAuth getUser() {
		return user;
	}
	public void setUser(UserAuth user) {
		this.user = user;
	}
	public User(String email, String password, UserAuth user) {
		super();
		this.email = email;
		this.password = password;
		this.user = user;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + "]";
	}
	
	
	

}
