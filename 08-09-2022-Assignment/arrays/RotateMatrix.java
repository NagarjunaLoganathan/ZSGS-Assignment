package com.arrays;

import java.util.Scanner;

public class RotateMatrix {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of Rows   : ");
		int row = scan.nextInt();
		System.out.print("Enter number of column : ");
		int column = scan.nextInt();
		int[][] matrix = new int[row][column];
		System.out.println("The Original matrix is :");
		int i, j, num = 1;;
		for(i = 0; i < row; i++) {
			for(j = 0; j < column; j++) {
				matrix[i][j] = num++;
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Matrix rotated to Clockwise at 90 degree :");
		for(i = 0; i < column; i++) {
			for(j = row - 1; j >= 0; j--) {
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println();
		}
		System.out.println("Matrix rotated to Anticlockwise at 90 degree :");
		for(i = column - 1; i >= 0; i--) {
			for(j = 0; j < row; j++) {
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println();
		}
		scan.close();
	}
}