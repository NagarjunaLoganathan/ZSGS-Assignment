/*	47. Write a program to print the following pattern.
 * 		Example : Input  : 5
 * 				  Output :         1
 *						         1 2 1
 *						       1 2 3 2 1 
 *					 		 1 2 3 4 3 2 1
 *						   1 2 3 4 5 4 3 2 1
 */

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_47 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = scan.nextInt();
		for(int i = 0; i < num; i++) {
			int p = 1;
			for(int j = i; j < num; j++) {
				System.out.print("  ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print(p++ + " ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print(p-- + " ");
			}
			System.out.println();
		}
		scan.close();
	}
}