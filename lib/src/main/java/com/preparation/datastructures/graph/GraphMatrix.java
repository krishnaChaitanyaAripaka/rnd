package com.preparation.datastructures.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by m.susmitha on 6/24/16.
 */
public class GraphMatrix<E> implements IGraph {
	int[][] graphMatrix;

	GraphMatrix(int n) {
		graphMatrix = new int[n][n];
	}

	boolean isValid(int index) {
		return index < graphMatrix.length;
	}

	@Override
	public void addEdge(int src, int dest) {
		if (isValid(src) && isValid(dest)) {
			graphMatrix[src][dest] = 1;
		} else {
			throw new ArrayIndexOutOfBoundsException("Index exceeded than graph size.");
		}
	}

	@Override
	public void removeEdge(int src, int dest) {
		graphMatrix[src][dest] = 0;
	}

	@Override
	public boolean hasEdge(int src, int dest) {
		return graphMatrix[src][dest] == 1;
	}

	@Override
	public List inEdges(int src) {
		List<Integer> inEdges = new ArrayList<>();
		for (int i = 0; i < graphMatrix.length; i++) {
			if (graphMatrix[i][src] == 1) {
				inEdges.add(i);
			}
		}
		System.out.println(src + " in edges");

		if (inEdges.size() > 0) {
			for (int i : inEdges) {
				System.out.print(i + ", ");
			}
		} else {
			System.out.println("No in edges");
		}
		System.out.println("\n------------------\n");

		return inEdges;
	}

	@Override
	public List outEdges(int src) {
		List<Integer> outEdges = new ArrayList<>();
		for (int i = 0; i < graphMatrix.length; i++) {
			if (graphMatrix[src][i] == 1) {
				outEdges.add(i);
			}
		}
		System.out.println(src + " out edges");

		if (outEdges.size() > 0) {
			for (int i : outEdges) {
				System.out.print(i + ", ");
			}
		} else {
			System.out.println("No out edges");
		}
		System.out.println("\n ------------------\n");

		return outEdges;
	}




}
