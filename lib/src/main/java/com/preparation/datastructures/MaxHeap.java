package com.preparation.datastructures;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * Created by m.susmitha on 6/11/16.
 */
public class MaxHeap<E> {
	private ArrayList<E> mList = new ArrayList<>();

	/**
	 * @param value
	 */
	public void addValueWithMaxHeapify(E value) {
		mList.add(value);

		if (mList.size() == 1) {
			return;
		}

		maxHeapify();
	}

	/**
	 *
	 */
	private void maxHeapify() {
		for (int i = mList.size() - 1; i > 0; ) {
			int parent = (i - 1) / 2;
			if (isGreaterThan(mList.get(i), mList.get(parent))) {
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
	public void traverse() {
		for (E value : mList) {
			System.out.println(value);
		}
	}

	private void delete(int value) {
		//step 1: find the index of the value to delete
		int indexOfValue = mList.indexOf(value);
		if (indexOfValue < 0) {
			return;
		}
		//step 2: put the last value in the heap at the index location of the item to delete
		mList.set(indexOfValue, mList.remove(mList.size() - 1));

		//step 3: verify heap ordering for each subtree which used to include the value
		maxHeapifyForDelete(indexOfValue);
	}

	/**
	 *
	 */
	private void maxHeapifyForDelete(int i) {
		int childIndex;
		int size = mList.size();
		int leftChild;
		int rightChild;
		while (i < size - 1 && (leftChild = 2 * i + 1) < size - 1 &&
				(rightChild = 2 * i + 2) < size - 1) {
			if (isLessThan(mList.get(i), mList.get(leftChild)) ||
					isLessThan(mList.get(i), mList.get(rightChild))) {
				childIndex =
						isGreaterThan(mList.get(leftChild), mList.get(rightChild)) ? leftChild :
								rightChild;
				swap(i, childIndex);
				i = childIndex;
				System.out.println(i);
			} else {
				break;
			}
		}
	}

	private boolean isGreaterThan(E valueOne, E valueTwo) {
		if (valueOne instanceof Integer) {
			return (Integer) valueOne > (Integer) valueTwo;
		}

		throw new NoSuchElementException();
	}

	private boolean isLessThan(E valueOne, E valueTwo) {
		if (valueOne instanceof Integer) {
			return (Integer) valueOne < (Integer) valueTwo;
		}

		throw new NoSuchElementException();
	}
}
