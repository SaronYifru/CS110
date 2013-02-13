package assignments.chap4;

public class Pe419 {


	public static void main(String[] args) {
		for (int i = 0; i <= 7; i++) {
			for (int space = 7 - i ; space > 0 ; space--) {  
				System.out.print("     ");  
			 }  
			for (int j = 0; j <= i; j++) {
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
			for (int j = i - 1; j >= 0; j--) {
				
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


