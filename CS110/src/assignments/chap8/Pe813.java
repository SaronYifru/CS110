package assignments.chap8;

import java.util.Scanner;

public class Pe813 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns in the array: ");
		int row = scanner.nextInt();
		int column = scanner.nextInt();
		System.out.println("Enter the array: ");
		double[][] a = new double[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				a[i][j] = scanner.nextDouble();
			}
		}
		System.out.println(locateLargest(a).LocationInfo());

	}

	public static Location locateLargest(double[][] a) {
		double maxValue = a[0][0];
		int row = 0;
		int column = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > maxValue) {
					maxValue = a[i][j];
					row = i;
					column = j;
				}
			}
		}
		Location location1 = new Location(row, column, maxValue);
		return location1;
	}

}
