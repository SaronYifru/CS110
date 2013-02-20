package assignments.chap4;

public class Pe419 {


	public static void main(String[] args) {
		final int LARGESTPOWER = 7;
		String maxstringColumn = String.valueOf((int)Math.pow(2, LARGESTPOWER));
		int FIELDSIZE = maxstringColumn.length()  + 1;
		for (int row = 0; row <= LARGESTPOWER; row++) {
			for (int space = LARGESTPOWER - row ; space > 0 ; space--) {  
				System.out.printf("%" + FIELDSIZE + "s", " ");  
			 }  
			for (int j = 0; j <= row; j++) {
				int column = (int)Math.pow(2, j);
				System.out.format("%" + FIELDSIZE + "d", column);
			}
			for (int j = row - 1; j >= 0; j--) {
				
				int column = (int)Math.pow(2, j);
				System.out.format("%" + FIELDSIZE + "d", column);
				
				
			}
			System.out.println();
			
			
			
		}
	}
	}


