package assignments.chap3;

import java.util.Scanner;

public class Pe31 {

	
	public static void main(String[] args) {
		Double a;
		Double b;
		Double c;
		Double r1;
		Double r2;
		Double discriminant;
		System.out.println(" Enter a, b, c: ");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		discriminant = Math.pow((Math.pow(b, 2) - 4 * a * c), 0.5);
		if (discriminant == 0) { 
			r1 = r2 = -b/(2*a);
			System.out.println("The root is " + r1);
		}
		else if (discriminant > 0) {
			r1 = (-b + discriminant)/(2 * a);
			r2 = (-b - discriminant)/(2 * a);
			System.out.println("The roots are " + r1 + "and" + r2);
		}
		else {
			System.out.println("The equation has no real roots");
		}
	}

}
