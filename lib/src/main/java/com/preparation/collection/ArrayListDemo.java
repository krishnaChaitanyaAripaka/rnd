package com.preparation.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chaitanya.ak on 10/09/17.
 */

public class ArrayListDemo extends BaseList {

  public static void main(String[] args) {
    ArrayList al = new ArrayList();
    al.add("adf");
    al.add(32);
    al.add("g");
    al.add(76);
    al.add("two");
    al.add(898);
    System.out.println("=========Initial List of al=========");
    iterate(al);

    clone(al);
    add(al);
    add(1, al);
    addAll(al);
    addAll(1, al);
    remove(al);
    removeAll(al);
    retainAll(al);


    String[] aaaa = new String[10];

    for (String a : aaaa) {
      System.out.println("SimplyPrinting");
    }
  }

  private static void clone(ArrayList al) {
    System.out.println("=========clone al to newList (Shallow copy)========");
    List newList = (ArrayList) al.clone();

    System.out.println("hashcode : " + al.hashCode());
    System.out.println("hashcode : " + newList.hashCode());

    Object obj = al.get(2);
    System.out.println("Deleting " + obj + " in newList");
    newList.remove(obj);
    System.out.println("Deleted " + obj + " in newList");

    System.out.println("al => ");
    iterate(al);

    System.out.println("newList => ");
    iterate(newList);
  }

  private static void remove(List al) {
    System.out.println("=========remove========");
    long startTime = System.currentTimeMillis();
    System.out.println("start time : " + startTime);
    List al2 = new ArrayList();
    al2.add("one");
    al2.add("three");
    al.remove(al2);
    long endTime = System.currentTimeMillis();
    System.out.println("end time : " + endTime);
    System.out.println("Total Time (in ms) : " + (endTime - startTime));
    iterate(al);
  }

  private static void removeAll(List al) {
    System.out.println("=========removeAll========");
    List al2 = new ArrayList();
    al2.add("one");
    al2.add("three");
    al.removeAll(al2);
    iterate(al);
  }

  private static void retainAll(List al) {
    System.out.println("=========retainAll========");
    List al2 = new ArrayList();
    al2.add("two");
    al.retainAll(al2);
    iterate(al);
  }

}
