package assignments.chap4;


import java.util.Scanner;

public class pe65 {

	public static void main(String[] args) {
		System.out.print("Enter ten numbers: ");
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[10];
		int distinctNumberCounter = 0;
		for (int i = 0; i < numbers.length; i++) {
			int number = scanner.nextInt();
			int arrayIndex = 0;
			for (arrayIndex = 0; arrayIndex < distinctNumberCounter; arrayIndex++) {
				if (numbers[arrayIndex] == number) {
					break;
				}
			}
			if (arrayIndex == distinctNumberCounter) {
				numbers[distinctNumberCounter] = number;
				distinctNumberCounter = distinctNumberCounter + 1;
			}
		}
		for (int arrayIndex = 0; arrayIndex < distinctNumberCounter; arrayIndex++) {
	    	System.out.print(numbers[arrayIndex] + " ");
	    }
		}
		
	}

	
	
			
			
		

			
			
		
		
		
		
		

	


