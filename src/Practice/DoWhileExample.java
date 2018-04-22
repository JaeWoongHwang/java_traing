package Practice;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		System.out.println("Input your Message");
		System.out.println("If you want to exit, input 'q'");

		Scanner scr = new Scanner(System.in);
		String inputString;

		do {
			System.out.println(">");
			inputString = scr.nextLine();
			System.out.println(inputString);
		} while (!inputString.equals("q"));

		System.out.println();
		System.out.println("Exit the Program");
	}

}
