package assignments.chap8;

import java.util.Scanner;

public class Pe812 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the endpoints of the first line segment: ");
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		System.out.println("Enter the endpoints of the second line segment: ");
		double x3 = scanner.nextDouble();
		double y3 = scanner.nextDouble();
		double x4 = scanner.nextDouble();
		double y4 = scanner.nextDouble();
		Intersection intersection1 = new Intersection(x1, x2, x3, x4, y1, y2,
				y3, y4);

		intersection1.printOutIntersection();

	}

}
