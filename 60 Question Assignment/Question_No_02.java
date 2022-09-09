/*	2. Write a program to print a letters from the user
 * 	   input character to 'Z' without using strings.
 * 	   Example 1 : input  : X
 * 				   Output : XYZ
 * 	   Example 2 : input  : M
 * 				   Output : MNOPQRSTUVWXYZ
 */

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the character : ");
		char ch = scan.next().charAt(0);
		if (((byte) ch >= 65 && (byte) ch <= 90) || ((byte) ch >= 97 && (byte) ch <= 122)) {
			if ((byte) ch >= 65 && (byte) ch <= 90) {
				printCharacters((byte) ch, 90);
			} else {
				printCharacters((byte) ch, 122);
			}
		} else {
			System.out.println("The gieven is not a Alphabets.");
		}
		scan.close();
	}

	static void printCharacters(int ch, int limit) {
		
		for (int i = ch; i <= limit; i++) {
			System.out.print((char) (i));
		}
	}
}