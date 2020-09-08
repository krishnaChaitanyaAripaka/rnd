package com.preparation;

import java.util.ArrayList;

/**
 * Created by chaitanya.ak on 18/11/17.
 */

public class DialyHunt {

  public static void main(String[] args) {

//    String a = "(())))(";
//    String []left = a.split("\\(");
//    String []right = a.split("\\)");
//    for (int i = 0; i < left.length; i++) {
//      System.out.println("left : index : " + i + " :" + left[i]);
//    }
//    for (int i = 0; i < right.length; i++) {
//      System.out.println("right : index : " + i + " :" + right[i]);
//    }
//    int[] a = new int[]{-1, -3, 1, 3, 6, 4, 1, 2};
//    test1(a);

    test2();
  }

  private static int test1(int[] a) {
    boolean isNegativeNumber = false;
    int smallestPositive = 1;
    for (int i = 0; i < a.length; i++) {
      if (a[i] > 0) {

        if(a[i] <= smallestPositive) {

        }
        isNegativeNumber = false;
      } else {
        isNegativeNumber = true;
      }
    }

    if (isNegativeNumber) {
      return 1;
    } else {
      return smallestPositive;
    }
  }

  private static void test2() {
    ArrayList a = (ArrayList) null;
    System.out.println(a);
  }
}
