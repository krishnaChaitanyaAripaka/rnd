package com.preparation.designpatterns.creational.abstractfactory.impl;

import com.preparation.designpatterns.creational.abstractfactory.interfaces.Shape;

/**
 * Created by m.susmitha on 7/9/16.
 */
public class Circle implements Shape {
	private String TAG = this.getClass().getSimpleName();

	@Override
	public void draw() {
		System.out.println(TAG);
	}
}
