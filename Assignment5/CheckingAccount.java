package Assignment5;

public class CheckingAccount extends BankAccount {
	SavingsAccount protectedBy;

	public CheckingAccount(int balance) {
		super(balance);
	}

	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy;
	}

	@Override
	public boolean withdraw(int amount) {
		if (balance < amount) {
			protectedBy.balance -= (amount - balance);
			balance=0;
			return true;
		}else {
			super.withdraw(amount);//this.balance -= amount;
		}
		return true;
	}

	@Override
	String getAccountType() {
		// TODO Auto-generated method stub
		return "당좌예금";
	}

}
