package assignments.chap8;



public class Pe814 {

	public static void main(String[] args) {
		StopWatch stopWatch1 = new StopWatch();
		final int LENGTH_OF_LIST = 100000;
		int[] list = new int[LENGTH_OF_LIST];
		stopWatch1.start();
		for (int i = 0; i < LENGTH_OF_LIST; i++) {
			list[i] = (int) (Math.random() * list.length);
		}
		for (int i = 0; i < LENGTH_OF_LIST; i++) {
			int currentMin = list[i];
			int currentMinIndex = i;
			for (int j = i + 1; j < LENGTH_OF_LIST; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;

				}
			}
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
		stopWatch1.stop();
		System.out
				.println("The execution time of sorting 10000 numbers using selection sort is "
						+ stopWatch1.getElapsedTime());

	}

}
