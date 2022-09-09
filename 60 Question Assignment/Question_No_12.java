//	12. Write a program to print the number 7.50 without using String.

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		double num = scan.nextDouble();
		System.out.printf("The number is  : %.2f", num);
		scan.close();
	}
}