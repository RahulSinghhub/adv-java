package tester;

import java.util.Iterator;

public class MyClass extends Thread{
	//mandatory to override run method
	
	public MyClass(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}

	/*
	 * rule method overriding and exception handling
	 * overriding form of the method (sub class version )
	 * can not throw any new broader checked exception
	 * 
	 * 
	 */
	@Override
	public void run() /*throws InterruptedException*/ {
		System.out.println(getName()+"started");
		//-------------business logic
		try {
		for(int i=0;i<10;i++) {
			System.out.println(getName()+"exec");
			Thread.sleep(500);
		}
		}catch(Exception e) {
			System.out.println(getName()+"got exec "+e);
		}
		System.out.println(getName()+"over");
		
		
	}
}
