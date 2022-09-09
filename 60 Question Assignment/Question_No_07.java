/*	7. Write a program to print the following output
 * 	   for the given input. You can assume the strin is of
 * 	   Odd length.
 * 	   Example : Input  : 12345
 * 			     Output : 1   1
 * 						   2 2
 * 							3
 * 						   4 4
 * 						  5   5
 */

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = scan.next();
		if (str.length() % 2 != 0) {
			pattern(str);
		} else {
			System.out.println("The 'X' pattern is not possible.");
		}
		scan.close();
	}

	static void pattern(String str) {

		int i, j, c;
		for (i = 0, c = 0; i < str.length(); i++, c++) {
			for (j = 0; j < str.length(); j++) {
				if (i == j || i == j - ((str.length() - 1) - i - c)) {
					System.out.print(str.charAt(i));
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}