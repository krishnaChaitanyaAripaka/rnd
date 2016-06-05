package com.preparation.designpatterns.creational.singleton;


/**
 * Created by chaitanya.ak on 04/05/16.
 */
public class StaticBlockSingletonDemo {
  public static void main(String a[]) {
    System.out.println(StaticBlockSingleton.getInstance().hashCode());
    System.out.println(StaticBlockSingleton.getInstance().hashCode());
    System.out.println(StaticBlockSingleton.getInstance().hashCode());
  }
}
