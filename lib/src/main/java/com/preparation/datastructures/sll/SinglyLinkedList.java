package com.preparation.datastructures.sll;

/**
 * Created by chaitanya.ak on 11/06/16.
 */
public class SinglyLinkedList<E> {

  private Node mHead;
  private Node mTail;

  SinglyLinkedList() {

  }

  public class Node {

    private E n;
    private Node next;
    private int priority;

    Node(E value) {
      n = value;
    }
  }

  /******************************************************************************/
  // Insert At Last
  /******************************************************************************/

  /**
   * Insert item at the last node
   */
  public void insertLast(E n) {
    Node temp = new Node(n);

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
  public void insertFirst(E n) {
    Node temp = new Node(n);

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
  public void insertAfter(E numberAfter, E addNumber) { //22, 9
    Node temp;
    Node currentNode = mHead;
    Node addNumberNode = new Node(addNumber);
    while (currentNode != null) {
      if (currentNode.n == numberAfter) {
        temp = currentNode.next; //store 11 in temp
        currentNode.next = addNumberNode; //add 9 after 22
        addNumberNode.next = temp; //make 9 point to 11
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
  public void delete(E numberToDelete) { //33
    Node previous = null;
    Node currentNode = mHead;
    int count = 0;
    while (currentNode != null) {
      if (currentNode.n == numberToDelete) {
        count++;
        if (previous != null) {//Delete element if it is not the first element
          previous.next = currentNode.next;
        } else {//Delete first element
          mHead = mHead.next;
        }
      }
      previous = currentNode;
      currentNode = currentNode.next;
    }

    if (count == 0) {
      System.out.println("Can't find an element to delte from the list");
    } else {
      traverse();
    }
  }

  public E deleteFirst() {
    Node node = mHead;
    E value = null;
    if (node != null) {
      mHead = mHead.next;
      value = node.n;
    }

    return value;
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

  //22 -> 9 -> 11 -> 1
  public void reverseTraversal() {
    if (mHead == null) {
      System.out.println("empty");
    } else {
      Node currentNode = mHead;
      Node lastNodeToPrint = null;
      boolean isLastElement;
      while (currentNode != null) {
        if (currentNode.next == null || currentNode.next == lastNodeToPrint) {
          lastNodeToPrint = currentNode;
          System.out.print(lastNodeToPrint.n + ",");

          if (mHead == lastNodeToPrint) {
            break;
          }
          isLastElement = true;
        } else {
          isLastElement = false;
        }

        currentNode = currentNode.next;

        if (isLastElement) {
          currentNode = mHead;
        }
      }

      System.out.println();
    }
  }

  //22 -> 9 -> 11 -> 1
  public void reverseTraversalWithTwoWhileLoops(Node head, Node tail) {
    if (head == null) {
      return;
    }

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

  public void reverseTraverseRecursion(Node head) {
    if (head == null) {
      return;
    }

    reverseTraverseRecursion(head.next);
    System.out.println(head.n + ",");
  }

  public Node reverseList() {
    Node rev = null;
    Node current = mHead;
    while (current != null) {
      Node next = current.next;
      current.next = rev;
      rev = current;
      current = next;
    }
    return rev;
  }


  public Node reverseList(int k) {
    if (k <= 1) {
      return mHead;
    }
    mHead = reverseList(mHead, k);
    return mHead;
  }

  private Node reverseList(Node node, int k) {
    int count = 0;
    Node current = node;
    Node prev = null;
    Node next = null;
    Node currentHead = node;
    while (count < k && current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
      count++;
    }

    if (next != null) {
      current = reverseList(next, k);
    }

    if (current != null) {
      currentHead.next = current;
    }
    return prev;
  }

  public Node reverseListSkip(int k) {
    if (k <= 1) {
      return mHead;
    }
    mHead = reverseListSkip(mHead, k, true);
    return mHead;
  }

  private Node reverseListSkip(Node node, int k, boolean reverse) {
    int count = 0;
    Node current = node;
    Node prev = null;
    Node next = null;
    Node currentHead = node;
    while (count < k && current != null) {
      if (reverse) {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
      } else {
        if (count == 0) {
          prev = current;
        }

        if (count == k - 1) {
          currentHead = current;
          current = current.next;
          currentHead.next = null;
          next = current;
        } else {
          current = current.next;
        }
      }
      count++;
    }

    if (next != null) {
      current = reverseListSkip(next, k, !reverse);
    }

    if (current != null) {
      currentHead.next = current;
    }
    return prev;
  }
}
