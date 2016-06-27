package com.preparation.designpatterns.creational.factory;

/**
 * Created by chaitanya.ak on 02/12/15.
 */
public class FactoryDemo {

  public static void main(String a[]) {
    System.out.println("FactoryDemo");

    ShapeFactory shapeFactory = ShapeFactory.getInstance();
    shapeFactory.getShape(ShapeFactory.ShapeAction.RECTANGLE).draw();
    shapeFactory.getShape(ShapeFactory.ShapeAction.SQUARE).draw();
    shapeFactory.getShape(ShapeFactory.ShapeAction.NONE).draw();
  }

}
