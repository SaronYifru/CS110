package assignments.chap11;

public class Student extends Person {
	private gradeLevel gradeLevel;
	public enum gradeLevel {
		SOPHOMORE, FRESHMAN, JUNIOR, SENIOR;
	}
public void setStatus(gradeLevel gradeLevel) {
		this.gradeLevel = gradeLevel;
	}
	
	
	
	

}
