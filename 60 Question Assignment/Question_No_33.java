//	33. Program to check whether a character is an alphabet or not.

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_33 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Character : ");
		char ch = scan.next().charAt(0);
		if((ch >= (char)65 && ch <= (char)90) || (ch >= (char)97 && ch <= (char)122)) {
			System.out.println("The given character '" + ch + "' is an Alphabet.");
		} else {
			System.out.println("The given character '" + ch + "' is not an Alphabet.");
		}
		scan.close();
	}
}