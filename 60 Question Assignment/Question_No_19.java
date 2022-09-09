/*	19. Evaluate the following expression on paper and on program
 * 		and understand the difference
 * 		a += a++ + ++a + --a + a-- ; when a  = 28*/

package com.sixty.questions;

public class Question_No_19 {

	public static void main(String[] args) {
		
		int a = 28;
		a += a++ + ++a + --a + a--;
		
		/*	Here, a = 28
		 * 	a++ is post-increment of 'a' which means a = 28 after the increment a = 29
		 * 	++a is pre-increment of 'a' which means a = 30
		 * 	--a is pre-decrement of 'a' which means a = 29
		 * 	a-- is post-decrement of 'a' which means a = 29 after the decrement a = 28
		 * 	a = a + a++ + ++a + --a + a--
		 *  a = 28 + 28 + 30 + 29 + 29
		 *  finally the value of a = 144*/
		
		System.out.println("Final value of a is : " + a);
	}
}