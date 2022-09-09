/*	57. Write a program to print the following output for the
 * 		given input. You can assume the string is of odd length.
 * 		Example : Input  : 12345
 * 				  Output : 1   5
 * 							2 4
 * 							 3
 * 							2 4
 * 						   1   3
 */

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_57 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = scan.next();
		if(str.length() % 2 != 0) {
			for(int i = 0; i < str.length(); i++) {
				for(int j = 0; j < str.length(); j++) {
					if((i == j) || ((i + j) == (str.length() - 1))) {
						System.out.print(str.charAt(j));
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("The string is in even length.");
		}
		scan.close();
	}
}