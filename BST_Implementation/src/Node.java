public class Node {
	public int data;
	Node left;
	Node right;
	public Node(int key) {
		this.data = key;
	}
	
	public void Insert(int key) {
		if(key < data) {
			if(left == null) {
				left = new Node(key);
			}
			else {
				left.Insert(key);
			}
		}
		else {
			if(right == null) {
				right = new Node(key);
			}
			else {
				right.Insert(key);
			}
		}
	}
	
	public boolean Search(int key) {
		if(data == key) {
			return true;
		}
		else if(key < data && left != null) {
			return left.Search(key);
		}
		else if(key > data && right != null) {
			return right.Search(key);
		}
		else {
			return false;
		}
	}
	
	public void Preorder() {
		System.out.print(data + " ");
		if(left != null) {
			left.Preorder();
		}
		if(right != null) {
			right.Preorder();
		}
		
	}
	
	public void Inorder() {
		if(left != null) {
			left.Inorder();
		}
		System.out.print(data + " ");
		if(right != null) {
			right.Inorder();
		}
		
	}
	
	public void Postorder() {
		if(left != null) {
			left.Postorder();
		}
		if(right != null) {
			right.Postorder();
		}
		System.out.print(data + " ");
		
	}
	
	
	
}
