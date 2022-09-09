//	31. Write a program to find the roots of a quadratic equation.

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_31 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double a, b, c, root1, root2;
		System.out.print("Enter the value of a : ");
		a = scan.nextDouble();
		System.out.print("Enter the value of b : ");
		b = scan.nextDouble();
		System.out.print("Enter the value of c : ");
		c = scan.nextDouble();
		root1 = ((-b) + (Math.sqrt(b * b) - (4 * a * c))) / (2 * a);
		root2 = ((-b) - (Math.sqrt(b * b) - (4 * a * c))) / (2 * a);
		System.out.println("Root 1 is : " + root1);
		System.out.println("Root 2 is : " + root2);
		scan.close();
	}
}