package Thread_2;

public class Tester {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		//name of thread,priiority,thread group to string 
		//
		System.out.println(Thread.currentThread());
		//create multiple child threads
//		create runnable task instance ie implementation class of r
		//create runnable task instance 
		MyClass runnableTask = new MyClass();
		Thread t1 = new Thread(runnableTask,"one");
		Thread t2 = new Thread(runnableTask,"two");
		Thread t3 = new Thread(runnableTask,"three");
		Thread t4 = new Thread(runnableTask,"four");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		//how many runnable threads
		
	    //how many r
		System.out.println(t1.isAlive()+" "+t4.isAlive());
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" exec "+" Count "+i);
			Thread.sleep(500);
		}
		System.out.println(t1.isAlive()+" "+t4.isAlive());
		System.out.println("main over");
		
		

	}

}
