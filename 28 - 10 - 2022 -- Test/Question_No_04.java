package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_No_04 {

	static Scanner scan = new Scanner(System.in);

	private static ArrayList<Integer> getArrayElements(int length) {

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < length; i++) {
			list.add(scan.nextInt());
		}
		return list;
	}

	private static int checkEquals(ArrayList<Integer> list1, ArrayList<Integer> list2) {

		int count = 0;
		for (int i = 0; i < list2.size(); i++) {
			if (list1.contains(list2.get(i))) {
				continue;
			} else {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		System.out.print("Enter the length of Array : ");
		int length = scan.nextInt();
		System.out.print("Enter the first array elements : ");
		ArrayList<Integer> list1 = getArrayElements(length);
		System.out.print("Enter the second array elements : ");
		ArrayList<Integer> list2 = getArrayElements(length);
		int count = 0;
		count = checkEquals(list1, list2);
		count = checkEquals(list2, list1);
		if (count == 0) {
			System.out.println("The Output is : Equal");
		} else {
			System.out.println("The Output is : Not Equal");
		}
	}
}