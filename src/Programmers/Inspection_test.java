package Programmers;

import java.util.Arrays;

public class Inspection_test {

	public static void main(String[] args) {
		// Define array and variable
		int[] arr = { 4, 3, 2, 1 };
		boolean answer = true;
		int[] arrCopy = new int[arr.length];

		// Copy an instance array
		for (int i = 0; i < arr.length; i++) {
			arrCopy[i] = i + 1;
			System.out.println("arrCopy" + i + "=" + arrCopy[i]);
		}

		// Sort the parameter array
		Arrays.sort(arr);

		// Compare between standard array and copied array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arrCopy[i]) {
				answer = false;
				break;
			} else {
				answer = true;
				continue;
			}
		}

		System.out.println(answer);
	}
}
