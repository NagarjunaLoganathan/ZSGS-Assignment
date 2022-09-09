//	30. Program to find the largest number among three numbers.

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_30 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the First number : ");
		int num1 = scan.nextInt();
		System.out.print("Enter the Second number : ");
		int num2 = scan.nextInt();
		System.out.print("Enter the Third number : ");
		int num3 = scan.nextInt();
		if(num1 > num2 && num1 > num3) {
			System.out.println("The largest number is : " + num1);
		} else if (num2 > num3) {
			System.out.println("The largest number is : " + num2);
		} else {
			System.out.println("The largest number is : " + num3);
		}
		scan.close();
	}
}