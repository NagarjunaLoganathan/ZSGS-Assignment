package com.operators;

import java.util.Scanner;

public class OperatorsFunction {

	Scanner SC = new Scanner(System.in);

	public void unaryOperators() {
		System.out.print("Enter the number : ");
		int num = SC.nextInt();
		System.out.println("----------PostFix----------");
		System.out.println("During Increment : " + num++);
		System.out.println("After Increment  : " + num);
		System.out.println("During Decrement : " + num--);
		System.out.println("After Decrement  : " + num);
		System.out.println("----------PreFix----------");
		System.out.println("Before Increment             : " + num);
		System.out.println("During Increment             : " + ++num);
		System.out.println("Before Decrement             : " + num);
		System.out.println("During Decrement             : " + --num);
		System.out.println("Signing number with Positive : " + +num);
		System.out.println("Signing number with Negative : " + -num);
	}

	public void arithmeticOperators() {
		System.out.print("Enter the number1 : ");
		int num1 = SC.nextInt();
		System.out.print("Enter the number2 : ");
		int num2 = SC.nextInt();
		System.out.println("----------Multiplicative----------");
		System.out.println("Product of two numbers are   : " + (num1 * num2));
		System.out.println("Quotient of two numbers are  : " + (num1 / num2));
		System.out.println("Remainder of two numbers are : " + (num1 % num2));
		System.out.println("----------Additive----------");
		System.out.println("Adding two numbers     : " + (num1 + num2));
		System.out.println("Subtrating two numbers : " + (num1 - num2));
	}

	public void shiftOperators() {
		System.out.print("Enter the value : ");
		int num = SC.nextInt();
		System.out.print("Enter the shift position : ");
		int sp = SC.nextInt();
		System.out.println("----------Bitwise Shift----------");
		System.out.println("Left shift             : " + (num << sp));
		System.out.println("Right Shift            : " + (num >> sp));
		System.out.println("Right Shift with Zeros : " + (num >>> sp));
	}

	public void relationalOperators() {
		System.out.print("Enter number1 : ");
		int num1 = SC.nextInt();
		System.out.print("Enter number2 : ");
		int num2 = SC.nextInt();
		System.out.println("----------Comparision----------");
		System.out.println(num1 + " is Less then " + num2 + "              : " + (num1 < num2));
		System.out.println(num1 + " is Greater then " + num2 + "           : " + (num1 > num2));
		System.out.println(num1 + " is Less then or Equalt " + num2 + "    : " + (num1 <= num2));
		System.out.println(num1 + " is Greater then or Equalt " + num2 + " : " + (num1 >= num2));
		System.out.println("----------Equality----------");
		System.out.println(num1 + " is Equalt " + num2 + "                 : " + (num1 < num2));
		System.out.println(num1 + " is Not Equalt " + num2 + "             : " + (num1 < num2));
	}

	public void bitwiseOperators() {
		System.out.print("Enter the number1 : ");
		int num1 = SC.nextInt();
		System.out.print("Enter the number2 : ");
		int num2 = SC.nextInt();
		System.out.println("----------Bitwise Operators----------");
		System.out.println("Bitwise AND : " + (num1 & num2));
		System.out.println("Bitwise OR  : " + (num1 | num2));
		System.out.println("Bitwise XOR : " + (num1 ^ num2));
	}

	public void logicalOperators() {
		System.out.print("Enter the number1 : ");
		int num1 = SC.nextInt();
		System.out.print("Enter the number2 : ");
		int num2 = SC.nextInt();
		System.out.println("----------Logical Operators----------");
		System.out.println(num1 + " is less then " + num2 + " and " + num2 + " is Greater then " + num1 + " : "
				+ ((num1 < num2) && (num2 > num1)));
		System.out.println(num1 + " is less then " + num2 + " or " + num2 + " is less then " + num1 + "     : "
				+ ((num1 < num2) || (num2 < num1)));
	}

	public void ternaryOperator() {
		System.out.print("Enter the number1 : ");
		int num1 = SC.nextInt();
		System.out.print("Enter the number2 : ");
		int num2 = SC.nextInt();
		System.out.println("----------Ternary Operator----------");
		String num = (num1 > num2) ? "True" : "False";
		System.out.println(num1 + " is Greaer then " + num2 + " : " + num);
		num = (num1 < num2) ? "True" : "False";
		System.out.println(num1 + " is Less then " + num2 + "   : " + num);
	}

	public void assignmentOperators() {
		System.out.print("Enter the number : ");
		int num = SC.nextInt();
		System.out.println("----------Assignment Operation----------");
		int num2 = num;
		System.out.println("The above given number is assigned to number2            : " + num2);
		System.out.println("Number add with 2 and assigned to number                 : " + (num += 2));
		System.out.println("Number subtract with 2 and assigned to number            : " + (num -= 2));
		System.out.println("Number product with 2 and assigned to number             : " + (num *= 2));
		System.out.println("Number divide with 2 and assigned to number              : " + (num /= 2));
		System.out.println("Number Modular with 10 and assigned to number            : " + (num %= 10));
		System.out.println("Number Bitwise AND with 2 and assigned to number         : " + (num &= 2));
		System.out.println("Number Bitwise OR with 2 and assigned to number          : " + (num |= 2));
		System.out.println("Number Bitwise XOR wit 2 and assigned to number          : " + (num ^= 2));
		System.out.println("Number Left Shift with 1 and assigned to number          : " + (num <<= 1));
		System.out.println("Number Right Shift with 1 and assigned to number         : " + (num >>= 1));
		System.out.println("Number Righ Shift with zeros by 2 and assigned to number : " + (num >>>= 2));
	}
}