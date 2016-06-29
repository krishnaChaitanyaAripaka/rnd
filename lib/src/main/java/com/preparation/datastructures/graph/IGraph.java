package com.preparation.datastructures.graph;

import java.util.List;

/**
 * Created by m.susmitha on 6/24/16.
 */
public interface IGraph<E> {

	void addEdge(int src, int dest);

	void removeEdge(int src, int dest);

	boolean hasEdge(int src, int dest);

	List<E> inEdges(int src);

	List<E> outEdges(int src);

}
