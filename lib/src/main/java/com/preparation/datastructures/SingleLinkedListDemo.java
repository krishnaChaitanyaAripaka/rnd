package com.preparation.datastructures;

/**
 * Describes data transactions in a singly linked list
 *
 * @author Krishna Chaitanya
 * @since 02/06/16
 */
public class SingleLinkedListDemo {
  private static Node mHead;
  private static Node mTail;

  public static void main(String a[]) {

    //Insert First
    insertLast(1);

    //Insert Last
    insertFirst(11);
    insertFirst(22);

    //Insert After
    Node addNumber = new Node();
    addNumber.n = 9;
    insertAfter(22, addNumber);

    //Delete an Item
    delete(mHead, 40);

    //Traverse
    traverse(mHead);

    //Reverse Traversal
    reverseTraversal(mHead);
    //reverseTraversalWithTwoWhileLoops(mHead, mTail);
    //reverseTraverseRecursion(mHead);

    //Reverse List
    //mHead = reverseList(mHead);
    //traverse(mHead);
  }

  /******************************************************************************/
  // Insert At Last
  /******************************************************************************/

  /**
   * Insert item at the last node
   */
  private static void insertLast(int n) {
    Node temp = new Node();
    temp.n = n;

    if (mHead == null) {
      mHead = temp;
      mTail = temp;
    } else {
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
    Node temp = new Node();
    temp.n = n;

    if (mHead == null) {
      mHead = temp;
      mTail = temp;
    } else {
      temp.next = mHead;
      mHead = temp;
    }
  }

  /******************************************************************************/
  // Insert after a number
  /******************************************************************************/
  /**
   * Insert item after a given number
   */
  private static void insertAfter(int numberAfter, Node addNumber) { //22, 9
    Node temp;
    Node currentNode = mHead;
    while (currentNode != null) {
      if (currentNode.n == numberAfter) {
        temp = currentNode.next; //store 11 in temp
        currentNode.next = addNumber; //add 9 after 22
        addNumber.next = temp; //make 9 point to 11
        break;
      }
      currentNode = currentNode.next;
    }

    //traverse(head);
  }

  /******************************************************************************/
  // Delete an item
  /******************************************************************************/
  /**
   * Delete a number provided from the linked list,
   * Deleting a node from a linked list is straightforward but there are a few cases we need to
   * account for
   * 1. the list is empty; or
   * 2. the node to remove is the only node in the linked list; or
   * 3. we are removing the head node; or
   * 4. we are removing the tail node; or
   * 5. the node to remove is somewhere in between the head and tail;
   * 6. the item to remove doesn’t exist in the linked list
   */
  private static void delete(Node head, int numberToDelete) { //33
    Node previous = null;
    Node currentNode = head;
    int count = 0;
    while (currentNode != null) {
      if (currentNode.n == numberToDelete) {
        count++;
        if (previous != null) {//Delete element if it is not the first element
          previous.next = currentNode.next;
        } else {//Delete first element
          head = head.next;
        }
      }
      previous = currentNode;
      currentNode = currentNode.next;
    }

    if (count == 0) {
      System.out.println("Can't find an element to delte from the list");
    } else {
      traverse(head);
    }
  }

  /******************************************************************************/
  // Traverse
  /******************************************************************************/
  /**
   * Traverse through the single linked list
   */
  private static void traverse(Node node) {
    if (node == null) {
      System.out.println();
      return;
    }

    System.out.print(node.n + ", ");
    traverse(node.next);
  }

  /******************************************************************************/
  // Reverse Traversal
  /******************************************************************************/
  //22 -> 9 -> 11 -> 1
  private static void reverseTraversal(Node head) {
    if (head == null) {
      System.out.println("empty");
    } else {
      Node currentNode = head;
      Node lastNodeToPrint = null;
      boolean isLastElement;
      while (currentNode != null) {
        if (currentNode.next == null || currentNode.next == lastNodeToPrint) {
          lastNodeToPrint = currentNode;
          System.out.print(lastNodeToPrint.n + ",");

          if (head == lastNodeToPrint) break;
          isLastElement = true;
        } else {
          isLastElement = false;
        }

        currentNode = currentNode.next;

        if (isLastElement) {
          currentNode = head;
        }
      }

      System.out.println();
    }
  }

  //22 -> 9 -> 11 -> 1
  private static void reverseTraversalWithTwoWhileLoops(Node head, Node tail) {
    if (head == null) return;

    Node current = tail;
    Node previous;

    while (head != current) {
      previous = head;

      while (previous.next != current) {
        previous = previous.next;
      }

      System.out.print(current.n + ",");
      current = previous;
    }
    System.out.print(head.n);
    System.out.println();
  }

  private static void reverseTraverseRecursion(Node head) {
    if (head == null) {
      return;
    }

    reverseTraverseRecursion(head.next);
    System.out.println(head.n + ",");
  }

  /******************************************************************************/
  // Reverse List
  /******************************************************************************/
  private static Node reverseList(Node head) {
    Node rev = null;
    Node current = head;
    while (current != null) {
      Node next = current.next;
      current.next = rev;
      rev = current;
      current = next;
    }
    return rev;
  }
}
