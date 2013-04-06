package assignments.chap9;

import java.util.Random;

public class HangMan {
	private final String[] words = {"java", "program", "write", "awesome", "computer"};
	private char letterGuess;
	private String wordWithAsteriks;
	private String randomWord;
	
    public HangMan() {
    	Random random = new Random();
    	int randomIndex = random.nextInt(words.length);
    	randomWord = words[randomIndex];
    	
    	
    }
    public String replaceByAsteriks(){
    	wordWithAsteriks = randomWord;
    	for (int i = 0; i < randomWord.length(); i++) {
    		wordWithAsteriks = wordWithAsteriks.replace(wordWithAsteriks.charAt(i), '*');
    		
    	}
    	System.out.println(wordWithAsteriks);
    	return wordWithAsteriks;
    }
    public String findAndDisplay(char letterGuess) {
    	if (wordWithAsteriks.indexOf(letterGuess)!= -1) {
    		return null;
    	}
    	int index = randomWord.indexOf(letterGuess);
    	if (index != -1) {
    		return wordWithAsteriks;
    	}
    	
    	wordWithAsteriks = wordWithAsteriks.replace(wordWithAsteriks.charAt(index), letterGuess);
    	return wordWithAsteriks;
    		
    }
    public void printStatusAndPrompt() {
    	if (findAndDisplay(letterGuess) == null) {
    		System.out.println(letterGuess + " is already in the word");
    	}
    	System.out.println("(Guess) Enter a letter in word " + wordWithAsteriks + " > ");
    	
    }
    public void firstPrompt() {
		System.out.println("(Guess) Enter a letter in word " + replaceByAsteriks() + " > ");
	}
    
}
