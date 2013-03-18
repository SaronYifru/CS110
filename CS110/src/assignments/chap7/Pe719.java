package assignments.chap7;

import java.util.Scanner;

public class Pe719 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter the number of rows: ");
	    int numberOfRows = input.nextInt();
	    System.out.print("Enter the number of columns: ");
	    int numberOfColumns = input.nextInt();
	 
	    int[][] values = new int[numberOfRows][numberOfColumns];
	 
	    System.out.println("Enter the array values: ");
	    for (int i = 0; i < numberOfRows; i++) {
	        for (int j = 0; j < numberOfColumns; j++) {
	        	values[i][j] = input.nextInt();
	        }	
	    }
	 System.out.println(isConsecutiveFour(values, numberOfRows, numberOfColumns));
	 }
	 
	public static boolean isConsecutiveFour(int[][] values, int numberOfRows, int numberOfColumns) {
		for (int i = 0; i < numberOfRows; i++) {
			if (isConsecutiveFour(values[i])) {
				return true;
			}
		}
	 
		for (int j = 0; j < numberOfColumns; j++) {
			int[] column = new int[numberOfRows];
	 
			for (int i = 0; i < numberOfRows; i++) {
				column[i] = values[i][j];
			}
			if (isConsecutiveFour(column)) {
				return true;
			}
		}
	 
		for (int i = 0; i < numberOfRows - 3; i++) {
			int numberOfElementsInDiagonal = Math.min(numberOfRows - i, numberOfColumns);
			int[] diagonal = new int[numberOfElementsInDiagonal];
			for (int k = 0; k < numberOfElementsInDiagonal; k++) {
				diagonal[k] = values[(k + i)][k];
			}
			if (isConsecutiveFour(diagonal)) {
				return true;
			}
		}
	 
		for (int j = 0; j < numberOfColumns; j++) {
			int numberOfValuesInDiagonal = numberOfRows; 
			int[] diagonal = new int[numberOfValuesInDiagonal];
			for (int k = 0; k < numberOfValuesInDiagonal; k++) {
				diagonal[k] = values[k][j];
			}
			if (isConsecutiveFour(diagonal)) {
				return true;
			}
		}
	 
		for (int j = 0; j < numberOfColumns; j++) {
			int numberOfElementsInDiagonal = numberOfRows;
			int[] diagonal = new int[numberOfElementsInDiagonal];
	 
			for (int k = 0; k < numberOfElementsInDiagonal; k++) {
				diagonal[k] = values[k][j];
			}
			if (isConsecutiveFour(diagonal)) {
				return true;
			}
		}
	 
	/*for (int i = 1; i < numberOfRows - 3; i++) {
	 int numberOfElementsInDiagonal =
	 Math.min(numberOfRows - i, numberOfColumns);
	 int[] diagonal = new int[numberOfElementsInDiagonal];
	 
	for (int k = 0; k < numberOfElementsInDiagonal; k++) {
	 diagonal[k] = values[(k + i)][(numberOfColumns - k - 1)];
	 }
	 if (isConsecutiveFour(diagonal)) {
	 return true;
	 }
	 }*/
		return false;
	 }
	 
	public static boolean isConsecutiveFour(int[] values) {
		int counter = 0;
		for (int i = 1; i < values.length - 1; i++) {
			
			if (values[i] != values[i-1]){
				counter = 0;	
				continue;
			}
			else {
				counter = counter + 1;
			}	
		}
		if (counter == 4) {
			return true;
		}	
        
		return false;
	 }


}
