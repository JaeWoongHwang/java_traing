package Programmers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NextBigNumber {
	public int nextBigNumber(int n) {
		// Set variable
		int answer = 0;
		String standard = "";
		standard = Integer.toBinaryString(n);
		Pattern p = Pattern.compile("1");
		Matcher m = p.matcher(standard);
		int count = 0;

		String biggerNum = "";
		Pattern p2 = Pattern.compile("1");
		Matcher m2 = p.matcher(biggerNum);
		int count2 = 0;

		// Count the number 1
		for (int i = 0; m.find(i); i = m.end()) {
			count++;
		}

		// Search next big number
		for (int i = n + 1; i <= 1000000; i++) {
			biggerNum = Integer.toBinaryString(i);
			for (int j = 0; m2.find(j); j = m2.end()) {
				count2++;
				if (count == count2) {
					answer = Integer.parseInt(biggerNum);
					break;
				}
			}

		}
		return answer;
	}

	public static void main(String[] args) {

		NextBigNumber test = new NextBigNumber();
		int n = 78;
		System.out.println(test.nextBigNumber(n));
	}
}