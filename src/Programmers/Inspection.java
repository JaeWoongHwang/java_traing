package Programmers;

import java.util.Arrays;

public class Inspection {
	public boolean inspection(int[] arr) {
		// Define array and variable
		boolean answer = true;
		int[] arrCopy = new int[arr.length];

		// Copy an instance array
		for (int i = 0; i < arr.length; i++) {
			arrCopy[i] = i + 1;
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
		return answer;
	}
}
