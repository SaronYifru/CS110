package assignments.chap3;

import java.util.Scanner;

public class pe322 {
	public static void main(String[] args) {
		final int X1 = 0;
		final int Y1 = 0;
		Double x2;
		Double y2;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		x2 = scanner.nextDouble();
		y2 = scanner.nextDouble();
		System.out.println(pointInACircle(X1, Y1, x2, y2));
	}
	public static String pointInACircle(int X1, int Y1, double x2, double y2) {
		double distance;
		distance = Math.sqrt(Math.pow((x2 - X1), 2) + Math.pow((y2 - Y1), 2));
		if (distance <= 10) {
			return ("Point " + "(" + x2 + "," + y2 + ")" + " is in the circle");
		}
		else {
			return ("point " + "(" + x2 + "," + y2 + ")" + "is not in the circle");
		}
		
		
		

	}

}
