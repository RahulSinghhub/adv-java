package linkedlist;

public class LinkedList {
	private Node head;
    public Node getHead() {
    	return head;
    	
    }
    
    public LinkedList() {
    	head=null;
    }
    
    public boolean insert(int data) {
    	Node newNode = new Node(data);
    	if(newNode == null) 
    	{
    		return false; 	
        }
    	if(head==null)//we have an empty list
    	{
    		head = newNode;
    		return true;
    	}
    	Node temp = head;
    	if(head.getData()==data) {//checks the data for any duplicates with head if yes insertion wont happen
    		return false;
    	}
    	
    	while(temp.getNext()!=null) {
    		temp = temp.getNext();
    		if(temp.getData()==data) {
    			return false;
    		}
    		
    	}
    	temp.setNext(newNode);
    	return true;
    		
    	}
    
       
    //insert at a specific position
    public boolean insertAtPos(int data,int pos) {
    	//check for if list is empty or not and if it is then make sure that
    	//the node is not greater than position
    	
    	
    	return true;
    }
    
    
    
    
       public void display() {
    	   Node temp = head;
    	   while(temp!=null) {
    		   System.out.print(temp.getData()+"->");
    		   temp = temp.getNext();
    	   }
    	   System.out.println();
       }
	

}
