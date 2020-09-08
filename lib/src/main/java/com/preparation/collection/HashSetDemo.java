package com.preparation.collection;

import java.util.HashSet;

/**
 * Created by chaitanya.ak on 10/09/17.
 */

public class HashSetDemo extends BaseSet {

  public static void main(String[] args) {
    HashSet hs = new HashSet();
    hs.add(null);
    hs.add(1);
    hs.add(3);
    hs.add(56);
    hs.add(3);
    hs.add(9);
    hs.add(3);
    hs.add(8);
    hs.add(8);
    hs.add(7);
    hs.add(3);

    iterate(hs);
    remove(8, hs);
  }

}
