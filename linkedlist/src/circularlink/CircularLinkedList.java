package circularlink;

public class CircularLinkedList {
	private ListNode head;
	public ListNode getHead() {
		return head;
	}
	public CircularLinkedList() {
		head=null;
	}
	
	public boolean insertCirc(int data) {
		ListNode newNode = new ListNode(data);
		if(head==null) {
			head=newNode;
			head.next=head;
		
			return false;
		}
		ListNode temp = head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
		newNode.next=head;
		
		
		return true;
		
		
	}
	public void display() {
		if(head==null) {
			return;
			
		}
		ListNode temp = head;
		do {
			System.out.println(temp.val+" ->");
			temp=temp.next;
			
		}while(temp!=head);
		System.out.println();
	}

}
