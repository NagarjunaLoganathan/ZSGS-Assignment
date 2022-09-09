/*	52. Using recursion reverse the string such as.
 * 		Example 1 : Input  : One Two Three
 * 					Output : Three Two One
 * 		Example 2 : Input  : I Love India
 * 					Output : India Love I
 */

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_52 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String fstr = "";
		System.out.print("Enter the String : ");
		String str = scan.nextLine();
		String[] rstr = reverseRecursion(str).split("\s");
		for (String s : rstr) {
			fstr += (reverseRecursion(s) + "\s");
		}
		System.out.println("Reversed String is : " + fstr);
		scan.close();
	}
	
	public static String reverseRecursion(String str)  {
		
		if(str.length() <= 1 || str == null) {
			return str;
		}
		return reverseRecursion(str.substring(1)) + str.charAt(0);
	}
}