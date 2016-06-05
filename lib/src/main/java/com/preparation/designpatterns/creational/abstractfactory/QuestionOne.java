package com.preparation.designpatterns.creational.abstractfactory;

import java.util.HashMap;
import java.util.Scanner;

public class QuestionOne {

  public static void main(String a[]) {
    Scanner scanner= new Scanner(System.in);
    String test = scanner.next();
    HashMap<String, Integer> map = new HashMap<>();
    int length = 0;
    for (int i=0; i<test.length(); i++) {
      Integer value = map.get(String.valueOf(test.charAt(i)));
      map.put(String.valueOf(test.charAt(i)), value != null ? length++ : 1);
    }

    System.out.print(length);

  }

}
