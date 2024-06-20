package com.app.tester;

import java.time.LocalDate;
import java.util.Scanner;

import com.app.core.Employee;
import com.app.core.PartTimeEMp;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)){
			PartTimeEMp e1=new PartTimeEMp(200,new Employee("Rahul",LocalDate.parse("2022-02-02"), 2, 3, 5));
			PartTimeEMp e2=new PartTimeEMp(4400,new Employee("Rahdddul",LocalDate.parse("4022-02-02"), 29,43, 65));
			System.out.println(e1);
			System.out.println(e2);
			
		}

	}

}
