/*	50. Write a program to print following pattern.
 * 		Example : Input  : 5
 * 				  Output : 5 5 5 5 5
 * 							4 4 4 4
 * 							 3 3 3
 * 							  2 2
 * 							   1
 */

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_50 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = scan.nextInt();
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < num - i; j++) {
				System.out.print(num - i + " ");
			}
			System.out.println();
		}
		scan.close();
	}
}