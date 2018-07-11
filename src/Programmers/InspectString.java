package Programmers;

import java.util.regex.Pattern;

public class InspectString {

	public static void main(String[] args) {
		boolean answer = true;
		String str = "1534";

		if (str.length() == 4 || str.length() == 6) {
			if (Pattern.matches("^[0-9]+$", str)) {
				answer = true;
			} else {
				answer = false;
			}

		} else {
			answer = false;
		}
		System.out.println(answer);
	}
}