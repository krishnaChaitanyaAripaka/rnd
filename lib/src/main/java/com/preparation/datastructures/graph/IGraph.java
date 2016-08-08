package com.preparation.datastructures.graph;

import java.util.List;

/**
 * Created by m.susmitha on 6/24/16.
 */
public interface IGraph<E> {

	String IN_EDGES = "IN EDGES";

	String OUT_EDGES = "OUT EDGES";

	void addEdge(E src, E dest, int weight);

	void removeEdge(E src, E dest);

	boolean hasEdge(E src, E dest, int weight);

	List inEdges(E src);

	List outEdges(E src);

}
