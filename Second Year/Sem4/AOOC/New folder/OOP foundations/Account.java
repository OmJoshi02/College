import java.util.*;


class BankAccount{
    double initial;
    double amount;
    double balance = 0;
    public BankAccount(double initial, double amount) {
        this.initial = initial;
        this.amount = amount;
    }
    
    void deposit(){
        double balance = initial + amount;
        System.out.println(amount+" : Deposited");
        System.out.println("Current balance : "+balance);
    }

    void withdraw(){
        balance = balance - amount;
        System.out.println(amount+" withdrawn");
        System.out.println("Current balance : "+balance);
    }
}

class SavingAccount extends BankAccount{

    @Override
    public void withdraw(){
        if(balance < 100){
            System.out.println("Cannot withdraw");
            return;
        }
    }
}



public class Account {
    
}
