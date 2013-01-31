package assignments.chap3;

import java.util.Random;
import java.util.Scanner;

public class Pe317 {
	
	public static void main(String[] args) {
		final int scissor = 0;
		final int rock = 1;
		final int paper = 2;
		Random random = new Random();
		int computer = random.nextInt(2) + 1;
		int user;
		System.out.println("Scissor (0), Rock(1), Paper (2): ");
		Scanner scanner = new Scanner(System.in);
		user = scanner.nextInt();
		switch (computer) {
		case scissor:
			if (user == scissor) {
				System.out.println("The computer is scissor. You are scissor too. It is a draw");
			}
			else if (user == rock) {
				System.out.println("The computer is scissor. You are rock. You won");
				
			}
			else if (user == paper) {
				System.out.println("The computer is scissor. You are paper. You lost");
				
			}
			break;
		case rock:
			if (user == scissor) {
				System.out.println("The computer is rock. You are scissor. You lost");
				
			}
			else if (user == rock) {
				System.out.println("The computer is rock. You are rock too. It is a draw");
				
			}
			else if (user == paper) {
				System.out.println("The computer is rock. You are paper. You won");
			
			}
			break;
		case paper:
			if (user == scissor) {
				System.out.println("The computer is paper. You are scissor. You won");
				
			}
			else if (user == rock) {
				System.out.println("The computer is paper. You are rock too. You lost");
				
			}
			else if (user == paper) {
				System.out.println("The computer is paper. You are paper too. It is a draw");
			
			}
			break;
		
			
		}

		
	}

}
