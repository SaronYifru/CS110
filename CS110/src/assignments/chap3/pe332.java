package assignments.chap3;

import java.util.Scanner;

public class pe332 {
	public static void main(String[] args) {
		Double x0, x1, x2;
		Double y0, y1, y2;
		Double condition;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter three points for p0, p1, and p2: ");
		x0 = scanner.nextDouble();
		y0 = scanner.nextDouble();
		x1 = scanner.nextDouble();
		y1 = scanner.nextDouble();
		x2 = scanner.nextDouble();
		y2 = scanner.nextDouble();
		condition = ((x1 - x0) * (y2 - y0)) - ((x2 - x0) * (y1 - y0));
		
		if (condition < 0) {
			System.out.println("p2 is on the left side of the line");
		}
		else if (condition == 0) {
			System.out.println("p2 is on the same line");
				
		}
		else {
			System.out.println("p2 is on the right side of the line");
		}
		
		
	}

}
