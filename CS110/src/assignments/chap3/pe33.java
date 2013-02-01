package assignments.chap3;

import java.util.Scanner;

public class pe33 {
	public static void main(String[] args) {
		Double a, b, c, d, e, f;
		Double x, y;
		Double denominator;
		System.out.print("Enter a, b, c, d, e, f: ");
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
			System.out.printf("X is %4.3f and Y is %4.3f", x, y);
		}
		else {
			System.out.println("The equation has no solution");
		}

	}

}
