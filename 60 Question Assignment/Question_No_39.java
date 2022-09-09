//	39. Java program to print the largest elements in an array.

package com.sixty.questions;

import java.util.Arrays;
import java.util.Scanner;

public class Question_No_39 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size = scan.nextInt();
		int[] array = new int[size];
		System.out.print("Enter the array elements : ");
		for (int i = 0; i < size; i++) {
			array[i] = scan.nextInt();
		}
		Arrays.sort(array);
		int min = array[0];
		System.out.println("The smallest element in the array is : " + min);
		scan.close();
	}
}