package com.preparation.designpatterns.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * Created by chaitanya.ak on 01/05/16.
 */
public class SerializationWIthSingletonDemo {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    SerializationSingleton
        instanceOne = SerializationSingleton.getInstance();
    ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
    out.writeObject(instanceOne);
    out.close();

    //deserailize from file to object
    ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
    SerializationSingleton
        instanceTwo = (SerializationSingleton) in.readObject();
    in.close();

    System.out.println("instanceOne hashCode=" + instanceOne.hashCode());
    System.out.println("instanceTwo hashCode=" + instanceTwo.hashCode());
  }
}
