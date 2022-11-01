package test;

import java.util.Arrays;
import java.util.Scanner;

public class Question_No_01 {
	
	private int[] productOfArray(int[] array, int length) {
		
		int[] arr = new int[length];
		for(int i = 0; i < length; i++) {
			int product = 1;
			for(int j = 0; j < length; j++) {
				if(i != j) {
					product *= array[j];
				}
			}
			arr[i] = product;
		}
		return arr;
	}

	private void solution() {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length of Array : ");
		int length = scan.nextInt();
		int[] array = new int[length];
		System.out.print("Enter the Array Element   : ");
		for(int i = 0; i < length; i++) {
			array[i] = scan.nextInt();
		}
		System.out.println("Give Arrays Product is    : " + Arrays.toString(productOfArray(array, length)));
		scan.close();
	}

	public static void main(String[] args) {

		Question_No_01 solu = new Question_No_01();
		solu.solution();
	}
}