package Assignment4;

public class BankAccount {
	protected int balance;
	
	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}
	// 입금
	public void desposit(int amount) {
		balance += amount;
	}
	/**
	 * 본인 계좌에서 출금
	 * @param amount 금액
	 * @return	출금되면 true, 안되면 false
	 */
	public boolean withdraw(int amount) {
		if(amount < balance) {
			balance -= amount;
		return true;
		}
		return false;
	}
	/**
	 * 현제 계좌에서 다른 계좌로 이체하는 메소드
	 * @param amount 금액
	 * @param otherAccount 계좌
	 * @return 이체 성공시 true, 실패시 false
	 */
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
