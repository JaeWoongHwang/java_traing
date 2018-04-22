package Programmers;

public class HarshadNumber {
	public boolean isHarshad(int num) {
		// Integer to String
		String strTemp = Integer.toString(num);

		// String to Character Array
		char[] charArray = strTemp.toCharArray();

		// Character Array to String Array
		String[] strArray = new String[charArray.length];
		for (int i = 0; i < charArray.length; i++) {
			strArray[i] = String.valueOf(charArray[i]);
		}

		// String Array to Integer Array
		int[] intArray = new int[strArray.length];
		for (int i = 0; i < strArray.length; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);
		}

		// Add First digit and Second digit
		int intSum = 0;
		for (int i = 0; i < intArray.length; i++) {
			intSum += intArray[i];
		}
		
		// Check the condition
		if (num % intSum == 0) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		HarshadNumber sn = new HarshadNumber();
		System.out.println(sn.isHarshad(18));

	}

}
