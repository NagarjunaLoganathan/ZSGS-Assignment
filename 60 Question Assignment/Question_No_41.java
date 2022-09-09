//	41. Java program to copy all elements of one array into another array.

package com.sixty.questions;

import java.util.Arrays;

public class Question_No_41 {

	public static void main(String[] args) {
		
		int[] array = {1, 5, 9, 8, 7, 3, 2, 4, 6, 10};
		int[] copyArray = new int[array.length];
		int j = 0;
		for(int i : array) {
			copyArray[j++] = i;
		}
		System.out.println("Array 1 is : " + Arrays.toString(array));
		System.out.println("Array 2 is : " + Arrays.toString(copyArray));
	}
}