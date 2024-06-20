package com.app.utils;

public class Utility {
	
	public static void populateList() {
		
		validateInput("01-01-2023","Salary Credit",0.0,50000.0);
		validateInput("01-01-2023","Mobile Recharge",300.0,0.0);
	    validateInput("02-01-2023","DTH Recharge",1000.0,0.0);
	    validateInput("02-01-2023","Rent Transfer",11000.0,0);
	    validateInput("02-01-2023","Cashback Paytm",0.0,1000.0);
	    validateInput("05-01-2023","Shopping",5000.0,0.0);
	    validateInput("10-01-2023","Shopping",7000.0,0.0);
	    validateInput("15-01-2023","Cashback",0.0,3000.0);
	    validateInput("25-01-2023","Mobile Purchase",10000.0,0.0);
	    validateInput("31-01-2023","Dining",1200.0,0.0);
	}

}
