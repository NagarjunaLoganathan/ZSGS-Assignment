//	43. Java program to left rotate the elements of an array.

package com.sixty.questions;

import java.util.Arrays;
import java.util.Scanner;

public class Question_No_43 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		System.out.print("Enter the rotating element count : ");
		int index = scan.nextInt();
		int[] cArray = new int[index];
		int count = 0;
		for(int i = 0; i < index; i++) {
			cArray[i] = array[i];
			count++;
		}
		System.out.println(Arrays.toString(cArray));
		for(int i = 0; i < array.length - index; i++) {
			array[i] = array[count++];
		}
		System.out.println(Arrays.toString(array));
		count = array.length - index;
		for(int i = 0; i < cArray.length; i++) {
			array[count++] = cArray[i];
		}
		System.out.println("The left rotated array is : " + Arrays.toString(array));
		scan.close();
	}
}