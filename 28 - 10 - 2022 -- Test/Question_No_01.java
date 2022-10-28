package test;

import java.util.Scanner;

public class Question_No_01 {
	
	private static int anagram(String s) {
		if((s.length() % 2) == 0){
            int count = 0;
            char[] arr1 = s.substring(0, (s.length() / 2)).toCharArray();
            char[] arr2 = s.substring((s.length() / 2), s.length()).toCharArray();
            for(int i = 0; i < arr1.length; i++){
                for(int j = 0; j < arr2.length; j++){
                    if(arr1[i] == arr2[j]){
                        count += 2;
                        break;
                    } else if((j == arr2.length - 1) & (arr1[i] != arr2[j])){
                    	arr2[j] = '0';
                        break;
                    }
                }
            }
            return count;
        } else {
            return -1;
        }
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of String : ");
		int count = scan.nextInt();
		String[] array = new String[count];
		System.out.print("Enter the String : ");
		for(int i = 0; i < count; i++) {
			array[i] = scan.next();
		}
		for(String str : array) {
			System.out.println(anagram(str));
		}
		scan.close();
	}
}