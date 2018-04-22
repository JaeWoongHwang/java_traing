package Programmers;

public class Caesar {
	String caesar(String s, int n) {
		// Set Value
		String result = "";
		String lowerCase[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };
		String upperCase[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z" };
		String[] strArray = new String[lowerCase.length];
		for (int i = 0; i < lowerCase.length; i++) {
			strArray[i] = "0";
		}
		// Character Array to String Array
		char charArray[] = s.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			strArray[i] = String.valueOf(charArray[i]);
		}
		// Compare Alphabet
		for (int i = 0; i < lowerCase.length; i++) {
			for (int j = 0; j < upperCase.length; j++) {
				if (strArray[i].equals(lowerCase[j])) {
					strArray[i] = lowerCase[(j + n) % 26];
				} else if (strArray[i].equals(upperCase[j])) {
					strArray[i] = upperCase[(j + n) % 26];
				}
			}
		}
		// Input value
		for (int i = 0; i <= n; i++) {
			result += strArray[i];
		}
		return result;

	}

	public static void main(String[] args) {
		Caesar c = new Caesar();
		System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B z", 4));
	}
}