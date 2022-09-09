/*	51. Write a program to display the number in reverse order
 * 		without use of string functions.
 * 		Example : Input  : 12345
 * 				  Output : The number in reverse order is : 54321
 */

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_51 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = scan.nextInt();
		int sum = 0, remainder;
		while(num > 0) {
			remainder = num % 10;
			sum = sum * 10 + remainder;
			num /= 10;
		}
		System.out.println("The number in reverse order is : " + sum);
		scan.close();
	}
}