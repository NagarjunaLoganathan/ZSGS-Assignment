//	32. Program to check whether a number is positive or negative.

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_32 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = scan.nextInt();
		if(num == 0) {
			System.out.println("The number '" + num + "' is neither positive nor a negative number.");
		} else if(num > 0) {
			System.out.println("The number '" + num + "' is a positive number.");
		} else {
			System.out.println("The number '" + num + "' is a negative number.");
		}
		scan.close();
	}
}