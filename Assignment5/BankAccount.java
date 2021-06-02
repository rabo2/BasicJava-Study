package Assignment5;

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
		withdraw(amount);
		otherAccount.desposit(amount);
		return false;
	}

	@Override
	public String toString() {
		return String.format("잔액 : %,d", balance);
	}

}
