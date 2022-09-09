/*	3. write a program to find the difference between
 * 	   the given number and it's reverse number.
 * 	   Example 1: Input  : 12345
 * 				  Output : 12345 - 54321 = -41976
 * 	   Example 2: Input  : 543
 * 				  Output : 543 - 345 = 198
 */

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = scan.nextInt();
		int rnumber = reverseNumber(number);
		System.out.println("Difference between the given number and its reverse is : " + (number - rnumber));
		scan.close();
	}

	static int reverseNumber(int number) {
		int rnumber = 0, remainder;
		while (number > 0) {
			remainder = number % 10;
			rnumber = rnumber * 10 + remainder;
			number /= 10;
		}
		return rnumber;
	}
}