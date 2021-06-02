package Assignment6;

public class Bank {
	private Customer[] customers;
	private int numberOfCustomers;
	
	public Bank() {
		customers = new Customer[10];
	}
	public void addCustomer(Customer customer)	{
		customers[numberOfCustomers++] = customer;
	}
	public Customer[] getCustomers() {
		return customers;
	}
	public void setCustomers(Customer[] customers) {
		this.customers = customers;
	}
	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	public void setNumberOfCustomers(int numberOfCustomers) {
		this.numberOfCustomers = numberOfCustomers;
	}
	public Customer getCustomer(int index) {
		return customers[index];
	}
	
}
