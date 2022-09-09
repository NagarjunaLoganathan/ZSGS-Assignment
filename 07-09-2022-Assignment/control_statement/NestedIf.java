package com.control_statement;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Tamil Mark   : ");
		int tamil = scan.nextInt();
		System.out.print("Enter the English Mark : ");
		int english = scan.nextInt();
		System.out.print("Enter the Maths Mark   : ");
		int maths = scan.nextInt();
		System.out.print("Enter the Science Mark : ");
		int science = scan.nextInt();
		System.out.print("Enter the Social Mark  : ");
		int social = scan.nextInt();
		int total = tamil + english + maths + science + social;
		float average = total / 5;
		if (average >= 35) {
			if (average > 50) {
				if (average > 60) {
					if (average > 70) {
						if (average > 80) {
							if (average > 90) {
								System.out.println("Student got O - Grade.");
							} else {
								System.out.println("Student got A+ - Grade.");
							}
						} else {
							System.out.println("Student got A - Grade.");
						}
					} else {
						System.out.println("Student got B+ - Grade.");
					}
				} else {
					System.out.println("Student got B - Grade.");
				}
			} else {
				System.out.println("Student got C - Grade.");
			}
		} else {
			System.out.println("Student is Failed.");
		}
		scan.close();
	}
}