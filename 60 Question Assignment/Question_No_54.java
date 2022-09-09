/*	54. Write a program to sort the elements in odd positions
 * 		in descending order and elements in even position in
 * 		ascending order
 * 		Example 1 : Input  : 13, 2, 4, 15, 12, 10, 5
 * 					Output : 13, 2, 12, 10, 5, 15, 4
 * 		Example 2 : Input  : 1, 2, 3, 4, 5, 6, 7, 8, 9
 * 					Output : 9, 2, 7, 4, 5, 6, 3, 8, 1
 */

package com.sixty.questions;

import java.util.Arrays;
import java.util.Scanner;

public class Question_No_54 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size = scan.nextInt();
		int[] array = new int[size];
		System.out.print("Enter the array elements : ");
		for(int i = 0; i < size; i++) {
			array[i] = scan.nextInt();
		}
		int[] farray = new int[size];
		Arrays.sort(array);
		for(int i = 0; i < array.length; i++) {
			if(i % 2 == 0) {
				farray[i] = array[array.length - (i + 1)];
			} else {
				farray[i] = array[i];
			}
		}
		System.out.println("Final output is : " + Arrays.toString(farray));
		scan.close();
	}
}