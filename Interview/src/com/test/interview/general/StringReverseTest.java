package com.test.interview.general;

import java.util.Arrays;

public class StringReverseTest {

	public static void main(String[] args) {
		stringReverse1("samsad");
		stringReverse2("samsad");

	}

	private static void stringReverse1(String input) {
		StringBuilder output = new StringBuilder(input.length());
		
		for (int i = input.length()-1; i >= 0; i--) {
			output.append(input.charAt(i));
		}
		System.out.println("Input String = "+input+" and reverse string = "+output);
	}
	
	private static void stringReverse2(String input) {
		char[] inputChar = input.toCharArray();
		int left = 0;
		int right = inputChar.length-1;
		
		for (left = 0; left < right; left++, right--) {
			char temp = inputChar[left];
			inputChar[left] = inputChar[right];
			inputChar[right] = temp;
		}
		System.out.println("Input String = "+input+" and reverse string = "+Arrays.toString(inputChar));
	}
}
