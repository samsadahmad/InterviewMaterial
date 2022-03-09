package com.test.interview.general;

import java.util.Arrays;

public class GeneralTest {

	public static void main(String[] args) {
		int input[] = {19,1, 10,25, 2,4, 95, 11, 67};
		
		System.out.println("Largest number is "+ findLargestNumber(input));
		System.out.println("Second number is "+ findSecondLargestNumber(input));

	}
	
	public static int findLargestNumber(int[] input) {
		
		int largestNum = Integer.MIN_VALUE;
		
		for(int i=0; i<input.length; i++) {
			if(largestNum <= input[i]) {
				largestNum = input[i];
			}	
		}
		return largestNum;
	}
	
	public static int findSecondLargestNumber(int[] input) {
		int size = input.length;
		int temp = 0;
		for(int i=0; i<size; i++) {
			for(int j=i+1; j<size; j++) {
				if(input[i] > input[j]) {
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
		System.out.println("Sorted array is " +Arrays.toString(input));
		return input[input.length-2];
	}
}
