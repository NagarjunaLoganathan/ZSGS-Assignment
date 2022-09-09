/*	59. Find if a String2  is substring of String1.
 * 		If it is, return the index of the first occurrence. else return -1.
 * 		Example 1 : Input  : String1 : test123string
 * 							 String2 : 123
 * 					Output : 4
 * 		Example 2 : Input  : String1 : testing12
 * 							 String2 : 1234
 * 					Output : -1
 */

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_59 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string1 : ");
		String str1 = scan.next();
		System.out.print("Enter the string2 : ");
		String str2 = scan.next();
		int i = 0, j = 0, s = 0, index = 0;
		if(str1.length() >= str2.length()) {
			while(i < str1.length()) {
				if(str1.charAt(i) == str2.charAt(j)) {
					s = findSubString(str1, str2, i, j);
					index = i;
				}
				i++;
			}
		}
		if(s == str2.length()) {
			System.out.println("Output : " + index);
		} else {
			System.out.println("Output : " + -1);
		}
		scan.close();
	}
	
	static int findSubString(String str1, String str2, int i, int j) {
		
		int count = 0;
		while(i < str1.length()) {
			if(str1.charAt(i) == str2.charAt(j)) {
				count++;
				i++; j++;
				if(j == str2.length()) {
					break;
				}
			} else {
				count = -1;
			}
		}
		return count;
	}
}