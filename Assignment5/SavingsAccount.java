package Assignment5;

public class SavingsAccount extends BankAccount {
	private double interestRate;

	public SavingsAccount(int balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}

	public void updateBalance(int period) {
		this.balance += this.balance * interestRate * period;
	}

	@Override
	String getAccountType() {
		// TODO Auto-generated method stub
		return "저축예금";
	}

}
