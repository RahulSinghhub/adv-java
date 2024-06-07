package com.app.utils;

import java.time.LocalDate;
import java.util.List;

import com.app.custmanage.Customer;
import com.app.custmanage.ServicePlan;
import com.app.custom_exception.CustomException;

public class CustomValidation {
	
	public static Customer validateInputs(String firstname,String lastname,String email,String password, Double registrationAmount,String dob,ServicePlan plan, int id,List<Customer> customer ) {
		dupCustom( email, customer);
		ServicePlan servicePlan = validatePlan(plan, registrationAmount);
		LocalDate bithDate = LocalDate.parse(dob);
		return new Customer(firstname, lastname, email, password, registrationAmount, bithDate, servicePlan,id);
	}
	
	//add a method to check for duplicates customer by email
	public static void dupCustom(String email,List<Customer> customList) throws CustomException{
		//i would check using email and pass the customer array 
		// we use list in place of array list because ..
		Customer newcust = new Customer(email);
		if(customList.contains(newcust)) {
			throw new CustomException("these are duplicates amount");
		}
	}

	//registration amount and validate plan   
	//
	//registration amount code where we take in input and the return boolean value 
	//weather the amount is valid or not .boolean , void
	public static void registerAmt(ServicePlan servPlan,double amt) throws CustomException{
		if(amt<servPlan.getMinPlan())
			throw new CustomException("Min balance criteria not met");
		System.out.println("met amount condition");		
	}
	
	//program for validating plan
	//weather the plan choosen is same as provided in the enum service plans
	//take string as input and take array as input
	public static ServicePlan validatePlan(ServicePlan plan, double regAmount) throws CustomException {
		ServicePlan servicePlan = ServicePlan.valueOf(plan.toUpperCase());
		if (servicePlan.getMinPlan() == regAmount)
			return servicePlan;
		throw new CustomException("choose the correct amount");
	}
	
	public static LocalDate parse(String date) {
		return LocalDate.parse(date);
	}
	
	
	
	
	
}
