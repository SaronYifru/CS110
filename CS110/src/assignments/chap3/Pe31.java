package assignments.chap3;

import java.util.Scanner;

public class Pe31 {

	public static void main(String[] args) {
		Double a;
		Double b;
		Double c;
		Double root1;
		Double root2;
		Double discriminant;
		System.out.print(" Enter a, b, c: ");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		discriminant = Math.pow(b, 2) - 4 * a * c;
		if (discriminant == 0) { 
			root1 = root2 = -b/(2 * a);
			System.out.printf("The root is %4.3f" + root1);
		}
		else if (discriminant > 0) {
			root1 = (-b + Math.sqrt(discriminant))/(2 * a);
			root2 = (-b - Math.sqrt(discriminant))/(2 * a);
			System.out.printf("The roots are %4.2f and %4.2f", root1, root2);
		}
		else {
			System.out.println("The equation has no real roots");
		}
	}

}
