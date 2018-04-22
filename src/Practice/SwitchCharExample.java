package Practice;

import java.util.Scanner;

public class SwitchCharExample {

	public static void main(String[] args) {
		
		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("VIP");
			break;
		case 'B':
			System.out.println("Client");
			break;
		default:
			System.out.println("Guest");

		}
	}

}
