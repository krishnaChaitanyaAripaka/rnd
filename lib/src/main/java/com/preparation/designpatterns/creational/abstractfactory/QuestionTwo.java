package com.preparation.designpatterns.creational.abstractfactory;

import java.util.Scanner;

public class QuestionTwo {
  public static void main(String a[]) {
    Scanner scanner= new Scanner(System.in);
    int x = scanner.nextInt();
    int result = x;
    int startingDivisible = 2;
    int consecutiveNumbers = startingDivisible;

    while (result > 1 && consecutiveNumbers < x / 2) {
      if (result % consecutiveNumbers == 0) {
        result = result / consecutiveNumbers++;
      } else {
        result = x;
        consecutiveNumbers = ++startingDivisible;
      }
    }

    if (result == 1) {
      System.out.print("YES");
    } else {
      System.out.print("NO");
    }
  }
}
