//	42. Java program to find the frequency of each element in the array.

package com.sixty.questions;

import java.util.HashMap;
import java.util.Map;

public class Question_No_42 {

	public static void main(String[] args) {
		
		int[] array = {0, 2, 1, 2, 1, 9, 9, 9};
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < array.length; i++) {
			if(map.containsKey(array[i])) {
				map.put(array[i], (map.get(array[i]) + 1));
			} else {
				map.put(array[i], 1);
			}
		}
		System.out.println("Element\tFrequency");
		for(@SuppressWarnings("rawtypes") Map.Entry entry : map.entrySet()) {
			System.out.println("   " + entry.getKey() + "\t    " + entry.getValue());
		}
	}
}