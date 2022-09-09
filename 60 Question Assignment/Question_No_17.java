/*	17. Given the radius fo two concentric circle, find the
 *	    area of the space between the circles.
 */

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the outer circle radius : ");
		double oCircle = scan.nextDouble();
		System.out.print("Enter the inner circle radius : ");
		double iCircle = scan.nextDouble();
		if(oCircle > iCircle) {
			double oArea = areaOfCircle(oCircle);
			double iArea = areaOfCircle(iCircle);
			System.out.printf("Area Between two circle : %.2f", (oArea - iArea));			
		} else {
			System.out.println("The inner circle radius is larger then the outer circle.");
		}
		scan.close();
	}
	
	static Double areaOfCircle(double radius) {
		
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}

}
