package com.preparation.designpatterns.creational.protype;

/**
 * Created by chaitanya.ak on 11/05/16.
 */
class Student implements Cloneable {
  //Contained object

  public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a = a;
  }

  private int a;

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
    //deep copy
    Student student = (Student) super.clone();
    student.subj = (Subject) subj.clone();

    System.out.println("Student Clone");
    return student;
  }

//  public Object clone() throws CloneNotSupportedException {
//    //shallow copy
//    System.out.println("Student Clone");
//    return super.clone();
//  }
}
