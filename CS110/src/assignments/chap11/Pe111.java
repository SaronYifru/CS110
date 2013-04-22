package assignments.chap11;

import java.util.Scanner;

public class Pe111 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the three sides of the triangle: ");
		double side1 = scanner.nextDouble();
		double side2 = scanner.nextDouble();
		double side3 = scanner.nextDouble();
		System.out.print("Enter a color: ");
		String color = scanner.next();
		System.out.print("Enter true or false indicating whether the triangle is filled: ");
		boolean filled = scanner.nextBoolean();
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(filled);
		System.out.println(triangle.toString());
		
		

	}

}
