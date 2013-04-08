package assignments.chap9;

public class Pe916 {

	public static void main(String[] args) {

		char[] chars = { 'A', 'B', 'C', 'D', 'E', 'x', 'G' };
		char[] chars2 = { 'A', 'B', 'C', 'D', 'E', 'F', 'G' };
		MyString1 myString1 = new MyString1(chars);
		MyString1 myString2 = new MyString1(chars2);
		// check whether the two strings are equal
		if (myString1.equals(myString2)) {
			System.out.println("The two MyString1's are equal.");
		} else {
			System.out.println("The two MyString2's are not equal.");
		}
		// convert the contents of myString1 to lowerCase
		System.out.println("LowerCase: " + myString1.toLowerCase());
		// convert an integer in to a "MyString1"
		System.out.println("The String value of the integer is: "
				+ MyString1.valueOf(9));
		// print out a substring
		System.out.println("The subString between the specified indexies is: "
				+ myString1.subString(1, 6));
		// print out the character at a specified index
		System.out.println("The character at the specified position is: "
				+ myString2.charAt(4));
		// print out the length
		System.out.println("The length is: " + myString1.length());

	}

}
