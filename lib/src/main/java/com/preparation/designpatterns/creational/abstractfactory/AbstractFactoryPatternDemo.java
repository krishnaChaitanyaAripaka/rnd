package com.preparation.designpatterns.creational.abstractfactory;

import com.preparation.designpatterns.creational.abstractfactory.ColorFactory.ColorEnum;
import com.preparation.designpatterns.creational.abstractfactory.FactoryProducer.FactoryEnum;
import com.preparation.designpatterns.creational.abstractfactory.ShapeFactory.ShapeEnum;
import com.preparation.designpatterns.creational.abstractfactory.interfaces.Color;
import com.preparation.designpatterns.creational.abstractfactory.interfaces.Shape;

/**
 * Created by m.susmitha on 7/9/16.
 */
public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryEnum.SHAPE_FACTORY);
		Shape rect = shapeFactory.getShape(ShapeEnum.RECTANGLE);
		rect.draw();
		Shape cir = shapeFactory.getShape(ShapeEnum.CIRCLE);
		cir.draw();
		Shape square = shapeFactory.getShape(ShapeEnum.SQUARE);
		square.draw();

		AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryEnum.COLOR_FACTORY);
		Color green = colorFactory.getColor(ColorEnum.GREEN);
		green.fill();
		Color red = colorFactory.getColor(ColorEnum.RED);
		red.fill();
		Color blue = colorFactory.getColor(ColorEnum.BLUE);
		blue.fill();

	}
}
