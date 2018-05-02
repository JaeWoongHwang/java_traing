package Programmers;

public class MiddleValue {
	String getMiddle(String word) {
		// Define Variable
		int i = 0;
		String result = "";

		// Parse String to Char
		char[] charArray = word.toCharArray();

		// Char Array to String Array
		String[] strArray = new String[charArray.length];
		for (int y = 0; y < charArray.length; y++) {
			strArray[y] = String.valueOf(charArray[y]);
		}

		// Inspect Value Character
		if (strArray.length % 2 == 0) {
			i = strArray.length / 2;
			result = strArray[i - 1] + strArray[i];
		} else {
			i = strArray.length / 2;
			result = strArray[i];
		}

		return result;
	}

	public static void main(String[] args) {
		MiddleValue mv = new MiddleValue();
		System.out.println(mv.getMiddle("test"));

	}

}
