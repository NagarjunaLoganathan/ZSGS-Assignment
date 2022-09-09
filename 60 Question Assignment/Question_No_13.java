//	13. Write a program to find the area of the square.

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the side : ");
		double side = scan.nextDouble();
		double area = Math.pow(side, 2);
		System.out.println("Area of the square is : " + area);
		scan.close();
	}
}