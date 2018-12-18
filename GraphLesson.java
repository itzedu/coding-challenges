package hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphLesson {
	public static void main(String[] args) {
		// edge list
		// A list of all the edges in the graph: node 0 is connected to node 1, node 1 is connected to node 2, node 1 is connected to node 3, node 2 is connected to node 3
		int[][] edgeListGraph = {{0, 1}, {1, 2}, {1, 3}, {2, 3}};

		// adjacency list
		// A list where the index represents the node and the value at that index is a list of the node's neighbors
		int[][] adjancencyListGraph = {
				  {1},
				  {0, 2, 3},
				  {1, 3},
				  {1, 2}
		};
		
		// as a hash map
		Map<Integer, List<Integer>> adjancencyListGraphMap = new HashMap<Integer, List<Integer>>() {
			{
				put(0, Arrays.asList(1));
				put(1, Arrays.asList(0, 2, 3));
				put(2, Arrays.asList(1, 3));
				put(3, Arrays.asList(1, 2));
			}
		};
		
		// adjacency matrix
		// A matrix of 0s and 1s indicating whether node x connects to node y (0 means no, 1 means yes).
		int[][] matrixGraph = {
				{0, 1, 0, 0},
				{1, 0, 1, 1},
				{0, 1, 0, 1},
				{0, 1, 1, 0},
		};

	}

}
