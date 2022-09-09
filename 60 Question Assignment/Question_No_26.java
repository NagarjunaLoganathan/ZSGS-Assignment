//	26. Program to demonstrate the working of keyword long.

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_26 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		long num = 0;
		try {
			System.out.print("Enter the value : ");
			num = scan.nextLong();
			if(num <= Long.MAX_VALUE && num >= Long.MIN_VALUE) {
				System.out.println("The number " + num + " is a Long data type.");
			}
		} catch (Exception e){
			System.out.println(e);
			System.out.println("Because the size of data type in the range from " + Long.MIN_VALUE + " to " + Long.MAX_VALUE + ".");
		}
		scan.close();
	}
}