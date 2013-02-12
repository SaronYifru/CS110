package assignments.chap4;

import java.util.Scanner;

public class Pe49 {

	public static void main(String[] args) {
		String studentName;
		int numberOfStudents;
		double score;
		System.out.print("Enter the number of students: ");
		Scanner scanner = new Scanner(System.in);
		numberOfStudents = scanner.nextInt();
		double highestScore = 0;
		double secondHighestScore = 0;
		String studentWithHighestScore = null; 
		String studentWithSecondHighestScore = null;
		for (int i = 1; i <= numberOfStudents; i++) {
			System.out.print("Enter the students name: ");
			studentName = scanner.next();
			System.out.print("Enter the students score: ");
			score = scanner.nextDouble();
			if (score > highestScore) {
				secondHighestScore = highestScore;
				highestScore = score;
				studentWithSecondHighestScore = studentWithHighestScore;
				studentWithHighestScore = studentName;
			}
			else if (score > secondHighestScore) {
				secondHighestScore = score;
				studentWithSecondHighestScore = studentName;
			}
			
		}
		System.out.println("The student with the highest score is " + studentWithHighestScore);
		System.out.println("The student with the second highest score is " + studentWithSecondHighestScore);
		

	}

}
