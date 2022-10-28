package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_No_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length of Array : ");
		int length = scan.nextInt();
		int[] array = new int[length];
		System.out.print("Enter the array elements : ");
		for(int i = 0; i < length; i++) {
			array[i] = scan.nextInt();
		}
		int target = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < length; i++) {
			int sum = 0, count = 0;
			for(int j = i; j < length; j++) {
				sum += array[j];
				count++;
				if(sum == target) {
					list.add(count);
				}
			}
		}
		System.out.println("The Output is : " + Collections.max(list));
		scan.close();
	}

}
