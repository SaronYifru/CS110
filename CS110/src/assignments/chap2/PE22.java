package assignments.chap2;

import java.util.Scanner;

public class PE22 {
	public static void main(String [] arg) {
		double volume;
		double radius;
		double height;
		Double area;
		Double PI = Math.PI;
		System.out.println("Enter the radius and the height of the cylinder: ");
		Scanner scanner = new Scanner(System.in);
		radius  = scanner.nextDouble();
		height = scanner.nextDouble();
		area = Math.pow(radius, 2) * PI;
		volume = area * height;
		System.out.println("The area is " + area + "\n" + "The volume is " + volume);
		
		
		
		
		
		
	}
	

}
