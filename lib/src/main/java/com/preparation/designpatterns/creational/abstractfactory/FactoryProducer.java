package com.preparation.designpatterns.creational.abstractfactory;

/**
 * Created by m.susmitha on 7/9/16.
 */
public class FactoryProducer {
	public enum FactoryEnum {
		SHAPE_FACTORY, COLOR_FACTORY
	}

	public static AbstractFactory getFactory(FactoryEnum factory) {
		switch (factory) {
			case SHAPE_FACTORY:
				return new ShapeFactory();
			case COLOR_FACTORY:
				return new ColorFactory();
			default:
				return null;
		}
	}
}
