package assignments.chap9;

public class MyString1 {
	private final char[] chars;
	private int size;

	public MyString1(char[] chars) {
		this.chars = chars;
		size = chars.length;
	}

	public char charAt(int index) {
		return chars[index];
	}

	public int length() {
		return size;

	}

	public MyString1 subString(int begin, int end) {
		char[] newChars = new char[size - begin];
		for (int i = begin, j = 0; i < end && j < size - begin; i++, j++) {
			newChars[j] = chars[i];
		}

		return new MyString1(newChars);
	}

	public MyString1 toLowerCase() {
		char[] lowerCaseChars = new char[size];
		for (int i = 0; i < size; i++) {
			lowerCaseChars[i] = Character.toLowerCase(chars[i]);
		}
		return new MyString1(lowerCaseChars);
	}

	public boolean equals(MyString1 s) {
		if (s.length() != chars.length) {
			return false;
		}
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != chars[i]) {
				return false;
			}

		}
		return true;

	}

	public static MyString1 valueOf(int i) {
		char[] charValueOfI = { Character.forDigit(i, 10) };
		return new MyString1(charValueOfI);
	}

}
