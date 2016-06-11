package com.preparation.datastructures;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by chaitanya.ak on 10/06/16.
 */
public class SetDemo {

  private static Object obj = new Object();
  private static HashMap<Object, Object> set1 = new HashMap<>();
  private static HashMap<Object, Object> set2 = new HashMap<>();
  private static HashMap<Object, Object> union = new HashMap<>();
  private static HashMap<Object, Object> intersection = new HashMap<>();

  public static void main(String[] args) {

    set1.put(1, obj);
    set1.put(2, obj);
    set1.put(3, obj);
    set1.put(3, obj);

    set2.put(6, obj);
    set2.put(2, obj);
    set2.put(9, obj);

    union(set1, set2);

    intersection(set1, set2);

    print(union);
    System.out.println("--------------");
    print(intersection);

  }

  static void print(HashMap<Object, Object> set ){
    Set keys = set.keySet();
    for(Object value : keys) {
      System.out.println(value);
    }
  }

  private static void union(HashMap<Object, Object>... sets) {
    for (HashMap<Object, Object> set : sets) {
      union.putAll(set);
    }
  }

  private static void intersection(HashMap<Object, Object>... sets) {
    HashMap<Object, Object> prev = null;

    for (HashMap<Object, Object> set : sets) {
      if (prev == null) {
        prev = set;
      } else {
        if (prev.size() > set.size()) {
          prev = set;
        }
      }
    }

    Set keys = prev.keySet();
    for(Object value : keys){
      boolean contains=true;
      for (int i=0;i<sets.length;i++) {
        contains=sets[i].containsKey(value);
      }

      if(contains){
        intersection.put(value,obj);
      }
    }
  }
}
