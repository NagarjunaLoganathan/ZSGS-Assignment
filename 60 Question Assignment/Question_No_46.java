// 46. Java program to rotate the elements of an array in the right direction.

package com.sixty.questions;

import java.util.Arrays;
import java.util.Scanner;

public class Question_No_46 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		System.out.print("Enter the rotating element count : ");
		int index = scan.nextInt();
		int[] cArray = new int[array.length - index];
		int count = 0;
		for(int i = 0; i < array.length - index; i++) {
			cArray[i] = array[i];
			count++;
		}
		for(int i = 0; i < index; i++) {
			array[i] = array[count++];
		}
		for(int i = 0; i < cArray.length; i++) {
			array[index++] = cArray[i];
		}
		System.out.println("The left rotated array is : " + Arrays.toString(array));
		scan.close();
	}
}