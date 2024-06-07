package com.app.tester;
import java.sql.*;
import static com.app.utils.DBUtils.openConnection;

public class TestDBConnection {

	public static void main(String[] args) {
		try(Connection cn=openConnection();//get db connection
				Statement st=cn.createStatement();//create empty statement to hold sql
				//execute select query and get the 
				ResultSet rst = st.executeQuery("select * from users order by email desc")
				) {
			//resultset processing 
			//cursor --> before the 1st row
			while (rst.next()) {
			     System.out.printf(" id %d first_name %s last_name %s email %s"
			     		+ "	password %s dob %s status %b role %s %n",rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getDate(6),rst.getBoolean(7),rst.getString(8));	
				/*| id | first_name | last_name | email   
				| password | dob        | status | role*/
			}
//			System.out.println("connected to DB "+cn);//implementation class instance 
		}//JVM : cn.close()
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
