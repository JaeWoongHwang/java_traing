package Programmers;

public class MiddleValue {
	String getMiddle(String word) {
		int length = word.length();
		String result = "";

		// Inspect Value
		if (length % 2 == 0) {
			result = word.substring((length / 2) - 1, (length / 2) + 1);
		} else {
			result = word.substring((length / 2), (length / 2) + 1);
		}

		return result;
	}

	public static void main(String[] args) {
		MiddleValue mv = new MiddleValue();
		System.out.println(mv.getMiddle("test"));

	}

}
