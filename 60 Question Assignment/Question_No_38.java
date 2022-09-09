//	38. Java program to print the largest element in an array

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_38 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size = scan.nextInt();
		int[] array = new int[size];
		System.out.print("Enter the array elements : ");
		for (int i = 0; i < size; i++) {
			array[i] = scan.nextInt();
		}
		int max = 0;
		for(int i : array) {
			if(i > max) {
				max = i;
			}
		}
		System.out.println("The largest element in the array is : " + max);
		scan.close();
	}
}