package com.preparation.datastructures;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * Created by m.susmitha on 6/11/16.
 */
public class MinHeap<E> {
	private ArrayList<E> mList = new ArrayList<>();

	/**
	 * @param value
	 */
	public void addValueWithMinHeapify(E value) {
		mList.add(value);

		if (mList.size() == 1) {
			return;
		}
		minHeapify();
	}

	/**
	 *
	 */
	private void minHeapify() {
		for (int i = mList.size() - 1; i > 0; ) {
			int parent = (i - 1) / 2;
			if (isLessThan(mList.get(i), mList.get(parent))) {
				swap(i, parent);
				i = parent;
			} else {
				break;
			}
		}
	}

	/**
	 * @param i
	 * @param childIndex
	 */
	private void swap(int i, int childIndex) {
		E temp = mList.get(i);
		mList.set(i, mList.get(childIndex));
		mList.set(childIndex, temp);
	}

	/**
	 *
	 */
	private void traverse() {
		for (E value : mList) {
			System.out.println(value);
		}
	}

	/**
	 * 1 3 5 7 6 12 8 13 10 9
	 * <p/>
	 * 9 3 5 7 6 12 8 13 10  -swap
	 * 3 9 5 7 6 12 8 13 10  -swap
	 * 3 6 5 7 9 12 8 13 10  -swap
	 */
	public void delete(int value) {
		//step 1: find the index of the value to delete
		int indexOfValue = mList.indexOf(value);
		if (indexOfValue < 0) {
			return;
		}
		//step 2: put the last value in the heap at the index location of the item to delete
		mList.set(indexOfValue, mList.remove(mList.size() - 1));

		//step 3: verify heap ordering for each subtree which used to include the value
		minHeapifyForDelete(indexOfValue);
	}

	/**
	 *
	 */
	private void minHeapifyForDelete(int i) {
		int childIndex;
		int size = mList.size();
		int leftChild;
		int rightChild;
		while (i < size - 1 && (leftChild = 2 * i + 1) < size - 1 &&
				(rightChild = 2 * i + 2) < size - 1) {
			if (isGreaterThan(mList.get(i), mList.get(leftChild)) ||
					isGreaterThan(mList.get(i), mList.get(rightChild))) {
				childIndex = isLessThan(mList.get(leftChild), mList.get(rightChild)) ? leftChild :
						rightChild;
				swap(i, childIndex);
				i = childIndex;
				System.out.println(i);
			} else {
				break;
			}
		}
	}

	/**
	 * @param value
	 * @return
	 */
	public boolean contains(int value) {
		boolean isPresent;
		System.out.println(isPresent = mList.contains(value));
		return isPresent;
	}

	public boolean containsWithHeapifyLogic(E value) {
		boolean isPresent = false;

		int start = 0;
		int nodes = 1;
		while (start < mList.size()) {
			start = nodes - 1;
			int end = nodes + start;
			int count = 0;

			while (start < mList.size() && start < end) {
				if (equals(value, mList.get(start))) {
					isPresent = true;
					System.out.println(isPresent);
					return isPresent;
				} else if (isGreaterThan(value, mList.get((start - 1) / 2)) &&
						isLessThan(value, mList.get(start))) {
					count++;
					start++;
				} else {
					start++;
				}
			}

			if (count == nodes) {
				isPresent = false;
				System.out.println(isPresent);
				return isPresent;
			} else {
				nodes *= 2;
			}
		}

		System.out.println(isPresent);
		return isPresent;
	}

	private boolean isLessThan(E valueOne, E valueTwo) {
		if (valueOne instanceof Integer) {
			return (Integer) valueOne < (Integer) valueTwo;
		}

		throw new NoSuchElementException();
	}

	private boolean isGreaterThan(E valueOne, E valueTwo) {
		if (valueOne instanceof Integer) {
			return (Integer) valueOne > (Integer) valueTwo;
		}

		throw new NoSuchElementException();
	}

	private boolean equals(E valueOne, E valueTwo) {
		if (valueOne instanceof Integer) {
			return (Integer) valueOne == (Integer) valueTwo;
		}

		throw new NoSuchElementException();
	}
}
