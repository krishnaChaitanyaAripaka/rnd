package com.preparation.datastructures;

/**
 * Created by chaitanya.ak on 11/06/16.
 */
public class Queue<E> {
  private Node mHead;
  private Node mTail;

  Queue() {

  }

  public class Node {
    private E n;
    private Node next;

    Node(E value) {
      n = value;
    }
  }

  public void enQueue(E value) {
    Node temp = new Node(value);

    if (mHead == null) {
      mHead = temp;
      mTail = temp;
    } else {
      mTail.next = temp;
      mTail = temp;
    }
  }

  public E deQueue() {
    if (mHead == null) return null;

    Node current = mHead;
    if (mHead == mTail) {
      clear();
    } else {
      mHead = mHead.next;
    }

    return current.n;
  }

  private void clear() {
    mHead = null;
    mTail = null;
  }

  /**
   * Traverse through the single linked list
   */
  public void traverse() {
    Node currentNode = mHead;

    while (currentNode != null) {
      System.out.print(currentNode.n + ", ");
      currentNode = currentNode.next;
    }
  }

  public boolean notEmpty() {
    if (mHead == null) return false;

    return true;
  }
}
