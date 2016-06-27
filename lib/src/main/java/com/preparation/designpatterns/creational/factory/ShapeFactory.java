package com.preparation.designpatterns.creational.factory;

import com.preparation.designpatterns.creational.factory.impl.NoShape;
import com.preparation.designpatterns.creational.factory.impl.Rectangle;
import com.preparation.designpatterns.creational.factory.impl.Square;
import com.preparation.designpatterns.creational.factory.interfaces.Shape;

/**
 * Created by chaitanya.ak on 02/12/15.
 */
public class ShapeFactory {

  private String TAG = this.getClass().getName();

  private ShapeFactory() {}
  public enum ShapeAction{
    RECTANGLE,
    SQUARE,
    NONE
  }

  public static ShapeFactory getInstance(){
    return new ShapeFactory();
  }

  public Shape getShape(ShapeAction shapeAction) {
    switch (shapeAction) {
      case RECTANGLE:
        return new Rectangle();

      case SQUARE:
        return new Square();
    }

    return new NoShape();
  }
}
