package assignments.chap4;

import java.util.Scanner;

public class Pe437 {

	public static void main(String[] args) {
		System.out.print("Enter a binary number: ");
		Scanner scanner = new Scanner(System.in);
		String binaryNumber = scanner.next();
		int decimalNumber = 0;
		int positionOfLastValue = binaryNumber.length() - 1;
		for (int i = positionOfLastValue, j = 0; i >= 0 && j<= positionOfLastValue; i--, j++) {
			if (binaryNumber.charAt(i) == '1') {
					decimalNumber = decimalNumber + (int)Math.pow(2, j);
			           
				}
			else if (binaryNumber.charAt(i) != '1' && binaryNumber.charAt(i) != '0'){
					System.out.println("You have entered an invalid binary number");
					System.exit(0);
			}
				
		}
System.out.println("The decimal number representation of the binary number you entered is " + 
		           decimalNumber);
		

	}

}
