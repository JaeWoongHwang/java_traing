package Programmers;

public class NoDuplicate {

	public static void main(String[] args) {
		int[] array = { 4, 4, 4, 4, 3, 3 };

		for (int i = 0; i < array.length; i++) {
			if (array[i] != array.length) {
				if (array[i] == array[i + 1]) {
					array.splice(i, 1);
				}
			}
			break;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
