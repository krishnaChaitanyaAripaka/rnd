package com.preparation.designpatterns.creational.factory.impl;

import com.preparation.designpatterns.creational.factory.interfaces.Shape;

/**
 * Created by chaitanya.ak on 22/06/16.
 */
public class NoShape implements Shape{
  @Override public void draw() {
    System.out.println("Shape can't be drawn");
  }
}
