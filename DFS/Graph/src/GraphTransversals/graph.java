package GraphTransversals;

public class graph {
	Node[] node;
	int size;
	
	graph(int n){
		size = n;
		node = new Node[size];
		for(int i=0;i<size;i++) {
			node[i] = new Node(i);
		}
	}
	void addEdge(int from,int to) {
		node[from].adjList.add(node[to]);
	}
	void dfs() {
		int visit = 0;
		for(int i=0;i<size;i++) {
			if(!node[i].visited) {
				visit = node[i].dfs(++visit);
			}
		}
	}
	
	public void print() {
		for(int i=0;i<size;i++) {
			System.out.println(node[i].label + " " + node[i].pre + "," + node[i].post);
			System.out.println();
		}
	}
	
	
}
