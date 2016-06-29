package com.preparation.datastructures.sll;

/**
 * Describes data transactions in a singly linked list
 *
 * @author Krishna Chaitanya
 * @since 02/06/16
 */
public class SingleLinkedListDemo {

  public static void main(String a[]) {

    SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

    //Insert First
    singlyLinkedList.insertLast(1);

    //Insert Last
    singlyLinkedList.insertFirst(11);
    singlyLinkedList.insertFirst(22);

    //Insert After
    singlyLinkedList.insertAfter(22, 9);

    //Delete an Item
    singlyLinkedList.delete(40);

    //Traverse
    singlyLinkedList.traverse();

    //Reverse Traversal
    //singlyLinkedList.reverseTraversal();
    //reverseTraversalWithTwoWhileLoops(mHead, mTail);
    //reverseTraverseRecursion(mHead);

    //Reverse List
    //mHead = reverseList(mHead);
    //traverse(mHead);
  }
}
