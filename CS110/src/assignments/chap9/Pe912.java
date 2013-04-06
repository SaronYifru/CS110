package assignments.chap9;

import java.util.Arrays;
import java.util.Scanner;

public class Pe912 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two strings: ");
		String s1 = scanner.next();
		String s2 = scanner.next();
		if (isAnagram(s1, s2)) {
			System.out.println("The two strings are anagrams.");

		} else {
			System.out.println("The two strings are not anagrams.");
		}

	}

	public static boolean isAnagram(String s1, String s2) {
		// first change each string in to an array of characters and then sort
		// the characters
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		// convert the array of characters back to strings and check whether the
		// two sorted strings are equal
		s1 = String.valueOf(c1);
		s2 = String.valueOf(c2);
		if (s1.equals(s2)) {
			return true;
		}
		return false;
	}

}
