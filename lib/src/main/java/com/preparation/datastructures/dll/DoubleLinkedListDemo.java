package com.preparation.datastructures.dll;

/**
 * Describes data transactions in a Double linked list
 *
 * @author Krishna Chaitanya
 * @since 04/06/16
 */
public class DoubleLinkedListDemo {

  public static void main(String a[]) {

    DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
    doublyLinkedList.insertLast(1);

    //Insert Last
    doublyLinkedList.insertFirst(11);
    doublyLinkedList.insertFirst(22);

    //Insert After
    doublyLinkedList.insertAfter(22, 9);

    //Delete an Item
    //delete(mHead, 1);

    doublyLinkedList.traverseFront();
    //doublyLinkedList.reverseList();
    //doublyLinkedList.traverseBack();
  }

}
