package assignments.chap4;

import java.util.Scanner;

public class Pe417 {

	public static void main(String[] args) {
		System.out.println("Enter the number of lines: ");
		Scanner scanner = new Scanner(System.in);
		int numberOfLines = scanner.nextInt();
		for (int row = 1 ; row <= numberOfLines ; row++){  

			for (int space = numberOfLines - row ; space > 0 ; space--) {  

				 System.out.print("   ");  
			 }  

			 for (int column = row ; column > 1; column --) {  

				 System.out.print(column);  

				 System.out.print("  ");  

			 }  

			 for (int column = 1; column <= row; column++) {  

				 System.out.print(column);  

				 System.out.print("  ");  

			 }                

			 System.out.println();  

			 }  
			

}
}

