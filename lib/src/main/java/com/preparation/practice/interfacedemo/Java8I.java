package com.preparation.practice.interfacedemo;

/**
 * Created by chaitanya.ak on 23/08/16.
 */
public interface Java8I {
  void display();

  default void hello() {
    System.out.println("hello : Java8I");
  }

  static void showPopUp() {
    System.out.println("showPopUp : Java8I");
  }
}
