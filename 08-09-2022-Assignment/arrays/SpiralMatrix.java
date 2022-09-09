package com.arrays;

import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number for Rows and Column : ");
		int n = scan.nextInt();
		int i, j, num = 1;
		int[][] arr = new int[n][n];
		for (i = 0; i < n; i++) {
			for (j = i; j < n - i; j++) {
				arr[i][j] = num++;
			}
			for (j = i + 1; j <= n - i - 1; j++) {
				arr[j][n - i - 1] = num++;
			}
			for (j = n - i - 2; j >= i; j--) {
				arr[n - i - 1][j] = num++;
			}
			for (j = n - 2 - i; j > i; j--) {
				arr[j][i] = num++;
			}
		}
		System.out.println("The spiral matrix is :");
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (arr[i][j] < 10) {
					System.out.print("0" + arr[i][j] + " ");
				} else {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
		scan.close();
	}

}
