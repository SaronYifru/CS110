package assignments.chap4;

public class Pe419 {


	public static void main(String[] args) {
		for (int row = 0; row <= 7; row++) {
			for (int space = 7 - row ; space > 0 ; space--) {  
				System.out.print("     ");  
			 }  
			for (int j = 0; j <= row; j++) {
				int column = (int)Math.pow(2, j);
				if (column >= 100) {
					System.out.print("  " + column);
				}
				else if (column >= 10) {
					System.out.print("   " + column);
				}
				
				else {
					System.out.print("    " + column);
				}
			}
			for (int j = row - 1; j >= 0; j--) {
				
				int column = (int)Math.pow(2, j);
				if (column >= 100) {
					System.out.print("  " + column);
				}
				else if (column >= 10) {
					System.out.print("   " + column);
				}
				
				else {
					System.out.print("    " + column);
				}
				
			}
			System.out.println();
			
			
			
		}
	}
	}


