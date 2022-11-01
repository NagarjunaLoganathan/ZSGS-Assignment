package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Question_No_02 {

	private HashSet<String> getTriplets(int[] array, int length){
		
		HashSet<String> set = new HashSet<>();
		
		if(length == 0) {
			return set;
		}
		for(int i = 0; i < length ; i++) {
			int[] arr = new int[3];
			int j = i + 1, k = j + 1;
			while((j < length - 1) && (k < length)){
				int element = array[i] + array[j] + array[k];
				if((i != j) && (j != k) && (i != k) && (element == 0)) {
					arr[0] = array[i];
					arr[1] = array[j];
					arr[2] = array[k];
					Arrays.sort(arr);
					set.add(Arrays.toString(arr));
				}
				j++; k++;
			}
		}
		return set;
	}

	private void solution() {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length of Array : ");
		int length = scan.nextInt();
		int[] array = new int[length];
		System.out.print("Enter the Array Element   : ");
		for (int i = 0; i < length; i++) {
			array[i] = scan.nextInt();
		}
		System.out.println("The Triplets are          : " + getTriplets(array, length));
		scan.close();
	}

	public static void main(String[] args) {

		Question_No_02 solu = new Question_No_02();
		solu.solution();
	}
}