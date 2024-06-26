package testprac;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1 = new LinkedList();
		l1.insert(500);
		l1.insert(3);
		l1.insert(40);
		l1.insert(17);
		l1.insert(80);
		l1.insert(2100);
		l1.insert(2100);
	
		l1.insert(7,3);
		l1.display();
		/*
		 * l1.deleteByPos(0); l1.display(); l1.count();
		 */
		//l1.middleElement();
		l1.search(80);
		l1.maxmin();
		l1.sort();
		l1.display();
		
		

	}

}
