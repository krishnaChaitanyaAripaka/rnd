package com.preparation.hackerrank;

import java.util.Scanner;

/**
 * Created by chaitanya.ak on 02/08/16.
 */
public class SansaAndXOR {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int i = 0; i < t; i++) {
      int n = in.nextInt();
      int a[] = new int[n];
      for (int a_i = 0; a_i < a.length; a_i++) {
        a[a_i] = in.nextInt();
      }

      int xor = 0;
      if (n % 2 != 0) {
        for (int a_i = 0; a_i < a.length; a_i = a_i + 2) {
          xor ^= a[a_i];
        }
      }
      System.out.println(xor);
    }
  }
}
