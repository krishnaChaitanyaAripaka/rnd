package com.preparation.designpatterns.creational.protype;

/**
 * Created by chaitanya.ak on 11/05/16.
 */
public class CopyTest {
  public static void main(String[] args) throws CloneNotSupportedException {
    //Original Object
    Student
        stud = new Student("John", "Algebra");
    System.out.println("Original Object: " + stud.getName() + " - " + stud.getSubj().getName());

    //Clone Object
    Student
        clonedStud = (Student) stud.clone();
    System.out.println(
        "Cloned Object: " + clonedStud.getName() + " - " + clonedStud.getSubj().getName());

    System.out.println(stud.hashCode());
    System.out.println(clonedStud.hashCode());

    System.out.println(stud.getName().hashCode());
    System.out.println(clonedStud.getName().hashCode());

    System.out.println(stud.getSubj().hashCode());
    System.out.println(clonedStud.getSubj().hashCode());

    stud.setName("Dan");
    stud.getSubj().setName("Physics");


    System.out.println(stud.getName());
    System.out.println(clonedStud.getName());

    System.out.println(stud.getSubj().getName());
    System.out.println(clonedStud.getSubj().getName());

    System.out.println(stud.getName().hashCode());
    System.out.println(clonedStud.getName().hashCode());

    System.out.println(
        "Original Object after it is updated: " + stud.getName() + " - " + stud.getSubj()
            .getName());

    System.out.println(
        "Cloned Object after updating original object: " + clonedStud.getName() + " - " + clonedStud
            .getSubj()
            .getName());
  }
}
