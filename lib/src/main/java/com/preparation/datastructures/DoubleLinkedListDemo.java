package com.preparation.datastructures;

/**
 * Describes data transactions in a Double linked list
 *
 * @author Krishna Chaitanya
 * @since 04/06/16
 */
public class DoubleLinkedListDemo {
  private static DNode mHead;
  private static DNode mTail;

  public static void main(String a[]) {
    insertLast(1);

    //Insert Last
    insertFirst(11);
    insertFirst(22);

    //Insert After
    DNode addNumber = new DNode();
    addNumber.n = 9;
    insertAfter(22, addNumber);

    //Delete an Item
    //delete(mHead, 1);

    mHead = reverseList(mHead);
    traverseFront(mHead);
    traverseBack(mTail);
  }

  /******************************************************************************/
  // Insert At Last
  /******************************************************************************/
  public static void insertLast(int n) {
    DNode temp = new DNode();
    temp.n = n;

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
  private static void insertFirst(int n) {
    DNode temp = new DNode();
    temp.n = n;

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
  private static void insertAfter(int numberAfter, DNode addNumber) {
    DNode temp;
    DNode current = mHead;
    while (null != current) {
      if (current.n == numberAfter) {
        temp = current.next;
        current.next = addNumber;
        temp.prev = addNumber;
        addNumber.prev = current;
        addNumber.next = temp;
        break;
      }

      current = current.next;
    }
  }

  /******************************************************************************/
  // Delete an item
  /******************************************************************************/
  private static void delete(DNode head, int numberToDelete) { //11
    DNode current = head;

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

    traverseFront(mHead);
    traverseBack(mTail);
  }

  private static void deleteFirst() {
    if (mHead.next == null) {
      mHead = null;
    }
    mHead = mHead.next;
    mHead.prev = null;
  }

  //22, 9, 11, 1
  private static void deleteLast() {
    if (mTail.prev == null) {
      mTail = null;
    }
    mTail.prev.next = null;
    mTail = mTail.prev;
  }

  /******************************************************************************/
  // Traverse
  /******************************************************************************/
  /**
   * Traverse through the single linked list from first to last
   */
  private static void traverseFront(DNode node) {
    if (node == null) {
      System.out.println();
      return;
    }

    System.out.print(node.n + ", ");
    traverseFront(node.next);
  }

  /******************************************************************************/
  // Reverse Traversal
  /******************************************************************************/
  /**
   * Traverse through the single linked list from last to first
   */
  private static void traverseBack(DNode node) {
    if (node == null) {
      System.out.println();
      return;
    }

    System.out.print(node.n + ", ");
    traverseBack(node.prev);
  }

  /******************************************************************************/
  // Reverse List
  /******************************************************************************/
  //22 <-> 9 <-> 11 <-> 1
  //1 <-> 11 <-> 9 <-> 22
  private static DNode reverseList(DNode head) {

    DNode current = head;
    mTail = head;
    DNode rev;
    DNode result = null;

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
