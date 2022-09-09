/*	5. Write a program to print the following pattern based on the alphabet.
 * 	   Example 1: Input  : E
 * 				  Output : EEEEE
 * 						   DDDD
 * 						   CCC
 * 						   BB
 * 						   A
 * 	   Examplt 2: Input  : C
 * 				  Output : CCC
 * 						   BB
 * 						   A*/

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the character : ");
		char ch = scan.next().charAt(0);
		if (((byte) ch >= 65 && (byte) ch <= 90) || ((byte) ch >= 97 && (byte) ch <= 122)) {
			if ((byte) ch >= 65 && (byte) ch <= 90) {
				int len = Math.abs((byte) ch - 64);
				pattern(len, 64);
			} else {
				int len = Math.abs((byte) ch - 96);
				pattern(len, 96);
			}
		} else {
			System.out.println("The gieven is not a Alphabets.");
		}
		scan.close();
	}

	static void pattern(int n, int c) {

		int ref = n;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < ref; j++) {
				System.out.print((char) (ref + c));
			}
			ref--;
			System.out.println();
		}
	}
}