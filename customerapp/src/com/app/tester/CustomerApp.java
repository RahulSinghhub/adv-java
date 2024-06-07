package com.app.tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import com.app.core.*;
import com.app.custom_exceptions.CustomException;

import static com.app.utils.CustomValidations.*;



public class CustomerApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in))
		{
			boolean exit = false;
			//Customer[] customer = new Customer[sc.nextInt()]; now doing this is not necessary
			List<Customer> customerList = new ArrayList<>();//now we make a list 
			
			while(!exit)
			{
				System.out.println("Options : 1. Customer Sign Up 2. Display all 3.customer login 4.update password 5.delete customer details 0. Exit");
				System.out.println("Choose");
				try 
				{
					switch (sc.nextInt()) {
					case 1:System.out.println("Enter customers details");
					       System.out.println("Enter firstname  lastname  email  password	regAmount  dob  plan");
					       Customer customer = validateCustomerInput(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next(),customerList);
					       customerList.add(customer);
					       System.out.println("Details have been stored");
						
						break;
					case 2://display all the customers details
						    System.out.println("All customers details");
						    for(Customer c:customerList)
						    	System.out.println(c);
				    
					case 3://log in inside for that do authentication
						   //weather the email and the password matches the person
						   System.out.println("custoemr login \n enter your email");
						   customer= authenticateUser(sc.next(),sc.next(),customerList);
						  System.out.println(customer);
						  break;
					case 4:
						//update passworrd
						System.out.println("update password");
						customer = authenticateUser(sc.next(),sc.next(),customerList);
						customer.setPassword(sc.next());
						System.out.println("password set");
					case 5: //delete 
						System.out.println("enter the email to be deleted");
						customer = authenticateUser(sc.next(),sc.next(),customerList);
						customerList.remove(customerList.indexOf(customer));
						break;
					case 6://sort the given customer list
						System.out.println("sort the given list on dob and if dob equals then registration amount");
						Collections.sort((List<T>) customerList);
						break;
						
						
				    
					case 0:exit = true;
					    break;

					default:
						break;
					}
				} catch(Exception e) {
					sc.nextLine();
					System.out.println(e);
				}
				
				
			}
		}
	}
}
