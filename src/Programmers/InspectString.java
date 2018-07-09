package Programmers;

public class InspectString {

	public static void main(String[] args) {
		boolean answer = true;
		String s = "a234";

		if (s.length() == 4 || s.length() == 6) {
			if (isNumber(s)) {
				answer = true;
			} else {
				answer = false;
			}
		} else {
			answer = false;
		}
		System.out.println(answer);
	}

	private static boolean isNumber(String s) {
		return false;
	}

}
