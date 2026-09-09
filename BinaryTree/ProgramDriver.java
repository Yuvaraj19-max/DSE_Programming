package BinaryTree;

public class ProgramDriver {
public static void main(String[] args) {
	BinarySearchTree bst = new BinarySearchTree();
	bst.root = bst.insert(bst.root, 50);
	bst.insert(bst.root, 20);
	System.out.println(bst.root.data);
	System.out.println(bst.root.left.data);
}
}
