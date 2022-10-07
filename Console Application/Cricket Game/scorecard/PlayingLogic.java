package com.zoho.scorecard;

import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class PlayingLogic {

	int totalScore;
	final static int MAX_WICKETS = 10;
	float runRate;
	private static int[] runPossibilities = { 0, 1, 2, 3, 4, 6, 7, 8, 9 }; // 7 - out 8 - NB 9 - Wd
	private static int innings = 1;
	private static boolean isIndWon = false;
	private static boolean isFreeHit = false;

	private static int[] finalScoreArray = new int[2];

	static Random rand = new Random();
	public boolean isIndTossWin = false;

	private int playOvers;

	public static int getRandrunInputs() {
		return runPossibilities[rand.nextInt(runPossibilities.length)];
	}

	public HashMap<String, players> battingEvent(String[] battingTeam, String[] bowlingteam,
			LinkedHashMap<String, players> battingMap, LinkedHashMap<String, Bowlers> bowlingMap) {
		totalScore = 0;
		int ballCount = 0;
		int wickets = 0;
		int extras = 0;
		float overs = 0.0f;

		if (TossLogic.playingOvers == 1)
			playOvers = 10 * 6;
		if (TossLogic.playingOvers == 2)
			playOvers = 20 * 6;

		ArrayList<ArrayList<String>> oversDetails = new ArrayList<ArrayList<String>>(20);

		ArrayList<String> al = new ArrayList<String>();

		players pl = new players();
		Bowlers bl = new Bowlers();

		battingMap.put(battingTeam[0], pl);
		pl = new players();
		battingMap.put(battingTeam[1], pl);

		String[] strikers = { battingTeam[0], battingTeam[1] };

		int batitr = 1;
		String temp = "";
		int bowitr = 0;

		bowlingMap.put(bowlingteam[bowitr], bl);

		while (wickets < MAX_WICKETS && ballCount < playOvers) {

			int currentRun = getRandrunInputs();
			if (currentRun == 7) {
				if (isFreeHit) {
					al.add("0FH");
					isFreeHit = false;
					ballCount += 1;

					if (ballCount % 6 == 0) {

						temp = strikers[0];
						strikers[0] = strikers[1];
						strikers[1] = temp;

						oversDetails.add(al);

						al = new ArrayList<String>();

						bl = bowlingMap.get(bowlingteam[bowitr]);
						float oversbowl = bl.getOvers();
						oversbowl += 1;
						oversbowl += (ballCount % 6f) / 10f;

						bl.setOvers(oversbowl);

						bowlingMap.put(bowlingteam[bowitr], bl);

						bowitr++;
						if (bowitr == bowlingteam.length)
							bowitr = 0;

						if (!bowlingMap.containsKey(bowlingteam[bowitr])) {
							bl = new Bowlers();
							bowlingMap.put(bowlingteam[bowitr], bl);
						}

					}

				} else {

					wickets += 1;
					ballCount += 1;
					pl = battingMap.get(strikers[0]);
					int playerBallFaced = pl.getBallFaced();
					playerBallFaced++;
					pl.setBallFaced(playerBallFaced);

					battingMap.put(strikers[0], pl);

					batitr++;

					al.add("W");
					bl = bowlingMap.get(bowlingteam[bowitr]);
					int WicketTaken = bl.getWickets();
					WicketTaken += 1;
					bl.setWickets(WicketTaken);
					bowlingMap.put(bowlingteam[bowitr], bl);

					if (wickets <= 9) {
						strikers[0] = battingTeam[batitr];
						pl = new players();
						battingMap.put(battingTeam[batitr], pl);

						if (ballCount % 6 == 0) {

							temp = strikers[0];
							strikers[0] = strikers[1];
							strikers[1] = temp;

							oversDetails.add(al);

							al = new ArrayList<String>();

							bl = bowlingMap.get(bowlingteam[bowitr]);
							float oversbowl = bl.getOvers();
							oversbowl += 1;

							oversbowl += (ballCount % 6f) / 10f;

							bl.setOvers(oversbowl);

							bowlingMap.put(bowlingteam[bowitr], bl);

							bowitr++;
							if (bowitr == bowlingteam.length)
								bowitr = 0;

							if (!bowlingMap.containsKey(bowlingteam[bowitr])) {
								bl = new Bowlers();
								bowlingMap.put(bowlingteam[bowitr], bl);
							}

							overs++;

						}

					}

				}
			}

			else if (currentRun == 8 || currentRun == 9) {
				totalScore += 1;

				extras += 1;
				if (currentRun == 8) {
					al.add("Nb");
					isFreeHit = true;
				}

				if (currentRun == 9)
					al.add("Wd");

				bl = bowlingMap.get(bowlingteam[bowitr]);
				int runGiven = bl.getRunGiven();
				runGiven += 1;
				bl.setRunGiven(runGiven);

				bowlingMap.put(bowlingteam[bowitr], bl);

				if (innings == 2) {

					if (totalScore > finalScoreArray[0]) {

						overs = (ballCount / 6 + (ballCount % 6f) / 10);
						oversDetails.add(al);
						bl = bowlingMap.get(bowlingteam[bowitr]);
						float oversbowl = bl.getOvers();
						// oversbowl += 1;
						oversbowl += (ballCount % 6f) / 10f;

						bl.setOvers(oversbowl);

						bowlingMap.put(bowlingteam[bowitr], bl);

						if (battingTeam[0].equals("K.L.Rahul")) {
							isIndWon = true;
						} else
							isIndWon = false;
						break;
					}

				}
			}

			else {
				totalScore += currentRun;
				isFreeHit = false;

				ballCount += 1;

				pl = battingMap.get(strikers[0]);
				int playerScore = pl.getPlayerScore();
				playerScore += currentRun;

				pl.setPlayerScore(playerScore);
				battingMap.put(strikers[0], pl);

				int playerBallFaced = pl.getBallFaced();
				playerBallFaced++;
				pl.setBallFaced(playerBallFaced);

				battingMap.put(strikers[0], pl);
				al.add("" + currentRun);

				bl = bowlingMap.get(bowlingteam[bowitr]);
				int runGiven = bl.getRunGiven();
				runGiven += currentRun;
				bl.setRunGiven(runGiven);
				bowlingMap.put(bowlingteam[bowitr], bl);

				if (currentRun == 6) {

					int playerSixes = pl.getPlayerSixes();
					playerSixes++;
					pl.setPlayerSixes(playerSixes);

					battingMap.put(strikers[0], pl);

				}

				if (currentRun == 4) {

					int playerFours = pl.getPlayerFours();
					playerFours++;
					pl.setPlayerFours(playerFours);

					battingMap.put(strikers[0], pl);

				}

				if (currentRun == 1 || currentRun == 3) {
					temp = strikers[0];
					strikers[0] = strikers[1];
					strikers[1] = temp;

				}
				// System.out.println(ballCount);
				if (ballCount % 6 == 0) {

					temp = strikers[0];
					strikers[0] = strikers[1];
					strikers[1] = temp;

					oversDetails.add(al);

					al = new ArrayList<String>();

					bl = bowlingMap.get(bowlingteam[bowitr]);
					float oversbowl = bl.getOvers();
					oversbowl += 1;
					oversbowl += (ballCount % 6f) / 10f;

					bl.setOvers(oversbowl);

					bowlingMap.put(bowlingteam[bowitr], bl);

					bowitr++;
					if (bowitr == bowlingteam.length)
						bowitr = 0;

					if (!bowlingMap.containsKey(bowlingteam[bowitr])) {
						bl = new Bowlers();
						bowlingMap.put(bowlingteam[bowitr], bl);
					}

				}

				if (innings == 2) {

					if (totalScore > finalScoreArray[0]) {

						overs = (ballCount / 6 + (ballCount % 6f) / 10);
						oversDetails.add(al);
						bl = bowlingMap.get(bowlingteam[bowitr]);
						float oversbowl = bl.getOvers();

						oversbowl += (ballCount % 6f) / 10f;

						bl.setOvers(oversbowl);

						bowlingMap.put(bowlingteam[bowitr], bl);
						if (battingTeam[0].equals("K.L.Rahul")) {
							isIndWon = true;
							break;
						} else {
							isIndWon = false;
							break;
						}

					}

				}

			}
			overs = (ballCount / 6 + (ballCount % 6f) / 10);
		}
		if (wickets == 10) {
			oversDetails.add(al);
			bl = bowlingMap.get(bowlingteam[bowitr]);
			float oversbowl = bl.getOvers();
			// oversbowl += 1;
			oversbowl += (ballCount % 6f) / 10f;

			bl.setOvers(oversbowl);

			bowlingMap.put(bowlingteam[bowitr], bl);

		}

		finalScoreArray[innings - 1] = totalScore;

		System.out.println("Total / Wickets : " + totalScore + " / " + wickets);
		System.out.println("Extras: " + extras);
		System.out.println("Balls: " + ballCount);
		System.out.println("Overs: " + overs);
		System.out.println("******");
		// System.out.println("Player Name R(B) Fours Sixes SR");
		System.out.printf("%-20s %-1s(%-1s)    %-8s  %-5s    %-3s\n", "Player Name", "R", "B", "Fours", "Sixes", "SR");
		System.out.printf("%-20s %-1s    %-7s   %-7s  %-6s\n", "-----------", "----", "-----", "-----", "---");
		for (String s : battingMap.keySet()) {
			// System.out.print(s);
			// for(int i = 0; i < ("Mohammad Hasnain".length()-s.length()+5); i++)
			// System.out.print(" ");
			// System.out.print(battingMap.get(s).getPlayerScore()+
			// "("+battingMap.get(s).getBallFaced()+ ")" );
			// for(int i = 0; i < //(6 -(battingMap.get(s).getPlayerScore()+
			// "("+battingMap.get(s).getBallFaced()+ ")"+"".length())); i++)
			// +battingMap.get(s).getPlayerFours()+" "+battingMap.get(s).getPlayerSixes()+ "
			// "+((float)battingMap.get(s).getPlayerScore()/battingMap.get(s).getBallFaced()*100));
			System.out.printf("%-20s %-2s(%-2s)     %-5s   %-5s  %-3.2f \n", s, battingMap.get(s).getPlayerScore(),
					battingMap.get(s).getBallFaced(), battingMap.get(s).getPlayerFours(),
					battingMap.get(s).getPlayerSixes(),
					((float) battingMap.get(s).getPlayerScore() / battingMap.get(s).getBallFaced() * 100));

		}

		System.out.println();

		int x = 0;
		for (ArrayList<String> strarr : oversDetails)
			System.out.println("Over" + " " + (++x) + ": " + strarr);

		System.out.println();
		System.out.println("Bowling Card");
		System.out.println("************");

		System.out.println("Bowler Name          Overs   Runs   Wickets");
		System.out.println("-----------          -----   ----   -------");
		for (String s : bowlingMap.keySet()) {
			System.out.print(s);
			for (int i = 0; i < ("Mohammad Hasnain".length() - s.length() + 5); i++)
				System.out.print(" ");

			System.out.println(bowlingMap.get(s).getOvers() + "      " + bowlingMap.get(s).getRunGiven() + "       "
					+ bowlingMap.get(s).getWickets());

		}
		if (innings == 2) {
			if (finalScoreArray[1] < finalScoreArray[0]) {
				if (battingTeam[0].equals("K.L.Rahul"))
					isIndWon = false;

				else
					isIndWon = true;
			}

		}
		if (innings == 2) {
			if (finalScoreArray[0] == finalScoreArray[1]) {
				System.out.println();
				System.out.println("^^^^^^^MATCH DRAWN^^^^^^^");
			}
			if (isIndWon) {
				System.out.println();
				System.out.println("^^^^^^^INDIA WON THE MATCH^^^^^^^");
			}

			else {
				System.out.println();
				System.out.println("^^^^^^^PAKISTAN WON THE MATCH^^^^^^^");
			}
		}

		innings += 1;

		return battingMap;
	}

}
