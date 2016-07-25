package com.preparation.designpatterns.creational.abstractfactory;

import com.preparation.designpatterns.creational.abstractfactory.ColorFactory.ColorEnum;
import com.preparation.designpatterns.creational.abstractfactory.impl.Circle;
import com.preparation.designpatterns.creational.abstractfactory.impl.NoColor;
import com.preparation.designpatterns.creational.abstractfactory.impl.NoShape;
import com.preparation.designpatterns.creational.abstractfactory.impl.Rectangle;
import com.preparation.designpatterns.creational.abstractfactory.impl.Square;
import com.preparation.designpatterns.creational.abstractfactory.interfaces.Color;
import com.preparation.designpatterns.creational.abstractfactory.interfaces.Shape;

/**
 * Created by m.susmitha on 7/9/16.
 */
public class ShapeFactory extends AbstractFactory {
	public enum ShapeEnum {
		RECTANGLE, SQUARE, CIRCLE, NO_SHAPE
	}

	@Override
	Color getColor(ColorEnum color) {
		return new NoColor();
	}

	@Override
	Shape getShape(ShapeEnum shape) {
		switch (shape) {
			case RECTANGLE:
				return new Rectangle();
			case CIRCLE:
				return new Circle();
			case SQUARE:
				return new Square();
			default:
				return new NoShape();
		}

	}
}
