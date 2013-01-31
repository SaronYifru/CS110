package assignments.chap3;

import java.util.Scanner;

public class pe33 {

	public static void main(String[] args) {
		Double a;
		Double b;
		Double c;
		Double d;
		Double e;
		Double f;
		Double x;
		Double y;
		Double denominator;
		System.out.println("Enter a, b, c, d, e, f: ");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		d = scanner.nextDouble();
		e = scanner.nextDouble();
		f = scanner.nextDouble();
		denominator = a * d - b * c;
		if (denominator != 0) {
			x = (e * d - b * f)/denominator;
			y = (a * f - e * c)/denominator;
			System.out.println("X is " + x + " and Y is " + y);
		}
		else {
			System.out.println("The equation has no solution");
		}

	}

}
