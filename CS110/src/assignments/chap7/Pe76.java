package assignments.chap7;

import java.util.Scanner;

public class Pe76 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter matrix1: ");
		
		double[][] a = getInput(scanner, 3, 3);
		System.out.print("Enter matrix2: ");
		double[][] b = getInput(scanner, 3, 3);
		if (isValid(3, 3)) {
			double[][] c = multiplyMatrix(a, b);
			System.out.println("The multiplication of the matrices is: ");
			for (int i = 0; i < b.length; i++) {
				for (int j = 0; j < b.length; j++) {
				System.out.printf("%2.1f", c[i][j]);
				System.out.printf("%2s", " ");

			    }
			    System.out.println();
		    }
		}
		else {
			System.out.println("The two matrices can not be multiplied!");
		}
		

	}

	public static double[][] getInput(Scanner scanner, int rowsOfMatrix, int columnsOfMatrix) {
		double[][] array = new double[rowsOfMatrix][columnsOfMatrix];
		for (int row = 0; row < rowsOfMatrix; row++) {
			for (int column = 0; column < columnsOfMatrix; column++) {
				array[row][column] = scanner.nextDouble();
			}
		}
		return array;
	}
	public static boolean isValid(int columnsOfMatrix1, int rowsOfMatrix2) {
		if (columnsOfMatrix1 == rowsOfMatrix2) {
			return true;
		}
		return false;
	}

	public static double[][] multiplyMatrix(double[][] a, double[][] b) {

		double[][] c = new double[a.length][a.length];
		double product;
		for (int rowOfA = 0; rowOfA < a.length; rowOfA++) {

			for (int columnOfB = 0; columnOfB < b.length; columnOfB++) {
				product = 0;
				for (int columnOfA = 0; columnOfA < a.length; columnOfA++) {

					product = product + a[rowOfA][columnOfA]
							* b[columnOfA][columnOfB];
				}
				c[rowOfA][columnOfB] = product;
			}

		}
		return c;
	}

}
