package com.app.dao;

import java.sql.SQLException;

public interface AccountDao {

	//add a method for invoking a stored proc from db , to transfer function
	String transferFunds(int srcAcNo , int destAcNo , double amount ) throws SQLException;
		
	
}
