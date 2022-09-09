/*	10. Alternate sorting: Given an array of integers, rearrange
 *		the array in such a way that the first element is first
 *		maximum and second element is first minimum.
 *		Example : Input  : 1, 2, 3, 4, 5, 6, 7
 *				  Output : 7, 1, 6, 2, 5, 3, 4
 */

package com.sixty.questions;

import java.util.Arrays;

public class Question_No_10 {

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5, 6, 7};
		int[] farray = new int[array.length];
		int i = 0 , k = 0, j = array.length - 1;
		Arrays.sort(array);
		while (i < array.length) {
			if (i % 2 == 0) {
				farray[i++] = array[j--];
			} else {
				farray[i++] = array[k++];
			}
		}
		System.out.println("Alternae sorted array is : " + (Arrays.toString(farray)));
	}
}