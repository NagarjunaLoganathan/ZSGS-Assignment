//	14. Write a program to find the area of the rectangle.

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length : ");
		double length = scan.nextDouble();
		System.out.print("Enter the breadth : ");
		double breadth = scan.nextDouble();
		double area = length * breadth;
		System.out.println("Area of the rectangle : " + area);
		scan.close();
	}
}