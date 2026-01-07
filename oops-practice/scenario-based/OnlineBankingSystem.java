
interface BankService {
    void deposit(double amount);
    void withdraw(double amount) throws Exception;
    double getBalance();
}

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class Account implements BankService {
    int accNo;
    double balance;

    Account(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
    }

    public synchronized void withdraw(double amount) throws Exception {
        if (balance < amount)
            throw new InsufficientBalanceException("Low Balance");
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends Account {
    SavingsAccount(int accNo, double balance) {
        super(accNo, balance);
    }

    double interest() {
        return balance * 0.04;
    }
}

class Transaction extends Thread {
    Account account;
    double amount;

    Transaction(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        try {
            account.withdraw(amount);
            System.out.println("Withdrawn: " + amount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class OnlineBankingSystem {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount(101, 5000);

        Transaction t1 = new Transaction(acc, 2000);
        Transaction t2 = new Transaction(acc, 4000);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {}

        System.out.println("Final Balance: " + acc.getBalance());
        System.out.println("Interest: " + acc.interest());
    }
}
