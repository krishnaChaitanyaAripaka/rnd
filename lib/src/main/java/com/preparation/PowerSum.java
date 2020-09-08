package com.preparation;

import java.io.IOException;

public class PowerSum {

  public static void main(String[] args) throws IOException {

//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//    String arr[] = br.readLine().split(" ");
//    int l = Integer.parseInt(arr[0]);
//    int r = Integer.parseInt(arr[1]);

    int l = 25;
    int r = 30;

    powerSum(l, r);
  }

  public static void powerSum(int l, int r) {
    int powerSum = 0;
    int p = 2, q = 2;
    int sqrtValue = (int) Math.sqrt(l);

    for (int i = l; i < r; ) {
      int valL = (int) (Math.pow(sqrtValue, p));
      int leftOver = l - valL;

      int valR = (int) (Math.pow(leftOver, q));
      if (valL + valR == l || Math.sqrt(valR) == leftOver) {
        powerSum++;
        l++;
        i++;
      } else if (valR > l) {
        sqrtValue--;
        p++;
      } else if (valL + valR > l) {
        sqrtValue--;
      }
    }

    System.out.println(powerSum);
  }
}
