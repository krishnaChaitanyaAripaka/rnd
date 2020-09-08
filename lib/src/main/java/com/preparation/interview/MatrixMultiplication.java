package com.preparation.interview;

public class MatrixMultiplication {

  public static void main(String[] args) {

    int a[] = {2, 3, 6, 4, 5, 7};
    int k = 2;
    int n[][] = new int[k * k][a.length];

    int x = 0;
    for (int i = 0; i < k * k; ) {
      for (int j = 0; j < a.length; j++) {
        n[i][j] = a[x + x / 2 + j / 2];
      }
      i++;
      if (i % 2 == 0) {
        x = x + k;
      }
    }

    for(int i=0; i<k*k; i++) {
      for(int j=0; j<n.length; j++) {
        System.out.println(n[i]);
      }
    }
  }
}
