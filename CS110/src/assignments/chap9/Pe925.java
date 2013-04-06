package assignments.chap9;

import java.util.Scanner;

public class Pe925 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HangMan hangMan1 = new HangMan();
		hangMan1.firstPrompt();
		for (int i = 0; i < 10; i++) {
			char letterGuess = scanner.next().charAt(0);
			hangMan1.replaceByAsteriks();
			hangMan1.findAndDisplay(letterGuess);
			hangMan1.printStatusAndPrompt();
			
		}

	}

}
