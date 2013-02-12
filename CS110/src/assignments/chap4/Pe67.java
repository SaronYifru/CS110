package assignments.chap4;

public class Pe67 {
	
	public static void main(String[] args) {
		int[] counts = new int[10];
		int numberOfRandomIntegers = 100;
		for (int i = 0; i < numberOfRandomIntegers; i++) {
			int integer = (int)(Math.random() * 10);
			counts[integer] = counts[integer] + 1;
			
		}
		for  (int i = 0; i < counts.length; i++) {
			System.out.println("Count for " + i + " is " + counts[i]);
		}
		

	}

}
