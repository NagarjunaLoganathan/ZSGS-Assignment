package com.arrays;

import java.util.Scanner;

public class Xpattern {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = scan.next();
		if(str.length() % 2 != 0) {
			for(int i = 0; i < str.length(); i++) {
				for(int j = 0; j < str.length(); j++) {
					System.out.print(((i == j) || ((i + j) == (str.length() - 1))) ? str.charAt(j) : " ");
				}
				System.out.println();
			}
		} else {
			System.out.println("O");
		}
		scan.close();
	}

}
