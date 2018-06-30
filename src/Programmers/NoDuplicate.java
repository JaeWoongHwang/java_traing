package Programmers;

public class NoDuplicate {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
		int[] arr2 = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			while (i != arr.length) {
				if (arr[i] == arr[i + 1]) {
					arr2[i] = arr[i];
				} else {
					break;
				}
			}

		}

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

	}

}
