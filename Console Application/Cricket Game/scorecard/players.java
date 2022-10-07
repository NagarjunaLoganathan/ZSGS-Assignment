package com.zoho.scorecard;

public class players {

	// 4 scoreDetails getter setter
	// map p.n, value this pojo details
	private int playerScore;
	private int ballFaced;
	private int playerSixes;
	private int playerFours;
	private int wickets;
	private int firstInningsScore;

	public int getPlayerScore() {
		return playerScore;
	}

	public void setPlayerScore(int playerScore) {
		this.playerScore = playerScore;
	}

	public int getBallFaced() {
		return ballFaced;
	}

	public void setBallFaced(int ballFaced) {
		this.ballFaced = ballFaced;
	}

	public int getPlayerSixes() {
		return playerSixes;
	}

	public void setPlayerSixes(int playerSixes) {
		this.playerSixes = playerSixes;
	}

	public int getPlayerFours() {
		return playerFours;
	}

	public void setPlayerFours(int playerFours) {
		this.playerFours = playerFours;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public int getFirstInningsScore() {
		return firstInningsScore;
	}

	public void setFirstInningsScore(int firstInningsScore) {
		this.firstInningsScore = firstInningsScore;
	}

}
