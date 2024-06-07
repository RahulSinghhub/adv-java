package com.app.dao;

import java.sql.*;
import static com.app.utils.DBUtils.*; 

public class AccountDaoImpl implements AccountDao {
//state
	private Connection cn;
	private CallableStatement cst1;
	//def ctr
	public AccountDaoImpl() throws SQLException {
		// TODO Auto-generated constructor stub
		//get db cn from DB utils
		cn=openConnection();
		//create cst  to invoke the stored procedure
	     cst1=cn.prepareCall("{call transfer_funds_proc(?,?,?,?,?)}");
	     //register out parameter
	     cst1.registerOutParameter(4, Types.DOUBLE);
	     cst1.registerOutParameter(5, Types.DOUBLE);
	     System.out.println("acct dao created");
		
		
	}
	@Override
	public String transferFunds(int srcAcNo, int destAcNo, double amount) throws SQLException {
		// TODO Auto-generated method stub
		// 1 set IN parameters
		cst1.setInt(1, srcAcNo);
		cst1.setInt(2, destAcNo);
		cst1.setDouble(3, amount);
		//execute the procedure
		cst1.execute();
		return "updated source balance "+cst1.getDouble(4)+
				"dest balance "+ cst1.getDouble(5);
	}
	
	public void cleanUp() throws SQLException {
		if(cst1!=null)
			cst1.close();
		closeConnection();
	}

}
