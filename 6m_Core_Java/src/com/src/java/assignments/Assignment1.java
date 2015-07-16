package com.src.java.assignments;

public class Assignment1 {
	public static void main(String[] args) {
		StringAdapter strVct = new StringAdapter();
		strVct.add("test");
		strVct.add("temp");
		
		System.out.println(strVct.contains("test"));
	}	
}
