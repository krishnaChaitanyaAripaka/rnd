package com.preparation.designpatterns.creational.singleton;

/**
 * Created by chaitanya.ak on 03/05/16.
 */
public class StaticBlockSingleton {

  private static StaticBlockSingleton instance;

  private StaticBlockSingleton(){}

  //static block initialization for exception handling
  static{
    try{
      instance = new StaticBlockSingleton();
    }catch(Exception e){
      throw new RuntimeException("Exception occured in creating singleton instance");
    }
  }

  public static StaticBlockSingleton getInstance(){
    return instance;
  }
}
