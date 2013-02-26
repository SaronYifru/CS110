package assignments.chap5;

import java.util.Scanner;

public class Pe531 {
	public static void main(String[] args) {
		System.out.print("Enter a credit card number: ");
		Scanner scanner = new Scanner(System.in);
		Long cardNumber = scanner.nextLong();
		if (isValid(cardNumber)) {
			System.out.println(cardNumber + " is valid");
		} else {
			System.out.println(cardNumber + " is not valid");
		}

	}

	public static boolean isValid(long number) {
		boolean validity = true;
		if (getSize(number) >= 13 && getSize(number) <= 16) {
			int prefix = (int) getPrefix(number, 1);
			if (prefixMatched(number, prefix)) {
				int total = sumOfOddPlace(number)
						+ sumOfDoubleEvenPlace(number);
				if (total % 10 == 0) {
					validity = true;
				}
			}
		}

		return validity;
	}

	public static int sumOfOddPlace(long number) {
		int sum = 0;
		int oddDigit;
		while (number > 0) {
			oddDigit = (int) (number % 10);
			sum = sum + oddDigit;
			number = (number / 10) / 10;
		}

		return sum;

	}

	public static int sumOfDoubleEvenPlace(long number) {
		int sum = 0;
		int evenDigit;

		while (number > 0) {
			evenDigit = (int) ((number / 10) % 10);
			sum = sum + getDigit(evenDigit * 2);
			number = (number / 10) / 10;

		}
		return sum;

	}

	public static int getDigit(int number) {
		int total = 0;
		if (number > 0 && number < 10) {
			return number;
		} else if (number >= 10) {
			while (number > 0) {
				total = total + number % 10;
				number = number / 10;
			}

		}
		return total;
	}

	public static boolean prefixMatched(long number, int prefix) {
		boolean match = false;
		switch (prefix) {
		case 4:
			match = true;
			break;

		case 5:
			match = true;
			break;
		case 37:
			match = true;
			break;
		case 6:
			match = true;
			break;
		}
		return match;
	}

	public static long getPrefix(long number, final int ONE) {
		if (getSize(number) < ONE) {
			return number;
		}
		while (number > 0) {
			number = number / 10;
			if (getSize(number) <= ONE) {
				break;
			}
		}
		return number;
	}

	public static int getSize(long number) {
		int size = 0;
		while (number < 0) {
			number = number / 10;
			size++;
		}
		return size;

	}
}
