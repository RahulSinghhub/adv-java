package com.app.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.custmanage.Customer;
import com.app.utils.CustomValidation.*;

public class CustomerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//try with resources
		try(Scanner in = new Scanner(System.in)){
			List <Customer> customerList = new ArrayList<>(); //size 0 capacity 10
			boolean exit = false;
			while (!exit) {
				System.out.println("choose from the given option \n 1.Sign up\n 2.Sign in \n3.Change password \n4.Un subscribe customer \n5. Display all customers\n 0. Exit \n");
				System.out.println("choose");
				try {
					switch(in.nextInt()) {
					case 1: System.out.println("Sign up form");
					        //ask user for all details then store details in the array also valiodate thre detILA4
					        System.out.println("Enter customer details : firstName,  lastName,  email,  password,	regAmount,  dob,  plan");
					        Customer customer = validateInputs(in.next(), in.next(), in.next(), in.next(),in.nextDouble(), in.next(), in.next(),in.nextInt(), customerList);
					        customerList.add(customer);//collection framework
					        System.out.println("done registering");
					        
					    
					        
					        break;
					        
					case 2: 
						System.out.println("display all customers details");
						   for(Customer c: customerList)
							   System.out.println(c);
					        
					        break;
					case 3:System.out.println("Enter email and password");
					       customer = authenticateCustomer(in.nextInt(),in.nextInt())
						break;
					case 0:exit=true;
					       break;
					         
					}
				
				} catch (Exception e) {
					in.nextLine();
					System.out.println(e);// toString
				}
				}
			}
		}

	}

}
