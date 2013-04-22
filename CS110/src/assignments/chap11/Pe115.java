package assignments.chap11;

import assignments.chap10.Course;

public class Pe115 {

	public static void main(String[] args) {
		Course cS = new Course("Computer Science");
		cS.addStudent("Saron");
		cS.addStudent("Evelin");
		cS.addStudent("Carla");
		cS.dropStudent("Evelin");
		System.out.println(cS.getStudents());

	}

}
