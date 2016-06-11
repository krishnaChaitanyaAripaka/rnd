package com.preparation.datastructures;

/**
 * Created by chaitanya.ak on 10/06/16.
 */
public class SetDemo {


	public static void main(String[] args) {

		MSet set1 = new MSet();
		set1.put(1);
		set1.put(2);
		set1.put(3);
		set1.put(9);

		MSet set2 = new MSet();
		set2.put(6);
		set2.put(2);
		set2.put(9);

		MSet set3 = new MSet();
		set3.put(10);
		set3.put(1);
		set3.put(9);

		//TODO
		MSet union = set1.union(set2, set3);
		union.print();

		System.out.println("--------------");

		MSet intersection = set1.intersection(set1, set2, set3);
		intersection.print();


	}


}
