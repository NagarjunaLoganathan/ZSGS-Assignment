package com.arrays;

import java.util.Arrays;

public class PositioningNumbers {
	
	public static int[] reArrangeArray(int[] arr) {
		
		Arrays.sort(arr);
		int mid = (arr.length % 2 != 0) ? (arr.length / 2) : (arr.length / 2) - 1;
		int[] farr = new int[arr.length];
		farr[0] = arr[mid];
		for(int i = 1, index = 1; mid + i < arr.length; i++) {
			farr[index++] = arr[mid + i];
			if(mid - i >= 0) {
				farr[index++] = arr[mid - i];
			}
		}
		return farr;
	}

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] arr2 = { 1, 2, 1, 4, 5, 6, 8, 8 };
		
		System.out.println(Arrays.toString(reArrangeArray(arr1)));
		System.out.println(Arrays.toString(reArrangeArray(arr2)));
	}
}