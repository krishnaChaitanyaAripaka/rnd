package com.preparation.designpatterns.creational.protype;

/**
 * Created by chaitanya.ak on 11/05/16.
 */
public class Subject implements Cloneable{
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String s) {
    name = s;
  }

  public Subject(String s) {
    name = s;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    System.out.println("Subject Clone");
    return super.clone();
  }
}
