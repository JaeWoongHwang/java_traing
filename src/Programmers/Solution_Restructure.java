package Programmers;

public class Solution_Restructure {
	public int solution_restructure(int n) {
		int sum = 0;
		while (n < 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
}
