package BinaryTree;

public class BinaryTree {
	public Node root;
	
	public void addNode(int key, String name) {
		Node newNode = new Node(key, name);
	
		if(root==null) {
			root = newNode;
		} else {
			Node refNode = root;
		}
	}
	
}
