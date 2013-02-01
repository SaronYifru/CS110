package assignments.chap3;

import java.util.Scanner;

public class pe321 {

	public static void main(String[] args) {
		int dayOfTheWeek;
		int dayOfTheMonth;
		int century;
		int yearOfTheCentury;
		int year;
		int month;
		final int listOfMonths[] = {0, 13, 14, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		final String listOfDaysInAWeek [] = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", 
									"Thursday", "Friday"};
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter year: ");
		year = scanner.nextInt();
		System.out.print("Enter month: ");
		month = scanner.nextInt();
		System.out.print("Enter the day of the month: ");
		dayOfTheMonth = scanner.nextInt();
		century = year/100;
		yearOfTheCentury = year % 100;
		month = listOfMonths[month];
		
		dayOfTheWeek = (dayOfTheMonth + (26 * (month + 1)/10) + yearOfTheCentury
						+ yearOfTheCentury/4 + century/4 + 5 * century) % 7;
		System.out.println("The day of the week is " + listOfDaysInAWeek[dayOfTheWeek]);
		System.out.println(dayOfTheWeek);
	}
}
