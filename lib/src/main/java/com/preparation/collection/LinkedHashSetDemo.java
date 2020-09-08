package com.preparation.collection;

import java.util.LinkedHashSet;

/**
 * Created by chaitanya.ak on 10/09/17.
 */

public class LinkedHashSetDemo extends BaseSet {

  public static void main(String[] args) {
    LinkedHashSet lhs = new LinkedHashSet();
    lhs.add(null);
    lhs.add(1);
    lhs.add(3);
    lhs.add(56);
    lhs.add(3);
    lhs.add(9);
    lhs.add(3);
    lhs.add(8);
    lhs.add(8);
    lhs.add(7);
    lhs.add(3);

    iterate(lhs);
    remove(8, lhs);
  }
}
