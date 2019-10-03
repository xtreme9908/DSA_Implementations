public class Driver {
	public static void main(String[] args) {
		bst tree = new bst();
		tree.Insert(5);
		tree.Insert(34);
		tree.Insert(2);
		tree.Insert(8);
		tree.Insert(45);
		tree.Insert(44);
		tree.Insert(9);
		tree.Inorder();
		System.out.println();
		tree.Preorder();
		System.out.println();
		tree.Postorder();
		System.out.println();
		tree.Levelorder();
		tree.Delete(4);
		System.out.println();
		tree.Inorder();
		

	}
}



