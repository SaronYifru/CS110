package assignments.chap9;

import java.util.Scanner;

public class Pe925 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String status = "y";
		while (status.equals("y")) {
			HangMan hangMan1 = new HangMan();
			hangMan1.replaceByAsteriks();
			while (hangMan1.continueGame()) {
				hangMan1.printStatusAndPrompt();
				char letterGuess = scanner.next().charAt(0);
				hangMan1.isletterInWord(letterGuess);
			}
			hangMan1.endOfGameDetails();
			System.out
					.print("Do you want to start another game? Enter y or n > ");
			status = scanner.next();
		}

	}

}
