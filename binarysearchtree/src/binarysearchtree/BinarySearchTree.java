package binarysearchtree;

import java.util.Stack;

public class BinarySearchTree {
	private Node root;
	public BinarySearchTree() {
		this.root= null;
		
	}
	
	@SuppressWarnings("unused")
	public boolean insert(int data)
	{
		//make a new node to insert in binary data
		
		Node newNode = new Node(data);
		if(newNode==null) {
			return false;
		}
		
		if(root == null){//if we have an empty tree
			root=newNode;
			return true;
		}
		
		//for making a bst we need to insert element at the left and right of the code so
		Node temp = root;
		
		while(true) {
			if(data == temp.getData()) {
				return false;
			}
			if(data<temp.getData()) {
				if(temp.getLeft()==null) {
					temp.setLeft(newNode);
					return true;
				}
				temp=temp.getLeft();
			}else 
			{
				
				
					if(temp.getRight()==null)
					{
						temp.setRight(newNode);
						return true;
					}
					temp=temp.getRight();
				
			    }
            }
		
		
	}
	
	public void preorder() {
		Node temp = root;
		System.out.println("preorder");
		Stack<Node> stack = new Stack<>();
		while(temp!=null || !stack.empty()) {
			while(temp!=null) {
				System.out.print(temp.getData()+"-> ");
				stack.push(temp);
				temp = temp.getLeft();
			}
			temp = stack.pop().getRight();
		}
		System.out.println();
	}
	
	
	public void inorder() {
		Node temp = root;
		System.out.println("inorder");
		//inorder we use left parent right
		Stack<Node> stack = new Stack<>();
		while(temp!=null || !stack.empty())
		{
			while(temp!=null) 
			{
				stack.push(temp);
				temp = temp.getLeft();
			}
			temp = stack.pop();
			System.out.print(temp.getData()+" ->");
			temp = temp.getRight();
			
		}
		System.out.println();
	}
	  public void postorder() {
	    //make a temp node for root 
		  //left right parent
		  System.out.println("postorder");
		 
		  class Pair{
			  Node node;
			  char flag;
			  public Pair(Node node, char flag) {
				  this.node=node;
				  this.flag=flag;
			  }
		  }
		  
		  Stack<Pair> stack = new Stack<>();
		  Node temp = root;
		  while(temp!=null || !stack.empty()) {
			  while(temp!=null) {
				  stack.push(new Pair(temp,'l'));
				  temp = temp.getLeft();
			  }
			  Pair pair = stack.pop();
			  if(pair.flag=='l') {
				  temp = pair.node.getRight();
				  pair.flag='R';
				  stack.push(pair);
			  }else {
				  System.out.print(pair.node.getData()+" ");
			  }
		  }
		  System.out.println();
	    }
	
	 }

