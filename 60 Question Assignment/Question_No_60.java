/*	60. Write a program to find the sum of the series.
 * 		The series will be like 1 + 11 + 111 + 1111 + ... n terms.
 * 		Example 1 : Input  : Enter the number : 5
 * 					Output : 12345
 * 		Example 2 : Input  : Enter the number : 3
 * 					Output : 123
 */

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_60 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = scan.nextInt();
		int sum = 0, n = 0;
		for(int i = 0; i < num; i++) {
			n = n * 10 + 1;
			sum += n;
		}
		System.out.println("The sum is : " + sum);
		scan.close();
	}
}