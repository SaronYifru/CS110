package assignments.chap4;

public class Pe418 {

	public static void main(String[] args) {
		// PATTERN A
		System.out.println("Pattern A");
		for ( int row = 1; row <= 6; row++) {
			
			for (int column = 1; column <= row; column++) {
				System.out.print(" " + column);
			}
			System.out.println();
		}
		
		// PATTERN B
		System.out.println("Pattern B");
		for (int row = 6; row >= 1; row--) {
			for (int column = 1; column <= row; column++) {
				System.out.print(" " + column);
			}
			System.out.println();
		}
		
		// PATTERN C
		System.out.println("Pattern C");
		for (int row = 1; row <= 6; row++) {
			for (int space = 6 - row; space >= 1; space--) {
				System.out.print("  ");
			}
			for (int column = row; column >= 1; column--) {
				System.out.print(" " + column);
			}
			System.out.println();
		}
		
		// PATTERN D
		System.out.println("Pattern D");
		for (int row = 6; row >= 1; row--) {
			for (int space = 1; space <= 6 - row; space++) {
				System.out.print("  ");
			
		}
		    for (int column = 1; column <= row; column++) {
				System.out.print(" " + column);
				
			}
			
			System.out.println();
			
		}
	
	
    	 
         }	 
    		 
     }
    	 
        	
	

	
		
	

	
		
	


