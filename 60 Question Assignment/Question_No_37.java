//	37. Java program to print the elements of an array present on odd position.

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_37 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size = scan.nextInt();
		int[] array = new int[size];
		System.out.print("Enter the array elements : ");
		for (int i = 0; i < size; i++) {
			array[i] = scan.nextInt();
		}
		System.out.print("Elements at even position : ");
		for (int i = 0; i < array.length; i++) {
			if(i % 2 != 0) {
				System.out.print(array[i] + " ");
			}
		}
		scan.close();
	}
}