package com.preparation.datastructures;

/**
 * Created by m.susmitha on 6/17/16.
 */
public class AVLNode {
	AVLNode left, right;
	int data;
	int height;

	/* Constructor */
	public AVLNode()
	{
		left = null;
		right = null;
		data = 0;
		height = 0;
	}
	/* Constructor */
	public AVLNode(int n)
	{
		left = null;
		right = null;
		data = n;
		height = 0;
	}
}
