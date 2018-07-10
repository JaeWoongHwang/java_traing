package Programmers;

public class InspectString {

	public static void main(String[] args) {
		boolean answer = true;
		String s = "1234";

		if (s.length() == 4 || s.length() == 6) {
			if (isStringDouble(s)) {
				answer = true;
			} else {
				answer = false;
			}
		} else {
			answer = false;
		}
		System.out.println(answer);
	}

	private static boolean isStringDouble(String s) {
		try {
			Double.parseDouble(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
