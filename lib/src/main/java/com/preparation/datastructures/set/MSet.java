package com.preparation.datastructures.set;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by m.susmitha on 6/11/16.
 */
public class MSet<E> {
	private Object obj = new Object();
	private HashMap<E, Object> set = new HashMap<>();

	MSet() {

	}

	void put(E key) {
		set.put(key, obj);
	}

	MSet union(MSet... sets) {
		MSet union = new MSet();
		union.set.putAll(this.set);
		for (MSet i : sets) {
			union.set.putAll(i.set);
		}
		return union;
	}

	//TODO discuss
	MSet intersection(MSet... sets) {
		MSet intersection = new MSet();
		MSet prev = null;

		for (MSet i : sets) {
			if (prev == null) {
				prev = i;
			} else {
				if (prev.set.size() > i.set.size()) {
					prev = i;
				}
			}
		}

		Set keys = prev.set.keySet();
		for (Object value : keys) {
			boolean contains = true;
			for (int i = 0; i < sets.length; i++) {
				contains = sets[i].set.containsKey(value);
				if (!contains) {
					break;
				}
			}

			if (contains) {
				intersection.put(value);
			}
		}
		return intersection;
	}

	void print() {
		Set keys = set.keySet();
		for (Object value : keys) {
			System.out.println(value);
		}
	}
}
