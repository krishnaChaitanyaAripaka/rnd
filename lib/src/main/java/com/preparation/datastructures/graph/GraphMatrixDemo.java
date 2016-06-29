package com.preparation.datastructures.graph;

/**
 * Created by m.susmitha on 6/24/16.
 */
public class GraphMatrixDemo {

	public static void main(String[] s) {
		//using matrix
		GraphMatrix graph = new GraphMatrix(5);
		graph.addEdge(0, 3);

		graph.addEdge(0, 4);
		graph.addEdge(1, 2);
		graph.addEdge(1, 4);

		graph.addEdge(2, 4);
		graph.addEdge(3, 4);
		graph.removeEdge(0, 3);


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

		//using list

//		GraphAdjacencyList<String> al = new GraphAdjacencyList();
//		al.addEdge("rami", "chaitu");
//		al.addEdge("rami", "krishnaveni");
//
//		al.addEdge("koti", "chaitu");
//		al.addEdge("koti", "susmi");
//		al.addEdge("koti", "nagesh");
//
//		al.addEdge("chaitu", "swathi");
//
//		al.addEdge("susmi", "rambabu");
//
//		al.inEdges("rami");
//		al.inEdges("koti");
//		al.inEdges("chaitu");
//		al.inEdges("susmi");
//
//
//		al.outEdges("rami");
//		al.outEdges("koti");
//		al.outEdges("chaitu");
//		al.outEdges("susmi");
//
//		al.removeEdge("rami", "krishnaveni");
//		al.outEdges("rami");

		GraphAdjacencyList<Integer> al = new GraphAdjacencyList();

		al.addEdge(0, 3);
		al.addEdge(0, 4);

		al.addEdge(1, 2);
		al.addEdge(1, 4);

		al.addEdge(2, 4);
		al.addEdge(3, 4);

		al.removeEdge(0, 3);

		al.inEdges(0);
		al.inEdges(1);
		al.inEdges(2);
		al.inEdges(3);
		al.inEdges(4);

		al.outEdges(0);
		al.outEdges(1);
		al.outEdges(2);
		al.outEdges(3);
		al.outEdges(4);

	}
}
