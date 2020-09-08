package com.preparation.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chaitanya.ak on 10/09/17.
 */

public class BaseList {

  protected static void iterate(List list) {
    System.out.println("Iterating list with Size : " + list.size());
    for (Object a : list) {
      System.out.print(a + ", ");
    }
    System.out.println("\n");
  }

  protected static void add(List list) {
    System.out.println("=========add========");
    List list2 = new ArrayList();
    list2.add("one");
    list2.add("two");
    list2.add("three");
    list.add(list2);
    iterate(list);
  }

  protected static void addAll(List list) {
    System.out.println("=========addAll========");
    List list2 = new ArrayList();
    list2.add("one");
    list2.add("two");
    list2.add("three");
    list.addAll(list2);
    iterate(list);
  }

  protected static void add(int index, List list) {
    System.out.println("=========add at index " + index + "========");
    List list2 = new ArrayList();
    list2.add("one");
    list2.add("two");
    list2.add("three");
    list.add(index, list2);
    iterate(list);
  }


  protected static void addAll(int index, List list) {
    System.out.println("=========addAll at index " + index + "========");
    List list2 = new ArrayList();
    list2.add("one");
    list2.add("two");
    list2.add("three");
    list.addAll(index, list2);
    iterate(list);
  }

}
