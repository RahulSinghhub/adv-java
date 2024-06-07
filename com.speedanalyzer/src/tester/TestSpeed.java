package tester;


import java.util.Scanner;



public class TestSpeed {
	
	public static void main(String[] args) {
		try(Scanner in = new Scanner(System.in)){
			System.out.println("enter the speed of vechicle");
			validateSpeed(in.nextInt());
			System.out.println("move ");
		}
		catch(Exception ee){
			System.out.println(ee.getMessage());
		}
		System.out.println("now signinig off");
	}

	

}
