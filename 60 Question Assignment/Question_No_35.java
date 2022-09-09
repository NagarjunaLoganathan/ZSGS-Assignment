//	35. Program to find factorial of a number and the factorial numbers sum of digits.

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_35 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = scan.nextInt();
		int fact = factorialOfNumber(num);
		int sdig = sumOfDigits(fact);
		System.out.println("Factorial of the number " + num + " : " + fact);
		System.out.println("Sum of the factorial digit : " + sdig);
		scan.close();
	}
	
	static int factorialOfNumber(int num) {
		
		int product = 1;
		for (int i = 1; i <= num; i++) {
			product *= i;
		}
		return product;
	}
	
	static int sumOfDigits(int num) {
		
		int sum, remainder;
		for (sum = 0; num > 0;) {
			remainder = num % 10;
			sum += remainder;
			num /= 10;
		}
		return sum;
	}
}