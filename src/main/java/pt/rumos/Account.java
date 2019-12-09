package pt.rumos;

import java.util.Random;

public class Account {
	
	private int accountNumber;
	int accountDeposit;
	int accountWithdraw;
	int accountTransfer;
	double clientBalance;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int newAccountNumber) {
		this.accountNumber = newAccountNumber;
	}

}
