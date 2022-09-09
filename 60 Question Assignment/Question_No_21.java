/*	21. Evaluate the following expression on paper and on program
 * 		and understand the difference
 * 		if int y = 10 then find tint z = (++y * (y++ + 5))*/

package com.sixty.questions;

public class Question_No_21 {

	public static void main(String[] args) {
		
		int y = 10, z;
		z = (++y * (y++ + 5));
		
		 /*	Here, we take y = 10
		  * ++y is pre-increment of 'y' it means y = 11
		  * y++ is post-increment of 'y' it means y = 11 after the increment y = 12
		  * According the BODMAS rule
		  * z = (11 * (11 + 5))
		  * z = (11 * 16)
		  * z = 176*/
		
		System.out.println("The value of z is : " + z);
		}

}
