/*	9. Given two sorted arrrays, merge them such that the
 * 	   elements are not repeated.
 * 	   Example : Input  : Array 1 : 2, 4, 5, 6, 7, 9, 10, 13
 * 						  Array 2 : 2, 3, 4, 5, 6, 7, 8, 9, 11, 15
 *				 Output : Merged Array : 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15
 */

package com.sixty.questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Question_No_09 {
	
	public static void main(String[] args) {
		
		int[] array1 = {2, 4, 5, 6, 7, 9, 10, 13};
		int[] array2 = {2, 3, 4, 5, 6, 7, 8, 9, 11, 15};
		int[] marray = mergeArray(array1, array2);
		handlingDuplicates(marray);
	}

	public static int[] mergeArray(int[] array1, int[] array2) {

		int[] marray = new int[array1.length + array2.length];
		int i = 0, j = 0;
		while (i < marray.length) {
			if (i < array1.length) {
				marray[i] = array1[i++];
			} else {
				marray[i++] = array2[j++];
			}
		}
		Arrays.sort(marray);
		return marray;
	}

	public static void handlingDuplicates(int[] marray) {

		ArrayList<Integer> flist = new ArrayList<>();
		for (int i = 0; i < marray.length - 1; i++) {
			if (marray[i] != marray[i + 1]) {
				flist.add(marray[i]);
			}
		}
		if (marray[marray.length - 2] != marray[marray.length - 1]) {
			flist.add(marray[marray.length - 1]);
		}
		System.out.println("Merged Array is : " + Arrays.toString(flist.toArray()));
	}
}