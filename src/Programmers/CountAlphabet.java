package Programmers;

public class CountAlphabet {

	public static void main(String[] args) {
		// Set variable
		String test = "ppPooyY";
		boolean answer = true;
		int pCounter = 0;
		int yCounter = 0;

		// String to Char
		char[] charArray = test.toCharArray();

		// Count
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'p' || charArray[i] == 'P') {
				pCounter += 1;
				continue;
			}
			if (charArray[i] == 'y' || charArray[i] == 'Y') {
				yCounter += 1;
				continue;
			}
		}

		if (pCounter != yCounter) {
			answer = false;
		}
		System.out.println(answer);
	}

}
