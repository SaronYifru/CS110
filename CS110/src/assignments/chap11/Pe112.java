package assignments.chap11;

public class Pe112 {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setName("Saron");
		Person student1 = new Student();
		student1.setName("George");
		Person employee1 = new Employee();
		employee1.setName("Carla");
		Person faculty1 = new Faculty();
		faculty1.setName("Ben");
		Person staff1 = new Staff();
		staff1.setName("Yifru");
		System.out.println(person1.toString());
		System.out.println(student1.toString());
		System.out.println(employee1.toString());
		System.out.println(faculty1.toString());
		System.out.println(staff1.toString());
    
	}

}
