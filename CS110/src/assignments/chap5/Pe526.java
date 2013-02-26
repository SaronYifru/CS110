package assignments.chap5;

public class Pe526 {

	public static void main(String[] args) {
		final int NUMBEROFPPRIMES = 100;
		final int NUMBERSPERLINE = 10;
		int count = 1;
		int number = 2;
		while (count <= NUMBEROFPPRIMES) {
			if (testIfPrime(number) && testIfPalindromic(number)) {
				System.out.print(number + " ");
				if (count % NUMBERSPERLINE == 0) {
					System.out.println();
				}
				count++;
			}
			number++;
		}

	}

	public static boolean testIfPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean testIfPalindromic(int number) {
		String stringNumber = String.valueOf(number);
		for (int iFromLeft = 0, iFromRight = stringNumber.length() - 1; iFromLeft <= iFromRight; iFromRight--, iFromLeft++) {
			if (stringNumber.charAt(iFromLeft) != stringNumber
					.charAt(iFromRight)) {
				return false;
			}
		}
		return true;
	}

}
