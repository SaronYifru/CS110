package assignments.chap4;

import java.util.Scanner;

public class Pe438 {

	public static void main(String[] args) {
		System.out.print("Enter a decimal integer: ");
		Scanner scanner = new Scanner(System.in);
		int decimalNumber = scanner.nextInt();
		final String[] hexadecimalValues = {"0", "1", "2", "3", "4", "5", "6", "7", 
											"8", "9", "A", "B", "C", "D", "E", "F"};
		int remainder;
	    String hexadecimalValue  = "";
		while(decimalNumber != 0) {
			
			remainder = decimalNumber % 16;
			
			decimalNumber = decimalNumber/16;
			
			hexadecimalValue = hexadecimalValue  + hexadecimalValues[remainder];
			 
			}
		// reverse the order of the concatenated string (hexadecimalValue)
		for (int i = hexadecimalValue.length() - 1; i >= 0; i--) {
			System.out.print(hexadecimalValue.charAt(i));
		}
		
			
			
			
			
			
			
			
			
			
			
		

	}

}
