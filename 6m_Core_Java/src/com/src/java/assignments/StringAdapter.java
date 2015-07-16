package com.src.java.assignments;

import java.util.Vector;

public class StringAdapter implements StringCollection {

	@SuppressWarnings("rawtypes")
	Vector vector = new Vector();
	
	@Override
	public boolean contains(String str) {		
		return vector.contains((this.stringToObject(str)));
	}
	
	@SuppressWarnings("unchecked")
	public void add(String str) {
		vector.add(this.stringToObject(str));
	}

	private Object stringToObject(String str) {
		return (Object) str;
	}
}
