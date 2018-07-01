package Programmers;

public class NoDuplicate {

	public static void main(String[] args) {
		int[] arr = { 4, 4, 4, 4, 3, 3 };
		int[] arr2 = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (i + 1 < arr.length) {
				if (arr[i] != arr[i + 1]) {
					arr2[i] = arr[i];
				} else {
					
					continue;
				}
			} else {
				if (i == arr.length) {
					arr2[i] = arr[i];
				}
				break;
			}

		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
}
