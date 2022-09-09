package com.operators;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		OperatorsFunction fn = new OperatorsFunction();
		boolean flag = true;
		while (flag) {
			System.out.println("1. Unary Operators.");
			System.out.println("2. Arithmetic Operators.");
			System.out.println("3. Shift Operators.");
			System.out.println("4. Relational Operators.");
			System.out.println("5. Bitwise Operators.");
			System.out.println("6. Logical Operators.");
			System.out.println("7. Ternary Operator.");
			System.out.println("8. Assignment Operators.");
			System.out.println("------------------------");
			System.out.print("Enter the Options : ");
			int option = scan.nextInt();
			switch (option) {
			case 1 -> fn.unaryOperators();
			case 2 -> fn.arithmeticOperators();
			case 3 -> fn.shiftOperators();
			case 4 -> fn.relationalOperators();
			case 5 -> fn.bitwiseOperators();
			case 6 -> fn.logicalOperators();
			case 7 -> fn.ternaryOperator();
			case 8 -> fn.assignmentOperators();
			case 9 -> flag = false;
			default -> System.out.println("Plese choose the above given options only.");
			}
			System.out.println("-----------------------------------------------------------------------");
		}
		scan.close();

	}
}