package com.app.tester;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc  = new Scanner(System.in))
		{
			
			boolean flag = false;
			while(!flag) 
			{
				try 
				{
				System.out.println("1. Sum of all deposits\r\n"
						+ "2. Max deposit amount\r\n"
						+ "3. Shopping expenses (sum of withdrawals for shopping)\r\n"
						+ "4. Date on which maximum amount withdrawn\r\n"
						+ "0. exit");
				switch(sc.nextInt())
				{
				case 1:System.out.println("Sum of all deposits");
					break;
				case 2:System.out.println("Max deposit amount");
					break;
				case 3:System.out.println("Shopping expenses (sum of withdrawals for shopping)");
					break;
				case 4:System.out.println("Date on which maximum amount withdrawn");
					break;
				case 0:System.out.println("exit");
				       flag=true;
					break;
					
				
				
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
