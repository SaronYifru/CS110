package assignments.chap3;

import java.util.Scanner;

public class pe332 {
	public static void main(String[] args) {
		Double x0, x1, x2;
		Double y0, y1, y2;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter three points for p0, p1, and p2: ");
		x0 = scanner.nextDouble();
		y0 = scanner.nextDouble();
		x1 = scanner.nextDouble();
		y1 = scanner.nextDouble();
		x2 = scanner.nextDouble();
		y2 = scanner.nextDouble();
		System.out.println(pointPosition(x0, y0, x1, y1, x2, y2));
	}
	public static String pointPosition(double x0, double y0, double x1, double y1, double x2, double y2) {
		Double condition;
		condition = ((x1 - x0) * (y2 - y0)) - ((x2 - x0) * (y1 - y0));
		if (condition > 0) {
			return "p2 is on the left side of the line";
		}
		else if (condition == 0) {
			return "p2 is on the same line";
				
		}
		else {
			return "p2 is on the right side of the line";
		}
		
		
	}

}
