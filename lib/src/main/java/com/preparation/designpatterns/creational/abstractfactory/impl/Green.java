package com.preparation.designpatterns.creational.abstractfactory.impl;

import com.preparation.designpatterns.creational.abstractfactory.interfaces.Color;

/**
 * Created by m.susmitha on 7/9/16.
 */
public class Green implements Color {
	private String TAG = this.getClass().getSimpleName();

	@Override
	public void fill() {
		System.out.println(TAG);
	}
}
