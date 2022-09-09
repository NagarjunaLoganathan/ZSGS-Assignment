/*	6. Write a program for the following. Let consider 20 students
 * 	   in a class with the roll no 101 - 120. We are going to split
 *     them into four groups. Based on their roll number we are
 *     going to split them with the following logics.
 *     Example : Input  : Total number of students : 20
 *     			 Output : Group 1 : 101, 105, 109, 113, 117
 *     					  Group 2 : 102, 106, 110, 114, 118
 *     					  Group 3 : 103, 107, 111, 115, 119
 *     					  Group 4 : 104, 108, 112, 116, 120
 */

package com.sixty.questions;

import java.util.Arrays;
import java.util.Scanner;

public class Question_No_06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Total number of students : ");
		int studentsCount = scan.nextInt();
		System.out.print("Enter number of groups : ");
		int numOfGroups = scan.nextInt();
		if (studentsCount % numOfGroups == 0) {
			int gSize = studentsCount / numOfGroups;
			for (int i = 1; i <= numOfGroups; i++) {
				System.out.print("Group " + i + ": ");
				int[] group = new int[gSize];
				int rollNo = i, k = 0;
				while (rollNo <= studentsCount) {
					group[k++] = rollNo + 100;
					rollNo += numOfGroups;
				}
				System.out.println(Arrays.toString(group));
			}
		} else {
			System.out.println("The group members are not in balance.");
		}
		scan.close();
	}
}
