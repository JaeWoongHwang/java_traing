package Programmers;

public class CountAlphabet {

	public static void main(String[] args) {
		String test = "pPooyY";
		boolean answer = true;
		int pCnt = 0;
		int yCnt = 0;

		char[] charArray = test.toCharArray();

		String[] strArray = new String[charArray.length];
		for (int i = 0; i < charArray.length; i++) {
			strArray[i] = String.valueOf(charArray[i]);
		}

		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i] == "p") {
				pCnt += 1;
			} else if (strArray[i] == "y") {
				yCnt += 1;
			}
		}
		System.out.println(answer);
	}

}
