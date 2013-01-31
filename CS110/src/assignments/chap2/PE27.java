package assignments.chap2;

import java.util.Scanner;

public class PE27 {
	
	public static void main(String[] args) {
		
		final int minutesInAnHour = 60;
		final int hoursInADay = 24;
		final int daysInAYear = 365;
		Long minutes;
		Long years;
		Long days;
		Long hours;
		System.out.println("Enter the number of minutes: ");
		Scanner scanner = new Scanner(System.in);
		minutes = scanner.nextLong();
		hours = minutes/minutesInAnHour;
		days = hours/hoursInADay;
		years = days/daysInAYear;
		days = days%daysInAYear;
		
		System.out.println(minutes + " minutes " + "is approximately " + years + " years and " 
							+ days + " days");
		
		
		
		
		
		

	}

}
