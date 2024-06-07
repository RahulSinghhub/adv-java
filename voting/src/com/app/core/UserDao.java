package com.app.core;

public interface UserDao {
	//authenticate given in email and password
	String authenticateUser(String email,String password) throws ;

}
