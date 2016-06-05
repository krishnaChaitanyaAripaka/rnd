package com.preparation.designpatterns.creational.protype;

/**
 * Created by chaitanya.ak on 11/05/16.
 */
class Student implements Cloneable {
  //Contained object
  private Subject subj;

  private String name;

  public Subject getSubj() {
    return subj;
  }

  public String getName() {
    return name;
  }

  public void setName(String s) {
    name = s;
  }

  public Student(String s, String sub) {
    name = s;
    subj = new Subject(sub);
  }

  public Object clone() throws CloneNotSupportedException {
    //shallow copy
    System.out.println("Student Clone");
    return super.clone();
  }
}
