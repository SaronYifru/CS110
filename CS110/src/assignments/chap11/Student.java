package assignments.chap11;

public class Student extends Person {
	private GradeLevel gradeLevel;
	public enum GradeLevel {
		SOPHOMORE, FRESHMAN, JUNIOR, SENIOR;
	}
public void setStatus(GradeLevel gradeLevel) {
		this.gradeLevel = gradeLevel;
	}
	
	
	
	

}
