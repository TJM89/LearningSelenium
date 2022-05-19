package methodPractice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ATMMachine at = new ATMMachine();
		AccountClass ac = new AccountClass();
		ac.getAccountNumber();
		ac.getAccountOwner();
		ac.getBalance();
		ac.getPin();
		at.getPin();

		int accountNumber;
		int pin = 0;
		int atmBalance = 100;
		int option;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter option number : ");
		option = sc.nextInt();

		switch (option) {

		case 1: {
			System.out.println("Enter account number : ");
			accountNumber = sc.nextInt();
			System.out.println("Enter pin :");
			pin = sc.nextInt();
			if (accountNumber == ac.getAccountNumber() && pin == ac.getPin()) {
				System.out.println("Enter amount to deposit : ");
				int depositAmount = sc.nextInt();
				System.out.println("Amount of " + depositAmount + " has been added to account");
				System.out.println("New balance is " + (ac.getBalance() + depositAmount));
			}

			else {
				System.out.println("Invalid account number");
			}
		}
		break;

		case 2: {

			System.out.println("Enter pin number for ATM :");
			pin = sc.nextInt();
			if (pin == at.pin) {
				System.out.println("Enter amount for deposit : ");
				atmBalance = sc.nextInt();
				System.out.println("Deposited amount of " + atmBalance + " dollars");
				System.out.println("Total balance is " + (atmBalance + at.minremainingBalance) + "dollars");
			}

		}
		break;
		}
	}
}
