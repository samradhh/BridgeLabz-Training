

class SavingAccount extends Account implements BankService{

	public SavingAccount(String accountNumber, String name, double balance) {
		super(accountNumber, name, balance);
		// TODO Auto-generated constructor stub
	}
	
	public double calculateInterest() {
		return balance * 0.04; // interest 4 percent 
	}

	
}