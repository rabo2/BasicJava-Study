package Assignment4;

public class Customer {
	private String firstName;
	private String lastName;
	private BankAccount[] accounts;
	private int numberOfAccounts;

	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		accounts = new BankAccount[5];
	}

	public void addAccount(BankAccount account) {
		if (numberOfAccounts <= 5) {
			accounts[numberOfAccounts++] = account;
		}
	}

	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public BankAccount getAccount(int index) {
		return accounts[index];
	}

	@Override
	public String toString() {
		return String.format("이름: %s %s, 계좌의 개수 %s개", firstName, lastName, numberOfAccounts);
	}

}
