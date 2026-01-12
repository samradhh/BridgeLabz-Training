

public class OnlineBankingSystem {

	public static void main(String[] args) {

	    Account acc1 = new SavingAccount("101", "Aryan", 3000);
	    Account acc2 = new CurrentAccount("102", "Pankaj", 3000);

	    System.out.println("\n--- Initial Balances ---");
	    acc1.checkBalance();
	    acc2.checkBalance();

	    System.out.println("\n--- Single Thread Operations ---");
	    try {
	        acc1.deposit(500);
	        acc1.withdraw(200);
	        acc1.transfer(acc2, 500);
	    } catch (InsufficientBalanceException e) {
	        System.out.println(e.getMessage());
	    }

	    System.out.println("\n--- Balances After Transactions ---");
	    acc1.checkBalance();
	    acc2.checkBalance();

	    System.out.println("\n--- Interest Calculation (Polymorphism) ---");
	    System.out.println("Savings Interest  : " + acc1.calculateInterest());
	    System.out.println("Current Interest  : " + acc2.calculateInterest());

	    System.out.println("\n--- Multithreading Demo ---");
	    TransactionThread t1 = new TransactionThread(acc1);
	    TransactionThread t2 = new TransactionThread(acc1);

	    t1.start();
	    t2.start();

	    try {
	        t1.join();
	        t2.join();
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }

	    System.out.println("\n--- Final Balance ---");
	    acc1.checkBalance();

	    acc1.showTransactionHistory();
	    acc2.showTransactionHistory();
	}

}