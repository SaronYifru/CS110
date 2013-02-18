package assignments.chap4;

import java.util.Scanner;

public class Pe621 {

	public static void main(String[] args) {
		int balls;
		int slots;
	    System.out.print("Enter the number of balls: ");
		Scanner scanner = new Scanner(System.in);
		balls = scanner.nextInt();
		System.out.print("Enter the number of slots: ");
		slots = scanner.nextInt();
		char[] path = new char[slots];
		char[] ballBuildUp = new char[slots];
		for (int i = 0; i < balls; i++) {
			
			int slot = 0;
			for (int j = 0; j < slots; j++) {
				double direction = Math.random();
			
			if (direction < 0.5) {
				path[j] = 'L';
			}
			else if (direction > 0.5) {
				path[j] = 'R';
				slot++;
			}
			
			
			}
			
			ballBuildUp[slot] = 'O';
			System.out.println(ballBuildUp);
			ballBuildUp[slot] = ' ';
			System.out.println(path);
			
			
			
				
			}
			
		}

	}



