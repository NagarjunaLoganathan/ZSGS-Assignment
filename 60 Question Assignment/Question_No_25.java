//	Program to compute Quotient and Remainder

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_25 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the dividend : ");
		int dividend = scan.nextInt();
		System.out.print("Enter the divisor : ");
		int divisor = scan.nextInt();
		int quotient = dividend / divisor;
		int remainder = dividend % divisor;
		System.out.println("The Quotient is : " + quotient);
		System.out.println("The Remainder is : " + remainder);
		scan.close();
	}
}