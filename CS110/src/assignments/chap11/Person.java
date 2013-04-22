package assignments.chap11;

public class Person {
	private String name;
	private String address;
	private long phoneNumber;
	private String emailAddress;

	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String toString() {
		return getClass().getSimpleName() + ": " + name;
	}

}
