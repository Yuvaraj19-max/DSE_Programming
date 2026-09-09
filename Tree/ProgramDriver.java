package Tree;

public class ProgramDriver {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
	Node root = null;
	new Node(10);
	if(root == null) {
		root = new Node(10);
	}
	if(root == null) {
		root = new Node(20);
	}
	else {
		root.left = new Node(20);
	}
	if(root == null) {
		root = new Node(30);
	}
	else {
		root.right = new Node(30);
	}
	if(root == null) {
		root = new Node(30);
	}
	else {
		root.left.left = new Node(40);
	}
	if(root == null) {
		root = new Node(30);
	}
	else {
		root.left.right = new Node(50);
	}
	
	System.out.println(root.data);
	System.out.println(root.left.data);
	System.out.println(root.right.data);
	System.out.println(root.left.left.data);
	System.out.println(root.left.right.data);
		
}
}
