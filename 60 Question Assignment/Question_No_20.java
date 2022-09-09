/*	20. Evaluate the following expression on paper and on program
 * 		and understand the difference
 * 		x = x++ * 2 + 3 * --x
 */

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of x : ");
		int x = scan.nextInt();
		x = x++ * 2 + 3 * --x;
		
		/*	Here, we take x = 5
		 * 	x++ is post-increment of 'x' it means x = 5 after the increment x = 6
		 * 	--x is pre-decrement of 'x' it means x = 5
		 * 	therefore, x = 5 * 2+ 3 * 5
		 * 	According to the BODMAS rule 5 * 2 = 10 and 3 * 5 = 15.
		 * 	therefore, x = 10 + 15
		 * 	the final value of x = 25
		 */
		
		System.out.println("The final value of x is : " + x);
		scan.close();
	}
}