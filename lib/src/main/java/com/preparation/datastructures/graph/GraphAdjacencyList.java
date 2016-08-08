package com.preparation.datastructures.graph;

import com.preparation.datastructures.queue.Queue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Stack;


/**
 * Created by m.susmitha and team (Leader board head - Chaitu) on 6/29/16.
 */
public class GraphAdjacencyList<E> implements IGraph<E> {
	LinkedHashMap<E, ArrayList<EdgeDto>> listVertices;
	HashSet<E> vertices;
	int[] sw;
	boolean[] visited;

	class EdgeDto<E> {
		public E dest;
		public int weight;

		EdgeDto(E dest, int weight) {
			this.dest = dest;
			this.weight = weight;
		}

		EdgeDto(E dest) {
			this.dest = dest;
		}

		@Override
		public boolean equals(Object obj) {

			if (this == obj) {
				return true;
			}

			if (!(obj instanceof EdgeDto)) {
				return false;
			}

			if (this.dest == ((EdgeDto) obj).dest) {
				return true;
			}

			return false;
		}

		@Override
		public int hashCode() {
			int hashcode = 31;

			if (dest instanceof Integer) {
				hashcode = hashcode * (Integer) dest;
			}

			return hashcode;
		}

	}

	GraphAdjacencyList() {
		listVertices = new LinkedHashMap<>();
		vertices = new HashSet<E>();
	}

	//	@Override
	//	public void addEdge(E src, E dest) {
	//		if (!isValid(src)) {
	//			listVertices.put(src, new ArrayList<E>());
	//		}
	//
	//		vertices.add(src);
	//		vertices.add(dest);
	//
	//		if (!listVertices.get(src).contains(dest)) {
	//			ArrayList<E> arrayTemp = listVertices.get(src);
	//			arrayTemp.add(dest);
	//			listVertices.put(src, arrayTemp);
	//		} else {
	//			System.out.println("Edge already exists");
	//		}
	//	}

	@Override
	public void addEdge(E src, E dest, int weight) {
		if (!isValid(src)) {
			listVertices.put(src, new ArrayList<EdgeDto>());
		}

		vertices.add(src);
		vertices.add(dest);

		if (!listVertices.get(src).contains(dest)) {
			ArrayList<EdgeDto> arrayTemp = listVertices.get(src);
			EdgeDto edgeDto = new EdgeDto(dest, weight);
			arrayTemp.add(edgeDto);
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
		EdgeDto edgeDto = new EdgeDto(dest);
		listVertices.get(src).remove(edgeDto);
	}

	@Override
	public boolean hasEdge(E src, E dest, int weight) {
		if (!isValid(src)) {
			return false;
		}

		EdgeDto edgeDto = new EdgeDto(dest, weight);
		if (listVertices.get(src) == null) {
			return false;
		}
		return listVertices.get(src).contains(edgeDto);
	}

	@Override
	public List<EdgeDto> inEdges(E dest) {
		ArrayList<EdgeDto> inEdges = new ArrayList();
		Iterator<E> itr = listVertices.keySet().iterator();

		while (itr.hasNext()) {
			E src = itr.next();
			if (isValid(src)) {
				ArrayList<EdgeDto> edgeDtos = listVertices.get(src);
				if (edgeDtos != null) {
					for (EdgeDto edge : edgeDtos) {
						if (dest.equals(edge.dest)) {
							EdgeDto edgeDto = new EdgeDto(src, edge.weight);
							inEdges.add(edgeDto);
						}
					}
				}
			}
		}
//		print("In edges ", dest, inEdges);

		return inEdges;
	}

	@Override
	public List outEdges(E src) {
//		print("Out edges ",src,listVertices.get(src));
		return listVertices.get(src);
	}

	private void print(String tag, E src, List<EdgeDto> list) {
		System.out.println(tag + " for " + src + " : " );
		if(list!=null) {
			for (EdgeDto edgeDto : list) {
				System.out.print("   " + edgeDto.dest);

			}
		}else{
			System.out.print("  Nothing");
		}
		System.out.println("\n");
		System.out.println(
				"----------------------------------------------------------------------------------------");

		System.out.println("\n");

	}

	private boolean isValid(E src) {
		return listVertices.get(src) != null;
	}

	// 				1
	//		2 		3 		5
	//  6     7   8  9    10  11
	//output
	// 1 2 3 5 6 7 8 9 10 11

	void bfsVisit(E startNode) {
		boolean[] marked = new boolean[vertices.size()];
		Queue queue = new Queue();

		if (startNode instanceof Integer) {
			queue.enQueue(startNode);
			marked[(Integer) startNode] = true;

			while (queue.notEmpty()) {
				Integer current = (Integer) queue.deQueue();
				System.out.println(current);
				List<Integer> outEdges = outEdges((E) current);
				if (outEdges != null) {
					for (Integer i : outEdges) {
						if (!marked[i]) {
							queue.enQueue(i);
							marked[i] = true;
						}
					}
				}
			}
		}
	}

	void bfsRecur(E startNode) {
		boolean[] marked = new boolean[vertices.size()];
		Queue queue = new Queue();
		if (startNode instanceof Integer) {
			queue.enQueue(startNode);
			marked[(Integer) startNode] = true;
			bfsRecursive(queue, marked);
		}

	}

	void bfsRecursive(Queue queue, boolean[] marked) {
		if (queue.notEmpty()) {
			Integer current = (Integer) queue.deQueue();
			System.out.println(current);
			List<Integer> outEdges = outEdges((E) current);
			if (outEdges != null) {
				for (Integer i : outEdges) {
					if (!marked[i]) {
						queue.enQueue(i);
						marked[i] = true;
					}
				}
			}
			bfsRecursive(queue, marked);
		} else {
			return;
		}
	}

	// 				1
	//		2 		3 		5
	//  6     7   8  9    10  11
	//output
	// 1 2 6 7 3 8 9 5 10 11

	void dfsVisit(E startNode) {
		boolean[] marked = new boolean[vertices.size()];
		Stack stack = new Stack();

		if (startNode instanceof Integer) {
			stack.push(startNode);

			while (!stack.isEmpty()) {
				Integer current = (Integer) stack.peek();
				if (!marked[current]) {
					System.out.println(current);
					marked[(Integer) startNode] = true;
				}

				List<Integer> outEdges = outEdges((E) current);
				if (outEdges != null && outEdges.size() > 0) {
					boolean pending = false;
					for (Integer i : outEdges) {
						if (!marked[i]) {
							System.out.println(i);
							stack.push(i);
							marked[i] = true;
							pending = true;
							break;
						}
					}

					if (!pending) {
						stack.pop();
					}
				} else {
					stack.pop();
				}
			}
		}
	}

	void dfsVisitAnyOrder(E startNode) {
		boolean[] marked = new boolean[vertices.size()];
		Stack stack = new Stack();

		if (startNode instanceof Integer) {
			stack.push(startNode);
			marked[(Integer) startNode] = true;

			while (!stack.isEmpty()) {
				Integer current = (Integer) stack.pop();
				System.out.println(current);

				List<Integer> outEdges = outEdges((E) current);
				if (outEdges != null && outEdges.size() > 0) {
					for (Integer i : outEdges) {
						if (!marked[i]) {
							stack.push(i);
							marked[i] = true;
						}
					}
				}
			}
		}
	}

	void dfsRecur(E startNode) {
		boolean[] marked = new boolean[vertices.size()];
		Stack stack = new Stack();

		if (startNode instanceof Integer) {
			stack.push(startNode);
			marked[(Integer) startNode] = true;
			dfsRecursive(marked, stack);
		}
	}

	void dfsRecursive(boolean[] marked, Stack stack) {
		if (!stack.isEmpty()) {
			Integer current = (Integer) stack.pop();
			System.out.println(current);

			List<Integer> outEdges = outEdges((E) current);
			if (outEdges != null && outEdges.size() > 0) {
				for (Integer i : outEdges) {
					if (!marked[i]) {
						stack.push(i);
						marked[i] = true;
					}
				}
			}
			dfsRecursive(marked, stack);
		} else {
			return;
		}
	}

	void dijkstraShortestPath(E startNode) {
		if (startNode instanceof Integer) {
			int[] w = new int[vertices.size()];
			boolean[] marked = new boolean[vertices.size()];

			int previousIterationValue = 0;
			marked[(Integer) startNode] = true;
			int[] shortestWeights =
					getshortestWeights(startNode, startNode, w, marked, previousIterationValue,
							false);

			System.out.println(" \n shorttest paths from " + startNode + "\n");

			for (int i = 0; i < shortestWeights.length; i++) {
				System.out.println("\n" + startNode + " ---> " + i + " is " + shortestWeights[i]);
			}
		}
	}

	boolean containsNode(List<EdgeDto> list,int node) {
		boolean contains = false;
		if (list != null) {
			for (EdgeDto edgeDto : list) {
				if (edgeDto.dest == node) {
					contains = true;
					break;
				}
			}
		}
		return contains;
	}

	int minimumNode(List<EdgeDto> list) {
		int minimum = -1;
		if (list != null) {
			for (EdgeDto edgeDto : list) {
				if ((Integer) edgeDto.dest < minimum || minimum == -1) {
					minimum = (Integer) edgeDto.dest;
				}
			}
		}
		return minimum;
	}

	private int[] getshortestWeights(E src, E startNode, int[] w, boolean[] marked, int previousIterationValue, boolean isBackTracking) {
		System.out.println(" start node "+startNode);
		int leastValue = 0;
		List<EdgeDto> list = outEdges(startNode);
		if (list != null) {
			for (EdgeDto edgeDto : list) {
				if ((edgeDto.weight < leastValue || leastValue == 0) &&
						!marked[(Integer) edgeDto.dest]) {
					leastValue = edgeDto.weight;
				}

				if (previousIterationValue != 0) {
					if (!marked[(Integer) edgeDto.dest]) {
						if (isBackTracking) {
							if (w[(Integer) edgeDto.dest] != 0) {
								//already processed

							} else {
								w[(Integer) edgeDto.dest] = previousIterationValue + edgeDto.weight;
							}

						} else {
							w[(Integer) edgeDto.dest] = previousIterationValue + edgeDto.weight;
						}
					}
				} else {
					w[(Integer) edgeDto.dest] = edgeDto.weight;
				}
			}

			//		if(leastValue == previousIterationValue && leastValue != 0) {
			//			return w;
			//		}
			for (Integer i = 0; i < w.length; i++) {
				if (w[i] == previousIterationValue + leastValue && !marked[i]) {
					marked[i] = true;
					startNode = (E) i;
					break;
				}
			}
		}

		boolean pending = false;
		for (Integer i = 0; i < marked.length; i++) {
			if (marked[i] == false && inEdges((E) i) != null && inEdges((E) i).size() > 0 &&
					outEdges((E) i) != null && outEdges((E) i).size() > 0) {
				pending = true;
				break;
			}
		}

		if (leastValue == 0) {
			if (pending) {
				List<EdgeDto> inEdges = inEdges(startNode);
				Integer minimum = minimumNode(inEdges);
				if (minimum != -1) {
					return getshortestWeights(src, (E) minimum, w, marked,
							w[minimum], true);
				} else {
					return getshortestWeights(src, src, w, marked,
							w[(Integer)src], true);

				}
			} else {
				return w;
			}
		} else {
			return getshortestWeights(src, startNode, w, marked,
					previousIterationValue + leastValue, false);
		}
	}




}
