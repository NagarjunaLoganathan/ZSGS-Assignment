/*	56. Write a program to make such a pattern like a pyramid with number
 * 		incresed by 1.
 * 		Example : Input  : 10
 * 				  Output :    1
 * 						     2 3
 *						    4 5 6
 *					       7 8 9 10
 */

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_56 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = scan.nextInt();
		int sum = 0, count = 0;;
		for(int i = 1; i <= num; i++) {
			sum += i;
			count++;
			if(sum == num) {
				break;
			} else if(sum > num) {
				break;
			}
		}
		int p = 1;
		for(int i = 0; i < count; i++) {
			for(int j = 0; j < count - (i + 1); j++) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print(p++ + " ");
			}
			System.out.println();	
		}
		
		scan.close();
	}
}