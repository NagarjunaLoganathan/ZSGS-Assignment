/*	1. Write a single program to generate a multiplication and
 * 	   subtraction table for a given number.
 */

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the table number : ");
		int tableNumber = scan.nextInt();
		System.out.print("Enter the limit : ");
		int limit = scan.nextInt();
		multiplicationTable(tableNumber, limit);
		subtractionTable(tableNumber, limit);
		scan.close();
	}
	
	static void multiplicationTable(int tableNumber, int limit) {
		System.out.println("The multiplication table is :-");
		for(int i = 1; i <= limit; i++) {
			System.out.println(i + " * " + tableNumber + " = " + (i*tableNumber));
		}
	}
	
	static void subtractionTable(int tableNumber, int limit) {
		System.out.println("\nThe subtraction table is :-");
		for(int i = 1; i <= limit; i++) {
			System.out.println(i + " - " + tableNumber + " = " + (i-tableNumber));
		}
	}
}