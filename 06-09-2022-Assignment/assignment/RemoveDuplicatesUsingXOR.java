package com.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesUsingXOR {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size = scan.nextInt();
		long[] arr = new long[size];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextLong();
		}
		Arrays.sort(arr);
		ArrayList<Long> flist = new ArrayList<>();
		ArrayList<Long> rlist = new ArrayList<>();
		for(int i = 0; i < arr.length - 1; i++) {
			if((arr[i] ^ arr[i + 1]) != 0) {
				flist.add(arr[i]);
			} else {
				if(!rlist.contains(arr[i])) {
					rlist.add(arr[i]);
				} else {
					continue;
				}
			}
		}
		flist.add(arr[arr.length - 1]);
		System.out.println("Original given array        : " + Arrays.toString(arr));
		System.out.println("Duplicate removed Array     : " + Arrays.toString(flist.toArray()));
		System.out.println("Duplicate elements in Array : " + Arrays.toString(rlist.toArray()));
		scan.close();
	}
}