package com.preparation.collection;

import java.util.ArrayList;

/**
 * Created by chaitanya.ak on 14/09/17.
 */

public class ListTest {

  public static void main(String[] args) {
    ArrayList arrayList = new ArrayList();
    arrayList.add(1);
    arrayList.add(2);
    arrayList.add(3);
    arrayList.add(4);
    arrayList.add(5);
    arrayList.add(6);
    arrayList.add(7);
    arrayList.add(8);
    arrayList.add(9);
    Object[] obj1 = arrayList.toArray();

    ArrayList arrayList2 = new ArrayList();
//    arrayList2.add(5);
//    arrayList2.add(6);
//    arrayList2.add(7);
//    arrayList2.add(8);
//    arrayList2.add(9);
    arrayList2.add(10);
    arrayList2.add(11);
    arrayList2.add(12);
    arrayList2.add(13);
//    Object[] obj2 =
    Object[]  obj2=arrayList2.toArray(obj1);

    for (Object o : obj2) {
      System.out.println(o);
    }

//    for (Object o : obj2) {
//      System.out.println(o);
//    }

  }
}
