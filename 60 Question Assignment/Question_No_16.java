/*	16. Write a program to evaluate the polynomial equation.
 * 		Example : aX^2 + bX + c = 0
 * 				      -b (+ | -)√(b^2 - 4ac)
 * 				  X = ----------------------
 * 					           2a
 */

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double a, b, c, discriminate, root1, root2;
		System.out.print("Enter the value of a : ");
		a = scan.nextDouble();
		System.out.print("Enter the value of b : ");
		b = scan.nextDouble();
		System.out.print("Enter the value of c : ");
		c = scan.nextDouble();
		discriminate = (Math.pow(b, 2)) - (4 * a * c);
		root1 = ((-b) + (Math.sqrt(b * b) - (4 * a * c))) / (2 * a);
		root2 = ((-b) - (Math.sqrt(b * b) - (4 * a * c))) / (2 * a);
		System.out.println("\nThe equation is : " + a + "x^2 + " + b +"x + " + c + " = 0");
		System.out.println("The roots are :-\n\tX = " + root1 + "\n\tX = " + root2);
		if(discriminate == 0) {
			System.out.println("Roots are real and equal.");
		} else if(discriminate > 0) {
			System.out.println("Roots are read and distinct.");
		} else {
			System.out.println("Roots are imaginary and distince.");
		}
		scan.close();
	}
}