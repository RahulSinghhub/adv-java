package binarysearchtree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst = new BinarySearchTree();

        bst.insert(50);
        bst.insert(20);
        bst.insert(10);
        bst.insert(40);
        bst.insert(90);
        bst.insert(80);
        bst.insert(60);
        bst.insert(70);
        bst.insert(100);
        bst.insert(90);
        bst.insert(30);

        bst.preorder();
        bst.inorder();
        bst.postorder();
        //

	}

}
