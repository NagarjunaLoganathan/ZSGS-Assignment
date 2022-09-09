/*	58. Write a program to print the following pattern for the given input number.
 * 		Example : Input  : 4
 * 				  Output : ********
 * 						   ***  ***
 * 						   **    **
 * 						   *      *
 * 						   **    **
 * 						   ***  ***
 * 						   ********
 */

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_58 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = scan.nextInt();
		int i, j;
		for(i = 0; i < num; i++) {
			for(j = i; j < num; j++) {
				System.out.print("*");
			}
			for(j = 0; j < (i * 2); j++) {
				System.out.print(" ");
			}
			for(j = 0; j < num - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(i = num - 2; i >= 0; i--) {
			for(j = 0; j < num - i; j++) {
				System.out.print("*");
			}
			for(j = 0; j < (i * 2); j++) {
				System.out.print(" ");
			}
			for(j = 0; j < num - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}
}