package com.test.interview.array;

public class ArrayDynamicTest {

	public static void main(String[] args) {
		
		ArrayDynamic arr = new ArrayDynamic(5);
		arr.addElement(1);
		arr.addElement(2);
		arr.addElement(3);
		arr.addElement(4);
		arr.addElement(5);
		arr.addElement(6);
		arr.addElement(7);
		arr.addElement(8);
		
		//arr.removeElement(4);
		arr.print();
	}
}
