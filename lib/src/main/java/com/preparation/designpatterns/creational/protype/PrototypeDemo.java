package com.preparation.designpatterns.creational.protype;

import java.util.HashMap;

/**
 * Created by chaitanya.ak on 04/05/16.
 */
public class PrototypeDemo {
  static HashMap<Integer, Data> original;
  static HashMap<Integer, Data> cloned;

  static {
    original = new HashMap<>();
    Data
        data = new Data(1, "Krishna", "Ola");
    original.put(10, data);

    //data = new Data();
    //data.setId(2);
    //data.setName("b");
    //original.put(20, data);
  }

  public static void main(String a[]) throws CloneNotSupportedException {
    //data hashcode should be different as data.clone() hashcode

    System.out.println("========   HashMap Clone   ==========");
    cloned = (HashMap<Integer, Data>) original.clone();
    //cloned.get(10).setName("Krishna");
    //
    //System.out.println(original.hashCode());
    //System.out.println(cloned.hashCode());
    //
    //System.out.println(original.get(10).hashCode());
    //System.out.println(cloned.get(10).hashCode());
    //
    //System.out.println(original.get(10).getName().hashCode());
    //System.out.println(cloned.get(10).getName().hashCode());

    System.out.println("========   Data Object Clone   ==========");
    Data originalDataObj = original.get(10); //  krishna
    Data clonedDataObj = (Data) original.get(10).clone();

    //data.clone() != data
    System.out.println(originalDataObj.hashCode());
    System.out.println(clonedDataObj.hashCode());

    //data classname should be same as data.clone() classname
    System.out.println(original.get(10).getClass());
    System.out.println(cloned.get(10).getClass());

    //data.equals(data.clone()) should be same as it compares data
    System.out.println(cloned.get(10).equals(original.get(10)));

    //Shallow Copy - New memory location -> New field object
    originalDataObj.setName("Ram");
    System.out.println(originalDataObj.getName()); // Ram
    System.out.println(clonedDataObj.getName()); // Krishna

    //Shallow Copy - Same reference location -> Same Memory location
    originalDataObj.getCompany().setName("HCL");
    System.out.println(originalDataObj.getCompany().getName()); // HCL
    System.out.println(clonedDataObj.getCompany().getName()); // HCL
  }
}
