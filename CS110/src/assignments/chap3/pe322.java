package assignments.chap3;

import java.util.Scanner;

public class pe322 {
	public static void main(String[] args) {
		final int x1 = 0;
		final int y1 = 0;
		Double x2;
		Double y2;
		double distance;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		x2 = scanner.nextDouble();
		y2 = scanner.nextDouble();
		distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		if (distance <= 10) {
			System.out.print("Point " + "(" + x2 + "," + y2 + ")" + " is in the circle");
		}
		else {
			System.out.print("point " + "(" + x2 + "," + y2 + ")" + "is not in the circle");
		}
		
		
		

	}

}
