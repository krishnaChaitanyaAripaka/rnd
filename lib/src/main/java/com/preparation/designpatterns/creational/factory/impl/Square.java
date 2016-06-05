package com.preparation.designpatterns.creational.factory.impl;

import com.preparation.designpatterns.creational.factory.interfaces.Shape;

/**
 * Created by chaitanya.ak on 02/12/15.
 */
public class Square implements Shape {
  private String TAG = this.getClass().getSimpleName();

  @Override public void draw() {
    System.out.println(TAG);
  }
}
