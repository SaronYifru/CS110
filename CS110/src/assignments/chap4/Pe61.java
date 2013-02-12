package assignments.chap4;


import java.util.Scanner;

public class Pe61 {

	public static void main(String[] args) {
		System.out.print("Enter the number of students: ");
		Scanner scanner = new Scanner(System.in);
		int numberOfStudents = scanner.nextInt();
	    System.out.print("Enter " + numberOfStudents + " scores: ");
	    double[] scores = new double [numberOfStudents];
	    double bestScore = 0;
	    for (int i = 0; i < numberOfStudents; i++) {
	    	double score = scanner.nextDouble();
	    	scores[i] = score;
	    	if (scores[i] > bestScore) {
	    		bestScore = scores[i];
	    	}
	    }
	    char grade;
	    for (int i = 0; i < numberOfStudents; i++) {
    		if (scores[i] >= (bestScore - 10)) {
	    		grade = 'A';
	    	}
	    	else if (scores[i] >= (bestScore - 20)) {
	    		grade = 'B';
	    	}
	    	else if (scores[i] >= (bestScore - 30)) {
	    		grade = 'C';
	    	}
	    	else if (scores[i] >= (bestScore - 40)) {
	    		grade = 'D';
	    	}
	    	else {
	    		grade = 'F';
	    	}
	    	
	    	System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
	    	
	    }
	    	
	}
	
	    
	    
	    

	}


