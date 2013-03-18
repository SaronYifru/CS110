package assignments.chap7;

import java.util.Scanner;

public class Pe72 {

	public static void main(String[] args) {
		System.out.println("Enter a 4 by 4 matrix row by row: ");
		Scanner scanner = new Scanner(System.in);
		double[][] matrix = new double[4][4];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = scanner.nextDouble();
			}
		}
		System.out.println("Sum of the elements in the major diagonal is "
				+ sumMajorDiagonal(matrix));

	}

	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum = sum + m[i][i];

		}
		return sum;
	}

}
