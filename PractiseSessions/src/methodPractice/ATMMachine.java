package methodPractice;

public class ATMMachine {

	int pin = 1990;
	int minimumcashDeposit = 100;
	int minremainingBalance = 100;

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getMinimumcashDeposit() {
		return minimumcashDeposit;
	}

	public void setMinimumcashDeposit(int minimumcashDeposit) {
		this.minimumcashDeposit = minimumcashDeposit;
	}

	public int getMinremainingBalance() {
		return minremainingBalance;
	}

	public void setMinremainingBalance(int minremainingBalance) {
		this.minremainingBalance = minremainingBalance;
	}

}