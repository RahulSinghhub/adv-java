package com.app.vechicle;
import java.util.Scanner;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)){
			boolean exit = true;
			while(!exit) {
				System.out.println("Choose from the options \n 1.Add new Vechicle \n 2.drive a vehicle");
				switch(sc.nextInt()) {
				case 1:System.out.println("Add user to the database");
				       
					break;
				case 2:
					break;
				default:System.out.println("Enter a valid input");
				}
				
				
			}
		}

	}

}
