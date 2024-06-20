package mergeLinkList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		LinkedList l3 = new LinkedList();
		
		l1.insert(1);
		l1.insert(2);
		l1.insert(3);
		l1.insert(6, 1);

		
		l1.display();
		
		l2.insert(7);
		l2.insert(8);
		l2.insert(9);
		l2.insert(9);
		
		l2.display();
				
		l1.displayreverse(l1.getHead());
	   
	    
	    //l3.insertLinkalt(l1,l2);
	    
	   // l1.middleElement();
		
		
	
		
		
		

	}

}
