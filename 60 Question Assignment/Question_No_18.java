/*	18. Evaluate the following expresion on paper and on program
 * 	    understand the difference.
 * 		Example:   i) ++a - b--
 * 				  ii) a % b++
 * 				 iii) a *= b + 5
 * 				  iv) x = 69 >>> 2
 */

package com.sixty.questions;

import java.util.Scanner;

public class Question_No_18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.print("1. Expression --> ++a - b--\n" + "2. Expression --> a % b++\n"
					+ "3. Expression --> a *= b + 5\n" + "4. Expression --> x = 69 >>> 2\n" + "5. Exit.\n");
			System.out.print("Enter your choice : ");
			int choice = scan.nextInt();
			int a, b, ans;
			switch(choice) {
			case 1:
				System.out.print("Enter the value for a : ");
				a = scan.nextInt();
				System.out.print("Enter the value for b : ");
				b = scan.nextInt();
				ans = ++a - b--;
				
				/*	Here, we take a = 5 and b = 5
				 * 	++a is the pre-increment of 'a' which means a = 6
				 * 	b-- is the post-decrement of 'b' which means b = 5 after the decrement b = 4
				 * 	then ans = 6 - 5 => ans = 1
				 */
				
				System.out.println("The answer is : " + ans);
				break;
			case 2:
				System.out.print("Enter the value for a : ");
				a = scan.nextInt();
				System.out.print("Enter the value for b : ");
				b = scan.nextInt();
				ans = a % b++;
				
				/*	Here, we take a = 7 and b = 3
				 * 	b++ is the post-increment of 'b' which means b = 3 after the increment b = 4
				 * 	then ans = 7 % 3 => ans = 1
				 */
				
				System.out.println("The answer is : " + ans);
				break;
			case 3:
				System.out.print("Enter the value for a : ");
				a = scan.nextInt();
				System.out.print("Enter the value for b : ");
				b = scan.nextInt();
				a *= b + 5;
				ans = a;
				
				/*	Here, we take a = 4 and b = 3
				 * 	b + 5 => 3 + 5 = 8
				 * 	a *= b + 5 => a = a * b + 5
				 * 	therefore, a = 4 * 8 => a = 32
				 * 	then ans = 32
				 */
				
				System.out.println("The answer is : " + ans);
				break;
			case 4:
				int x = 69 >>> 2;
				
				/*	Here, >>> the symbol denotes Right Shift filled with zeros and also it works in bitwise
				 * 	the binary value of 69 is -> 0000 0000 0000 0000 0000 0000 0100 0101
				 * 	>>> 2 it means the entire binary value is shifted by two positions in right side and filled by zeros in the left.
				 * 	after 69 >>> 2 the ans is -> 0000 0000 0000 0000 0000 0000 0001 0001 => the decimal value is 17
				 * 	after the 69 >>> 2 the value of x = 17
				 */
				
				System.out.println("The answer is : " + x);
				break;
			case 5:
				flag = false;
				break;
			default:
				System.out.println("Please choose within 1 to 5.");
				break;
			}
			System.out.println("--------------------------------");
		}
		scan.close();
	}
}