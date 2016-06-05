package com.preparation.designpatterns.creational.factory;

import com.preparation.designpatterns.creational.factory.impl.Rectangle;

/**
 * Created by chaitanya.ak on 02/12/15.
 */
public class ShapeFactory {

  private String TAG = this.getClass().getName();

  private ShapeFactory() {}
  public enum ShapeAction{
    RECTANGLE,
    SQUARE,
  }

  public static ShapeFactory getInstance(){
    return new ShapeFactory();
  }

  public com.preparation.designpatterns.creational.factory.interfaces.Shape getShape(ShapeAction shapeAction) {
    switch (shapeAction) {
      case RECTANGLE:
        return new Rectangle();

      case SQUARE:
        return new com.preparation.designpatterns.creational.factory.impl.Square();

    }

    return null;
  }
}
