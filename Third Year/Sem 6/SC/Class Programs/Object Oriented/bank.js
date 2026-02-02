class BankAccount{

    constructor(name, ac_no, balance){
        this.name = name;
        this.ac_no = ac_no;
        this.balance = balance;
    }

    deposit(amount){
        if(amount < 0){
            console.log("Invalid amount");
            return
        }
        this.balance += amount;
    }

    withdraw(amount){
        if(this.balance < 0){
            console.log("Funds insufficient");
            return;
        }
        this.balance -= amount;
    }

    details(){
        console.log("Name : ",this.name);
        console.log("Account number : ",this.ac_no);
        console.log("Balance : ",this.balance);
        

    }
}

let acc1 = new BankAccount("Om", 123456, 5000);

acc1.deposit(2000);
acc1.withdraw(1500);
acc1.details();
