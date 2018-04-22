package Practice;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;

		Scanner scr = new Scanner(System.in);
		int num = scr.nextInt();

		int balance = 0;

		while (run) {
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택 > ");

		}

		if (num == 1) {
			balance += num;
			System.out.println("혜택 >" + balance);
		} else if (num == 2) {
			balance -= num;
			System.out.println("혜택 >" + balance);
		} else if (num == 3) {
			System.out.println("잔고 >" + balance);
		} else if (num == 4) {
			run = false;
		}
		System.out.println("프로그램 종료");
	}

}
