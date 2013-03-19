package assignments.chap7;

import java.util.Scanner;

public class Pe719 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int numberOfRows = scanner.nextInt();
		System.out.print("Enter the number of columns: ");
		int numberOfColumns = scanner.nextInt();
		int[][] values = getInput(scanner, numberOfRows, numberOfColumns);
		if (isConsecutiveFour(values, numberOfRows, numberOfColumns)) {
			System.out
					.println("True, the array contains four consecutive numbers with the same value");
		}
	}

	public static int[][] getInput(Scanner scanner, int numberOfRows,
			int numberOfColumns) {
		int[][] values = new int[numberOfRows][numberOfColumns];

		System.out.println("Enter the array values: ");
		for (int i = 0; i < numberOfRows; i++) {
			for (int j = 0; j < numberOfColumns; j++) {
				values[i][j] = scanner.nextInt();
			}
		}
		return values;
	}

	public static boolean isConsecutiveFour(int[][] values, int numberOfRows,
			int numberOfColumns) {
		// check for horizontal pattern
		for (int i = 0; i < numberOfRows; i++) {
			int[] row = values[i];
			if (hasPattern(row)) {
				return true;
			}
		}
		// check for vertical pattern
		for (int i = 0; i < numberOfColumns; i++) {
			int[] column = new int[numberOfRows];

			for (int j = 0; i < numberOfRows; i++) {
				column[j] = values[j][i];
			}
			if (hasPattern(column)) {
				return true;
			}
		}
		// check for diagonal patterns
		for (int i = 0; i < numberOfRows - 3; i++) {
			int valuesInDiagonal = numberOfRows - i;
			int[] diagonal = new int[valuesInDiagonal];
			for (int j = 0; j < valuesInDiagonal; j++) {
				diagonal[j] = values[(j + i)][j];
			}
			if (hasPattern(diagonal)) {
				return true;
			}
		}

		for (int i = 1; i < numberOfColumns - 3; i++) {
			int valuesInDiagonal = numberOfColumns - i;
			int[] diagonal = new int[valuesInDiagonal];
			for (int j = 0; j < valuesInDiagonal; j++) {
				diagonal[j] = values[j][j + i];
			}
			if (hasPattern(diagonal)) {
				return true;
			}
		}

		for (int i = 3; i < numberOfColumns; i++) {
			int valuesInDiagonal = i;
			int[] diagonal = new int[valuesInDiagonal];

			for (int j = 0; j < valuesInDiagonal; j++) {
				diagonal[j] = values[j][i - j];
			}
			if (hasPattern(diagonal)) {
				return true;
			}
		}

		for (int i = 1; i < numberOfRows - 3; i++) {
			int valuesInDiagonal = numberOfRows - i;
			int[] diagonal = new int[valuesInDiagonal];
			for (int j = 0; j < valuesInDiagonal; j++) {
				diagonal[j] = values[(i + j)][(numberOfColumns - 1 - j)];
			}
			if (hasPattern(diagonal)) {
				return true;
			}
		}
		return false;
	}

	public static boolean hasPattern(int[] values) {
		boolean sameValue = true;
		for (int i = 0; i < values.length - 3; i++) {
			for (int j = i; j < i + 3; j++) {
				if (values[j] != values[(j + 1)]) {
					sameValue = false;
					break;
				}
			}
		}
		return sameValue;

	}

}
