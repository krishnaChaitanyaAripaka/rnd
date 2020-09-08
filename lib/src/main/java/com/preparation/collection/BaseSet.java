package com.preparation.collection;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by chaitanya.ak on 10/09/17.
 */

public class BaseSet {

  protected static void remove(Object val, Set set) {
    System.out.println("=========remove " + val + " from set========");
    set.remove(val);
    iterate(set);
  }

  protected static void iterate(Set set) {
    System.out.println("Iterating set with Size : " + set.size());
    Iterator it = set.iterator();
    while (it.hasNext()) {
      System.out.print(it.next() + ", ");
    }
    System.out.println();
  }
}
