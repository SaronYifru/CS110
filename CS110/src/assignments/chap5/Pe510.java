package assignments.chap5;

public class Pe510 {

	public static void main(String[] args) {
		int numberOfPrimeNumbers = 0;
		for (int number = 2; number < 10000; number++) {
			if (isPrime(number) == true) {
				numberOfPrimeNumbers++;
			}

		}
		System.out.print("The number of Prime numbers less than 10000 is "
				+ numberOfPrimeNumbers);
	}

	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) {
				return false;
			}

		}
		return true;

	}

}
