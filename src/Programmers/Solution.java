package Programmers;

public class Solution {
	public int solution(int n) {
		// Integer to String	
		String str = Integer.toString(n);
		
		// String to Char
		char [] charArray = str.toCharArray();
		
		// Char Array to String Array
		String[] strArray = new String[charArray.length];
		for (int i = 0; i < charArray.length; i++) {
			strArray[i] = String.valueOf(charArray[i]);
		}
		
		// String Array to Integer Array
		int[] intArray = new int[strArray.length];
		for (int i = 0; i < strArray.length; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);
		}
		
		int answer = 0;
		// Get Result
		for(int i = 0; i < intArray.length; i++) {
			answer += intArray[i];
		}
		
		return answer;
	}
}
