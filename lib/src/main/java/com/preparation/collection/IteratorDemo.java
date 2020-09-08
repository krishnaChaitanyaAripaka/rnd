package com.preparation.collection;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/**
 * Created by chaitanya.ak on 10/09/17.
 */

public class IteratorDemo {

  public static void main(String[] args) {
    ArrayList al = new ArrayList();
    al.add(1);
    al.add(7);
    al.add(32);
    al.add("String");
    al.add(56);
    al.add(8);
    al.add(25);
    al.add(87);

    iterate(al);
    iterateWithConcurrentException(al);
  }

  private static void iterate(ArrayList list) {
    Iterator it = list.iterator();
    while (it.hasNext()) {
      System.out.print(it.next() + ", ");
    }
  }

  /**
   * Modification of existing list will lead to ConcurrentModificationException
   *
   * @see ConcurrentModificationException
   */
  private static void iterateWithConcurrentException(ArrayList list) {
    Iterator it = list.iterator();
    while (it.hasNext()) {
      System.out.print(it.next() + ", ");
      list.add(100);
      list.remove(0);
    }
  }
}
