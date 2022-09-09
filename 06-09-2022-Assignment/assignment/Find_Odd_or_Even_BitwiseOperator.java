package com.assignment;

import java.util.Scanner;

public class Find_Odd_or_Even_BitwiseOperator {
	
	public static String and(long num) {
		
		return ((num & 1) == 0) ? "Even" : "Odd";
	}
	
	public static String or(long num) {
		
		return ((num | 1) > num) ? "Even" : "Odd";
	}
	
	public static String xor(long num) {
				
		return ((num ^ 1) == (num + 1)) ? "Even" : "Odd";
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		long num = scan.nextLong();
		boolean result = true;
		while(result) {
			System.out.println("1. Bitwise AND.\n2. Bitwise OR.\n3. Bitwise XOR.\n4. Exit.");
			System.out.println("---------------");
			System.out.print("Enter your option : ");
			int option = scan.nextInt();
			switch(option) {
			case 1 -> System.out.println("The given number is : " + and(num));
			case 2 -> System.out.println("The given number is : " + or(num));
			case 3 -> System.out.println("The given number is : " + xor(num));
			case 4 -> result = false;
			default -> System.out.println("Enter the above given options only.");
			}
		}
		scan.close();
	}
}