package com.preparation.designpatterns.creational.singleton;

/**
 * Created by chaitanya.ak on 01/05/16.
 */
public class BillPughSingleTonDemo {
  public static void main(String a[]) {
    BillPughSingleTon
        instance = BillPughSingleTon.getInstance();
    instance.setNum(1);
    System.out.println(instance + ", Value : " + instance.getNum());

    BillPughSingleTon
        instance1 = BillPughSingleTon.getInstance();
    instance1.setNum(10);
    System.out.println(instance1 + ", Value : " + instance1.getNum());

    BillPughSingleTon
        instance2 = BillPughSingleTon.getInstance();
    instance2.setNum(11);
    System.out.println(instance + ", Value : " + instance.getNum());

    BillPughSingleTon
        instance3 = BillPughSingleTon.getInstance();
    instance3.setNum(12);
    System.out.println(instance + ", Value : " + instance.getNum());

    BillPughSingleTon
        instance4 = BillPughSingleTon.getInstance();
    instance4.setNum(13);
    System.out.println(instance + ", Value : " + instance.getNum());
  }
}
