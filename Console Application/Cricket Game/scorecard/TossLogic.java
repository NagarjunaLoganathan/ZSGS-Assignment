package com.zoho.scorecard;

import java.util.Scanner;
import java.util.Random;


public class TossLogic {

	Random rand = new Random();
	private int[] tossPossibility = {1,2};
	static Scanner sc = new Scanner(System.in);
	public static boolean isIndFristBat;
	public static int playingOvers = 0;



	private int getRandToss(){
		return tossPossibility[rand.nextInt(tossPossibility.length)];
	}

	public boolean tossingEvent() {

		int indToss = 0;
		boolean validation = true;
		
		
		while(validation) {
			System.out.println("Please Select Overs to Play: ");
			System.out.println("1.Ten  \n2.Twenty");
			playingOvers = sc.nextInt();
			
			validation = InputValidation.validatingOvers(playingOvers);
		}
		
		validation = true;

		while(validation) {
			System.out.println("It is the TOSS Time");

			System.out.println("IND calling for Toss: ");
			System.out.println("1.Head  \n2.Tail");
			indToss = sc.nextInt();

			validation = InputValidation.validatingToss(indToss);

		}
		int sysToss = getRandToss();


		if(indToss == sysToss) {

			return batOrBowl(true);

		}	
		else {

			return batOrBowl(false);
		}	
	}
	public static boolean batOrBowl(boolean b) {
		if(b) {
			boolean validation = true;

			while(validation) {

				System.out.println("India Selecting Batting or Bowling first...\n 1.Bat  \n 2.Bowl ");
				int temp = sc.nextInt();
				if(temp == 1) {
					isIndFristBat = true;
					System.out.println("India won the Toss and elect to Bat First");
				}

				else {
					isIndFristBat = false;
					System.out.println("India won the Toss and elect to Bowl First");
				}

				validation = InputValidation.validatingToss(temp);

			}
		}
		else {
			boolean validation = true;
			while(validation) {
				System.out.println("Pakistan Selecting Batting or Bowling first...\n 1.Bat  \n 2.Bowl ");

				int temp = sc.nextInt();
				if(temp == 1) {
					isIndFristBat = false;
					System.out.println("Pakistan won the Toss and elect to Bat First");
				}

				else {
					isIndFristBat = true;
					System.out.println("Pakistan won the Toss and elect to Bowl First");
				}

				validation = InputValidation.validatingToss(temp);
			}
		}
		return isIndFristBat;
	}

}
