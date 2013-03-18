package assignments.chap7;

import java.util.Scanner;

public class Pe74 {

	public static void main(String[] args) {
		int[][] dayHours = { { 2, 4, 3, 4, 5, 8, 8 }, { 7, 3, 4, 3, 3, 4, 4 },
				{ 3, 3, 4, 3, 3, 2, 2 }, { 9, 3, 4, 7, 3, 4, 1 },
				{ 3, 5, 4, 3, 6, 3, 8 }, { 3, 4, 4, 6, 3, 4, 4 },
				{ 3, 7, 4, 8, 3, 8, 4 }, {6, 3, 5, 9, 2, 7, 9}};
		double[] weeklyHours = sumOfHours(dayHours);
        int[] index = sortWeeklyHoursIndex(weeklyHours);
        System.out.println(index[7]);
        System.out.println(weeklyHours[7]);
		format(dayHours, index);

	}

	public static double[] sumOfHours(int dayHours[][]) {
		double[] weeklyHours = new double[8];
		

		for (int i = 0; i < dayHours.length; i++) {
			int sum = 0;
			for (int j = 0; j < dayHours[i].length; j++) {
				sum = sum + dayHours[i][j];
			}
			weeklyHours[i] = sum;
			

		}

		
		return weeklyHours;

	}
	public static double[] sortWeeklyHours(double[] weeklyHours) {
		java.util.Arrays.sort(weeklyHours);
		return weeklyHours;
	}
	public static int[] sortWeeklyHoursIndex(double[] weeklyHours) {
		double[] sortedWeeklyHours = sortWeeklyHours(weeklyHours);
		int[] indexList = new int[8];
		for (int i = 0; i < indexList.length; i++) {
			indexList[i] = java.util.Arrays.binarySearch(sortedWeeklyHours, weeklyHours[i]);
			System.out.println(indexList[i]);
		}
			
			
		
		return indexList;
	}

	public static void format(int dayHours[][], int index[]) {
		System.out.printf("%12s", " ");
		System.out.println("Su M  T  W  Th F Sa");
		
		for (int i = 0; i < dayHours.length; i++) {
			System.out.print("Employee " + index[i]);
			for (int j = 0; j < dayHours[i].length; j++) {
				System.out.printf("%3d", dayHours[index[i]][j]);

			}
			System.out.println();
		}
	}

}
