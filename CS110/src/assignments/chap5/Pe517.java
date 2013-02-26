package assignments.chap5;

import java.util.Random;
import java.util.Scanner;

public class Pe517 {

	public static void main(String[] args) {
		System.out.print("Enter n: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		printMatrix(n);

	}

	public static void printMatrix(int n) {
		for (int row = 0; row < n; row++) {
			for (int column = 0; column < n; column++) {
				Random r = new Random();
				int Value = r.nextInt(2);
				System.out.printf("%2d", Value);
			}
			System.out.println();
		}
	}

}
