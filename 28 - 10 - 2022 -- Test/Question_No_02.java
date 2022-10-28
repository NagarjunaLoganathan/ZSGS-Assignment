package test;

import java.util.Scanner;

public class Question_No_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Length of Array : ");
		int length = scan.nextInt();
		int[] array = new int[length];
		System.out.print("Enter the array elements : ");
		for (int i = 0; i < length; i++) {
			array[i] = scan.nextInt();
		}
		int leader = 0;
		System.out.print("\nThe Output is : ");
		for (int i = 0; i < length; i++) {
			if (array[i] > leader) {
				leader = array[i];
			} else {
				System.out.print(leader + " ");
				leader = 0;
			}
		}
		System.out.println(array[length - 1]);
		scan.close();
	}
}