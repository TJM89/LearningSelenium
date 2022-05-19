package methodPractice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		AccountClass ac = new AccountClass();
		ac.getAccountNumber();
		ac.getAccountOwner();
		ac.getBalance();
		ac.getPin();
		int accountNumber;
		int pin;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account number : ");
		accountNumber = sc.nextInt();
		System.out.println("Enter pin :");
		pin = sc.nextInt();
		if (accountNumber == ac.getAccountNumber() && pin == ac.getPin()){	
			System.out.println("Enter amount to deposit : ");
			int depositAmount = sc.nextInt();
			System.out.println("Amount of " + depositAmount + " has been added to account");
			System.out.println("New balance is " + (ac.getBalance() + depositAmount));
		} 
		
		else
		{
			System.out.println("Invalid account number");
		}

	}

}
