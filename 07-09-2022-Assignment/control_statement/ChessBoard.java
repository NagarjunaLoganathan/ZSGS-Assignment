package com.control_statement;

import java.math.BigInteger;

public class ChessBoard {
	
	public static BigInteger recursion(BigInteger num, int limit) {
		
		return (limit != 1) ? num.add(recursion(num.add(num), limit - 1)) : num;
	}
	
	public static void main(String[] args) {
		
		System.out.println(recursion(BigInteger.valueOf(1), 64));
	}
}