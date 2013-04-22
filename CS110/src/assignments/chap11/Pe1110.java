package assignments.chap11;

import java.util.Scanner;

public class Pe1110 {

	public static void main(String[] args) {
		 int numberOfStrings = 5;
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter the " + numberOfStrings + " strings: ");
		 MyStack myStack1 = new MyStack();
		 for (int i = 0; i < numberOfStrings; i++) {
			 myStack1.push(scanner.next());
		 }
		 System.out.print("The " + numberOfStrings + " strings in reverse order: ");
		 while (!myStack1.isEmpty()) {
			 System.out.print(myStack1.pop() + " ");
		 }

	}

}
