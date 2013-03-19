package assignments.chap7;

import java.util.Scanner;

public class Pe79 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int slotsFilled = 0;
		final int NUMBER_OF_SLOTS = 9;
		String boardArray[][] = new String[3][4];
		String player;
		int row;
		int column;
		do {
			player = whichPlayer(boardArray);
			System.out
					.print("Enter a row (0, 1, 2) for player " + player + ":");
			row = scanner.nextInt();
			System.out.print("Enter a column (0, 1, or 2) for player " + player
					+ ":");
			column = scanner.nextInt();
			if (boardArray[row][column] == "X"
					|| boardArray[row][column] == "O") {
				System.out
						.println("This position has already been filled. try again");
				continue;
			}
			boardArray = board(row, column, player, boardArray);

			slotsFilled++;
		} while (slotsFilled < NUMBER_OF_SLOTS
				&& (status(boardArray, player, row, column) == false));
		if (slotsFilled >= NUMBER_OF_SLOTS) {
			System.out.println("Its a draw");
		}

	}

	// build board
	public static String[][] board(int row, int column, String user,
			String boardArray[][]) {
		for (int i = 0; i < 3; i++) {
			System.out.println("-------------");
			for (int j = 0; j < 4; j++) {
				System.out.print("| ");
				if (i == row && j == column) {
					boardArray[i][j] = user;
				} else if (boardArray[i][j] == null) {

					boardArray[i][j] = " ";
				}
				System.out.print(boardArray[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-------------");
		return boardArray;

	}

	// decide which player goes
	public static String whichPlayer(String boardArray[][]) {
		String player = "X";
		int numberOfXs = 0;
		int numberOfOs = 0;
		for (int i = 0; i < boardArray.length; i++) {
			for (int j = 0; j < boardArray.length; j++) {
				if (boardArray[i][j] == "X") {
					numberOfXs++;

				} else if (boardArray[i][j] == "O") {
					numberOfOs++;
				}

			}
		}
		if (numberOfXs == numberOfOs) {
			player = "X";
		} else if (numberOfXs > numberOfOs) {
			player = "O";
		}
		return player;

	}

	public static boolean status(String boardArray[][], String player, int row,
			int column) {
		String gameStatus = player + " player won";
		// check horizontal symmetry
		for (int i = 0; i < boardArray.length; i++) {
			if (boardArray[row][i] != player) {
				break;
			} else if (i == boardArray.length - 1) {
				System.out.println(gameStatus);
				return true;
			}
		}
		// check vertical symmetry
		for (int i = 0; i < boardArray.length; i++) {
			if (boardArray[i][column] != player) {
				break;
			} else if (i == boardArray.length - 1) {
				System.out.println(gameStatus);
				return true;
			}
		}
		// check diagonal
		for (int i = 0; i < boardArray.length; i++) {
			if (boardArray[i][i] != player) {
				break;
			} else if (i == boardArray.length - 1) {
				System.out.println(gameStatus);
				return true;
			}
		}
		// check reverse diagonal
		for (int i = 0, j = boardArray.length - 1; i < boardArray.length
				&& j >= 0; i++, j--) {
			if (boardArray[i][j] != player) {
				break;
			} else if (i == boardArray.length - 1) {
				System.out.println(gameStatus);
				return true;
			}
		}

		return false;

	}
}
