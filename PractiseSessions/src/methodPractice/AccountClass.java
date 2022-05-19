package methodPractice;

public class AccountClass {

	private String accountOwner = "Thomas";	
	private int balance = 1000;
	private int accountNumber = 586586586;
	private int pin = 1989;
	
	
	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	String provideInfo() {
		return accountOwner;
	}
	
	int returnAccount() {
		return balance;
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
}
