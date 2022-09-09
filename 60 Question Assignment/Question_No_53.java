/*	53. Write a program to give the following output for the given input
 * 		Example 1 : Input  : a1b10
 * 					Output : abbbbbbbbbb
 * 		Example 2 : Input  : b3c6d15
 * 					Output : bbbccccccdddddddddddd
 * 		The number varies from 1 to 99
 */

package com.sixty.questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question_No_53 {
	
	static HashMap<String, Integer> MAP = new HashMap<>();

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter the string : ");
			String str = scan.next();
			int i = 0;
			String character = "", count = "";
			for(i = 0; i < str.length(); i++) {
				if(!((str.charAt(i) >= (char) 48) && (str.charAt(i) <= (char) 57))) {
					if(character.length() != 0 && count.length() != 0) {
						putInMap(character, count);
						character = "";
						count = "";
					}
					character += str.charAt(i);
				} else {
					count += str.charAt(i);
				}
			}
			putInMap(character, count);
			System.out.print("The output is : ");
			for(@SuppressWarnings("rawtypes") Map.Entry entry : MAP.entrySet()) {
				for(i = 0; i < (int) entry.getValue(); i++) {
					System.out.print(entry.getKey());
				}
			}
		}
	}
	
	static void putInMap(String ch, String count) {
		
		int num = Integer.parseInt(count);
		MAP.put(ch, num);
	}
}