public class BankAccountSimulator {
    static class BankAccount {
        String accountHolder;
        String accountNumber;
        double balance;
        BankAccount(String h, String n, double b) { accountHolder = h; accountNumber = n; balance = b; }
        void deposit(double amt) { balance += amt; System.out.println("Deposited: " + amt); }
        void withdraw(double amt) { if (balance >= amt) { System.out.println("Withdraw amount is : " + amt); balance -= amt; } else { System.out.println("Insufficient balance"); } }
        void display() { System.out.println("Current balance: " + balance); }
    }
    public static void main(String[] args) {
        System.out.println("State of Chennai");
        System.out.println();
        BankAccount a = new BankAccount("State Bank", "ACC001", 700.0);
        a.display();
        a.deposit(200.0);
        a.display();
        a.withdraw(100.0);
        a.display();
        a.withdraw(10000.0);
    }
}