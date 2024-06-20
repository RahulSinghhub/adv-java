package com.app.utils;

import java.util.ArrayList;
import java.util.List;

import com.app.core.User;
import com.app.core.UserAuth;

public class Utility {
	/*
	 * Admin User (loginId=admin, password = admin) Customer (loginId=c1,
	 * password=c1)
	 */
	
	public static List<User> populateUser(){
		List<User> userList = new ArrayList<>();
		userList.add(new User("admin","admin",UserAuth.valueOf("ADMIN")));
		userList.add(new User("C1","C1",UserAuth.valueOf("CUSTOMER")));
		
		return userList;
	}

}
