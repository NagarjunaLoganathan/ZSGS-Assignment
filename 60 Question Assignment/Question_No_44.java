//	44. Java program to print the duplicate elements of an array.

package com.sixty.questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Question_No_44 {

	public static void main(String[] args) {
		
		int[] array = { 2, 4, 5, 6, 2, 3, 7, 9, 10, 13, 15, 2, 3, 4, 5, 6, 7, 8, 9, 11, 15};
		ArrayList<Integer> dlist = new ArrayList<>();
		Arrays.sort(array);
		for (int i = 0; i < array.length - 1; i++) {
			if(array[i] == array[i + 1]) {
				dlist.add(array[i++]);
			}
		}
		System.out.println("The duplicate elements are : " + Arrays.toString(dlist.toArray()));
	}
}