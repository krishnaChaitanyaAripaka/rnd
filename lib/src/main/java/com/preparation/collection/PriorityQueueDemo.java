package com.preparation.collection;


import java.util.PriorityQueue;

/**
 * Created by chaitanya.ak on 10/09/17.
 */

public class PriorityQueueDemo extends BaseQueue {

  public static void main(String[] args) {
    PriorityQueue pq = new PriorityQueue();
    try {
      pq.add(null);
    } catch (NullPointerException e) {
      System.out.println("Unchecked Exception msg : PriorityQueue doesn't allow null values ");
    }
    pq.add(91);
    pq.add(122);
    pq.add(56);
    pq.add(65);
    pq.add(9);
    pq.add(99);
    pq.add(8);
    pq.add(8);
    pq.add(8);
    pq.add(8);
    pq.add(88);
    pq.add(7);
    pq.add(3);
    iterate(pq);
    offer(100, pq);
    remove(pq);
    poll(pq);
    peek(pq);
    element(pq);
  }
}
