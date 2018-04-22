package Practice;

import java.util.Scanner;

public class BankApplication {
	// Array Definition
	private static Account[] accountArray = new Account[100];
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// Set interface
		boolean run = true;
		while (run) {
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("1. Create Account | 2. Account List | 3. Deposit | 4. Withdraw | 5. Exit");
			System.out.println("---------------------------------------------------------------------------");
			System.out.print("Choice >");

			int selectNo = scan.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("Exit the Program");
	}

	// Method Definition

	private static void createAccount() {
		System.out.println("[Create account]");
		System.out.print("Account number : ");
		String anum = scan.next();
		System.out.print("Account owner : ");
		String owner = scan.next();
		System.out.print("Initial deposit amount : ");
		int balance = scan.nextInt();

		Account account = new Account(anum, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = account;
				System.out.println("Result : Account is created");
				break;
			}
		}
	}

	private static void accountList() {
		System.out.println("[Account List]");
		for (int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i];
			if (accountArray[i] != null) {
				System.out.print(account.getAnum());
				System.out.print("   ");
				System.out.print(account.getOwner());
				System.out.print("   ");
				System.out.print(account.getBalance());
				System.out.println();
			}
		}

	}

	private static void deposit() {
		System.out.println("[Deposit]");
		System.out.print("Account number : ");
		String anum = scan.next();
		System.out.print("Deposit amount : ");
		int newDeposit = scan.nextInt();

		Account account = findAccount(anum);

		if (account == null) {
			System.out.println("Result : Could not found your account");
			return;
		}
		account.setBalance(account.getBalance() + newDeposit);
		System.out.println("Result : Your deposit was successful.");
	}

	private static void withdraw() {
		System.out.println("[Withdraw]");
		System.out.print("Account number : ");
		String anum = scan.next();
		System.out.print("Withdraw amount : ");
		int newWithdraw = scan.nextInt();

		Account account = findAccount(anum);

		if (account == null) {
			System.out.println("Result : Could not found your account");
			return;
		}
		account.setBalance(account.getBalance() - newWithdraw);
		System.out.println("Result : Your withdraw was successful.");
	}

	private static Account findAccount(String anum) {
		Account account = null;
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				String dbanum = accountArray[i].getAnum();
				if (dbanum.equals(anum)) {
					account = accountArray[i];
					break;
				}
			}

		}
		return account;
	}
}