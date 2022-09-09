package com.arrays;

import java.util.Arrays;

public class Multiply2DArray {

	public static void main(String[] args) {
		
		int[][] arr1 = {{1, 2}, {3, 4}};
		int[][] arr2 = {{5, 6, 7}, {8, 9, 10}};
		int[][] farr = new int[arr1.length][arr2[0].length];
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				farr[i][j] = 0;
				for(int k = 0; k < arr2.length; k++) {
					farr[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}
		System.out.println(Arrays.deepToString(farr));
	}
}