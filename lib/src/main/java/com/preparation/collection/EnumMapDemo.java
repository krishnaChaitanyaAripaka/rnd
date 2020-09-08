package com.preparation.collection;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by chaitanya.ak on 10/09/17.
 */

public class EnumMapDemo {

  enum Days {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

  public static void main(String[] args) {
    /**
     * Throws NullPointerException if value of the constructor is other than enum class
     * Ex : EnumMap enumMap = new EnumMap(ArrayList.class);
     */
    EnumMap enumMap = new EnumMap(Days.class);
    enumMap.put(Days.SUNDAY, "1");
    enumMap.put(Days.MONDAY, "2");
    enumMap.put(Days.TUESDAY, "3");
    enumMap.put(Days.WEDNESDAY, "4");
    iterate(enumMap);
  }

  private static void iterate(Map map) {
    System.out.println("Iterating set with Size : " + map.size());
    Iterator it = map.entrySet().iterator();
    while (it.hasNext()) {
      System.out.print(it.next() + ", ");
    }
    System.out.println("\n");
  }
}
