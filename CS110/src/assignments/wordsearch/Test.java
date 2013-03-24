package assignments.wordsearch;

 import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	char [][] puzzle = {{'a', 'b', 'c', 'd'}, {'w', 'g', 'a', 'e'}, {'e', 'a', 't', 'l'}, {'b', 'r', 'a', 't'}, {'z', 'e', 'p', 'a'}};
        String[] clue = {"web", "rat", "delta", "eat", "cat", "era"};
    	String name = "Saron";
        WordSearch puzzle1 = new WordSearch("maze.dat", puzzle, name, clue);
        puzzle1.printWelcomeMessage();
    	puzzle1.printPuzzle();
        puzzle1.printClue();
        System.out.print("Enter the word you want to search for: ");
        scanner = new Scanner(System.in);
        String wordToFind = scanner.next();
        puzzle1.printWordVector();
        
   
        
        
    
    }
    
}


