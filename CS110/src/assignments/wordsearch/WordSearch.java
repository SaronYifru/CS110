package assignments.wordsearch;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {
	StringBuffer location = new StringBuffer();
	private String[] puzzle;
	private String clues = "";
	private int m;
	private int n;

	private String name;

	Scanner scanner;

	public WordSearch(String filename, String name) {
		this.name = name;
		try {
			scanner = new Scanner(new File(filename));
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		this.n = scanner.nextInt();
		this.m = scanner.nextInt();
		puzzle = new String[n];
		for (int i = 0; i < n; i++) {
			puzzle[i] = scanner.next();
		}
		while (scanner.hasNext()) {
			clues = clues + scanner.next() + "  ";
		}
	}

	public void printClue() {
		System.out.println("The words in this puzzle are: ");
		System.out.println(clues);

	}

	public void printPuzzle() {
		for (int i = 0; i < n; i++) {
			System.out.println(puzzle[i]);
		}
	}

	public String getWordToFind(String wordToFind) {
		return wordToFind;
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

	public void setNameOfPuzzle(String name) {
		this.name = name;
	}

	public void printWelcomeMessage() {
		System.out.println("Welcome to " + name + "'s puzzle!!!");
	}
    


	// return wordVector containing full description of the location of the word
	// to find
	public WordVector lookUpAndFindLocation(String wordToFind) {
		//first check if word is in clue
		if (clues.contains(wordToFind)) {
			// check row and reverse row
			int row = 0;
			int column = 0;
			for (int i = 0; i < n; i++) {
				StringBuffer rowString = new StringBuffer();
				rowString.append(puzzle[i]);
				column = rowString.indexOf(wordToFind);
				row = i;
				if (column != -1) {
					WordVector wd = new WordVector(row, column,
							Direction.EASTERLY, wordToFind.length());
					return wd;
				}	
				row = i;
				column = m - 1 - rowString.reverse().indexOf(wordToFind);
				if (rowString.indexOf(wordToFind) != -1){
					WordVector wd = new WordVector(row, column,
							Direction.WESTERLY, wordToFind.length());
					return wd;
				}
			}

			// check column and reverse column
			for (int i = 0; i < m; i++) {
				StringBuffer columnString = new StringBuffer();

				for (int j = 0; j < n; j++) {
					columnString.append(puzzle[j].charAt(i));
				}

				column = i;
				row = columnString.indexOf(wordToFind);
				if (row != -1) {
					WordVector wd = new WordVector(row, column,
							Direction.SOUTHERLY, wordToFind.length());
					return wd;
				}
                
				column = i;
				row = n - columnString.reverse().indexOf(wordToFind) - 1;
				if (columnString.indexOf(wordToFind) != -1) {
					WordVector wd = new WordVector(row, column, Direction.NORTHERLY, wordToFind.length());
                    return wd;
				}
				
			}
		}
		System.out.println("The word you entered is not in the puzzle. Please try again!");
		return null;
		
	}
	
    
	public char[][] placeAsterics(String wordToFind) {
		char[][] puzzleArray = new char[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				puzzleArray[i][j] = puzzle[i].charAt(j);

			}
		}
		WordVector wd = lookUpAndFindLocation(wordToFind);
		int row = wd.getRow();
		int column = wd.getColumn();
		Direction direction = wd.getDirection();
		int horizontal = direction.getHorizontalStep();
		int vertical = direction.getVerticalStep();
		int length = wd.getLength();
		for (int i = 0; i < length; row += vertical, column += horizontal, i++) {
			puzzleArray[row][column] = '*';
		}
		return puzzleArray;
	}

	public void printView(String wordToFind) {
		char[][] puzzleWithAsterics = placeAsterics(wordToFind);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(puzzleWithAsterics[i][j]);
			}
			System.out.println();
		}
	}
}
