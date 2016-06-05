package com.preparation.designpatterns.creational.singleton;

/**
 * Created by chaitanya.ak on 01/05/16.
 */
public class BillPughSingleTon {

  private int num;

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  private static class LazyLoader {
    private static final BillPughSingleTon INSTANCE = new BillPughSingleTon();
  }

  public static BillPughSingleTon getInstance() {
    return LazyLoader.INSTANCE;
  }
}
