package com.preparation.collection;


import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by chaitanya.ak on 10/09/17.
 */

public class ArrayDequeDemo extends BaseDeque {

  public static void main(String[] args) {
    ArrayDeque ad = new ArrayDeque();
    try {
      ad.add(null);
    } catch (NullPointerException e) {
      System.out.println("Unchecked Exception msg : PriorityQueue doesn't allow null values ");
    }
    ad.add(91);
    ad.add(122);
    ad.add(56);
    ad.add(65);
    ad.add(9);
    ad.add(99);
    ad.add(8);
    ad.add(8);
    ad.add(8);
    ad.add(8);
    ad.add(88);
    ad.add(7);
    ad.add(3);
    iterate(ad);
    offer(100, ad);
    remove(ad);
    poll(ad);
    peek(ad);
    element(ad);
    offerFirst(111, ad);
    offerLast(222, ad);
    peekFirst(ad);
    peekLast(ad);
  }

  private static <T> void offerFirst(T t, Deque deque) {
    System.out.println("=========offerFirst " + t + " ========");
    System.out.println(deque.offerFirst(t));
    iterate(deque);
  }

  private static <T> void offerLast(T t, Deque deque) {
    System.out.println("=========offerLast " + t + " ========");
    System.out.println(deque.offerLast(t));
    iterate(deque);
  }

  private static <T> void peekFirst(Deque deque) {
    System.out.println("=========peekFirst========");
    System.out.println(deque.peekFirst());
    iterate(deque);
  }

  private static <T> void peekLast(Deque deque) {
    System.out.println("=========peekLast========");
    System.out.println(deque.peekLast());
    iterate(deque);
  }
}
