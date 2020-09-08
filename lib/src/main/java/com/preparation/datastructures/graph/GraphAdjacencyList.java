package com.preparation.datastructures.graph;

import com.preparation.datastructures.queue.Queue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * Created by m.susmitha and team (Leader board head - Chaitu) on 6/29/16.
 */
public class GraphAdjacencyList<E> implements IGraph<E> {
	private HashMap<E, ArrayList<E>> listVertices;
	private HashSet mHashSet;

	GraphAdjacencyList() {
		listVertices = new HashMap<>();
		mHashSet = new HashSet();
	}

	@Override
	public void addEdge(E src, E dest) {
		if (!isValid(src)) {
			listVertices.put(src, new ArrayList<E>());
		}

		mHashSet.add(src);
		mHashSet.add(dest);

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
		//print(IN_EDGES, src, inEdges);

		return inEdges;
	}

	@Override
	public List outEdges(E src) {
		//print(OUT_EDGES, src, listVertices.get(src));
		return listVertices.get(src);
	}

	public void bfs(E src) {

		if(!mHashSet.contains(src)) {
			System.out.println("Not in graph");
			return;
		}

		boolean[] seen = new boolean[mHashSet.size()];
		Queue queue = new Queue();
		queue.enQueue(src);
		seen[(Integer) src] = true;
		while (queue.notEmpty()) {
			E vertex = (E) queue.deQueue();

			if (!(src instanceof Integer)) {
				throw new NoSuchElementException("Supported only for Integers as of now");
			}

			System.out.print(vertex+", ");
			List<Integer> adjacentList = outEdges(vertex);

			if(adjacentList != null && adjacentList.size() > 0) {
				for (Integer adjacentItem : adjacentList) {

					if (!seen[adjacentItem]) {
						queue.enQueue(adjacentItem);
						seen[adjacentItem] = true;
					}
				}
			}
		}
		System.out.println("");
	}

	public void dfsRecursion(E src) {
		if (!mHashSet.contains(src)) {
			System.out.println("Not in graph");
			return;
		}

		if (!(src instanceof Integer)) {
			throw new NoSuchElementException("Supported only for Integers as of now");
		}

		boolean[] color = new boolean[mHashSet.size()];

		dfsRecursion((Integer) src, color);
	}

	private void dfsRecursion(Integer src, boolean[] color) {
		List<Integer> adjacentList = outEdges((E) src);

		System.out.print(src + ", ");
		color[src] = true;
		for (Integer ajdacentNode : adjacentList) {
			if (!color[ajdacentNode]) {
				dfsRecursion(ajdacentNode, color);
			}
		}
	}

	public void dfs(E src) {
		if (!mHashSet.contains(src)) {
			System.out.println("Not in graph");
			return;
		}

		if (!(src instanceof Integer)) {
			throw new NoSuchElementException("Supported only for Integers as of now");
		}

		boolean[] seen = new boolean[mHashSet.size()];
		Stack stack = new Stack();
		stack.push(src);
		System.out.print(src + ", ");

		while (!stack.empty()) {
			E vertex = (E) stack.peek();
			seen[(Integer) vertex] = true;
			List<Integer> adjacentList = outEdges(vertex);

			if(adjacentList != null && adjacentList.size() > 0) {
				for (Integer adjacentItem : adjacentList) {
					if (!seen[adjacentItem]) {
						stack.push(adjacentItem);
						System.out.print(adjacentItem + ", ");
						seen[adjacentItem] = true;
					} else {
						stack.pop();
					}
				}
			}
		}
		System.out.println("");
	}

	public void bfsToday(E src) {
		int[] marked=new int[size()];


	}

	private void print(String tag, E src, List list) {
		System.out.println(tag + " for " + src + " : " + list);
	}

	private boolean isValid(E src) {
		return listVertices.get(src) != null;
	}

	public int size() {
		return mHashSet.size();
	}
}
