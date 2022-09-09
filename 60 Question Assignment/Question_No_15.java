//	15. Write a program to find the area of the cylinder.

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the radius of cylinder : ");
		double radius = scan.nextDouble();
		System.out.print("Enter the height of cylinder : ");
		double height = scan.nextDouble();
		double area = 2 * Math.PI * ((radius * height) + (Math.pow(radius, 2)));
		System.out.printf("Area of the cylinder : %.2f", area);
		scan.close();
	}
}