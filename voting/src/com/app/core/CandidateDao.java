package com.app.core;

import java.sql.SQLException;

public interface CandidateDao {
	//email and password needs to be authenticated
	//
	String getDetails(String email,String password) throws SQLException;
	

}
