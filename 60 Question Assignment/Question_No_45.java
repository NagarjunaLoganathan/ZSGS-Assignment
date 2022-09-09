//	45. Java program to print the sum of all the items of the array.

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_45 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size = scan.nextInt();
		int[] array = new int[size];
		System.out.print("Enter the array elements : ");
		for (int i = 0; i < size; i++) {
			array[i] = scan.nextInt();
		}
		int sum = 0;
		for(int i : array) {
			sum += i;
		}
		System.out.println("Sum of the array elements are : " + sum);
		scan.close();
	}
}