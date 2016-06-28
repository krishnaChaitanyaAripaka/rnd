package com.preparation.datastructures;

/**
 * Created by m.susmitha on 6/24/16.
 */
public class GraphMatrixDemo {

	public static void main(String[] s) {
		GraphMatrix<Integer> graph = new GraphMatrix<Integer>(5);
		graph.addEdge(0, 3);

		graph.addEdge(0, 4);
		graph.addEdge(1, 2);
		graph.addEdge(1, 4);

		graph.addEdge(2, 4);
		graph.addEdge(3, 4);


		graph.inEdges(0);
		graph.inEdges(1);
		graph.inEdges(2);
		graph.inEdges(3);
		graph.inEdges(4);

		graph.outEdges(0);
		graph.outEdges(1);
		graph.outEdges(2);
		graph.outEdges(3);
		graph.outEdges(4);


	}
}
