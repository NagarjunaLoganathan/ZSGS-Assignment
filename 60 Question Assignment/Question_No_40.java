//	40. Java program to print the number of elements present in an array.

package com.sixty.questions;

public class Question_No_40 {

	public static void main(String[] args) {
		
		int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		int count = 0;
		for(@SuppressWarnings("unused") int i : array) {
			count++;
		}
		System.out.println("Number of elements in the array is : " + count);
	}
}