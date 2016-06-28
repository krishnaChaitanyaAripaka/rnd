package com.preparation.datastructures.dll;

/**
 * Created by chaitanya.ak on 11/06/16.
 */
public class DoublyLinkedList<E> {
  private Node mHead;
  private Node mTail;

  DoublyLinkedList() {

  }

  public class Node {
    private E n;
    private Node next;
    public Node prev;

    Node(E value) {
      n = value;
    }
  }

  /******************************************************************************/
  // Insert At Last

  /******************************************************************************/
  public void insertLast(E n) {
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

  /******************************************************************************/
  // Insert At First
  /******************************************************************************/
  /**
   * Insert item at the first node
   */
  public void insertFirst(E n) {
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

  /******************************************************************************/
  // Insert after a number
  /******************************************************************************/
  /**
   * Insert item after a given number
   */
  public void insertAfter(E numberAfter, E addNumber) {
    Node temp;
    Node current = mHead;
    Node addNumberNode = new Node(addNumber);
    while (null != current) {
      if (current.n == numberAfter) {
        temp = current.next;
        current.next = addNumberNode;
        temp.prev = addNumberNode;
        addNumberNode.prev = current;
        addNumberNode.next = temp;
        break;
      }

      current = current.next;
    }
  }

  /******************************************************************************/
  // Delete an item

  /******************************************************************************/
  public void delete(E numberToDelete) { //11
    Node current = mHead;

    while (null != current) {
      if (current.n == numberToDelete) {

        if (current.prev == null) {
          deleteFirst();
        } else if (current.next == null) {
          deleteLast();
        } else {
          current.prev.next = current.next;
          current.next.prev = current.prev;
        }

        break;
      }
      current = current.next;
    }
  }

  public void deleteFirst() {
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

  //22, 9, 11, 1
  public void deleteLast() {
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

  /**
   * Traverse through the single linked list from first to last
   */
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

  public Node reverseList() {

    Node current = mHead;
    mTail = mHead;
    Node rev;
    Node result = null;

    /*
    r: 22     			 		          c: 9 <-> 11 <-> 1
    r: 9 <-> 22  			 	          c: 11 <-> 1
    r: 11 <-> 9 <-> 22 			      c: 1
    r: 1 <-> 11 <-> 9 <-> 22  		c: null
    */

    while (current != null) {
      rev = current;

      if (current.next != null) {
        current = current.next;
        current.prev = null;
        rev.next = null;
      } else {
        current = null;
      }

      if (result != null) {
        result.prev = rev;
        rev.next = result;
      }
      result = rev;
    }

    return result;
  }
}
