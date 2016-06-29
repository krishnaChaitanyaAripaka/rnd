package com.preparation.datastructures.queue;

import java.util.ArrayList;

/**
 * Created by chaitanya.ak on 11/06/16.
 */
public class PriorityQueue<E> {
  ArrayList<Node> mList = new ArrayList<>();

  PriorityQueue() {

  }

  public class Node {
    private E n;
    private int priority;

    Node(E value) {
      n = value;
    }
  }

  public void enQueuePriority(E value, int priority) {
    Node node = new Node(value);
    node.priority = priority;
    mList.add(node);

    prioritize();
  }

  private void prioritize() {
    for (int index = mList.size() - 1; index > 0; ) {
      int parent = (index - 1) / 2;
      if (mList.get(index).priority < mList.get(parent).priority) {
        swap(index, parent);
        index = parent;
      } else {
        break;
      }
    }
  }

  private void swap(int index, int childIndex) {
    Node temp = mList.get(index);
    mList.set(index, mList.get(childIndex));
    mList.set(childIndex, temp);
  }

  public void dequeuePriority() {
    if (mList != null && mList.size() > 0) {
      mList.remove(0);
    }
  }

  public void traverse() {
    for (Node value : mList) {
      System.out.print(value.n + ",");
    }
    System.out.println("");
  }
}
