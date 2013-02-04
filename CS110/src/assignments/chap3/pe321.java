package assignments.chap3;

import java.util.Scanner;

public class pe321 {
	public static void main(String[] args) {
		int dayOfTheMonth;
		int year;
		int month;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter year: ");
		year = scanner.nextInt();
		System.out.print("Enter month: ");
		month = scanner.nextInt();
		System.out.print("Enter the day of the month: ");
		dayOfTheMonth = scanner.nextInt();
		System.out.println(dayOfTheWeek(dayOfTheMonth, month, year));
		
	}
	public static String dayOfTheWeek(int dayOfTheMonth, int month, int year) {
		int dayOfTheWeek;
		int century;
		int yearOfTheCentury;
		final String DAYSINAWEEK [] = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", 
                                             "Thursday", "Friday"};
		// change the user input according to the convention
		switch (month) {
		case 1:
			month = 13;
			year = year - 1;
			break;
		case 2:
			month = 14;
			year = year - 1;
		}
		yearOfTheCentury = year % 100;
		century = year/100;
		dayOfTheWeek = (dayOfTheMonth + (26 * (month + 1)/10) + yearOfTheCentury
						+ yearOfTheCentury/4 + century/4 + 5 * century) % 7;
		return ("The day of the week is " + DAYSINAWEEK[dayOfTheWeek]);
		
	}
}
