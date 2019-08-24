import java.util.ArrayDeque;

public class bst {
	public Node root;
	
	public void Insert(int key) {
		if(root == null) {
			root = new Node(key);
		}
		else {
			root.Insert(key);
		}
	}
	
	public boolean Search(int key) {
		if(root == null) {
			return false;
		}
		else {
			return root.Search(key);
		}
	}
	
	public void Preorder() {
		if(root == null) {
			return ;
		}
		else {
			root.Preorder();
		}
	}
	
	public void Inorder() {
		if(root == null) {
			return ;
		}
		else {
			root.Inorder();
		}
	}
	
	public void Postorder() {
		if(root == null) {
			return ;
		}
		else {
			root.Postorder();
		}
	}
	
	public void Levelorder() {
		ArrayDeque<Node> Deque = new ArrayDeque<Node>();
		Deque.addLast(root);
		while(!Deque.isEmpty()) {
			Node n = Deque.removeFirst();
			System.out.print(n.data + " ");
			if(n.left != null) {
				Deque.addLast(n.left);
			}
			if(n.right != null) {
				Deque.addLast(n.right);
			}
			System.out.print("");
		}
	}
	
	
	/*public void Delete(int key) {
		root = DeleteRec(root,key);
	}
	public Node DeleteRec(Node root,int key) {
		if(root == null) {
			return root;
		}
		else {
			if(key < root.data) {
				root.left = DeleteRec(root.left,key); 
			}
			else if(key > root.data) {
				root.right = DeleteRec(root.right,key);
			}
			else {
				if(root.left == null) {
					return root.right;
				}
				else if(root.right == null) {
					return root.left;
				}
				else {
					Node temp = root.left;
					while(temp.right != null) {
						temp = temp.right;
					}
					root.data = temp.data;
					root.left = DeleteRec(root.left,temp.data);
				}
				
			}
		}
		return root;
	}*/
	
	
	public void Delete(int key) {
		root = DeleteRec(root,key);
	}
	public Node DeleteRec(Node root,int key) {
		if(root == null) {
			return root;
		}
		else {
			if(key < root.data) {
				root.left = DeleteRec(root.left,key);
			}
			else if(key > root.data) {
				root.right = DeleteRec(root.right,key);
			}
			else {
				if(root.left == null) {
					return root.right;
				}
				else if(root.right== null) {
					return root.left;
				}
				else {
					Node temp = root.left;
					while(temp.right != null) {
						temp = temp.right;
					}
					root.data = temp.data;
					root.left = DeleteRec(root.left,temp.data);
				}
			}
		}
		return root;
	}
	
	
}
