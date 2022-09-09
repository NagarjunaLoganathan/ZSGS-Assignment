//	11. Java program to left rotate the elements of a multidimentional array.

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of Rows : ");
		int row = scan.nextInt();
		System.out.print("Enter the number of Column : ");
		int col = scan.nextInt();
		int i, j, k = 1;
		int[][] matrix = new int[row][col];
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				matrix[i][j] = k++;
			}
		}
		System.out.println("\nThe original matrix is :-\n");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\nThe matrix rotated to left side at 90 degree :-\n");
		for (i = col - 1; i >= 0; i--) {
			for (j = 0; j < row; j++) {
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println();
		}
	}
}