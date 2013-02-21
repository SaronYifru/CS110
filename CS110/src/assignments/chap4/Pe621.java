package assignments.chap4;

import java.util.Scanner;

public class Pe621 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of balls: ");
		int numberOfballs = scanner.nextInt();
		System.out.print("Enter the number of slots: ");
		int numberOfSlots = scanner.nextInt();
		int[] slots = new int[numberOfSlots];
		char[] path = new char[numberOfSlots];
		 /* decide and keep track of the path way taken by each ball. Also count the number of
		 'Right' decisions for each ball, which ultimately decides which slot it goes in*/
		for (int i = 0; i < numberOfballs; i++) {
			 int numberOfRightPaths = 0;
			 for (int j = 0; j < numberOfSlots; j++) {
				if (Math.random() < 0.5) {
					path[j] = 'L';
				}
				else {
					path[j] = 'R';
					numberOfRightPaths++;
				}
				
		 	}
			System.out.print(path);
			System.out.println();
			slots[numberOfRightPaths]++;
		}
		histogram(slots, numberOfSlots);
		 
	}
	// define the maximum height of the histogram	 
	public static int max(int[] slots, int numberOfSlots){
		 int max = slots[0];
		 for (int i = 1; i < numberOfSlots; i++) {
			 if (max < slots[i]) {
				 max = slots[i];
			 }
		 }
		 return max;
	}
	// use the maximum height to decide where to put the ball	 
	public static void histogram(int[] slots, int numberOfSlots){
		 int maximumHeight = max(slots, numberOfSlots);
		 for (int i = maximumHeight; i > 0; i--) {
			for (int j = 0; j < numberOfSlots; j++) {
				if (slots[j] < i) {
					System.out.print(" ");
			    }
				else if (slots[j] >= i) {
				  System.out.print("O");
			    }
				
		    }
			System.out.println();
		}
		 
		 
	}
}
		 
		 




