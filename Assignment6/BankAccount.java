package Assignment6;

import chapter4.Exceoption;

public abstract class BankAccount {
	protected int balance;

	abstract String getAccountType();

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void desposit(int amount) {
		balance += amount;
	}

	public boolean withdraw(int amount) {
		if (amount < balance) {
			balance -= amount;
			return true;
		}
		return false;
	}

	public boolean transfer(int amount, BankAccount otherAccount) {
		if(amount < 0 || this.balance < amount) {
			IllegalArgumentException e = new IllegalArgumentException("잔액이 0원 밑입니다.");
			throw e;
		}else if(otherAccount == null) {
			NullPointerException e = new NullPointerException();
			throw e;
		}
		withdraw(amount);
		otherAccount.desposit(amount);
		return false;
	}

	@Override
	public String toString() {
		return String.format("잔액 : %,d", balance);
	}

}
