package com.preparation.datastructures;

import java.util.ArrayList;

/**
 * Created by chaitanya.ak on 07/06/16.
 */
public class HeapDemo {

	private static ArrayList<Integer> mList = new ArrayList<>();

	public static void main(String a[]) {
		MinHeap minHeap = new MinHeap();
		MaxHeap maxHeap = new MaxHeap();

		minHeap.addValueWithMinHeapify(13);
		minHeap.addValueWithMinHeapify(9);
		minHeap.addValueWithMinHeapify(12);
		minHeap.addValueWithMinHeapify(7);
		minHeap.addValueWithMinHeapify(5);
		minHeap.addValueWithMinHeapify(3);
		minHeap.addValueWithMinHeapify(8);
		minHeap.addValueWithMinHeapify(6);
		minHeap.addValueWithMinHeapify(10);
		minHeap.addValueWithMinHeapify(1);

		maxHeap.addValueWithMaxHeapify(13);
		maxHeap.addValueWithMaxHeapify(9);
		maxHeap.addValueWithMaxHeapify(12);
		maxHeap.addValueWithMaxHeapify(7);
		maxHeap.addValueWithMaxHeapify(5);
		maxHeap.addValueWithMaxHeapify(3);
		maxHeap.addValueWithMaxHeapify(8);
		maxHeap.addValueWithMaxHeapify(6);
		maxHeap.addValueWithMaxHeapify(10);
		maxHeap.addValueWithMaxHeapify(1);

		minHeap.delete(1);
		minHeap.contains(8);
		minHeap.containsWithHeapifyLogic(8);
		maxHeap.traverse();
	}

	/**
	 * 13 9 12 7 5 3 8 6 10 1
	 *
	 * 13 9
	 * 9 13 - swap
	 * 9 13 12
	 * 9 13 12 7
	 * 9 7 12 13 - swap
	 * 7 9 12 13 - swap
	 * 7 9 12 13 5
	 * 7 5 12 13 9 -swap
	 * 5 7 12 13 9
	 * 5 7 12 13 9 3
	 * 5 7 3 13 9 12 -swap
	 * 3 7 5 13 9 12 -swap
	 * 3 7 5 13 9 12 8
	 * 3 7 5 13 9 12 8 6
	 * 3 7 5 6 9 12 8 13 -swap
	 * 3 6 5 7 9 12 8 13 -swap
	 * 3 6 5 7 9 12 8 13 10
	 * 3 6 5 7 9 12 8 13 10 1
	 * 3 6 5 7 1 12 8 13 10 9 -swap
	 * 3 1 5 7 6 12 8 13 10 9 -swap
	 * 1 3 5 7 6 12 8 13 10 9 -swap
	 */
}

