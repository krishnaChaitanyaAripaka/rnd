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
//    singlyLinkedList.insertLast(1);
//
//    //Insert Last
//    singlyLinkedList.insertFirst(11);
//    singlyLinkedList.insertFirst(22);
//
//    //Insert After
//    singlyLinkedList.insertAfter(22, 9);
//
//    //Delete an Item
//    singlyLinkedList.delete(40);
//
//    //Traverse
//    singlyLinkedList.traverse();

    //Reverse Traversal
    //singlyLinkedList.reverseTraversal();
    //reverseTraversalWithTwoWhileLoops(mHead, mTail);
    //reverseTraverseRecursion(mHead);

    //Reverse List
    //mHead = reverseList(mHead);
    //traverse(mHead);

    //Stack3
    //11, 10, 9    - prev     -> return
    //9, 10, 11    - currentHead (9)

    //Stack2
    //8, 7, 6, 5   - prev     -> 8, 7, 6, 5, 11, 10, 9
    //5, 6, 7, 8   - currentHead (5)

    //Stack1
    //4, 3, 2, 1   - prev     -> 4, 3, 2, 1, 8, 7, 6, 5, 11, 10, 9
    //1, 2, 3, 4   - currentHead (1)
    singlyLinkedList.insertLast(1);
    singlyLinkedList.insertLast(2);
    singlyLinkedList.insertLast(3);
    singlyLinkedList.insertLast(4);
    singlyLinkedList.insertLast(5);
    singlyLinkedList.insertLast(6);
    singlyLinkedList.insertLast(7);
    singlyLinkedList.insertLast(8);
    singlyLinkedList.insertLast(9);
    singlyLinkedList.insertLast(10);
    singlyLinkedList.insertLast(11);
    singlyLinkedList.insertLast(12);
    singlyLinkedList.insertLast(13);
//    singlyLinkedList.reverseList(4);
    singlyLinkedList.reverseListSkip(15);
    singlyLinkedList.traverse();
  }
}
