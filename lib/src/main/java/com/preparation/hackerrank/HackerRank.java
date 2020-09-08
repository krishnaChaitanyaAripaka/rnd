package com.preparation.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by chaitanya.ak on 26/07/16.
 */
public class HackerRank {
  private static final int LOUISE = 0;
  private static final int RICHARD = 1;
  private static int currentPlayer = LOUISE;

  public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int i = 0; i < t; i++) {
      BigInteger n = in.nextBigInteger();
      currentPlayer = LOUISE;
      String binaryOfN = n.toString(2);
      while (true) {
        int indexOfOne = binaryOfN.indexOf("1", 1);
        if (indexOfOne == -1) { //even
          binaryOfN = binaryOfN.substring(0, binaryOfN.length() - 1);

          if (binaryOfN.equalsIgnoreCase("1")) {
            setPlayerWin(currentPlayer);
            break;
          }
        } else { //odd
          n = new BigInteger(String.valueOf(binaryOfN.length() - 1));
          binaryOfN = n.toString(2);

          if (binaryOfN.equalsIgnoreCase("1")) {
            setPlayerWin(currentPlayer);
            break;
          }
        }

        if (currentPlayer == LOUISE) {
          currentPlayer = RICHARD;
        } else {
          currentPlayer = LOUISE;
        }
      }
    }
  }

  private static void setPlayerWin(int playerId) {
    switch (playerId) {
      case LOUISE:
        System.out.println("Louise");
        break;
      case RICHARD:
        System.out.println("Richard");
        break;
    }
  }
}
