package assignments.wordsearch;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = "Saron";
		int numberOfTrials = 0;
		WordSearch puzzle1 = new WordSearch("maze.dat", name);
		puzzle1.printWelcomeMessage();
		puzzle1.initialPuzzleDisplay();
		while (numberOfTrials < puzzle1.numberOfTrials) {
			puzzle1.printClue();
			System.out.print("Enter the word you want to search for: ");
			String wordToFind = scanner.next();
			if (puzzle1.lookUp(wordToFind) == null) {
				System.out.println(wordToFind
						+ " is not in the puzzle! Please tryAgain!");
			} else {
				puzzle1.puzzleView(wordToFind);
				System.out.println(puzzle1.lookUp(wordToFind));
				numberOfTrials++;
			}
		}

	}

}
