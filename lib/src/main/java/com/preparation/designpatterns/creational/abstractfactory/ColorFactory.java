package com.preparation.designpatterns.creational.abstractfactory;

import com.preparation.designpatterns.creational.abstractfactory.ShapeFactory.ShapeEnum;
import com.preparation.designpatterns.creational.abstractfactory.impl.Blue;
import com.preparation.designpatterns.creational.abstractfactory.impl.Green;
import com.preparation.designpatterns.creational.abstractfactory.impl.NoColor;
import com.preparation.designpatterns.creational.abstractfactory.impl.NoShape;
import com.preparation.designpatterns.creational.abstractfactory.impl.Red;
import com.preparation.designpatterns.creational.abstractfactory.interfaces.Color;
import com.preparation.designpatterns.creational.abstractfactory.interfaces.Shape;

/**
 * Created by m.susmitha on 7/9/16.
 */
public class ColorFactory extends AbstractFactory {
	public enum ColorEnum {
		RED, GREEN, BLUE
	}

	@Override
	Color getColor(ColorEnum color) {
		switch (color) {
			case RED:
				return new Red();
			case GREEN:
				return new Green();
			case BLUE:
				return new Blue();
			default:
				return new NoColor();
		}
	}

	@Override
	Shape getShape(ShapeEnum shape) {
		return new NoShape();
	}


}
