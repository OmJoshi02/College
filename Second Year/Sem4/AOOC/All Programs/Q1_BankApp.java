
import java.util.Scanner;

class LowBalanceException extends Exception {

    public LowBalanceException(String message) {
        super(message);
    }
}

class NegativeNumberException extends Exception {

    public NegativeNumberException(String message) {
        super(message);
    }
}

class BankAccount {

    private double balance;

    public BankAccount(double balance) throws NegativeNumberException {
        if (balance < 0) {
            throw new NegativeNumberException("Negative initial balance.");
        }
        this.balance = balance;
    }

    public void deposit(double amount) throws NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot deposit negative amount.");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws LowBalanceException, NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot withdraw negative amount.");
        }
        if (balance - amount < 0) {
            throw new LowBalanceException("Insufficient balance.");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class Q1_BankApp {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter initial balance: ");
            double balance = sc.nextDouble();
            BankAccount acc = new BankAccount(balance);

            System.out.print("Enter deposit amount: ");
            acc.deposit(sc.nextDouble());

            System.out.print("Enter withdrawal amount: ");
            acc.withdraw(sc.nextDouble());

            System.out.println("Final Balance: " + acc.getBalance());

        } catch (NegativeNumberException | LowBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
