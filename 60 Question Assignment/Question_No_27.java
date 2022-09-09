//	27. Program to swap two numbers.

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_27 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int num1 = scan.nextInt();
		System.out.print("Enter the second number : ");
		int num2 = scan.nextInt();
		int temp;
		System.out.println("Before swappint the numbers are :-");
		System.out.println("First Number  : " + num1);
		System.out.println("Second Number : " + num2);
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After swapping the numbers are :-");
		System.out.println("First Number  : " + num1);
		System.out.println("Second Number : " + num2);
		scan.close();
	}
}