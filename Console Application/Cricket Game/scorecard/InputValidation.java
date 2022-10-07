package com.zoho.scorecard;

public class InputValidation {
	public static Boolean validatingToss(int input) {

		if (input == 1 || input == 2)
			return false;
		else {
			System.out.println("Enter proper Choice");
			return true;
		}

	}

	public static Boolean validatingHeadTail(int input) {

		if (input == 1 || input == 2)
			return false;
		else {
			System.out.println("Enter proper Choice");
			return true;
		}

	}

	public static Boolean validatingOvers(int input) {

		if (input == 1 || input == 2)
			return false;

		else {
			System.out.println("Enter proper Choice");
			return true;
		}

	}

}
