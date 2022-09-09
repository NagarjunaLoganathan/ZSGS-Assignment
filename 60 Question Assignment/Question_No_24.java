//	24. Program to find ASCII value of a character

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the character : ");
		char ch = scan.next().charAt(0);
		int ascii = (int) ch;
		System.out.println("The ASCII value of the given character is : " + ascii);
		scan.close();
	}
}