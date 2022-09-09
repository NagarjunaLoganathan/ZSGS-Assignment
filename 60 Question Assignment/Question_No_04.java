//	Write a program to define the functionality of a bitwise operator.

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value for a : ");
		int a = scan.nextInt();
		System.out.print("Enter the value for b : ");
		int b = scan.nextInt();
		
//		Here, we take a = 7 and b = 3
		
		System.out.println("Bitwise And 		  : " + (a & b));
		
		/* 	AND Operator : 
		 * 		0000 0000 0000 0000 0000 0000 0000 0111
		 * 		0000 0000 0000 0000 0000 0000 0000 0011
		 * 		---------------------------------------
		 * 		0000 0000 0000 0000 0000 0000 0000 0011
		 * 		---------------------------------------
		 * 	Bitwise And for 7 & 3  = 3
		 */
		
		System.out.println("Bitwise Or  		  : " + (a | b));
		
		/* 	OR Operator :
		 * 		0000 0000 0000 0000 0000 0000 0000 0111
		 * 		0000 0000 0000 0000 0000 0000 0000 0011
		 * 		---------------------------------------
		 * 		0000 0000 0000 0000 0000 0000 0000 0111
		 * 		---------------------------------------
		 * 	Bitwise And for 7 | 3  = 7
		 */
		
		System.out.println("Bitwise Not 		  : " + (~a));
		
		 /* 	NOT Operator :
		 * 		0000 0000 0000 0000 0000 0000 0000 0111
		 * 		---------------------------------------
		 * 		0000 0000 0000 0000 0000 0000 0000 1000
		 * 		---------------------------------------
		 * 	Decimal for 1000 is 8 here Not operator retains the 
		 * 	Opposition of the 8 so 8 turns into negative.
		 * 	Bitwise And for ~7 = -8
		 */
		
		System.out.println("Bitwise Xor 		  : " + (a ^ b));
		
		/* 	XOR Operator :
		 * 		0000 0000 0000 0000 0000 0000 0000 0111
		 * 		0000 0000 0000 0000 0000 0000 0000 0011
		 * 		---------------------------------------
		 * 		0000 0000 0000 0000 0000 0000 0000 0100
		 * 		---------------------------------------
		 * 	Bitwise And for 7 ^ 3 = 4
		 */
		
		System.out.println("Right shift 		  : " + (a >> 2));
		
		/* 	Right Shift :
		 * 		before shift is : 0000 0000 0000 0000 0000 0000 0000 0111
		 * 		After shift is  : 0000 0000 0000 0000 0000 0000 0000 0001
		 * 	The answer is : 1
		 */
		
		System.out.println("Left Shift            : " + (a << 2));
		
		/*  Left Shift :
		 *  	Before Shift is : 0000 0000 0000 0000 0000 0000 0000 0111
		 *  	After Shift is  : 0000 0000 0000 0000 0000 0000 0001 1100
		 *  The answer is : 28
		 */
		
		System.out.println("Right shift with zero : " + (a >>> 2));
		
		/*  Right Shift with Zero :
		 *  	Before shift is : 0000 0000 0000 0000 0000 0000 0000 0111
		 *  	After shift is  : 0000 0000 0000 0000 0000 0000 0000 0001
		 *  The answer is : 1
		 */
		scan.close();
	}
}