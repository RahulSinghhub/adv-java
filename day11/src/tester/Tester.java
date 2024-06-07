package tester;

public class Tester {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		//name of thread,priiority,thread group to string 
		//
		System.out.println(Thread.currentThread());
		//create multiple child threads
		MyClass t1= new MyClass("one");
		MyClass t2= new MyClass("two");
		MyClass t3= new MyClass("three");
		MyClass t4= new MyClass("four");
		
		//how many runnable threads
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	    //how many r
		System.out.println(t1.isAlive()+" "+t4.isAlive());
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" exec ");
			Thread.sleep(1000);
		}
		System.out.println(t1.isAlive()+" "+t4.isAlive());
		System.out.println("main over");
		
		

	}

}
