package testprac;

public class LinkedList {
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
			head = newNode;
			return false;
		}
		Node temp = head;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(newNode);
		return true;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + "->");
			temp = temp.getNext();
		}
		System.out.println();
	}

	public boolean insert(int data, int pos) {
		Node newNode = new Node(data);

		if ((pos <= 0) || (head == null && pos > 1)) {
			return false;
		}

		if (pos == 1) {
			newNode.setNext(head);
			head = newNode;
			return true;
		}
		Node prev = head;
		for (int i = 0; i < pos - 1; i++) {
			prev = prev.getNext();
			if (prev == null) {
				return false;
			}
		}
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);

		return true;
	}

	// delete the node
	@SuppressWarnings("unused")
	public void delete(int data) {
		Node newNode = new Node(data);
		if (newNode == null) {
			return;
		}
		if (head.getData() == data) {
			head = head.getNext();
			return;
		}
		Node temp = head;
		Node prev = head;
		while (temp.getData() != data) {
			prev = temp;
			if (temp.getNext() == null) {
				return;
			}
			temp = temp.getNext();

		}
		prev.setNext(temp.getNext());
	}

	public void deleteByPos(int pos) {
		if (head == null) {
			return;
		}
		if (pos < 0) {
			return;
		}
		if(pos==0) {
			head=head.getNext();
			return;
		}
				 Node prev = head;
				 for(int i=0;i<pos-1;i++) {
					 prev = prev.getNext();
				 }
				 prev.setNext(prev.getNext().getNext());
	}
	
	//count the element
	public void count() {
		int count = 0;
		Node temp=head;
		while(temp!=null) {
			++count;
			temp=temp.getNext();
		}
		System.out.println("count:="+(count+1));
	}
	
	//remove duplicates
/*	public void removeDuplicates() {
		Node curr = head.getNext();
		Node prev = head;
		if(head==null) {
			return;
		}
		while(curr!=null) {
			
		*///}

	//}
	
	//find the middle element
	public void middleElement() {
		if (head == null) {
	        System.out.println("The list is empty.");
	        return;
	    }

		Node temp = head;
		Node mid = head;
		int count=0;
		while(temp!=null && temp.getNext()!=null) {
			mid = mid.getNext();
			temp=temp.getNext().getNext();
			count++;
		}
		
		System.out.println(mid.getData());
	}
	
	//search an element by value
	public void search(int data) {
		if(head == null) {
			return ;
		}
		int count = 0;
		Node temp = head;
		while(temp!=null) {
			++count;
			if(temp.getData()==data) {
				System.out.println(count);
				break;
			}
			
			
			temp=temp.getNext();
		}
	}
	
	public void maxmin() {
		if(head == null) {
			return ;
		}
		int max=head.getData();
		int min=head.getData();
		Node temp = head;
		while(temp!=null) {
			if(temp.getData()>max) {
				max=temp.getData();
			}
			if(temp.getData()<min) {
				min=temp.getData();
			}
			temp=temp.getNext();
			
		}
		System.out.println("max="+max+" min="+min);
				
	}
	
	public boolean sort() {
		if(head==null) {
			return false;
		}
		boolean swapped;
		do {
			swapped = false;
			Node curr = head;
			while(curr!=null && curr.getNext()!=null) {
				if(curr.getData()>curr.getNext().getData()) {
					int temp = curr.getData();
					curr.setData(curr.getNext().getData());
					curr.getNext().setData(temp);
					swapped =true;
				}
				curr = curr.getNext();
			}
			
		}while(swapped);
		return true;
		
	}
	

}
