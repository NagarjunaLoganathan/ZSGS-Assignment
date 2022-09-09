//	34. Program to calculate the sum of natural numbers and find the largest digit fo the sum.

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_34 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = scan.nextInt();
		int sum = sumOfNaturals(num);
		int smax = largestDigit(sum);
		System.out.println("Sum of the naturals from 1 to " + num + " : " + sum);
		System.out.println("Largest digit of the sum is : " + smax);
		scan.close();
	}
	
	static int sumOfNaturals(int num) {
		
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}
	
	static int largestDigit(int smax) {
		
		int max = smax % 10;
		while(smax > 0) {
			int d = smax % 10;
			if(max < d) {
				max = d;
			}
			smax /= 10;
		}
		return max;
	}
}