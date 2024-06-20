package com.app.tester;

import static com.app.utils.Utility.populateUser;
import static com.app.validation.CustomValidations.validateEmailAndPassword;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.app.core.Category;
import com.app.core.Order;
import com.app.core.Pet;
import com.app.core.User;


public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try(Scanner sc = new Scanner(System.in))
			{
				//there will be two users admin and customer
				//i make two different switch cases for both customer and admin
				Map<Integer, Pet> petList = new HashMap<>();
				Map<Integer,Order> orderList = new HashMap<>();
				boolean flag = false;
				List<User> user = populateUser();
				while(!flag)
				{
					try {
						System.out.println("enter email and password");
						String choice = validateEmailAndPassword(sc.next(),sc.next(),user);
						
						if(choice=="ADMIN") {
							
							
							try {
								
								System.out.println(""
									+ "1. Add new Pet (Admin only functionality)\r\n"
									+ "2. Update Pet details (Admin only functionality)\r\n"
									+ "3. Display all available pets\r\n"
									+ "4. Order a Pet\r\n"
									+ "5. Check order status by Order Id\r\n"
									+ "6. Update order status (Admin only functionality)\r\n"
									+ "0. Exit");
								switch(sc.nextInt()) {
								case 1:System.out.println("Add new Pet");
								       Pet p = new Pet();
								       // petId = 101, name=” Bull Dog”, category= DOG, unitPrice= 1000, stocks=50
								       System.out.println(" String name, Category category, double unitPrice, int stocks");
								       petList.put(p.getPetId(),new Pet(sc.next(),Category.valueOf(sc.next()),sc.nextDouble(),sc.nextInt()));
								       petList.values().stream().forEach(s->System.out.println(s));
									break;
								case 2:System.out.println("Update Pet details");
								      int upetId = sc.nextInt();
								      Pet p1 = petList.replace(upetId,new Pet(sc.next(),Category.valueOf(sc.next()),sc.nextDouble(),sc.nextInt()));
								       petList.values().forEach((x)->System.out.println(x));
								     
									break;
								case 3:System.out.println("Display all available pets");
								      petList.values().forEach((x)->System.out.println(x));
									break;
								case 4:System.out.println("Order a Pet");
								       Pet newpet= new Pet();
								       petList.values().forEach((x)->System.out.println(x));
								       
									break;
								case 5:System.out.println("Check order status by Order Id");
									break;
								case 6:System.out.println("Update order status");
									break;
								case 0:System.out.println("Exit");
									break;
								}
								
							}catch(Exception e) {
								System.out.println("error showing in business logic of switch");
								e.printStackTrace();
							}
							
							
							
							
						}else {
							
							
							
							System.out.println(""
									+ "1. Display all available pets\r\n"
									+ "2. Order a Pet\r\n"
									+ "3. Check order status by Order Id\r\n"
									+ "0. Exit");
							try {
								switch(sc.nextInt()) {
								case 1:System.out.println("Display all available pets");
									break;
								case 2:System.out.println("Order a Pet");
									break;
								case 3:System.out.println("Check order status by Order Id");
									break;
								case 0:System.out.println("Exit");
									break;
								}
								
							}catch(Exception e) {
								System.out.println("error showing in business logic of switch");
								e.printStackTrace();
							}
							
							
						}
						
					}catch(Exception e) {
						e.printStackTrace();
					}
					
					
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}

	}

}
