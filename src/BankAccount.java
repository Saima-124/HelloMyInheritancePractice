public class BankAccount {
    public double balance ;
    //public double amount;

    public BankAccount(double balance){
        this.balance = balance;
        //this.amount = amount;
    }

    public void deposit(double amount){

       balance= balance+amount;

        }
        public double withdraw(double amount){
        if(amount>=balance){
            return -1;
        }else{
            balance=balance-amount;
            return balance;
        }

        }
    public double getBalance() {
        return balance;
    }
    }

