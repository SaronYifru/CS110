package assignments.chap9;

import java.util.Random;

public class HangMan {
	private final String[] words = { "java", "program", "write", "awesome",
			"computer" };
	private String wordWithAsteriks;
	private String randomWord;
	private int numberOfMissed;
	

	public HangMan() {
		Random random = new Random();
		int randomIndex = random.nextInt(words.length);
		randomWord = words[randomIndex];
		

	}

	public String replaceByAsteriks() {
		wordWithAsteriks = randomWord;
		for (int i = 0; i < randomWord.length(); i++) {
			wordWithAsteriks = wordWithAsteriks.replace(
					wordWithAsteriks.charAt(i), '*');

		}

		return wordWithAsteriks;
	}

	public boolean isletterInWord(char letterGuess) {
		// check if the letter is already found
		if (wordWithAsteriks.indexOf(letterGuess) != -1) {
			System.out.println(letterGuess + " is already in word");
			numberOfMissed++;
			return false;// the letter is already found
		}
		int index = randomWord.indexOf(letterGuess);
		if (index == -1) {
			numberOfMissed++;
			return false;// the letter is not in word

		}
		for (int i = 0; i < randomWord.length(); i++) {
			index = randomWord.indexOf(letterGuess, i);
			if (index != -1) {
				char[] arrayOfAsteriks = wordWithAsteriks.toCharArray();
				arrayOfAsteriks[index] = letterGuess;
				wordWithAsteriks = String.valueOf(arrayOfAsteriks);
			}
		}

		
		return true;
	}

	public void printStatusAndPrompt() {
		System.out.print("(Guess) Enter a letter in word " + wordWithAsteriks
				+ " > ");

	}

	public boolean continueGame() {
		if (wordWithAsteriks.indexOf('*') != -1) {
			return true;
		}
		return false;

	}

	public void endOfGameDetails() {
		System.out.println("The word is " + randomWord + " . You missed "
				+ numberOfMissed + " time");
	}
}
