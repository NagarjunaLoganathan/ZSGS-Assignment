package test;

import java.util.Arrays;
import java.util.Scanner;

public class Question_No_05 {

	static LinkedList<Object> list = new LinkedList<Object>();

	private int getElement(int i) {

		return (list.get(i) != null) ? (int) list.get(i) : 0;
	}

	private String getValues(int length) {

		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			for (int j = i; j < length; j++) {
				int element1 = getElement(j);
				int element2 = getElement(i);
				if (element1 > element2) {
					array[i] = element1;
					break;
				} else {
					array[i] = 0;
				}
			}
		}
		return Arrays.toString(array);
	}

	private void solution() {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length of Array : ");
		int length = scan.nextInt();
		System.out.print("Enter the Head of Nodes   : ");
		for (int i = 0; i < length; i++) {
			list.add(scan.nextInt());
		}
		System.out.print("The Output is             : " + getValues(length));
		scan.close();
	}

	public static void main(String[] args) {

		Question_No_05 solu = new Question_No_05();
		solu.solution();
	}
}