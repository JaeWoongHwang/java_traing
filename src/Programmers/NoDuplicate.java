package Programmers;

import java.util.*;

public class NoDuplicate {

	public static void main(String[] args) {
		int[] arr = { 4, 4, 4, 3, 3 };
		List<Integer> result = new ArrayList<>();
		
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				result.add(arr[i]);
				continue;
			} else {
				if (i + 1 == arr.length - 1) {
					result.add(arr[i]);
				}
				continue;
			}
		}
		int[] answer = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			answer[i] = result.get(i);
		}
	}
}
