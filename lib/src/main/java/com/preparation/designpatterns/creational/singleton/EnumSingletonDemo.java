package com.preparation.designpatterns.creational.singleton;

/**
 * Created by chaitanya.ak on 04/05/16.
 */
public class EnumSingletonDemo {
  public static void main(String a[]) {
    System.out.println(EnumSingleton.INSTANCE.hashCode());
    System.out.println(EnumSingleton.INSTANCE.hashCode());
    System.out.println(EnumSingleton.INSTANCE.hashCode());
  }
}
