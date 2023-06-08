package entitites;

public class BankAccount {

	private int accountNumber;
	private String name;
	private double accountBalance;
	public int aux;

	public BankAccount(int accountNumber, String name, double initialDeposit) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		deposit(initialDeposit);
	}

	public BankAccount(int accountNumber, String name) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
	}
	public BankAccount() {
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void deposit(double add) {

		accountBalance += add;
	}

	public void withdraw(double withdraw) {
		accountBalance -= (withdraw + 5.0);
	}

	public String toString() {

		if (aux == 0) {
			return "Account Data: \n" + "Account: " + accountNumber + ", Holder: " + name + ", Balance: "
					+ String.format("%.2f", accountBalance);
		} else
			return "Updated Account Data: \n" + "Account: " + accountNumber + ", Holder: " + name
					+ ", Balance: " + String.format("%.2f", accountBalance);
	}
}
