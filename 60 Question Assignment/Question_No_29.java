//	29. Program to check whether a character is a vowel or consonant.

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_29 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the character : ");
		char ch = scan.next().charAt(0);
		if(((int) ch >= 65 && (int) ch <= 90) || ((int) ch >= 97 && (int) ch <= 122)) {
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
					ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				System.out.println("The given character '" + ch + "' is a Vowel.");
			} else {
				System.out.println("The given character '" + ch + "' is a Consonant.");
			}
		} else {
			System.out.println("The given character '" + ch + "' is not a alphabet.");
		}
		scan.close();
	}
}