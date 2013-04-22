package assignments.chap11;
import java.util.Date;
public class Employee extends Person {
	private String office;
	private double salary;
	private Date dateHired;
//	public Employee(String name, String address, long phoneNumber, String emailAddress, String office, double salar){
//		super(name, address, phoneNumber, emailAddress);
//		this.dateHired = new java.util.Date();
//		this.office = office;
//		this.salary = salary;
//	}
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
