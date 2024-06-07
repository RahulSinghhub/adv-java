package com.app.utils;

import com.app.core.Customer;
import com.app.core.ServPlan;
import com.app.custom_exceptions.CustomException;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class CustomValidations {
	public static Customer validateCustomerInput(String firstName,String LastName,String email,String password,
			double regAmt,String dob,String plan,Map<String,Customer> list) throws CustomException 
	{
		
		checkDuplicatesCustomer(email,list);
		ServPlan serviceplan = parseAndValidateService(plan,regAmt);
		LocalDate date = LocalDate.parse(dob);
		return new Customer(firstName,LastName,email,password,regAmt,date,serviceplan);
	}
	
	//password authentication
	public static void validatePassword(String password) throws CustomException {
		
	}
	
	//parse and validate dob
//	public static LocalDate parseAndValidateDob(String dob )throws CustomException {
//		LocalDate date = LocalDate.parse(dob);
//		int 
//	}

	

	private static ServPlan parseAndValidateService(String plan, double regAmt) throws CustomException {
		// TODO Auto-generated method stub
		ServPlan servplan = ServPlan.valueOf(plan.toUpperCase());
		if(servplan.getMinAmt()<regAmt)
			throw new CustomException("insufficient balance");
		throw new CustomException("plan doesnot exist");
		
	}
	

	public static void checkDuplicatesCustomer(String email,Map<String,Customer> list) throws CustomException {
		// TODO Auto-generated method stub
		Customer checkEmail = list.get(email);
		if(checkEmail==null)
			throw new CustomException("Email already exist");
		System.out.println("Email check is passed");
		
		
	}
	
	public static Customer authenticateUser(String email,String password,Map<String,Customer> list) throws CustomException {
		Customer emailCheck = new Customer(email);
		int index = list.indexOf(emailCheck);
		if(index==-1)
			throw new CustomException("email not found");
		Customer customer = list.get(index);
		if(customer.getPassword().equals(password))
			return customer;
		throw new CustomException("invalid password");
		}
	
	public Map<String,Customer> 
	
	
}
