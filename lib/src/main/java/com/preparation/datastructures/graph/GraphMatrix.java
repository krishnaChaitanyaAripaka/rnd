package com.preparation.datastructures.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by m.susmitha on 6/24/16.
 */
public class GraphMatrix {
	String IN_EDGES = "IN EDGES";
	String OUT_EDGES = "OUT EDGES";
	int[][] graphMatrix;

	GraphMatrix(int n) {
		graphMatrix = new int[n][n];
		System.out.println("Size of Adjacency matrix : " + n);
	}

	boolean isValid(int index) {
		return index < graphMatrix.length;
	}


	public void addEdge(int src, int dest) {
		if (isValid(src) && isValid(dest)) {
			graphMatrix[src][dest] = 1;
		} else {
			throw new ArrayIndexOutOfBoundsException("Index exceeded than graph size.");
		}
	}


	public void removeEdge(int src, int dest) {
		graphMatrix[src][dest] = 0;
	}

	public boolean hasEdge(int src, int dest) {
		return graphMatrix[src][dest] == 1;
	}

	public List inEdges(int src) {
		List<Integer> inEdges = new ArrayList<>();
		for (int i = 0; i < graphMatrix.length; i++) {
			if (graphMatrix[i][src] == 1) {
				inEdges.add(i);
			}
		}

		print(IN_EDGES, src, inEdges);
		return inEdges;
	}

	public List outEdges(int src) {
		List<Integer> outEdges = new ArrayList<>();
		for (int i = 0; i < graphMatrix.length; i++) {
			if (graphMatrix[src][i] == 1) {
				outEdges.add(i);
			}
		}

		print(OUT_EDGES, src, outEdges);

		return outEdges;
	}

	private void print(String tag, int src, List list) {
		System.out.println(tag + " for " + src + " : " + list);
	}


}
