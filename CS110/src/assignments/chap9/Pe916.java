package assignments.chap9;

public class Pe916 {

	public static void main(String[] args) {
		char[] chars = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
		char[] chars2 = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
		MyString1 myString1 = new MyString1(chars);
		MyString1 myString2 = new MyString1(chars2);
		MyString1 lower = myString1.toLowerCase();
		MyString1 sub = MyString1.valueOf(9);
		for (int i = 0; i < sub.length();i++) {
			System.out.print(sub.charAt(i));
		}
		

	}

}
