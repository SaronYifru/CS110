package assignments.chap4;

import java.util.ArrayList;
import java.util.Scanner;

public class Pe63 {

	public static void main(String[] args) {
		System.out.print("Enter the integers between 1 and 100: ");
		Scanner scanner = new Scanner(System.in);
		int integer = scanner.nextInt();
		ArrayList integers = new ArrayList();
		while (integer != 0) {
			integers.add(integer);
			integer = scanner.nextInt();
			
		}
		
		for (int i = 0; i < integers.size(); i++) {
			int count = 1;
			for (int j = i + 1; j < integers.size(); j++) {
			/*add 1 to count if the integer is repeated and remove the repetition
			so that its not counted again*/
			if (integers.get(i) == integers.get(j)) {
					    count = count + 1;
					    integers.remove(j);
			    }
			}
			
			if (count > 1) {
				System.out.println(integers.get(i) + " occurs " + count + " times");
			}
			else {
				System.out.println(integers.get(i) + " occurs " + count + " time");
			}
			
			
		}

	}

}
