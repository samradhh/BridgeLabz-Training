

public class CurrentAccount extends Account implements BankService{

	public CurrentAccount(String accountNumber,String holderName, double balance) {
		super(accountNumber, holderName, balance);
		// TODO Auto-generated constructor stub
	}
	
	public double calculateInterest() {
		return balance * 0.02; // interest 2 percent
	}

}