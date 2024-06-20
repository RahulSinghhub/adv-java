package binarysearchtree;

public class Node {
	private int data;
	Node root;
	Node left;
	Node right;
	
	public Node(int data) {
		this.root=null;
		this.data=data;
		this.left=this.right=null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}
	

}
