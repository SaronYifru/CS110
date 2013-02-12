package assignments.chap4;

public class Pe415 {

	public static void main(String[] args) {
		int charactersPerLine = 10;
		// initialize character count to 0
		int count = 0;
		// ASCII code for ! and ~ is 33 and 126 respectively. use this in a loop
		for (int i = 33; i <= 126; i++) {
			count = count + 1;
			if (count > charactersPerLine) {
				// restart character count from 1
				count = 1;
				System.out.print("\n" + (char)(i) + " ");
			}
			else {
				System.out.print((char)(i) + " ");
			}
		}

	}

}