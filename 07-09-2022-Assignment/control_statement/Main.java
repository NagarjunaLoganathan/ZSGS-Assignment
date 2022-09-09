package com.control_statement;

import java.util.Scanner;
import java.math.BigInteger;

public class Main {

	public static BigInteger recursion(BigInteger num, long limit) {

		return (limit != 1) ? recursion(num.add(num), limit - 1) : num;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Value : ");
		long val = scan.nextLong();
		System.out.print("Enter the Limit : ");
		long limit = scan.nextLong();
		System.out.println(recursion(BigInteger.valueOf(val), limit));
		scan.close();
	}
}