package com.preparation.collection;

import java.util.Iterator;
import java.util.Queue;

/**
 * Created by chaitanya.ak on 10/09/17.
 */

public class BaseDeque {

  protected static void iterate(Queue queue) {
    System.out.println("Iterating set with Size : " + queue.size());
    Iterator it = queue.iterator();
    while (it.hasNext()) {
      System.out.print(it.next() + ", ");
    }
    System.out.println("\n");
  }

  /**
   * Adds value at the end
   */
  protected static <T> void offer(T val, Queue queue) {
    System.out.println("=========offer " + val + " ========");
    System.out.println("Is Added : " + queue.offer(val));
    iterate(queue);
  }

  /**
   * Removes and returns the first item
   */
  protected static void remove(Queue queue) {
    System.out.println("=========remove========");
    System.out.println(queue.remove());
    iterate(queue);
  }

  /**
   * Removes and returns the first item
   */
  protected static void poll(Queue queue) {
    System.out.println("=========poll========");
    System.out.println(queue.poll());
    iterate(queue);
  }

  /**
   * Just returns the first element but it doesn't remove from queue.
   */
  protected static void peek(Queue queue) {
    System.out.println("=========peek========");
    System.out.println(queue.peek());
    iterate(queue);
  }

  /**
   * Just returns the first element but it doesn't remove from queue.
   */
  protected static void element(Queue queue) {
    System.out.println("=========element========");
    System.out.println(queue.element());
    iterate(queue);
  }
}
