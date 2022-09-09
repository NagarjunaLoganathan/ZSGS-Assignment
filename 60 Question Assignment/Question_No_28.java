//	28. Program to check whether a number is Even or Odd.

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_28 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = scan.nextInt();
		if(num % 2 == 0) {
			System.out.println("The given number '" + num + "' is Even.");
		} else {
			System.out.println("The given number '" + num + "' is Odd.");
		}
		scan.close();
	}
}