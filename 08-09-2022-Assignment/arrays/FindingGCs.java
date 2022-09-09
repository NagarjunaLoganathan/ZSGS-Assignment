package com.arrays;

public class FindingGCs {

	public static void main(String[] args) {
		
		String[][] arr = {{"Luke", "Shaw"}, {"Wayne", "Rooney"}, {"Rooney", "Ronaldo"}, {"Shaw", "Rooney"}};
		int gChild = 0, i = 0;
		String child = "";
		while(i < arr.length) {
			
			child += (arr[i++][1].equals("Ronaldo")) ? arr[i - 1][0] : "";
		}
		for(i = 0; i < arr.length; i++) {
			
			gChild += (arr[i][1].equals(child)) ? 1 : 0;
		}
		System.out.println("Ronaldo's Grandchildren : " + gChild);
	}
}