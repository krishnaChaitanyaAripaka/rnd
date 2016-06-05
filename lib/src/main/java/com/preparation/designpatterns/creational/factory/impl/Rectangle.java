package com.preparation.designpatterns.creational.factory.impl;

/**
 * Created by chaitanya.ak on 02/12/15.
 */
public class Rectangle implements
    com.preparation.designpatterns.creational.factory.interfaces.Shape {

  private String TAG = this.getClass().getSimpleName();

  @Override public void draw() {
    System.out.println(TAG);
  }
}
