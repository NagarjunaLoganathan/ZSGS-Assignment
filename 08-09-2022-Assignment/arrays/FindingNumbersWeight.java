package com.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class FindingNumbersWeight {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size = scan.nextInt();
		int[] numArr = new int[size];
		System.out.println("Enter the array elements:-");
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = scan.nextInt();
		}
		int[][] farr = new int[numArr.length][2];
		for (int i = 0; i < numArr.length; i++) {
			int j = 0, sum = 0;
			if (numArr[i] % 2 == 0)
				sum += 3;
			if ((numArr[i] % 4 == 0) && (numArr[i] % 6 == 0))
				sum += 4;
			for (int k = 0; k < numArr[i]; k++) {
				if (Math.sqrt(numArr[i]) == k) {
					sum += 5;
					break;
				}
			}
			while (j < 2)
				farr[i][j] = (j++ == 0) ? numArr[i] : sum;
		}
		short2DArray(farr, 2);
		System.out.println(Arrays.deepToString(farr));
		scan.close();
	}

	public static void short2DArray(int[][] arr, int col) {

		Arrays.sort(arr, new Comparator<int[]>() {

			public int compare(int[] val1, int[] val2) {

				return (val1[col - 1] < val2[col - 1]) ? 1 : -1;
			}
		});
	}
}