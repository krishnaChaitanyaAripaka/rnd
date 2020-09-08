package com.preparation.collection;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by chaitanya.ak on 10/09/17.
 */

public class EnumSetDemo {

  enum Days {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

  public static void main(String[] args) {
    Set set = EnumSet.of(Days.FRIDAY, Days.MONDAY, Days.TUESDAY);
    iterate(set);
    allOf();
    noneOf();
  }

  private static void noneOf() {
    System.out.println("=========noneOf========");
    EnumSet<Days> noneOf = EnumSet.noneOf(Days.class);
    iterate(noneOf);
  }

  private static void allOf() {
    System.out.println("=========allOf========");
    EnumSet<Days> enumAllOf = EnumSet.allOf(Days.class);
    iterate(enumAllOf);
  }

  private static void iterate(Set set) {
    System.out.println("Iterating set with Size : " + set.size());
    Iterator it = set.iterator();
    while (it.hasNext()) {
      System.out.print(it.next() + ", ");
    }
    System.out.println("\n");
  }
}
