package assignments.chap10;

public class Pe109 {

	public static void main(String[] args) {
		Course CS = new Course("Computer Science");
		CS.addStudent("Saron");
		CS.addStudent("Evelin");
		CS.addStudent("Carla");
		CS.dropStudent("Evelin");
		System.out.println(CS.getStudents());

	}

}
