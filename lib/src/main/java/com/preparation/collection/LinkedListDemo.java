package com.preparation.collection;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by chaitanya.ak on 10/09/17.
 */

public class LinkedListDemo extends BaseList {

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.add("adf");
    ll.add(32);
    ll.add("g");
    ll.add(76);
    ll.add("two");
    ll.add(898);
    ll.add(898);
    iterate(ll);

    add(ll);
    add(1, ll);
    addAll(ll);
    addAll(1, ll);
    addFirst(ll);
    addLast(ll);
    get(3, ll);
    getFirst(ll);
    getLast(ll);
    remove(ll);
    removeFirst(ll);
    removeLast(ll);
  }

  private static void addFirst(LinkedList list) {
    System.out.println("=========addFirst========");
    List ll2 = new LinkedList();
    ll2.add("one");
    ll2.add("two");
    ll2.add("three");
    list.addFirst(ll2);
    iterate(list);
  }

  private static void addLast(LinkedList list) {
    System.out.println("=========addLast========");
    List ll2 = new LinkedList();
    ll2.add("one");
    ll2.add("two");
    ll2.add("three");
    list.addLast(ll2);
    iterate(list);
  }

  private static void get(int index, LinkedList list) {
    System.out.println("=========get at index " + index + "========");
    System.out.println(list.get(index));
    System.out.println("");
  }

  private static void getFirst(LinkedList list) {
    System.out.println("=========getFirst========");
    System.out.println(list.getFirst());
    System.out.println("");
  }


  private static void getLast(LinkedList list) {
    System.out.println("=========getLast========");
    System.out.println(list.getLast());
    System.out.println("");
  }

  private static void remove(LinkedList list) {
    System.out.println("=========remove========");
    list.remove();
    iterate(list);
  }

  private static void removeFirst(LinkedList list) {
    System.out.println("=========removeFirst========");
    list.removeFirst();
    iterate(list);
  }

  private static void removeLast(LinkedList list) {
    System.out.println("=========removeLast========");
    list.removeLast();
    iterate(list);
  }
}