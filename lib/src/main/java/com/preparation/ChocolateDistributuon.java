package com.preparation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChocolateDistributuon {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.readLine().split(" ");
//    PrintWriter wr = new PrintWriter(System.out);
    int T = 1;
    int N = 5;
    int M = 8;
    int[] c = new int[]{1, 2, 3, 4, 5};
//    br.close();
//    wr.close();

    solve(c, M, N);
  }

  public static void solve(int[] C, int M, int N) {
    int sumOfSubArray = 0;

    for (int i = 0; i < C.length; i++) {
      sumOfSubArray += C[i];
    }

    int equalChocos = sumOfSubArray / M;
    int pending = sumOfSubArray % M;
    boolean found = false;
    int expectedCount = sumOfSubArray - pending;
    if (pending == 0) {
      System.out.println(equalChocos);
    } else {
      for (int i = 0; i < C.length; i++) {
        sumOfSubArray -= C[i];

        if (expectedCount == sumOfSubArray) {
          System.out.println(equalChocos);
          found = true;
          break;
        }
      }

      if (!found) {
        System.out.println(0);
      }
    }
  }
}
