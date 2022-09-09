package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotatingArray {
	
	public static int[] rotateLeft(int[] arr, int dim, int size) {
		int[] temp = new int[size];
		int j = 0;
		for(int i = dim; i < size; i++) {
			temp[j++] = arr[i];
		}
		for(int i = 0; i < dim; i++) {
			temp[j++] = arr[i];
		}
		return temp;
	}
	
	public static int[] rotateRight(int[] arr, int dim, int size) {
		int[] temp = new int[size];
		int k = 0;
		for(int i = size - dim; i < size; i++) {
			temp[k++] = arr[i];
		}
		for(int i = 0; i < size - dim; i++) {
			temp[k++] = arr[i];
		}
		return temp;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the array size   : ");
		int size = scan.nextInt();
		System.out.print("Enter the rotate value : ");
		int dim = scan.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = i + 1;
		}
		System.out.println(Arrays.toString(rotateLeft(arr, dim, size)));
		System.out.println(Arrays.toString(rotateRight(arr, dim, size)));
		scan.close();
	}
}