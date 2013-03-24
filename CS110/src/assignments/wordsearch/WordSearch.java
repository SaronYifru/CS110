package assignments.wordsearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {
	StringBuffer location = new StringBuffer();
	private char[][] puzzle;
	private int m;
	private int n;
	private String[] clue;
	private String name;
	private String wordToFind;
	private int vertical = 0;
	private int horizontal = 0;
	private int xLocation;
	private int yLocation;
	
	public WordSearch(String Filename, char[][] puzzle, String name, String[] clue) {
		this.puzzle = puzzle;
		this.name = name;
		this.clue = clue;
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("maze.dat"));
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
    	this.n = scanner.nextInt();
    	this.m = scanner.nextInt();
		
	}
	public String getWordToFind(String wordToFind) {
		return wordToFind;
	}
	public void setWordToFind(String wordToFind) {
		this.wordToFind = wordToFind;
	}
	public int getN(int n) {
		return n;
	}
	public int getM(int m) {
		return m;
	}
	public void setN(int n) {
		this.n = n;
	}
	public void setM(int m) {
		this.m = m;
	}
	public void setPuzzle(char[][] puzzle) {
        this.puzzle = puzzle;
	}
	public void printPuzzle() {
		for (int i = 0; i < n; i++) {
			for (int j = 0;j < m;j++) {
				System.out.print(puzzle[i][j]);
			}
			System.out.println();
		}
		
	}
	public String[] getClue(String[] clue) {
		return clue;
	}
	public void setClue(String[] clue) {
		this.clue = clue;
	}
	public void printClue() {
		System.out.println("The words in this puzzle are: ");
		for (int i = 0; i < clue.length; i++) {
			System.out.print(clue[i] + "  ");
		}
		System.out.println();
	}
	public void setNameOfPuzzle(String name) {
		this.name = name;
	}
	public void printWelcomeMessage() {
		System.out.println("Welcome to " + name + "'s puzzle!!!");
	}
	
	public boolean appearsInRow(String wordToFind) {
		StringBuffer rowString;
		StringBuffer reverseRowString;
		
		for (int i = 0; i < puzzle.length; i++) {
			rowString = new StringBuffer();
			rowString.append(puzzle[i]);
			reverseRowString = rowString.reverse();
			if (rowString.toString().contains(wordToFind)){
				yLocation = i;
				xLocation = rowString.indexOf(wordToFind);
				horizontal = 1;
				location.append("(" + yLocation + ", " + xLocation + ")");
			
			}
			else if (reverseRowString.toString().contains(wordToFind)) {
				yLocation = puzzle[i].length - 1 - i;
				xLocation = rowString.indexOf(wordToFind);
				horizontal = -1;
				location.append("(" + yLocation + "," + xLocation + ")");
			}
			return true;
			
		}
		return false;
		
	}
	public boolean appearsInColumn(String wordToFind) {
		StringBuffer columnString;
		int xLocation;
		int yLocation;
		
		for (int i = 0; i < puzzle[0].length; i++) {
			columnString = new StringBuffer();
			for (int j = 0; j < puzzle.length; j++) {
				columnString.append(puzzle[j][i]);
			}
			StringBuffer reverseColumnString = columnString.reverse();
			if (columnString.toString().contains(wordToFind)) {
				yLocation = columnString.indexOf(wordToFind);
				xLocation = i;
				vertical = 1;
				
			}
			
			else if (reverseColumnString.toString().contains(wordToFind)) {
				yLocation = columnString.indexOf(wordToFind);
				xLocation = puzzle.length - 1 - i;
				location.append("(" + yLocation +"," + xLocation + ")");
				vertical = -1;
			}
			return true;
			
			


		}
		return false;
	}
public void printWordVector() {
	Direction direction1 = new Direction(vertical, horizontal);
	System.out.println(yLocation);
	WordVector vector1 = new WordVector(yLocation, xLocation, direction1, wordToFind.length());
	
	System.out.println(vector1.tOString());
}



	
	

}
