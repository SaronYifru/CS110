package assignments.chap5;

import java.util.Scanner;

public class Pe525 {

	public static void main(String[] args) {
		System.out.println("Enter milliseconds: ");
		Scanner scanner = new Scanner(System.in);
		long milliseconds = scanner.nextLong();
		final int MINUTESINANHOUR = 60;
		final int SECONDSINAMINUTE = 60;
		final int MILLISECONDSINASECOND = 1000;
		String output = convertMillis(milliseconds, MINUTESINANHOUR,
				SECONDSINAMINUTE, MILLISECONDSINASECOND);
		System.out.println(milliseconds
						+ " milliseconds in hours, minutes and seconds respectively is "
						+ output);

	}

	public static String convertMillis(long milliseconds, int MINUTESINANHOUR,
			int SECONDSINAMINUTE, int MILLISECONDSINASECOND) {
		int hours, minutes, seconds;
		seconds = (int) (milliseconds / MILLISECONDSINASECOND);
		minutes = seconds / SECONDSINAMINUTE;
		seconds = seconds % SECONDSINAMINUTE;
		hours = minutes / MINUTESINANHOUR;
		minutes = minutes % MINUTESINANHOUR;
		String output = hours + ":" + minutes + ":" + seconds;
		return output;
	}

}
