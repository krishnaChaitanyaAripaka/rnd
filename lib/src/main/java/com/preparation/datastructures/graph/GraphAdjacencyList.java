package com.preparation.datastructures.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * Created by m.susmitha and team (Leader board head - Chaitu) on 6/29/16.
 */
public class GraphAdjacencyList<E> implements IGraph<E> {
	HashMap<E, ArrayList<E>> listVertices;

	GraphAdjacencyList() {
		listVertices = new HashMap<>();
	}

	@Override
	public void addEdge(E src, E dest) {
		if (!isValid(src)) {
			listVertices.put(src, new ArrayList<E>());
		}

		if (!listVertices.get(src).contains(dest)) {
			ArrayList<E> arrayTemp = listVertices.get(src);
			arrayTemp.add(dest);
			listVertices.put(src, arrayTemp);
		} else {
			System.out.println("Edge already exists");
		}
	}

	@Override
	public void removeEdge(E src, E dest) {
		if (!isValid(src)) {
			return;
		}

		listVertices.get(src).remove(dest);
	}

	@Override
	public boolean hasEdge(E src, E dest) {
		if (!isValid(src)) {
			return false;
		}
		return listVertices.get(src).contains(dest);
	}

	@Override
	public List inEdges(E src) {
		ArrayList inEdges = new ArrayList();
		Iterator<E> itr = listVertices.keySet().iterator();

		while (itr.hasNext()) {
			E key = itr.next();
			if (isValid(key) && listVertices.get(key).contains(src)) {
				inEdges.add(key);
			}
		}
		print(IN_EDGES, src, inEdges);

		return inEdges;
	}

	@Override
	public List outEdges(E src) {
		print(OUT_EDGES, src, listVertices.get(src));
		return listVertices.get(src);
	}

	private void print(String tag, E src, List list) {
		System.out.println(tag + " for " + src + " : " + list);
	}

	private boolean isValid(E src) {
		return listVertices.get(src) != null;
	}
}
