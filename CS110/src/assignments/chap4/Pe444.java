package assignments.chap4;

public class Pe444 {

	public static void main(String[] args) {
		int numberOfHits = 0;
		final long numberOfThrows = 1000000;
		final int slope = -1;
		for (int i = 0; i < numberOfThrows; i++) {
			double x = (Math.random() * 2) - 1;
			double y = (Math.random() * 2) - 1;
			double condition = x + (-y * slope);
			if ((x > 0 && y > 0 && condition <= 1) || (x < 0)) {
				numberOfHits ++;
			}
			
		}
		double probability = (double)numberOfHits/numberOfThrows;
		System.out.print("The probability of a dart falling in to an odd number region is " + probability);
		
	}

	

}
