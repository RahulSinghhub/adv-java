package mergeLinkList;

public class LinkedList {
	// 1.Java Program To Merge A Linked List Into Another Linked List At Alternate
	// Positions
	// first i am going to insert in 1 linked list
	// then i am going to insert and make another linked list
	// then i would merge them alternatively
	// linkeed list should be of same size
	private Node head;

	public Node getHead() {
		return head;
	}

	public LinkedList() {
		head = null;
	}

	public boolean insert(int data) {
		Node newNode = new Node(data);
		

		if (head == null) {
			// for empty linkedlist
			head = newNode;
			return true;
		}

		Node temp = head;
		
		  /*if(head.getData()==data) {
			  return true;*/
			  //if the first element is duplicate //since it
		  //doesnot concern itself itself with duplicates i can skip the process
		  
		  //}
		  while(temp.getNext()!=null) {
	    		temp = temp.getNext();
				/*
				 * if(temp.getData()==data) { return true; }
				 */
	    		
	    	}
		  
		 
		temp.setNext(newNode);
		return true;
	}

	//for displaying the values
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + "->");
			temp = temp.getNext();
		}
		System.out.println();
	}
	
	
	
	public  void insertLinkalt(LinkedList list1, LinkedList list2) {
		Node temp1=list1.getHead();
		Node temp2=list2.getHead();
		while(temp1!=null || temp2!=null) {
			System.out.print(temp1.getData()+"->"+temp2.getData()+"->");
			temp1 = temp1.getNext();
			temp2= temp2.getNext();
		}
		
	}
	
	//inserting the node at a particular position
	//i would need the node and the position
	@SuppressWarnings("unused")
	public boolean insert(int data,int pos) {
		Node temp = head;
		//newnode make it
		Node newNode = new Node(data);
		if(newNode==null) {
			return false;
		}
		
		if(head==null) {
			return false;
		}
		
		//if position is 1 then 
		if(pos==1) {
			newNode.setNext(head);
			head=newNode;
			return true;
		}
		//made a new node for insertion
		Node prev = head;
		for(int i=1;i<pos-1;i++) {
			prev = prev.getNext();
			if(prev==null) {
				return false;
			}	
		}
		
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		return true;
		
		
	}
	
	//we learned two ways to reverse the linked list 
	//m1 recursion
	public void displayreverse(Node temp) {
		if(temp==null) {
			System.out.println();
			return;
		}
		
		displayreverse(temp.getNext());
		System.out.println(temp.getData()+" ");
		
		
		
	}
	
	/*
	 * public void middleElement() { System.out.println("hi"); Node temp = head; int
	 * count=1; while(temp!=null) { count++; temp = temp.getNext();
	 * 
	 * } int num = 0; System.out.println(); System.out.println(0); for(int
	 * i=1;i<count/2;i++) { System.out.println(num); num = temp.getData(); }
	 * System.out.println(num); }
	 */
	
	

}
