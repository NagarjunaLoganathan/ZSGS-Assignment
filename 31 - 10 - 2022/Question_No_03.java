package test;

import java.util.HashSet;
import java.util.Scanner;

public class Question_No_03 {

	static HashSet<String> set = new HashSet<>();
	static String combination = "";

	private boolean getSequence(String str, String subStr) {

		int index = -1;
		boolean flag = true;
		for (int i = 0; i < str.length(); i++) {
			subStr = subStr.substring(index + 1);
			index = subStr.indexOf(str.charAt(i));
			if (index == -1) {
				flag = false;
				break;
			}
		}
		if (flag) {
			set.add(str);
			return true;
		}
		return false;
	}

	private HashSet<String> getCombination(String str, int index) {

		if (combination.length() > 1) {
			getSequence(combination, str.substring(index - 1));
		}
		for (int i = index; i < str.length(); i++) {
			combination += str.charAt(i);
			getCombination(str, i + 1);
			combination = combination.substring(0, combination.length() - 1);
		}
		return set;
	}

	private void solution() {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String              : ");
		String str = scan.next();
		System.out.println("The Subsequences are          : " + getCombination(str, 0));
		System.out.println("The Number of Subsequence are : " + set.size());
		scan.close();
	}

	public static void main(String[] args) {

		Question_No_03 solu = new Question_No_03();
		solu.solution();
	}
}