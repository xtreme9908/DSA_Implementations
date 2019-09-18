package GraphTransversals;

public class Driver {

	public static void main(String[] args) {
		graph h = new graph(6);
		h.addEdge(0, 1);
		h.addEdge(3, 2);
		h.addEdge(4, 3);
		h.addEdge(2, 5);
		h.addEdge(1, 4);
		System.out.println();
		h.dfs();
		h.print();
		
	}
}
