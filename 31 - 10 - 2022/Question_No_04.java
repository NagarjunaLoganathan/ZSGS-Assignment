package test;

import java.util.Scanner;

public class Question_No_04 {

	int[] xMoves = { -1, -1, 1, 1, -2, -2, 2, 2 };
	int[] yMoves = { -2, 2, -2, 2, -1, 1, -1, 1 };

	private double getPosibilities(int size, int moves, int row, int column) {

		double[][][] array = new double[size][size][moves + 1];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				array[i][j][0] = 1.0;
			}
		}

		int totalPossible = xMoves.length;

		for (int move = 1; move <= moves; move++) {
			for (int x = 0; x < size; x++) {
				for (int y = 0; y < size; y++) {
					double posibility = 0.0;
					for (int i = 0; i < totalPossible; i++) {
						int xMove = x + xMoves[i];
						int yMove = y + yMoves[i];
						if ((xMove >= 0 && xMove < size) && (yMove >= 0 && yMove < size)) {
							posibility += array[xMove][yMove][move - 1] / 8.0;
						}
					}
					array[x][y][move] = posibility;
				}
			}
		}
		return array[row][column][moves];
	}

	private void solution() {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of Board   : ");
		int boardSize = scan.nextInt();
		System.out.print("Number of Moves of Knight : ");
		int moves = scan.nextInt();
		System.out.print("Start Index of x          : ");
		int xStart = scan.nextInt();
		System.out.print("Start Index of y          : ");
		int yStart = scan.nextInt();
		System.out.println("The Posibilities are      : " + getPosibilities(boardSize, moves, xStart, yStart));
		scan.close();
	}

	public static void main(String[] args) {

		Question_No_04 solu = new Question_No_04();
		solu.solution();
	}
}