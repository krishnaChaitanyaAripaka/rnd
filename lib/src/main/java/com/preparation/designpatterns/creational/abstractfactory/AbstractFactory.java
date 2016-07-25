package com.preparation.designpatterns.creational.abstractfactory;

import com.preparation.designpatterns.creational.abstractfactory.ColorFactory.ColorEnum;
import com.preparation.designpatterns.creational.abstractfactory.ShapeFactory.ShapeEnum;
import com.preparation.designpatterns.creational.abstractfactory.interfaces.Color;
import com.preparation.designpatterns.creational.abstractfactory.interfaces.Shape;

/**
 * Created by m.susmitha on 7/9/16.
 */
public abstract class AbstractFactory {
	abstract Color getColor(ColorEnum color);

	abstract Shape getShape(ShapeEnum shape);
}
