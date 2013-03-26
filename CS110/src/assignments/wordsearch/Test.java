package assignments.wordsearch;

 import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
    	Scanner scanner = new Scanner(System.in);
    	String name = "Saron";
        WordSearch puzzle1 = new WordSearch("maze.dat", name);
        puzzle1.printWelcomeMessage();
        puzzle1.printPuzzle();
        puzzle1.printClue();
        System.out.print("Enter the word you want to search for: ");
        scanner = new Scanner(System.in);
        String wordToFind = scanner.next();
        puzzle1.placeAsterics(wordToFind);
        puzzle1.printView(wordToFind);
        System.out.println(puzzle1.lookUpAndFindLocation(wordToFind));
        
        
        
        
        
   
     }
    
}


