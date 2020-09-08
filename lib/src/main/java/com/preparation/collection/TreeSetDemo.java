package com.preparation.collection;

import java.util.TreeSet;

/**
 * Created by chaitanya.ak on 10/09/17.
 */

public class TreeSetDemo extends BaseSet {

  public static void main(String[] args) {
    TreeSet ts = new TreeSet();
    try {
      ts.add(null);
    } catch (NullPointerException e) {
      System.out.println("Unchecked Exception msg : TreeSet doesn't allow null values ");
    }
    ts.add(1);
    ts.add(3);
    ts.add(56);
    ts.add(3);
    ts.add(9);
    ts.add(3);
    ts.add(8);
    ts.add(8);
    ts.add(7);
    ts.add(3);

    iterate(ts);
    ceiling(ts);
    floor(ts);
    first(ts);
    last(ts);
    headSet(ts);
    tailSet(ts);
    higher(ts);
    lower(ts);
    pollFirst(ts);
    pollLast(ts);
    remove(8, ts);
  }

  private static void ceiling(TreeSet set) {
    System.out.println("=========ceiling========");
    System.out.println(set.ceiling(7));
    iterate(set);
  }

  private static void floor(TreeSet set) {
    System.out.println("=========floor========");
    System.out.println(set.floor(7));
    iterate(set);
  }

  private static void first(TreeSet set) {
    System.out.println("=========first========");
    System.out.println(set.first());
    iterate(set);
  }

  private static void last(TreeSet set) {
    System.out.println("=========last========");
    System.out.println(set.last());
    iterate(set);
  }

  private static void headSet(TreeSet set) {
    System.out.println("=========headSet========");
    System.out.println(set.headSet(8));
    iterate(set);
  }

  private static void tailSet(TreeSet set) {
    System.out.println("=========tailSet========");
    System.out.println(set.tailSet(8));
    iterate(set);
  }

  private static void higher(TreeSet set) {
    System.out.println("=========higher========");
    System.out.println(set.higher(7));
    iterate(set);
  }

  private static void lower(TreeSet set) {
    System.out.println("=========lower========");
    System.out.println(set.lower(7));
    iterate(set);
  }

  private static void pollFirst(TreeSet set) {
    System.out.println("=========pollFirst========");
    System.out.println(set.pollFirst());
    iterate(set);
  }

  private static void pollLast(TreeSet set) {
    System.out.println("=========pollLast========");
    System.out.println(set.pollLast());
    iterate(set);
  }
}
