package com.zoho.scorecard;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class MainLogic {

	private static boolean isIndBatFirst;
	private static String[] IND_players = { "K.L.Rahul", "Rohit Sharma", "Virat Kohli", "SKY", "Rishab Pant",
			"Dinesh Karthik", "Hardik Pandya", "Ravindra Jadeja", "Bhuvneshwar Kumar", "Yuzvendra Chahal",
			"Deepak Chahar" };// ind bowlers
	private static String[] IND_bowlers = Arrays.copyOfRange(IND_players, 6, IND_players.length);
	private static String[] PAK_players = { "Mohammad Rizwan", "Babar Azam", "Fakhar Zaman", "Iftikhar Ahmed",
			"Mohammad Nawaz", "Khushdil Shah", "Asif Ali", "Shadab Khan", "Haris Rauf", "Naseem Shah",
			"Mohammad Hasnain" };// pak bowlers
	private static String[] PAK_bowlers = Arrays.copyOfRange(PAK_players, 6, PAK_players.length);

	private static LinkedHashMap<String, players> ind_map = new LinkedHashMap<String, players>();
	private static LinkedHashMap<String, players> pak_map = new LinkedHashMap<String, players>();
	private static LinkedHashMap<String, Bowlers> indBowlMap = new LinkedHashMap<String, Bowlers>();
	private static LinkedHashMap<String, Bowlers> pakBowlMap = new LinkedHashMap<String, Bowlers>();

	public static void main(String[] args) {

		System.out.println("Welcome to ZGS Cricbuzz IND vs PAK Match!!!");
		TossLogic tl = new TossLogic();
		isIndBatFirst = tl.tossingEvent();
		PlayingLogic plogic = new PlayingLogic();

		if (isIndBatFirst) {
			System.out.println("*****Indian Batting Card*****");
			plogic.battingEvent(IND_players, PAK_bowlers, ind_map, pakBowlMap);

			System.out.println();

			System.out.println("******Pakistan Batting Card*****");
			plogic.battingEvent(PAK_players, IND_bowlers, pak_map, indBowlMap);
		}

		else {
			System.out.println("******Pakistan Batting Card*****");
			plogic.battingEvent(PAK_players, IND_bowlers, pak_map, indBowlMap);

			System.out.println();

			System.out.println("*****Indian Batting Card*****");
			plogic.battingEvent(IND_players, PAK_bowlers, ind_map, pakBowlMap);

		}

	}
}
