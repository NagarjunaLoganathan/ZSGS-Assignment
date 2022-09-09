/*	23. What is the value of x1 if x = 5?
 * 		x1 = ++x - x++ + --X
 */

package com.sixty.questions;

public class Question_No_23 {

	public static void main(String[] args) {
		
		int x = 5, x1;
		x1 = ++x - x++ + --x;
		
		/*	Here, we take x = 5
		 * 	++x is pre-increment of 'x' which means x = 6
		 * 	x++ is post-increment of 'x' which means x = 6 after the increment x = 7
		 * 	--x is pre-decrement of 'x' which means x = 6
		 * 	therefore, x1 = 6 - 6 + 6
		 * 	The value of x1 = 6
		 */
		
		System.out.print("The value of x1 is : " + x1);
	}
}