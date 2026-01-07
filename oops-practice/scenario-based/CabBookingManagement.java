import java.util.*;

interface FareCalculator {
    double calculateFare(int distance);
}

class NormalFare implements FareCalculator {
    public double calculateFare(int distance) {
        return distance * 10;
    }
}

class PeakFare implements FareCalculator {
    public double calculateFare(int distance) {
        return distance * 15;
    }
}

class User {
    String name;
    User(String name) {
        this.name = name;
    }
}

class Driver {
    String name;
    boolean available = true;
    Driver(String name) {
        this.name = name;
    }
}

class NoDriverAvailableException extends Exception {
    NoDriverAvailableException(String msg) {
        super(msg);
    }
}

class Ride {
    User user;
    Driver driver;
    double fare;
    Ride(User user, Driver driver, double fare) {
        this.user = user;
        this.driver = driver;
        this.fare = fare;
    }
}

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
            throw new InsufficientBalanceException("Insufficient Balance");
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

public class Main {

    static List<Driver> drivers = new ArrayList<>();
    static List<Ride> rides = new ArrayList<>();

    static Driver getDriver() throws NoDriverAvailableException {
        for (Driver d : drivers) {
            if (d.available) {
                d.available = false;
                return d;
            }
        }
        throw new NoDriverAvailableException("No Driver Available");
    }

    public static void main(String[] args) {

        drivers.add(new Driver("Amit"));
        drivers.add(new Driver("Ravi"));

        User user = new User("Sam");
        FareCalculator fare = new PeakFare();

        try {
            Driver driver = getDriver();
            double cost = fare.calculateFare(12);
            Ride ride = new Ride(user, driver, cost);
            rides.add(ride);
            System.out.println("Ride Booked | Driver: " + driver.name + " | Fare: " + cost);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

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
