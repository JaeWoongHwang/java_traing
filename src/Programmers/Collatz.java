package Programmers;

public class Collatz {
	public int collatz(int num) {
		int count = 0;
		while (num != 1) {
			if (num % 2 == 0) {
				num = num / 2;
				count++;
			} else if (num % 2 == 1) {
				num = num * 3 + 1;
				count++;
			}

			if (count == 500) {
				return -1;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		Collatz c = new Collatz();
		int ex = 6;
		System.out.println(c.collatz(ex));
	}

}