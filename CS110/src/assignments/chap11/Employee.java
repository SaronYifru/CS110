package assignments.chap11;

import java.util.Date;

public class Employee extends Person {
	private String office;
	private double salary;
	private Date dateHired;

	public void setOffice(String office) {
		this.office = office;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setDate(Date dateHired) {
		this.dateHired = dateHired;
	}

}
