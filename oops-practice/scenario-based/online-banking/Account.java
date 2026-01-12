
import java.util.*;


class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class Account implements BankService{
	protected String accountNumber;
	protected String holderName;
	protected double balance;
	
	protected List<String> transactionHistory = new ArrayList<>();
	
	public Account(String accountNumber,String holderName, double balance) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}
	
	public synchronized void deposit(double amount) {
		balance += amount;
		transactionHistory.add("Deposited ₹" + amount);
		System.out.println(holderName + " deposited ₹" + amount);
	}
	
	public synchronized void withdraw(double amount) throws InsufficientBalanceException {
		if(amount > 0 ) {
			throw new InsufficientBalanceException("Insufficient Balance! ");
		}
		balance -= amount;
		transactionHistory.add("Withdrawn ₹" + amount);
        System.out.println(holderName + " withdrew ₹" + amount);
	}
	
	public synchronized void transfer(Account toAccount, double amount) throws InsufficientBalanceException {
		if(amount > balance) {
			throw new InsufficientBalanceException("Insufficient Balance! ");
		}
		this.balance -= balance;
		toAccount.balance += amount;
		
		transactionHistory.add("Transferred ₹" + amount + " to A/C " + toAccount.accountNumber);
        toAccount.transactionHistory.add("Received ₹" + amount + " from A/C " + this.accountNumber);
	}
	
	public void checkBalance() {
		System.out.println("Balance: ₹" + balance);
	}
	 
	public void showTransactionHistory() {
		System.out.println("\nTransaction History " + holderName);
		 for(String t : transactionHistory) {
			 System.out.println("- " + t);
		 }
	}
	//Polymorphism
	public double calculateInterest() {
        return 0;
    }
}