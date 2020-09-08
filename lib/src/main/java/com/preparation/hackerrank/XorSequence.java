package com.preparation.hackerrank;

import java.util.Scanner;

/**
 * Created by chaitanya.ak on 02/08/16.
 */
public class XorSequence {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int Q = in.nextInt();

    for (int a0 = 0; a0 < Q; a0++) {
      long L = in.nextLong();
      long R = in.nextLong();
      long result = 0;
      long currentValue = -1;
      for (long i = 0; i <= R; i++) {
        if (currentValue != -1) {
          currentValue = currentValue ^ i;
        } else {
          currentValue = 0;
        }

        if (i >= L) {
          result ^= currentValue;
        }
      }
      System.out.println(result);
    }
  }
}
