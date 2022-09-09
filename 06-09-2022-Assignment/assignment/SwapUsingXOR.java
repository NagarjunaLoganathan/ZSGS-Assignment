package com.assignment;

import java.util.Scanner;

public class SwapUsingXOR {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number  : ");
		long num1 = scan.nextLong();
		System.out.print("Enter the second number : ");
		long num2 = scan.nextLong();
		System.out.println("Befor Swapping First Number  : " + num1);
		System.out.println("Befor Swappint Second Number : " + num2);
		num1 = num1 ^ num2;
		num2 = num1 ^ num2;
		num1 = num1 ^ num2;
		System.out.println("After Swapping First Number  : " + num1);
		System.out.println("After Swappint Second Number : " + num2);
		scan.close();
	}
}