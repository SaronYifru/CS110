package assignments.chap5;

import java.util.Scanner;

public class MyTriangle {

	public static void main(String[] args) {
		System.out.print("Enter the three sides of a triangle: ");
		Scanner scanner = new Scanner(System.in);
		double side1 = scanner.nextDouble();
		double side2 = scanner.nextDouble();
		double side3 = scanner.nextDouble();
		if (isValid(side1, side2, side3)) {
			double area = area(side1, side2, side3);
			System.out.printf("The area of the triangle is %.3f ", area);
		} else {
			System.out.print("The input is invalid!");
		}

	}

	public static boolean isValid(double side1, double side2, double side3) {
		if (side1 + side2 <= side3 || side2 + side3 <= side1
				|| side1 + side3 <= side2) {
			return false;
		}
		return true;

	}

	public static double area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}

}
