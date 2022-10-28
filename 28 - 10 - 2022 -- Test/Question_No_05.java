package test;

import java.util.HashMap;
import java.util.Scanner;

public class Question_No_05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length of Array : ");
		int length = scan.nextInt();
		System.out.print("Enter the least Count : ");
		int leastCount = scan.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] array = new int[length];
		System.out.print("Enter the array elments : ");
		for (int i = 0; i < length; i++) {
			array[i] = scan.nextInt();
		}
		for (int i = 0; i < length; i++) {
			if (map.containsKey(array[i])) {
				map.put(array[i], map.get(array[i]) + 1);
				if (map.get(array[i]) == leastCount) {
					System.out.println("The first occurance of least count is : " + array[i]);
					break;
				}
			} else {
				map.put(array[i], 1);
			}
		}
		scan.close();
	}
}