package GraphTransversals;

import java.util.ArrayList;

public class Node {
	int label;
	ArrayList<Node> adjList = new ArrayList<Node>();
	boolean visited;
	int pre;
	int post;
	
	Node(int l){
		label = l;
	}
	
	public int dfs(int visit) {
		System.out.println(label + " ");
		visited = true;
		pre = visit;
		for(int j=0;j<adjList.size();j++) {
			if(!adjList.get(j).visited) {
				visit = adjList.get(j).dfs(++visit);
			}
		}
		post = ++visit;
		return visit;
	}
	
	
	
}
