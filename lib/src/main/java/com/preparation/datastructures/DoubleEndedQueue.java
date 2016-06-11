package com.preparation.datastructures;

/**
 * Created by chaitanya.ak on 11/06/16.
 */
public class DoubleEndedQueue<E> {
  private Node mHead;
  private Node mTail;

  DoubleEndedQueue() {

  }

  public class Node {
    private E n;
    private Node next;
    public Node prev;
    private int priority;

    Node(E value) {
      n = value;
    }
  }

  public void enQueueFirst(E n) {
    Node temp = new Node(n);

    if (mHead == null) {
      mHead = temp;
      mTail = temp;
    } else {
      temp.next = mHead;
      mHead.prev = temp;
      mHead = temp;
    }
  }

  public void enQueueBack(E n) {
    Node temp = new Node(n);

    if (mHead == null) {
      mHead = temp;
      mTail = temp;
    } else {
      temp.prev = mTail; //store reference of previous pointer in the current pointer
      mTail.next = temp;
      mTail = temp;
    }
  }

  public void deQueueFirst() {
    if (mHead == mTail) {
      clear();
      return;
    }

    if (mHead.next == null) {
      mHead = null;
    }
    mHead = mHead.next;
    mHead.prev = null;
  }

  public void deQueueBack() {
    if (mHead == mTail) {
      clear();
      return;
    }

    if (mTail.prev == null) {
      mTail = null;
    }
    mTail.prev.next = null;
    mTail = mTail.prev;
  }

  private void clear() {
    mHead = null;
    mTail = null;
  }

  public void traverseFront() {
    Node currentNode = mHead;

    while (currentNode != null) {
      System.out.print(currentNode.n + ", ");
      currentNode = currentNode.next;
    }
  }

  /**
   * Traverse through the single linked list from last to first
   */
  public void traverseBack() {
    Node currentNode = mTail;

    while (currentNode != null) {
      System.out.print(currentNode.n + ", ");
      currentNode = currentNode.prev;
    }
  }
}
