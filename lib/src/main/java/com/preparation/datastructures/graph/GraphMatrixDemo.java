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

		//		al.addEdge(0, 3);
		//		al.addEdge(0, 4);
		//
		//		al.addEdge(1, 2);
		//		al.addEdge(1, 4);
		//
		//		al.addEdge(2, 4);
		//		al.addEdge(3, 4);
		//
		//		al.removeEdge(0, 3);
		//
		//		al.inEdges(0);
		//		al.inEdges(1);
		//		al.inEdges(2);
		//		al.inEdges(3);
		//		al.inEdges(4);
		//
		//		al.outEdges(0);
		//		al.outEdges(1);
		//		al.outEdges(2);
		//		al.outEdges(3);
		//		al.outEdges(4);

		//		al.addEdge(2, 8);
		//		al.addEdge(2, 1);
		//		al.addEdge(2, 4);
		//
		//		al.addEdge(8, 0);
		//		al.addEdge(8, 9);
		//
		//		al.addEdge(1, 3);
		//		al.addEdge(1, 7);
		//
		//		al.addEdge(3, 5);
		//
		//		al.addEdge(7, 6);

		//test 1
		al.addEdge(0, 3, 80);
		al.addEdge(0, 6, 90);
		al.addEdge(0, 1, 20);
		al.addEdge(6, 0, 20);


		al.addEdge(1, 5, 10);
		al.addEdge(4, 1, 50);


		al.addEdge(2, 5, 50);
		al.addEdge(5, 2, 10);
		al.addEdge(2, 7, 20);
		al.addEdge(3, 2, 10);
		al.addEdge(2, 3, 10);


		al.addEdge(5, 3, 40);
		al.addEdge(3, 6, 20);

		al.addEdge(4, 6, 30);

		//		al.removeEdge(6, 3);
		//		al.removeEdge(1, 4);

		//test 2

//		al.addEdge(0, 1, 4);
//		al.addEdge(0, 7, 8);
//
//		al.addEdge(1, 2, 8);
//		al.addEdge(7, 6, 1);
//
//		al.addEdge(2, 3, 7);
//		al.addEdge(2, 8, 2);
//
//
//		al.addEdge(6, 5, 2);
//		al.addEdge(5, 4, 10);
//		//----------
//		al.addEdge(1, 0, 4);
//		al.addEdge(7, 0, 8);
//
//		al.addEdge(2, 1, 8);
//		al.addEdge(6, 7, 1);
//
//		al.addEdge(3, 2, 7);
//		al.addEdge(8, 2, 2);
//
//		al.addEdge(5, 6, 2);
//		al.addEdge(4, 5, 10);


		System.out.println(" weighted output---------");

//		al.inEdges(0);
//		al.outEdges(0);
//
//		al.inEdges(1);
//		al.outEdges(1);
//
//		al.inEdges(2);
//		al.outEdges(2);
//
//		al.inEdges(3);
//		al.outEdges(3);
//
//		al.inEdges(4);
//		al.outEdges(4);
//
//		al.inEdges(5);
//		al.outEdges(5);
//
//		al.inEdges(6);
//		al.outEdges(6);
//
//		al.inEdges(7);
//		al.outEdges(7);
//
//		al.inEdges(8);
//		al.outEdges(8);
//
		al.dijkstraShortestPath(0);

		//
		//		al.addEdge(2, 1);
		//		al.addEdge(2, 4);
		//
		//		al.addEdge(8, 0);
		//		al.addEdge(8, 9);
		//
		//		al.addEdge(1, 3);
		//		al.addEdge(1, 7);
		//
		//		al.addEdge(3, 5);
		//
		//		al.addEdge(7, 6);


		//		System.out.println("-------------------b f s  ------------------");
		//
		//		al.bfsVisit(2);
		//
		//		System.out.println("-------------------b f s recur ------------------");
		//		al.bfsRecur(2);
		//
		//		System.out.println("-------------------d f s ------------------");
		//		al.dfsVisit(2);
		//
		//		System.out.println("-------------------d f s 2 ------------------");
		//		al.dfsVisitAnyOrder(2);
		//
		//		System.out.println("-------------------d f s 2 recur------------------");
		//		al.dfsRecur(2);

	}
}