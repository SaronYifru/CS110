package assignments.chap3;

import java.util.Random;
import java.util.Scanner;

public class Pe317 {
	public static void main(String[] args) {
		final int SCISSOR = 0;
		final int ROCK = 1;
		final int PAPER = 2;
		Random random = new Random();
		int computer = random.nextInt(2) + 1;
		int user;
		System.out.print("Scissor (0), Rock(1), Paper (2): ");
		Scanner scanner = new Scanner(System.in);
		user = scanner.nextInt();
		switch (computer) {
		case SCISSOR:
			if (user == SCISSOR) {
				System.out.println("The computer is scissor. You are scissor too. It is a draw");
			}
			else if (user == ROCK) {
				System.out.println("The computer is scissor. You are rock. You won");
				
			}
			else if (user == PAPER) {
				System.out.println("The computer is scissor. You are paper. You lost");
				
			}
			break;
		case ROCK:
			if (user == SCISSOR) {
				System.out.println("The computer is rock. You are scissor. You lost");
				
			}
			else if (user == ROCK) {
				System.out.println("The computer is rock. You are rock too. It is a draw");
				
			}
			else if (user == PAPER) {
				System.out.println("The computer is rock. You are paper. You won");
			
			}
			break;
		case PAPER:
			if (user == SCISSOR) {
				System.out.println("The computer is paper. You are scissor. You won");
				
			}
			else if (user == ROCK) {
				System.out.println("The computer is paper. You are rock. You lost");
				
			}
			else if (user == PAPER) {
				System.out.println("The computer is paper. You are paper too. It is a draw");
			
			}
			break;
		
			
		}

		
	}

}
