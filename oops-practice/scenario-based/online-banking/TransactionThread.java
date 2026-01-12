

class TransactionThread extends Thread {

    private Account account;

    public TransactionThread(Account account) {
        this.account = account;
    }

    public void run() {
        try {
            account.deposit(500);
            account.withdraw(200);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}