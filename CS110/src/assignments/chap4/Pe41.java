package assignments.chap4;

import java.util.Scanner;

public class Pe41 {

	public static void main(String[] args) {
		int integer;
		System.out.print("Enter an integer, the input ends if it is 0: ");
		Scanner scanner = new Scanner(System.in);
		integer = scanner.nextInt();
		int numberOfPositives = 0;
		int numberOfNegatives = 0;
		int total = 0;
		int counter = 0;
		while (integer != 0) {
			if (integer < 0) {
				numberOfNegatives = numberOfNegatives + 1;
			}
			else {
				numberOfPositives = numberOfPositives + 1;
			}
			total = total + integer;
			counter = counter + 1;
			integer = scanner.nextInt();
		}
		double average = (double) total/counter;
		if (counter == 0) {
			System.out.println("No numbers are entered except 0");
		}
		else {
			System.out.println("The number of positives is " + numberOfPositives);
			System.out.println("The number of negatives is " + numberOfNegatives);
			System.out.println("The total is " + total);
			System.out.println("The average is " + average);
			
		}
		}

}
